package com.boot.aws.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welocome jagdi";
	}

}
