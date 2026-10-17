package hb1;

import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Wallet f150551a;

    public d(PaymentMethod.Wallet account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f150551a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f150551a, ((d) obj2).f150551a);
    }

    public final int hashCode() {
        return this.f150551a.hashCode();
    }
}
