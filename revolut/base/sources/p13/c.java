package p13;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f231832a;

    public c(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f231832a = address;
    }

    @Override // p13.d
    public final Address a() {
        return this.f231832a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f231832a, ((c) obj2).f231832a);
    }

    public final int hashCode() {
        return this.f231832a.hashCode();
    }
}
