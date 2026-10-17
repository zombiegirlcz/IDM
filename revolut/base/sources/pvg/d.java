package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240104c;
    public final String d;
    public final jo3.b e;

    public d(iwg.a analyticsProductType, boolean z, String currency, String portfolioId, jo3.b totalValue) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        this.f240102a = analyticsProductType;
        this.f240103b = z;
        this.f240104c = currency;
        this.d = portfolioId;
        this.e = totalValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f240102a == dVar.f240102a && this.f240103b == dVar.f240103b && Intrinsics.f(this.f240104c, dVar.f240104c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(j6.a.c(this.f240102a.hashCode() * 31, 31, this.f240103b), 31, this.f240104c), 31, this.d);
    }
}
