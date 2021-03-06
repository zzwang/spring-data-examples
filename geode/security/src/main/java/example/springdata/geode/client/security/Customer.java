/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.geode.client.security;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import java.io.Serializable;

/**
 * A customer used for Lucene examples.
 *
 * @author Udo Kohlmeyer
 * @author Patrick Johnson
 */
@Data
@Region(name = "Customers")
public class Customer implements Serializable {

	@Id
	private Long id;
	private EmailAddress emailAddress;
	private String firstName;
	private String lastName;

	public Customer(Long id, EmailAddress emailAddress, String firstName, String lastName) {
		this.id = id;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
