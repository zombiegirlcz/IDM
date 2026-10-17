package dec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.RevolutAccount.Wallet f113377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113378b;

    public u(PaymentMethod.RevolutAccount.Wallet wallet, boolean z) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        this.f113377a = wallet;
        this.f113378b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f113377a.equals(uVar.f113377a) && this.f113378b == uVar.f113378b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113378b) + (this.f113377a.hashCode() * 31);
    }
}
