package jq9;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCounterpartyInfo f177527a;

    public z(PaymentCounterpartyInfo counterparty) {
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        this.f177527a = counterparty;
    }

    @Override // jq9.t
    public final String a() {
        return this.f177527a.getDisplayName();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f177527a, ((z) obj2).f177527a);
    }

    public final int hashCode() {
        return this.f177527a.hashCode();
    }
}
