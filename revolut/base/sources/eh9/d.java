package eh9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentData f125774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReviewInfo f125775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferScheduleData f125776c;

    public d(PaymentData data, TransferReviewInfo reviewInfo, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f125774a = data;
        this.f125775b = reviewInfo;
        this.f125776c = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f125774a, dVar.f125774a) && Intrinsics.f(this.f125775b, dVar.f125775b) && Intrinsics.f(this.f125776c, dVar.f125776c);
    }

    public final int hashCode() {
        return this.f125776c.hashCode() + ((this.f125775b.hashCode() + (this.f125774a.hashCode() * 31)) * 31);
    }
}
