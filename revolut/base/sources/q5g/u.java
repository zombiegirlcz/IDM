package q5g;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Pocket f242392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242393b;

    public u(PaymentMethod.Pocket selectedPocket, boolean z) {
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        this.f242392a = selectedPocket;
        this.f242393b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f242392a, uVar.f242392a) && this.f242393b == uVar.f242393b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242393b) + (this.f242392a.hashCode() * 31);
    }
}
