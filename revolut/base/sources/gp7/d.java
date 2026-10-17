package gp7;

import com.revolut.feature.insurance_car.impl.data.model.Payment;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Payment f145280a;

    public d(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f145280a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f145280a, ((d) obj2).f145280a);
    }

    public final int hashCode() {
        return this.f145280a.hashCode();
    }
}
