package mrf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f208117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f208118c;
    public final String d;

    public a(String productName, String originCountry, String shippingAirport, String destinationCountry) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(originCountry, "originCountry");
        Intrinsics.checkNotNullParameter(shippingAirport, "shippingAirport");
        Intrinsics.checkNotNullParameter(destinationCountry, "destinationCountry");
        this.f208116a = productName;
        this.f208117b = originCountry;
        this.f208118c = shippingAirport;
        this.d = destinationCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f208116a, aVar.f208116a) && Intrinsics.f(this.f208117b, aVar.f208117b) && Intrinsics.f(this.f208118c, aVar.f208118c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f208116a.hashCode() * 31, 31, this.f208117b), 31, this.f208118c);
    }
}
