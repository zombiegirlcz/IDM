package j9g;

import a9g.y1;
import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.Image;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f172332a = r0.k(new Pair("BANNER", ufi.e.BANNER), new Pair("PROPERTY", ufi.e.PROPERTY), new Pair("ROOM", ufi.e.ROOM));

    public static final Address a(a9g.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new Address(aVar.getStreetLine1(), aVar.getStreetLine2(), aVar.getRegion(), aVar.getCity(), aVar.getCountry(), aVar.getPostcode(), aVar.getCountryName());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final Image b(y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        return new Image(y1Var.getRank(), (ufi.e) u1.u(y1Var.getType(), f172332a), y1Var.getUrl(), y1Var.getDescription());
    }

    public static final a9g.a c(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return new a9g.a(address.f97966a, address.f97967b, address.f97968c, address.d, address.e, address.f, address.f97969g);
    }
}
