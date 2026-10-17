package tch;

import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrder f269851a;

    public y(PortfolioRecurringOrder recurringOrder) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        this.f269851a = recurringOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f269851a, ((y) obj2).f269851a);
    }

    public final int hashCode() {
        return this.f269851a.hashCode();
    }
}
