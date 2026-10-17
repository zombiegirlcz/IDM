package f23;

import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrder f131357a;

    public d(CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        this.f131357a = checkoutOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f131357a, ((d) obj2).f131357a);
    }

    public final int hashCode() {
        return this.f131357a.hashCode();
    }
}
