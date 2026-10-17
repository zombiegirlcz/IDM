package avh;

import bvh.b0;
import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final b0 a(Address address) {
        return new b0(address.getCountry(), address.getStreetLine1(), address.getStreetLine2(), address.getStreet(), address.getStreetType(), address.getHouseNumber(), address.getHouseName(), address.getFlat(), address.getCity(), address.getRegion(), address.getPostcode(), address.getNeighborhood());
    }
}
