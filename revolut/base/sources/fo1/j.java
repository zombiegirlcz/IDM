package fo1;

import com.revolut.feature.apm.bills.bpay.impl.model.BPayPaymentData;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPocketData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayPaymentData f136760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f136761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BPayPocketData f136762c;
    public final ApmQuote d;

    public j(BPayPaymentData paymentData, TransferScheduleData transferScheduleData, BPayPocketData pocketData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(transferScheduleData, "transferScheduleData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        this.f136760a = paymentData;
        this.f136761b = transferScheduleData;
        this.f136762c = pocketData;
        this.d = apmQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f136760a, jVar.f136760a) && Intrinsics.f(this.f136761b, jVar.f136761b) && Intrinsics.f(this.f136762c, jVar.f136762c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f136762c.hashCode() + h30.l.f(this.f136761b, this.f136760a.hashCode() * 31, 31)) * 31;
        ApmQuote apmQuote = this.d;
        return iHashCode + (apmQuote == null ? 0 : apmQuote.hashCode());
    }
}
