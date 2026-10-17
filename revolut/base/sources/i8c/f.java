package i8c;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.Cashback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cashback f159496a;

    public f(Cashback cashback) {
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.f159496a = cashback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f159496a, ((f) obj2).f159496a);
    }

    public final int hashCode() {
        return this.f159496a.hashCode();
    }
}
