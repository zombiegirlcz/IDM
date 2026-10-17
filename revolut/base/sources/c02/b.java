package c02;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f20100c;

    public b(Address address, String shortName, String str) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        this.f20098a = shortName;
        this.f20099b = str;
        this.f20100c = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f20098a, bVar.f20098a) && Intrinsics.f(this.f20099b, bVar.f20099b) && Intrinsics.f(this.f20100c, bVar.f20100c);
    }

    public final int hashCode() {
        int iHashCode = this.f20098a.hashCode() * 31;
        String str = this.f20099b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Address address = this.f20100c;
        return iHashCode2 + (address != null ? address.hashCode() : 0);
    }
}
