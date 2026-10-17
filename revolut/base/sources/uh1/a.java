package uh1;

import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import rh1.b;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    static String a(a aVar, Address address) {
        List listL;
        yi1.a aVar2 = (yi1.a) aVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter("\n", "separator");
        ugc.a aVar3 = aVar2.f314212a;
        Intrinsics.checkNotNullParameter(address, "address");
        String strB = ((lj1.a) ((b) aVar3.f279998b)).b(address.getCountry());
        String country = address.getCountry();
        wi0.b.Companion.getClass();
        if (Intrinsics.f(country, "GB") || Intrinsics.f(country, "IE")) {
            String[] elements = {address.getStreetLine1(), address.getStreetLine2(), address.getCity(), address.getPostcode(), strB};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = d.L(elements);
        } else if (Intrinsics.f(country, "US")) {
            String[] elements2 = {address.getStreetLine1(), address.getStreetLine2(), com.google.android.gms.internal.mlkit_vision_face.a.p(address.getCity(), ", ", address.getRegion(), " ", address.getPostcode()), strB};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = d.L(elements2);
        } else {
            String[] elements3 = {address.getStreetLine1(), address.getStreetLine2(), com.google.android.gms.internal.mlkit_vision_face.a.o(address.getPostcode(), " ", address.getCity()), strB};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            listL = d.L(elements3);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            if (((String) obj2).length() != 0) {
                arrayList.add(obj2);
            }
        }
        return d0.k0(arrayList, "\n", null, null, 0, null, 62);
    }
}
