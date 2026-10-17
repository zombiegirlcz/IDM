package ocl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f224250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f224251c;

    public a(String portfolioId, b stockBuyBlockState, Long l2) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockBuyBlockState, "stockBuyBlockState");
        this.f224249a = portfolioId;
        this.f224250b = stockBuyBlockState;
        this.f224251c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f224249a, aVar.f224249a) && this.f224250b == aVar.f224250b && Intrinsics.f(this.f224251c, aVar.f224251c);
    }

    public final int hashCode() {
        int iHashCode = (this.f224250b.hashCode() + (this.f224249a.hashCode() * 31)) * 31;
        Long l2 = this.f224251c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
