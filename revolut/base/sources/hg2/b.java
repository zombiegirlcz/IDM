package hg2;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCounterpartyInfo f152065a;

    public b(PaymentCounterpartyInfo destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f152065a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f152065a, ((b) obj2).f152065a);
    }

    public final int hashCode() {
        return this.f152065a.hashCode();
    }
}
