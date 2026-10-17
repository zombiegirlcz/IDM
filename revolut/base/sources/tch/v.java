package tch;

import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrder f269848a;

    public v(PortfolioRecurringOrder recurringOrder) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        this.f269848a = recurringOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f269848a, ((v) obj2).f269848a);
    }

    public final int hashCode() {
        return this.f269848a.hashCode();
    }
}
