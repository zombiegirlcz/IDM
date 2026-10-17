package i9c;

import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f159619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f159620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentScheduleSelection f159621c;

    public a(dj0.d totalWithDiscount, List paymentScheduleList, PaymentScheduleSelection selectedPaymentSchedule) {
        Intrinsics.checkNotNullParameter(totalWithDiscount, "totalWithDiscount");
        Intrinsics.checkNotNullParameter(paymentScheduleList, "paymentScheduleList");
        Intrinsics.checkNotNullParameter(selectedPaymentSchedule, "selectedPaymentSchedule");
        this.f159619a = totalWithDiscount;
        this.f159620b = paymentScheduleList;
        this.f159621c = selectedPaymentSchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f159619a, aVar.f159619a) && Intrinsics.f(this.f159620b, aVar.f159620b) && Intrinsics.f(this.f159621c, aVar.f159621c);
    }

    public final int hashCode() {
        return this.f159621c.hashCode() + p.a.d(this.f159619a.hashCode() * 31, 31, this.f159620b);
    }
}
