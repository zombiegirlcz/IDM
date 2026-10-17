package rbc;

import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Delivery f253011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f253012b;

    public g(Delivery delivery, boolean z) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        this.f253011a = delivery;
        this.f253012b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f253011a, gVar.f253011a) && this.f253012b == gVar.f253012b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253012b) + (this.f253011a.hashCode() * 31);
    }
}
