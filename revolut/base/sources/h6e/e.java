package h6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149633c;
    public final String d;
    public final wi0.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f149634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f149635h;

    public e(String paymentLinkId, String str, String ownerFirstName, String ownerLastName, wi0.b ownerCountry, String ownerUsername, String ownerCode, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(paymentLinkId, "paymentLinkId");
        Intrinsics.checkNotNullParameter(ownerFirstName, "ownerFirstName");
        Intrinsics.checkNotNullParameter(ownerLastName, "ownerLastName");
        Intrinsics.checkNotNullParameter(ownerCountry, "ownerCountry");
        Intrinsics.checkNotNullParameter(ownerUsername, "ownerUsername");
        Intrinsics.checkNotNullParameter(ownerCode, "ownerCode");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f149631a = paymentLinkId;
        this.f149632b = str;
        this.f149633c = ownerFirstName;
        this.d = ownerLastName;
        this.e = ownerCountry;
        this.f = ownerUsername;
        this.f149634g = ownerCode;
        this.f149635h = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149631a, eVar.f149631a) && Intrinsics.f(this.f149632b, eVar.f149632b) && Intrinsics.f(this.f149633c, eVar.f149633c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f149634g, eVar.f149634g) && Intrinsics.f(this.f149635h, eVar.f149635h);
    }

    public final int hashCode() {
        int iHashCode = this.f149631a.hashCode() * 31;
        String str = this.f149632b;
        return this.f149635h.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f149633c), 31, this.d), 31, this.e.f297794a), 31, this.f), 31, this.f149634g);
    }
}
