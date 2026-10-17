package ycl;

import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qdl.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {
    public static final StockBuyBlock a(qdl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        d state = bVar.getState();
        int i = state == null ? -1 : a.f312633a[state.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return StockBuyBlock.Active.f105144a;
            }
            if (i != 2) {
                if (i == 3) {
                    return new StockBuyBlock.PendingDeactivation(bVar.getDeactivationDurationMillis());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return StockBuyBlock.Inactive.f105145a;
    }
}
