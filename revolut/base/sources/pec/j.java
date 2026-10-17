package pec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f235370a;

    public j(ShippingContact shippingContact) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        this.f235370a = shippingContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f235370a, ((j) obj2).f235370a);
    }

    public final int hashCode() {
        return this.f235370a.hashCode();
    }
}
