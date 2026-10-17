package cv6;

import aii.r;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcquiringPaymentFilter f109289a;

    public k(AcquiringPaymentFilter acquiringPaymentFilter) {
        this.f109289a = acquiringPaymentFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f109289a, ((k) obj2).f109289a);
    }

    public final int hashCode() {
        AcquiringPaymentFilter acquiringPaymentFilter = this.f109289a;
        if (acquiringPaymentFilter == null) {
            return 0;
        }
        return acquiringPaymentFilter.hashCode();
    }
}
