package mk3;

import com.revolut.feature.address.models.Address;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes21.dex */
public final class e {
    public static String a(Address address, gk3.c cVar) {
        switch (d.f206177a[cVar.ordinal()]) {
            case 1:
                return address.getCity();
            case 2:
                return address.getNeighborhood();
            case 3:
                return address.getPostcode();
            case 4:
                return address.getRegion();
            case 5:
                return address.getStreetLine1();
            case 6:
                return address.getStreetLine2();
            case 7:
                return address.getStreet();
            case 8:
                return address.getStreetType();
            case 9:
                return address.getHouseNumber();
            case 10:
                return address.getFlat();
            case 11:
                return address.getLandmark();
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
