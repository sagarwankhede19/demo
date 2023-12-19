package com.example.demo.model;

public class Car {

	private String  carName;
	private String carModel;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String carName, String carModel) {
		this.carName = carName;
		this.carModel = carModel;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
}
