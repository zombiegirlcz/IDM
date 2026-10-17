package xec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f304589a;

    public h(ShippingContact shippingContact) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        this.f304589a = shippingContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f304589a, ((h) obj2).f304589a);
    }

    public final int hashCode() {
        return this.f304589a.hashCode();
    }
}
