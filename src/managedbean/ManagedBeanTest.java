package managedbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "mb")
@ViewScoped
public class ManagedBeanTest implements Serializable {

	private static final long serialVersionUID = 6712450842525523744L;

	private List<Car> cars;

	@PostConstruct
	private void init() {
		CarService service = new CarService();
		cars = service.createCars(10);
	}

	public List<Car> getCars() {
		return cars;
	}
}
