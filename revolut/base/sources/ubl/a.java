package ubl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f278930c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f278931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f278932h;

    public a(String id10, String portfolioId, Long l2, String holdingState, String name, String currency, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(holdingState, "holdingState");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f278928a = id10;
        this.f278929b = portfolioId;
        this.f278930c = l2;
        this.d = holdingState;
        this.e = name;
        this.f = currency;
        this.f278931g = str;
        this.f278932h = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f278928a, aVar.f278928a) && Intrinsics.f(this.f278929b, aVar.f278929b) && Intrinsics.f(this.f278930c, aVar.f278930c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f278931g, aVar.f278931g) && Intrinsics.f(this.f278932h, aVar.f278932h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f278928a.hashCode() * 31, 31, this.f278929b);
        Long l2 = this.f278930c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.f278931g;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f278932h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
