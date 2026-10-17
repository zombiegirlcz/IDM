package th9;

import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentData f271327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReviewInfo f271328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f271329c;
    public final ServiceProvider d;
    public final TransferScheduleData e;

    public a(PaymentData paymentData, TransferReviewInfo reviewInfo, b bVar, ServiceProvider serviceProvider, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f271327a = paymentData;
        this.f271328b = reviewInfo;
        this.f271329c = bVar;
        this.d = serviceProvider;
        this.e = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271327a, aVar.f271327a) && Intrinsics.f(this.f271328b, aVar.f271328b) && Intrinsics.f(this.f271329c, aVar.f271329c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f271328b.hashCode() + (this.f271327a.hashCode() * 31)) * 31;
        b bVar = this.f271329c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ServiceProvider serviceProvider = this.d;
        return this.e.hashCode() + ((iHashCode2 + (serviceProvider != null ? serviceProvider.hashCode() : 0)) * 31);
    }
}
