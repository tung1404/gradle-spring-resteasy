package com.resteasy.service;

import java.util.Map;

public interface EmployeeRepository {
	Map<String, String> getEmpDetail(String id);
}