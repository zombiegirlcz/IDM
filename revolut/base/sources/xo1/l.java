package xo1;

import com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails;
import com.revolut.feature.apm.bills.core.api.model.BillTransferType;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferType f307577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f307578c;
    public final dj0.d d;
    public final ApmPaymentSource e;
    public final BillTransferPaymentMethodDetails f;

    public l(g paymentMethod, BillTransferType type, List inputs, dj0.d amount, ApmPaymentSource source, BillTransferPaymentMethodDetails billTransferPaymentMethodDetails) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f307576a = paymentMethod;
        this.f307577b = type;
        this.f307578c = inputs;
        this.d = amount;
        this.e = source;
        this.f = billTransferPaymentMethodDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f307576a == lVar.f307576a && this.f307577b == lVar.f307577b && Intrinsics.f(this.f307578c, lVar.f307578c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + v7.c(p.a.d((this.f307577b.hashCode() + (this.f307576a.hashCode() * 31)) * 31, 31, this.f307578c), 31, this.d)) * 31;
        BillTransferPaymentMethodDetails billTransferPaymentMethodDetails = this.f;
        return iHashCode + (billTransferPaymentMethodDetails == null ? 0 : billTransferPaymentMethodDetails.hashCode());
    }
}
