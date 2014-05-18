package com.example.unittesting;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.mytestapp.CalculatorEngine;
import com.example.mytestapp.MainActivity;

public class MainTest {
	
	private CalculatorEngine tester;

	public MainTest() {
		super();
		this.tester = new CalculatorEngine();

	}

	@Test
	public void testAddition() {

	   // check if addition of 4 and 5 is equal to 9
	   assertEquals("4 + 5 must be 9", 9, this.tester.addTwoNumbers(4, 5));
	 } 


}
