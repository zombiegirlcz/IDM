package lb1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f193574a;

    public d(Address deliveryAddress) {
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        this.f193574a = deliveryAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f193574a, ((d) obj2).f193574a);
    }

    public final int hashCode() {
        return this.f193574a.hashCode();
    }
}
