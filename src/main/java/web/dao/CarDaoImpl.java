package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("Car1", 11, 2001));
        carsList.add(new Car("Car2", 22, 2002));
        carsList.add(new Car("Car3", 33, 2003));
        carsList.add(new Car("Car4", 44, 2004));
        carsList.add(new Car("Car5", 55, 2005));
    }

    @Override
    public List<Car> getCars(int sum) {
        if (sum == 0) {
            return carsList;
        }
        return carsList.stream().limit(sum).collect(Collectors.toList());
    }
}
