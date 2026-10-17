package th1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f271242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f271243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271244c;

    public c(Address address, Address address2, String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f271242a = address;
        this.f271243b = address2;
        this.f271244c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f271242a, cVar.f271242a) && Intrinsics.f(this.f271243b, cVar.f271243b) && Intrinsics.f(this.f271244c, cVar.f271244c);
    }

    public final int hashCode() {
        int iHashCode = this.f271242a.hashCode() * 31;
        Address address = this.f271243b;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.f271244c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
