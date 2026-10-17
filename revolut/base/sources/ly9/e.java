package ly9;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCounterpartyInfo f200759a;

    public e(PaymentCounterpartyInfo counterparty) {
        Intrinsics.checkNotNullParameter(counterparty, "counterparty");
        this.f200759a = counterparty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f200759a, ((e) obj2).f200759a);
    }

    public final int hashCode() {
        return this.f200759a.hashCode();
    }
}
