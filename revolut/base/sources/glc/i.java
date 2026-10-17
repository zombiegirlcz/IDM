package glc;

import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoboPortfolioInfo f144608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboTransaction f144609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PortfolioRecurringOrder f144610c;

    public i(RoboPortfolioInfo portfolio, RoboTransaction transaction, PortfolioRecurringOrder portfolioRecurringOrder) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f144608a = portfolio;
        this.f144609b = transaction;
        this.f144610c = portfolioRecurringOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f144608a, iVar.f144608a) && Intrinsics.f(this.f144609b, iVar.f144609b) && Intrinsics.f(this.f144610c, iVar.f144610c);
    }

    public final int hashCode() {
        int iHashCode = (this.f144609b.hashCode() + (this.f144608a.hashCode() * 31)) * 31;
        PortfolioRecurringOrder portfolioRecurringOrder = this.f144610c;
        return iHashCode + (portfolioRecurringOrder == null ? 0 : portfolioRecurringOrder.hashCode());
    }
}
