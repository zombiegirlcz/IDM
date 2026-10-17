package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends u6c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Card f84405a;

    public a(PaymentMethod.Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f84405a = card;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f84405a, ((a) obj2).f84405a);
    }

    public final int hashCode() {
        return this.f84405a.hashCode();
    }
}
