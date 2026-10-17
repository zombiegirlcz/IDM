package qp7;

import com.revolut.feature.insurance_car.impl.data.model.Payment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Payment f248311a;

    public n(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f248311a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f248311a, ((n) obj2).f248311a);
    }

    public final int hashCode() {
        return this.f248311a.hashCode();
    }
}
