package com.qa.student.service;

public interface MovieService {
	String getAllMovies();

	String createMovie(String movie);

	String updateMovie(Long id, String movie);

	String deleteMovie(Long id);
}
