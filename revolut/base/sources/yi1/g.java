package yi1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g {
    public static final String a(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        String streetLine1 = address.getStreetLine1();
        String streetLine2 = address.getStreetLine2();
        String region = address.getRegion();
        String city = address.getCity();
        String postcode = address.getPostcode();
        String country = address.getCountry();
        String fullAddress = address.getFullAddress();
        String streetType = address.getStreetType();
        String street = address.getStreet();
        String houseNumber = address.getHouseNumber();
        String flat = address.getFlat();
        String neighborhood = address.getNeighborhood();
        String houseName = address.getHouseName();
        Address.Type type = address.getType();
        String landmark = address.getLandmark();
        StringBuilder sbM = v0.a.m("Address(streetLine1=", streetLine1, ", streetLine2=", streetLine2, ", region=");
        j6.a.D(sbM, region, ", city=", city, ", postcode=");
        j6.a.D(sbM, postcode, ", country=", country, ", fullAddress=");
        j6.a.D(sbM, fullAddress, ", streetType=", streetType, ", street=");
        j6.a.D(sbM, street, ", houseNumber=", houseNumber, ", flat=");
        j6.a.D(sbM, flat, ", neighborhood=", neighborhood, ", houseName=");
        sbM.append(houseName);
        sbM.append(", type=");
        sbM.append(type);
        sbM.append(", landmark=");
        return v0.a.i(sbM, landmark, ")");
    }
}
