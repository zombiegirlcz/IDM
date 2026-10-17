package sec;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f262165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeliveryMethods.DeliveryMethod f262166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ShippingContact f262167c;

    public b(Data deliveryMethods, DeliveryMethods.DeliveryMethod selectedDeliveryMethod, ShippingContact shippingContact) {
        Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
        Intrinsics.checkNotNullParameter(selectedDeliveryMethod, "selectedDeliveryMethod");
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        this.f262165a = deliveryMethods;
        this.f262166b = selectedDeliveryMethod;
        this.f262167c = shippingContact;
    }

    public static b a(b bVar, Data deliveryMethods, DeliveryMethods.DeliveryMethod selectedDeliveryMethod, int i) {
        if ((i & 1) != 0) {
            deliveryMethods = bVar.f262165a;
        }
        if ((i & 2) != 0) {
            selectedDeliveryMethod = bVar.f262166b;
        }
        ShippingContact shippingContact = bVar.f262167c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
        Intrinsics.checkNotNullParameter(selectedDeliveryMethod, "selectedDeliveryMethod");
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        return new b(deliveryMethods, selectedDeliveryMethod, shippingContact);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f262165a, bVar.f262165a) && Intrinsics.f(this.f262166b, bVar.f262166b) && Intrinsics.f(this.f262167c, bVar.f262167c);
    }

    public final int hashCode() {
        return this.f262167c.hashCode() + ((this.f262166b.hashCode() + (this.f262165a.hashCode() * 31)) * 31);
    }
}
