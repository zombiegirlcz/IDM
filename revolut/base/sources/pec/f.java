package pec;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f235365a;

    public f(Address shippingAddress) {
        Intrinsics.checkNotNullParameter(shippingAddress, "shippingAddress");
        this.f235365a = shippingAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f235365a, ((f) obj2).f235365a);
    }

    public final int hashCode() {
        return this.f235365a.hashCode();
    }
}
