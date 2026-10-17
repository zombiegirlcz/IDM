package m1i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements mm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrderDraft f201555a;

    public j(ExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f201555a = draft;
    }

    @Override // mm.c
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f201555a, ((j) obj2).f201555a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f201555a.hashCode() * 31);
    }
}
