package gi1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f144026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f144027c;

    public j(Address address, Address address2, String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f144025a = str;
        this.f144026b = address;
        this.f144027c = address2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f144025a, jVar.f144025a) && Intrinsics.f(this.f144026b, jVar.f144026b) && Intrinsics.f(this.f144027c, jVar.f144027c);
    }

    public final int hashCode() {
        String str = this.f144025a;
        int iHashCode = (this.f144026b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Address address = this.f144027c;
        return iHashCode + (address != null ? address.hashCode() : 0);
    }
}
