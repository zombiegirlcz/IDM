package uyh;

import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderSummaryScreenContract$InputData f284381a;

    public m(OrderSummaryScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f284381a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f284381a, ((m) obj2).f284381a);
    }

    public final int hashCode() {
        return this.f284381a.f96775a.hashCode();
    }
}
