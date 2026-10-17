package sec;

import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeliveryMethods.DeliveryMethod f262168a;

    public c(DeliveryMethods.DeliveryMethod deliveryMethod) {
        Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
        this.f262168a = deliveryMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f262168a, ((c) obj2).f262168a);
    }

    public final int hashCode() {
        return this.f262168a.hashCode();
    }
}
