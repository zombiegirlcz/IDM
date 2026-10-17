package so1;

import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPaymentData;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPocketData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayPaymentData f264673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f264674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferScheduleData f264675c;
    public final qua.p d;
    public final ScreenConfiguration e;
    public final BPayPocketData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApmQuote f264676g;

    public f(BPayPaymentData paymentData, boolean z, TransferScheduleData scheduleData, qua.p pVar, ScreenConfiguration screenConfiguration, BPayPocketData pocketData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        this.f264673a = paymentData;
        this.f264674b = z;
        this.f264675c = scheduleData;
        this.d = pVar;
        this.e = screenConfiguration;
        this.f = pocketData;
        this.f264676g = apmQuote;
    }

    public static f a(f fVar, BPayPaymentData bPayPaymentData, TransferScheduleData transferScheduleData, int i) {
        if ((i & 1) != 0) {
            bPayPaymentData = fVar.f264673a;
        }
        BPayPaymentData paymentData = bPayPaymentData;
        boolean z = fVar.f264674b;
        if ((i & 4) != 0) {
            transferScheduleData = fVar.f264675c;
        }
        TransferScheduleData scheduleData = transferScheduleData;
        qua.p pVar = fVar.d;
        ScreenConfiguration screenConfiguration = fVar.e;
        BPayPocketData pocketData = fVar.f;
        ApmQuote apmQuote = fVar.f264676g;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        return new f(paymentData, z, scheduleData, pVar, screenConfiguration, pocketData, apmQuote);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f264673a, fVar.f264673a) && this.f264674b == fVar.f264674b && Intrinsics.f(this.f264675c, fVar.f264675c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f264676g, fVar.f264676g);
    }

    public final int hashCode() {
        int iF = h30.l.f(this.f264675c, j6.a.c(this.f264673a.hashCode() * 31, 31, this.f264674b), 31);
        qua.p pVar = this.d;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((iF + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31)) * 31;
        ApmQuote apmQuote = this.f264676g;
        return iHashCode + (apmQuote != null ? apmQuote.hashCode() : 0);
    }
}
