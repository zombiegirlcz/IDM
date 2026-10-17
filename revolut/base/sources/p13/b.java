package p13;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f231831a;

    public b(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f231831a = address;
    }

    @Override // p13.d
    public final Address a() {
        return this.f231831a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f231831a, ((b) obj2).f231831a);
    }

    public final int hashCode() {
        return this.f231831a.hashCode();
    }
}
