package th9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentData f271331a;

    public c(PaymentData paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        this.f271331a = paymentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f271331a, ((c) obj2).f271331a);
    }

    public final int hashCode() {
        return this.f271331a.hashCode();
    }
}
