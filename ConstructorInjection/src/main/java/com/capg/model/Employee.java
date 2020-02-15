package com.capg.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	private String empId;
	private String empName;

	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

}
