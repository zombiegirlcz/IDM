package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrderDraft f111991a;

    public e0(ExchangeOrderDraft orderDraft) {
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        this.f111991a = orderDraft;
    }

    @Override // d7j.d0
    public final ExchangeOrderDraft a() {
        return this.f111991a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f111991a, ((e0) obj2).f111991a);
    }

    public final int hashCode() {
        return this.f111991a.hashCode();
    }
}
