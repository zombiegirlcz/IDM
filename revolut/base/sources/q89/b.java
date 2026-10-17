package q89;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f243045a;

    public b(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f243045a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f243045a, ((b) obj2).f243045a);
    }

    public final int hashCode() {
        return this.f243045a.hashCode();
    }
}
