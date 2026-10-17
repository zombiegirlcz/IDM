package m1i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrderDraft f201563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f201564b;

    public n0(ExchangeOrderDraft draft, o0 o0Var) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f201563a = draft;
        this.f201564b = o0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f201563a, n0Var.f201563a) && this.f201564b == n0Var.f201564b;
    }

    public final int hashCode() {
        int iHashCode = this.f201563a.hashCode() * 31;
        o0 o0Var = this.f201564b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }
}
