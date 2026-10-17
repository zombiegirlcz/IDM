package fui;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Pocket f138217a;

    public e(PaymentMethod.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f138217a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f138217a, ((e) obj2).f138217a);
    }

    public final int hashCode() {
        return this.f138217a.hashCode();
    }
}
