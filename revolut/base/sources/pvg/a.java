package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240065c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f240067h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ko3.b f240068j;
    public final ko3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f240069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f240070m;

    public a(float f, iwg.a analyticsProductType, String currency, String portfolioId, String asset, String quantity, String str, String str2, String str3, jo3.b value, ko3.b bVar, ko3.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f240063a = analyticsProductType;
        this.f240064b = z;
        this.f240065c = currency;
        this.d = portfolioId;
        this.e = asset;
        this.f = quantity;
        this.f240066g = value;
        this.f240067h = f;
        this.i = str;
        this.f240068j = bVar;
        this.k = bVar2;
        this.f240069l = str2;
        this.f240070m = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f240063a == aVar.f240063a && this.f240064b == aVar.f240064b && Intrinsics.f(this.f240065c, aVar.f240065c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f240066g, aVar.f240066g) && Float.compare(this.f240067h, aVar.f240067h) == 0 && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f240068j, aVar.f240068j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f240069l, aVar.f240069l) && Intrinsics.f(this.f240070m, aVar.f240070m);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f240067h, wp5.y.e(this.f240066g, p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(this.f240063a.hashCode() * 31, 31, this.f240064b), 31, this.f240065c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        String str = this.i;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.f240068j;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ko3.b bVar2 = this.k;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str2 = this.f240069l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f240070m;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
