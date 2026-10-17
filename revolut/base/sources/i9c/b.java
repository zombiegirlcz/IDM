package i9c;

import aii.r;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentScheduleSelection f159622a;

    public b(PaymentScheduleSelection selectedPaymentSchedule) {
        Intrinsics.checkNotNullParameter(selectedPaymentSchedule, "selectedPaymentSchedule");
        this.f159622a = selectedPaymentSchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f159622a, ((b) obj2).f159622a);
    }

    public final int hashCode() {
        return this.f159622a.hashCode();
    }
}
