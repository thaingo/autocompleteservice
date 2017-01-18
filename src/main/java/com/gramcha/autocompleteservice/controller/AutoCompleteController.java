package com.gramcha.autocompleteservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gramcha.autocompleteservice.AutoCompleteResponse;
import com.gramcha.autocompleteservice.QueryExecutor;

@RestController
public class AutoCompleteController {
	@RequestMapping(value = "/acservice/{prefix}", method = RequestMethod.GET,
		      produces = {MediaType.APPLICATION_JSON_VALUE})
		  public ResponseEntity<AutoCompleteResponse> updateDocSubStatus(@PathVariable String prefix) {
			QueryExecutor service = QueryExecutor.getInstance();
			return ResponseEntity.ok(service.execute(prefix));
		  }
}
