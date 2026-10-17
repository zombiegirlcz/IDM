package oec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f224577a;

    public b(ShippingContact shippingContact) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        this.f224577a = shippingContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f224577a, ((b) obj2).f224577a);
    }

    public final int hashCode() {
        return this.f224577a.hashCode();
    }
}
