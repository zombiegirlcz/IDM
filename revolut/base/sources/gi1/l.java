package gi1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f144038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f144039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144040c;
    public final String d;

    public l(Address address, Address address2, String str, String str2) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f144038a = address;
        this.f144039b = address2;
        this.f144040c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f144038a, lVar.f144038a) && Intrinsics.f(this.f144039b, lVar.f144039b) && Intrinsics.f(this.f144040c, lVar.f144040c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f144038a.hashCode() * 31;
        Address address = this.f144039b;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.f144040c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
