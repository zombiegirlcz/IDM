package gdc;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Card f143126a;

    public b(PaymentMethod.Card addedCard) {
        Intrinsics.checkNotNullParameter(addedCard, "addedCard");
        this.f143126a = addedCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f143126a, ((b) obj2).f143126a);
    }

    public final int hashCode() {
        return this.f143126a.hashCode();
    }
}
