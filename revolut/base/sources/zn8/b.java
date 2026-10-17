package zn8;

import cli.j;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f323684a;

    public b(PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle) {
        this.f323684a = paymentLinkCustomAmountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f323684a, ((b) obj2).f323684a);
    }

    public final int hashCode() {
        PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = this.f323684a;
        if (paymentLinkCustomAmountBundle == null) {
            return 0;
        }
        return paymentLinkCustomAmountBundle.hashCode();
    }
}
