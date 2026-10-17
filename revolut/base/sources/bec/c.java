package bec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Card f14765a;

    public c(PaymentMethod.Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f14765a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f14765a, ((c) obj2).f14765a);
    }

    public final int hashCode() {
        return this.f14765a.hashCode();
    }
}
