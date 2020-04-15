package org.roy.persistence;

import org.roy.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    @Autowired
    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        hotelRepository.save(new Hotel("Marriot",5, true));
        hotelRepository.save(new Hotel("Ibis",3, false));
        hotelRepository.save(new Hotel("Golden Tulip",4, true));
    }
}
