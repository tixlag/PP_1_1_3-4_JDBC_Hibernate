package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl<T> implements UserService {
    UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
    public void createUsersTable() {
        dao.createUsersTable();
    }
    <Z> T nets(ArrayList<T> c) {
        return null;
    }

    public void dropUsersTable() {
        dao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        dao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        dao.removeUserById(id);
    }

    public List<User> getAllUsers() {
       return dao.getAllUsers();
    }

    public void cleanUsersTable() {
        dao.cleanUsersTable();
    }
}
