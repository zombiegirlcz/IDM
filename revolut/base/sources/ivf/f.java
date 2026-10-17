package ivf;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Pocket f168845a;

    public f(PaymentMethod.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f168845a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f168845a, ((f) obj2).f168845a);
    }

    public final int hashCode() {
        return this.f168845a.hashCode();
    }
}
