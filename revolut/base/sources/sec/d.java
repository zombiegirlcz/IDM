package sec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f262169a;

    public d(ShippingContact selectedShippingContact) {
        Intrinsics.checkNotNullParameter(selectedShippingContact, "selectedShippingContact");
        this.f262169a = selectedShippingContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f262169a, ((d) obj2).f262169a);
    }

    public final int hashCode() {
        return this.f262169a.hashCode();
    }
}
