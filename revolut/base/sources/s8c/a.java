package s8c;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShippingContact f260966a;

    public a(ShippingContact shippingContact) {
        Intrinsics.checkNotNullParameter(shippingContact, "shippingContact");
        this.f260966a = shippingContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f260966a, ((a) obj2).f260966a);
    }

    public final int hashCode() {
        return this.f260966a.hashCode();
    }
}
