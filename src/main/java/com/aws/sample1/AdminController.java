package com.aws.sample1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@GetMapping("index")
	public ResponseEntity<String> getIndex(){
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
}
