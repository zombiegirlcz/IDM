package s63;

import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrder f260112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f260113b;

    public d(CheckoutOrder checkoutOrder, dj0.d requiredTopUpAmount) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        Intrinsics.checkNotNullParameter(requiredTopUpAmount, "requiredTopUpAmount");
        this.f260112a = checkoutOrder;
        this.f260113b = requiredTopUpAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f260112a, dVar.f260112a) && Intrinsics.f(this.f260113b, dVar.f260113b);
    }

    public final int hashCode() {
        return this.f260113b.hashCode() + (this.f260112a.hashCode() * 31);
    }
}
