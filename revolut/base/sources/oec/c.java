package oec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f224578a;

    public c(ShippingContact shippingContact) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        this.f224578a = shippingContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f224578a, ((c) obj2).f224578a);
    }

    public final int hashCode() {
        return this.f224578a.hashCode();
    }
}
