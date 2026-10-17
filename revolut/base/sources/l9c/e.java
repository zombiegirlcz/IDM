package l9c;

import aii.r;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Card f193125a;

    public e(PaymentMethod.Card updatedPaymentMethod) {
        Intrinsics.checkNotNullParameter(updatedPaymentMethod, "updatedPaymentMethod");
        this.f193125a = updatedPaymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f193125a, ((e) obj2).f193125a);
    }

    public final int hashCode() {
        return this.f193125a.hashCode();
    }
}
