package com.javasample.SpringBoot.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/")
	public String get() {
		return "Keyboard";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "Mouse";
	}

}
