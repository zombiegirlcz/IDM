package bg4;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final az3.a f15102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod.Pocket f15103b;

    public h(az3.a configuration, PaymentMethod.Pocket selectedPocket) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        this.f15102a = configuration;
        this.f15103b = selectedPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f15102a, hVar.f15102a) && Intrinsics.f(this.f15103b, hVar.f15103b);
    }

    public final int hashCode() {
        return this.f15103b.hashCode() + (this.f15102a.hashCode() * 31);
    }
}
