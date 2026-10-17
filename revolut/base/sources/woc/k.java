package woc;

import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import k4l.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {
    public static dj0.d a(PortfolioRecurringOrder recurringOrder) {
        Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
        c0 c0Var = recurringOrder.e;
        dj0.d dVar = recurringOrder.i;
        int i = j.f298919a[c0Var.ordinal()];
        if (i == 1) {
            return pyd.c.U(dVar, 30L);
        }
        if (i == 2) {
            return pyd.c.k(pyd.c.U(dVar, 52L), 12L);
        }
        if (i == 3) {
            return dVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
