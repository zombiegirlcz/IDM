package kfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import kotlin.NoWhenBranchMatchedException;
import yfg.p;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public static final TravelMilesSearchLocation a(p.a aVar) {
        if (aVar instanceof p.a.C1744a) {
            p.a.C1744a c1744a = (p.a.C1744a) aVar;
            return new TravelMilesSearchLocation.Airport(c1744a.getCity(), c1744a.getIataCode());
        }
        if (!(aVar instanceof p.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        p.a.b bVar = (p.a.b) aVar;
        return new TravelMilesSearchLocation.City(bVar.getCity(), bVar.getCountryCode());
    }

    public static final p.a b(TravelMilesSearchLocation travelMilesSearchLocation) {
        if (travelMilesSearchLocation instanceof TravelMilesSearchLocation.Airport) {
            TravelMilesSearchLocation.Airport airport = (TravelMilesSearchLocation.Airport) travelMilesSearchLocation;
            return new p.a.C1744a(airport.f94141a, airport.f94142b);
        }
        if (!(travelMilesSearchLocation instanceof TravelMilesSearchLocation.City)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelMilesSearchLocation.City city = (TravelMilesSearchLocation.City) travelMilesSearchLocation;
        return new p.a.b(city.f94143a, city.f94144b);
    }
}
