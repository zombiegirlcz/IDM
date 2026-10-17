package efl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f125371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125373c;

    public g(dj0.d amount, String destinationPortfolioId, String destinationHoldingId) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(destinationPortfolioId, "destinationPortfolioId");
        Intrinsics.checkNotNullParameter(destinationHoldingId, "destinationHoldingId");
        this.f125371a = amount;
        this.f125372b = destinationPortfolioId;
        this.f125373c = destinationHoldingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f125371a, gVar.f125371a) && Intrinsics.f(this.f125372b, gVar.f125372b) && Intrinsics.f(this.f125373c, gVar.f125373c);
    }

    public final int hashCode() {
        return this.f125373c.hashCode() + p.a.c(this.f125371a.hashCode() * 31, 31, this.f125372b);
    }
}
