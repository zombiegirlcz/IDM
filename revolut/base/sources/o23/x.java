package o23;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f221473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f221475c;
    public final boolean d;

    public x(Address address, String str, Boolean bool, int i) {
        bool = (i & 8) != 0 ? null : bool;
        boolean z = (i & 16) == 0;
        Intrinsics.checkNotNullParameter(address, "address");
        this.f221473a = address;
        this.f221474b = str;
        this.f221475c = bool;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f221473a, xVar.f221473a) && Intrinsics.f(this.f221474b, xVar.f221474b) && Intrinsics.f(this.f221475c, xVar.f221475c) && this.d == xVar.d;
    }

    public final int hashCode() {
        int iHashCode = ((this.f221473a.hashCode() * 31) - 311733877) * 31;
        String str = this.f221474b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f221475c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }
}
