package bec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod f14794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f14795b;

    public l(PaymentMethod paymentMethod, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f14794a = paymentMethod;
        this.f14795b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f14794a, lVar.f14794a) && Intrinsics.f(this.f14795b, lVar.f14795b);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.f14794a;
        return this.f14795b.hashCode() + ((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31);
    }
}
