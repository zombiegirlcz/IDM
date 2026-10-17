package xt9;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final Address a(no3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String addressLine1 = bVar.getAddressLine1();
        String addressLine2 = bVar.getAddressLine2();
        String region = bVar.getRegion();
        String country = bVar.getCountry();
        String city = bVar.getCity();
        String postcode = bVar.getPostcode();
        String street = bVar.getStreet();
        if (street == null) {
            street = bVar.getStreetName();
        }
        return new Address(addressLine1, addressLine2, region, city, postcode, country, null, null, street, bVar.getHouseNumber(), bVar.getFlat(), bVar.getNeighborhood(), bVar.getHouseName(), null, null, 24768, null);
    }
}
