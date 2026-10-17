package o3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f221800c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f221801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f221802h;

    public a(String id10, String portfolioId, Long l2, String holdingState, String name, String currency, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(holdingState, "holdingState");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f221798a = id10;
        this.f221799b = portfolioId;
        this.f221800c = l2;
        this.d = holdingState;
        this.e = name;
        this.f = currency;
        this.f221801g = str;
        this.f221802h = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221798a, aVar.f221798a) && Intrinsics.f(this.f221799b, aVar.f221799b) && Intrinsics.f(this.f221800c, aVar.f221800c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f221801g, aVar.f221801g) && Intrinsics.f(this.f221802h, aVar.f221802h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f221798a.hashCode() * 31, 31, this.f221799b);
        Long l2 = this.f221800c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.f221801g;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f221802h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
