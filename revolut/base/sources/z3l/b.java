package z3l;

import dj0.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319302c;
    public final String d;
    public final d e;

    public b(d value, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f319300a = str;
        this.f319301b = str2;
        this.f319302c = str3;
        this.d = str4;
        this.e = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319300a, bVar.f319300a) && Intrinsics.f(this.f319301b, bVar.f319301b) && Intrinsics.f(this.f319302c, bVar.f319302c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        String str = this.f319300a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f319301b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f319302c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
