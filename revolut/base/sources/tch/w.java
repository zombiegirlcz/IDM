package tch;

import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrder f269849a;

    public w(PortfolioRecurringOrder recurringOrder) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        this.f269849a = recurringOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f269849a, ((w) obj2).f269849a);
    }

    public final int hashCode() {
        return this.f269849a.hashCode();
    }
}
