package o9c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.Cashback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cashback f223222a;

    public r(Cashback cashback) {
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.f223222a = cashback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f223222a, ((r) obj2).f223222a);
    }

    public final int hashCode() {
        return this.f223222a.hashCode();
    }
}
