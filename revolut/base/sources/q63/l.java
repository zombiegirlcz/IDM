package q63;

import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrder f242473a;

    public l(CheckoutOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f242473a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f242473a, ((l) obj2).f242473a);
    }

    public final int hashCode() {
        return this.f242473a.hashCode();
    }
}
