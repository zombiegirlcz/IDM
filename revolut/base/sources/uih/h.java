package uih;

import cfl.u;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StockBuyBlock f280447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n4l.e f280448c;
    public final Set d;
    public final u e;

    public h(String portfolioId, StockBuyBlock stockBuyBlock, n4l.e stockLendingStatus, Set remediationComplexBonds, u giaMarginSettingsOnboardingStatus) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
        Intrinsics.checkNotNullParameter(remediationComplexBonds, "remediationComplexBonds");
        Intrinsics.checkNotNullParameter(giaMarginSettingsOnboardingStatus, "giaMarginSettingsOnboardingStatus");
        this.f280446a = portfolioId;
        this.f280447b = stockBuyBlock;
        this.f280448c = stockLendingStatus;
        this.d = remediationComplexBonds;
        this.e = giaMarginSettingsOnboardingStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f280446a, hVar.f280446a) && Intrinsics.f(this.f280447b, hVar.f280447b) && Intrinsics.f(this.f280448c, hVar.f280448c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f280446a.hashCode() * 31;
        StockBuyBlock stockBuyBlock = this.f280447b;
        return this.e.hashCode() + p.a.f((this.f280448c.hashCode() + ((iHashCode + (stockBuyBlock == null ? 0 : stockBuyBlock.hashCode())) * 31)) * 31, 31, this.d);
    }
}
