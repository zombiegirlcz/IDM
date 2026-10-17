package zs9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f324839a;

    public q(PaymentGroup paymentGroup) {
        Intrinsics.checkNotNullParameter(paymentGroup, "paymentGroup");
        this.f324839a = paymentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f324839a, ((q) obj2).f324839a);
    }

    public final int hashCode() {
        return this.f324839a.hashCode();
    }
}
