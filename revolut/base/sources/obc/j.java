package obc;

import aii.r;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryCarrier f223921a;

    public j(DeliveryCarrier carrier) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        this.f223921a = carrier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f223921a, ((j) obj2).f223921a);
    }

    public final int hashCode() {
        return this.f223921a.hashCode();
    }
}
