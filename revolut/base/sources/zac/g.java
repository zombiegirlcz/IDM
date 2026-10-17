package zac;

import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Delivery f320651a;

    public g(Delivery delivery) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        this.f320651a = delivery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f320651a, ((g) obj2).f320651a);
    }

    public final int hashCode() {
        return this.f320651a.hashCode();
    }
}
