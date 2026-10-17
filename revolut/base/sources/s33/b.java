package s33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259410c;
    public final String d;
    public final String e;
    public final String f;

    public b(String planId, String str, String cardDesign, String cardBrand, String deliveryCountry, String deliveryMethod) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(deliveryCountry, "deliveryCountry");
        Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
        this.f259408a = planId;
        this.f259409b = str;
        this.f259410c = cardDesign;
        this.d = cardBrand;
        this.e = deliveryCountry;
        this.f = deliveryMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f259408a, bVar.f259408a) && Intrinsics.f(this.f259409b, bVar.f259409b) && Intrinsics.f(this.f259410c, bVar.f259410c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f259408a.hashCode() * 31;
        String str = this.f259409b;
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f259410c), 31, this.d), 31, this.e);
    }
}
