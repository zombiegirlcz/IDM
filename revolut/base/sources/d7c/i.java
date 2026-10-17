package d7c;

import e7c.d0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {
    public static final com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a a(d0 d0Var) {
        int i = h.f111921a[d0Var.ordinal()];
        if (i == 1) {
            return com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.Pending;
        }
        if (i == 2) {
            return com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.Failed;
        }
        if (i == 3) {
            return com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.Done;
        }
        throw new NoWhenBranchMatchedException();
    }
}
