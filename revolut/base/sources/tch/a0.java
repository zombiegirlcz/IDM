package tch;

import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioRecurringOrder f269814a;

    public a0(PortfolioRecurringOrder recurringOrder) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        this.f269814a = recurringOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f269814a, ((a0) obj2).f269814a);
    }

    public final int hashCode() {
        return this.f269814a.hashCode();
    }
}
