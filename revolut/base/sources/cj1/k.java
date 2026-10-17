package cj1;

import com.revolut.feature.address.impl.data.network.AddressService;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressService f24595a;

    public k(AddressService addressService) {
        Intrinsics.checkNotNullParameter(addressService, "addressService");
        this.f24595a = addressService;
    }

    public static final no3.b a(k kVar, Address address, AddressFormat addressFormat) {
        kVar.getClass();
        String streetLine1 = address.getStreetLine1();
        String streetLine2 = address.getStreetLine2();
        String street = address.getStreet();
        String houseNumber = address.getHouseNumber();
        String houseName = address.getHouseName();
        return new no3.b(streetLine1, streetLine2, address.getRegion(), address.getCity(), address.getPostcode(), address.getCountry(), street, houseNumber, address.getFlat(), address.getNeighborhood(), houseName, address.getStreetType(), null, addressFormat.name(), 8320);
    }
}
