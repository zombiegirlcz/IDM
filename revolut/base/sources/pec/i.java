package pec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f235368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryMethods.DeliveryMethod f235369b;

    public i(ShippingContact shippingContact, DeliveryMethods.DeliveryMethod deliveryMethod) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
        this.f235368a = shippingContact;
        this.f235369b = deliveryMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f235368a, iVar.f235368a) && Intrinsics.f(this.f235369b, iVar.f235369b);
    }

    public final int hashCode() {
        return this.f235369b.hashCode() + (this.f235368a.hashCode() * 31);
    }
}
