package com.jenkins.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApplicationTest {

	 List<Employee> list = getEmployees();

	// used for test case //

	public List<Employee> getEmployees() {
		Employee employee = new Employee();
		employee.setEmail("X");
		employee.setFirstName("R");
		employee.setId(1);
		employee.setLastName("");

		return Arrays.asList();
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		assertNotNull(list.size());

	}

	@Test
	public void testEmployee() {
		List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8");
		assertEquals(1, list.stream().filter(v -> v.equalsIgnoreCase("2")).count());
	}

	@Test
	public void testListNotNull() {
		assertNotNull(list);
	}

	class Employee {
		private String email;
		private String firstName;
		private Integer id;
		private String lastName;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	}
}
