package fo1;

import com.revolut.feature.apm.bills.bpay.impl.model.BPayPaymentData;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPocketData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayPaymentData f136755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f136756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BPayPocketData f136757c;
    public final ApmQuote d;

    public h(BPayPaymentData paymentData, TransferScheduleData transferScheduleData, BPayPocketData pocketData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(transferScheduleData, "transferScheduleData");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        this.f136755a = paymentData;
        this.f136756b = transferScheduleData;
        this.f136757c = pocketData;
        this.d = apmQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f136755a, hVar.f136755a) && Intrinsics.f(this.f136756b, hVar.f136756b) && Intrinsics.f(this.f136757c, hVar.f136757c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f136757c.hashCode() + h30.l.f(this.f136756b, this.f136755a.hashCode() * 31, 31)) * 31;
        ApmQuote apmQuote = this.d;
        return iHashCode + (apmQuote == null ? 0 : apmQuote.hashCode());
    }
}
