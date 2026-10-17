package ilc;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrder f162220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboPortfolioInfo f162221b;

    public b(PortfolioRecurringOrder recurringOrder, RoboPortfolioInfo portfolioInfo) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        this.f162220a = recurringOrder;
        this.f162221b = portfolioInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f162220a, bVar.f162220a) && Intrinsics.f(this.f162221b, bVar.f162221b);
    }

    public final int hashCode() {
        return this.f162221b.hashCode() + (this.f162220a.hashCode() * 31);
    }
}
