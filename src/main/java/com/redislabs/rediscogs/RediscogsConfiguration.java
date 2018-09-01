package com.redislabs.rediscogs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "")
@EnableAutoConfiguration
@Data
public class RediscogsConfiguration {

	boolean skipLoad;
	private String mastersIndex = "mastersIdx";
	private String artistsSuggestionIdx = "artistsSuggestionIdx";
	private String mastersFile;
	private int batchSize = 500;

}