package zac;

import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Delivery f320653a;

    public i(Delivery delivery) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        this.f320653a = delivery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f320653a, ((i) obj2).f320653a);
    }

    public final int hashCode() {
        return this.f320653a.hashCode();
    }
}
