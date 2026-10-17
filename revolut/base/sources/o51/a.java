package o51;

import com.bumptech.glide.d;
import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import nkm.y;
import wi0.b;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Address f222306a = new Address("", "", "", "", "", "", null, null, null, null, null, "", null, null, null, 30656, null);

    public static final String a(Address address, Locale locale) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return c(address, ",\n", locale);
    }

    public static final String b(Address address, Locale locale) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return c(address, ", ", locale);
    }

    public static String c(Address address, String str, Locale locale) {
        Sequence sequenceE;
        Locale locale2;
        b bVarC = d.c(address.getCountry());
        b.Companion.getClass();
        if (bVarC.equals(b.O)) {
            List listK = v.k(address.getStreetType(), address.getStreet(), address.getHouseNumber());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listK) {
                String str2 = (String) obj2;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(obj2);
                }
            }
            String[] elements = {d0.k0(arrayList, " ", null, null, 0, null, 62), address.getFlat(), address.getNeighborhood(), address.getCity(), address.getRegion(), address.getPostcode()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            sequenceE = kotlin.collections.d.E(elements);
        } else {
            String[] elements2 = {address.getStreetLine1(), address.getStreetLine2(), address.getPostcode(), address.getRegion(), address.getNeighborhood(), address.getCity()};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            sequenceE = kotlin.collections.d.E(elements2);
        }
        String country = null;
        String strU = y.u(y.o(sequenceE, new o5.b(8)), str, null, 62);
        if (address.getCountry().length() == 0) {
            return strU;
        }
        if (locale != null) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales(...)");
            int length = availableLocales.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    locale2 = null;
                    break;
                }
                locale2 = availableLocales[i];
                if (Intrinsics.f(locale2.getCountry(), address.getCountry())) {
                    break;
                }
                i++;
            }
            if (locale2 != null) {
                country = locale2.getDisplayCountry(locale);
            }
        }
        if (country == null) {
            country = address.getCountry();
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(strU, ", ", country);
    }
}
