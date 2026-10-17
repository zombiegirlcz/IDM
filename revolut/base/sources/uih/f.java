package uih;

import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StockBuyBlock f280444b;

    public f(String portfolioId, StockBuyBlock buyOrder) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(buyOrder, "buyOrder");
        this.f280443a = portfolioId;
        this.f280444b = buyOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f280443a, fVar.f280443a) && Intrinsics.f(this.f280444b, fVar.f280444b);
    }

    public final int hashCode() {
        return this.f280444b.hashCode() + (this.f280443a.hashCode() * 31);
    }
}
