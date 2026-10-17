package eh9;

import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentData f125765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f125766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BillPaymentNavigation$BillData f125767c;
    public final int d;
    public final TransferScheduleData e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f125768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xo1.g f125769h;

    public a(PaymentData paymentData, b extraData, BillPaymentNavigation$BillData billData, int i, TransferScheduleData scheduleData, boolean z, boolean z3, xo1.g paymentMethod) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(billData, "billData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f125765a = paymentData;
        this.f125766b = extraData;
        this.f125767c = billData;
        this.d = i;
        this.e = scheduleData;
        this.f = z;
        this.f125768g = z3;
        this.f125769h = paymentMethod;
    }

    public static a a(a aVar, PaymentData paymentData, b bVar, int i, TransferScheduleData transferScheduleData, int i2) {
        if ((i2 & 1) != 0) {
            paymentData = aVar.f125765a;
        }
        PaymentData paymentData2 = paymentData;
        if ((i2 & 2) != 0) {
            bVar = aVar.f125766b;
        }
        b extraData = bVar;
        BillPaymentNavigation$BillData billData = aVar.f125767c;
        if ((i2 & 8) != 0) {
            i = aVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            transferScheduleData = aVar.e;
        }
        TransferScheduleData scheduleData = transferScheduleData;
        boolean z = aVar.f;
        boolean z3 = aVar.f125768g;
        xo1.g paymentMethod = aVar.f125769h;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(billData, "billData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new a(paymentData2, extraData, billData, i3, scheduleData, z, z3, paymentMethod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f125765a, aVar.f125765a) && Intrinsics.f(this.f125766b, aVar.f125766b) && Intrinsics.f(this.f125767c, aVar.f125767c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f125768g == aVar.f125768g && this.f125769h == aVar.f125769h;
    }

    public final int hashCode() {
        PaymentData paymentData = this.f125765a;
        return this.f125769h.hashCode() + j6.a.c(j6.a.c(h30.l.f(this.e, j6.a.b(this.d, (this.f125767c.hashCode() + ((this.f125766b.hashCode() + ((paymentData == null ? 0 : paymentData.hashCode()) * 31)) * 31)) * 31, 31), 31), 31, this.f), 31, this.f125768g);
    }
}
