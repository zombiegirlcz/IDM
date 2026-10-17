package xy3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f309596a;

    public t(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f309596a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f309596a, ((t) obj2).f309596a);
    }

    public final int hashCode() {
        return this.f309596a.hashCode();
    }
}
