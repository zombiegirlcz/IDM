package d4c;

import aii.r;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f111274a;

    public f(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f111274a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f111274a, ((f) obj2).f111274a);
    }

    public final int hashCode() {
        return this.f111274a.hashCode();
    }
}
