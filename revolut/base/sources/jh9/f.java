package jh9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f174160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentData f174161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f174162c;
    public final TransferScheduleData d;

    public f(dj0.d amount, PaymentData paymentData, g extraData, TransferScheduleData transferScheduleData) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f174160a = amount;
        this.f174161b = paymentData;
        this.f174162c = extraData;
        this.d = transferScheduleData;
    }

    public static f a(f fVar, PaymentData paymentData, g extraData, TransferScheduleData transferScheduleData, int i) {
        dj0.d amount = fVar.f174160a;
        if ((i & 2) != 0) {
            paymentData = fVar.f174161b;
        }
        if ((i & 4) != 0) {
            extraData = fVar.f174162c;
        }
        if ((i & 8) != 0) {
            transferScheduleData = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new f(amount, paymentData, extraData, transferScheduleData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f174160a, fVar.f174160a) && Intrinsics.f(this.f174161b, fVar.f174161b) && Intrinsics.f(this.f174162c, fVar.f174162c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f174160a.hashCode() * 31;
        PaymentData paymentData = this.f174161b;
        int iHashCode2 = (this.f174162c.hashCode() + ((iHashCode + (paymentData == null ? 0 : paymentData.hashCode())) * 31)) * 31;
        TransferScheduleData transferScheduleData = this.d;
        return iHashCode2 + (transferScheduleData != null ? transferScheduleData.hashCode() : 0);
    }
}
