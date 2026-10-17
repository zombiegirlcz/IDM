package kl7;

import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f185328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f185329b;

    public h(Address shippingAddress, LocalDate expectedDeliveryDate) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        Intrinsics.checkNotNullParameter(expectedDeliveryDate, "expectedDeliveryDate");
        this.f185328a = shippingAddress;
        this.f185329b = expectedDeliveryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f185328a, hVar.f185328a) && Intrinsics.f(this.f185329b, hVar.f185329b);
    }

    public final int hashCode() {
        return this.f185329b.hashCode() + (this.f185328a.hashCode() * 31);
    }
}
