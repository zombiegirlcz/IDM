package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrderDraft f111998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111999b;

    public f0(ExchangeOrderDraft orderDraft, String str) {
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        this.f111998a = orderDraft;
        this.f111999b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f111998a, f0Var.f111998a) && Intrinsics.f(this.f111999b, f0Var.f111999b);
    }

    public final int hashCode() {
        int iHashCode = this.f111998a.hashCode() * 31;
        String str = this.f111999b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
