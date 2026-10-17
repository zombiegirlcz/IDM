package f5j;

import com.revolut.feature.address.models.Address;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132348c;
    public final String d;
    public final Address e;

    public b(String str, String str2, String str3, String str4, Address address) {
        this.f132346a = str;
        this.f132347b = str2;
        this.f132348c = str3;
        this.d = str4;
        this.e = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f132346a, bVar.f132346a) && Intrinsics.f(this.f132347b, bVar.f132347b) && Intrinsics.f(this.f132348c, bVar.f132348c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        String str = this.f132346a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f132347b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132348c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Address address = this.e;
        return iHashCode4 + (address != null ? address.hashCode() : 0);
    }
}
