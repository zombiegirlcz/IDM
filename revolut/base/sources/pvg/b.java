package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240079c;
    public final String d;
    public final String e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f240080g;

    public b(float f, iwg.a analyticsProductType, String currency, String portfolioId, String asset, jo3.b value, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f240077a = analyticsProductType;
        this.f240078b = z;
        this.f240079c = currency;
        this.d = portfolioId;
        this.e = asset;
        this.f = value;
        this.f240080g = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f240077a == bVar.f240077a && this.f240078b == bVar.f240078b && Intrinsics.f(this.f240079c, bVar.f240079c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Float.compare(this.f240080g, bVar.f240080g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f240080g) + wp5.y.e(this.f, p.a.c(p.a.c(p.a.c(j6.a.c(this.f240077a.hashCode() * 31, 31, this.f240078b), 31, this.f240079c), 31, this.d), 31, this.e), 31);
    }
}
