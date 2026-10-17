package pec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f235362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryMethods.DeliveryMethod f235363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mec.b f235364c;

    public d(ShippingContact shippingContact, DeliveryMethods.DeliveryMethod deliveryMethod, mec.b deliveryMethodAmount) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
        Intrinsics.checkNotNullParameter(deliveryMethodAmount, "deliveryMethodAmount");
        this.f235362a = shippingContact;
        this.f235363b = deliveryMethod;
        this.f235364c = deliveryMethodAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f235362a, dVar.f235362a) && Intrinsics.f(this.f235363b, dVar.f235363b) && Intrinsics.f(this.f235364c, dVar.f235364c);
    }

    public final int hashCode() {
        return this.f235364c.hashCode() + ((this.f235363b.hashCode() + (this.f235362a.hashCode() * 31)) * 31);
    }
}
