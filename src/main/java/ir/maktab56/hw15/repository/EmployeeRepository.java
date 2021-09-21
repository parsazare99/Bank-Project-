package ir.maktab56.hw15.repository;

import ir.maktab56.hw15.base.repository.BaseEntityRepository;
import ir.maktab56.hw15.domain.Employee;

public interface EmployeeRepository extends BaseEntityRepository<Employee, Integer> {


    boolean existByUsername(String username);

    boolean existByPassword(String username, String password);

    Employee findByUsernameAndPassword(String username, String password);

    Employee findByUsername(String username);
}
