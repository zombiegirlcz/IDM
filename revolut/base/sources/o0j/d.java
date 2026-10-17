package o0j;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f221230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221231b;

    public d(String str, Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f221230a = address;
        this.f221231b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f221230a, dVar.f221230a) && Intrinsics.f(this.f221231b, dVar.f221231b);
    }

    public final int hashCode() {
        int iHashCode = this.f221230a.hashCode() * 31;
        String str = this.f221231b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
