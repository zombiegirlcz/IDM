package to3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;
import so3.c;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final Address a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String streetLine1 = cVar.getStreetLine1();
        String streetLine2 = cVar.getStreetLine2();
        String region = cVar.getRegion();
        String city = cVar.getCity();
        String postalCode = cVar.getPostalCode();
        String country = cVar.getCountry();
        if (country == null) {
            country = "";
        }
        return new Address(streetLine1, streetLine2, region, city, postalCode, country, null, null, null, null, null, cVar.getNeighborhood(), null, null, null, 30656, null);
    }

    public static final c b(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return new c(address.getStreetLine1(), address.getStreetLine2(), address.getRegion(), address.getCity(), address.getPostcode(), address.getCountry(), address.getNeighborhood());
    }
}
