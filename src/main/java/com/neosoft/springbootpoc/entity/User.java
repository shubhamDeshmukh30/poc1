package com.neosoft.springbootpoc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public @Data class User {

	public User(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@NotNull
	@Size(min = 3, message = "First name should be atleast 3 character")
	private String firstName;

	// @NotNull
	@Size(min = 3, message = "Sur name should be atleast 3 character")
	private String surName;
	// @NotNull
	private int age;
//	@Email
	private String email;
	private String occupation;
	// @NotNull
	private Long pincode;
	private String city;
	private String state;
	private String country;

	private boolean isDeleted;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dob;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")

	private Date doj;

}
