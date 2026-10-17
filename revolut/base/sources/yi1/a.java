package yi1;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements uh1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugc.a f314212a;

    public a(ugc.a addressRowsFactory, e addressTypeMapper) {
        Intrinsics.checkNotNullParameter(addressRowsFactory, "addressRowsFactory");
        Intrinsics.checkNotNullParameter(addressTypeMapper, "addressTypeMapper");
        this.f314212a = addressRowsFactory;
    }

    public final String b(Address address, AddressFormat format) {
        String str;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(format, "format");
        int i = f.f314218a[format.ordinal()];
        if (i == 1) {
            str = ", ";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "\n";
        }
        return c(str, address);
    }

    public final String c(String separator, Address address) {
        List listL;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(address, "address");
        int i = b.f314213a[address.getFormat().ordinal()];
        if (i == 1) {
            String[] elements = {address.getStreetLine1(), address.getStreetLine2(), address.getPostcode(), address.getNeighborhood(), address.getCity(), address.getRegion()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String[] elements2 = {address.getStreetType(), address.getStreet(), address.getHouseNumber(), address.getHouseName(), address.getFlat(), address.getPostcode(), address.getNeighborhood(), address.getCity(), address.getRegion()};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (((String) obj2).length() != 0) {
                arrayList.add(obj2);
            }
        }
        return d0.k0(arrayList, separator, null, null, 0, null, 62);
    }
}
