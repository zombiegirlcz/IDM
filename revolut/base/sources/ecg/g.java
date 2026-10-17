package ecg;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentMethod.Pocket f124732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124733b;

    public g(PaymentMethod.Pocket selectedPocket, boolean z) {
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        this.f124732a = selectedPocket;
        this.f124733b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f124732a, gVar.f124732a) && this.f124733b == gVar.f124733b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124733b) + (this.f124732a.hashCode() * 31);
    }
}
