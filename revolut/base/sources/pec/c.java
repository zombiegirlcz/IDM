package pec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f235361a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f235361a, ((c) obj2).f235361a);
    }

    public final int hashCode() {
        ShippingContact shippingContact = this.f235361a;
        if (shippingContact == null) {
            return 0;
        }
        return shippingContact.hashCode();
    }

    public c(ShippingContact shippingContact) {
        this.f235361a = shippingContact;
    }
}
