package th1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f271247a;

    public g(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f271247a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f271247a, ((g) obj2).f271247a);
    }

    public final int hashCode() {
        return this.f271247a.hashCode();
    }
}
