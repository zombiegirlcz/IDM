package q9c;

import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6c.f f243880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentScheduleSelection f243881b;

    public u(t6c.f fVar, PaymentScheduleSelection paymentScheduleSelection) {
        this.f243880a = fVar;
        this.f243881b = paymentScheduleSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f243880a, uVar.f243880a) && Intrinsics.f(this.f243881b, uVar.f243881b);
    }

    public final int hashCode() {
        t6c.f fVar = this.f243880a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        PaymentScheduleSelection paymentScheduleSelection = this.f243881b;
        return iHashCode + (paymentScheduleSelection != null ? paymentScheduleSelection.hashCode() : 0);
    }
}
