package com.in28minutes.springboot.jpa.hibernate.h2.example.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
	
	@Column(name="VALUES", columnDefinition="CLOB NOT NULL") 
	@Lob 
	private String values;

	public Student() {
		super();
	}

	public Student(Long id, String name, String passportNumber, String values) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
		this.values = values;
	}

	public Student(String name, String passportNumber, String values) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
		this.values = values;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, passportNumber=%s, values=%s]", id, name, passportNumber, values);
	}

}
