package r6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f251652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251654c;
    public final String d;
    public final List e;
    public final String f;

    public b(a type, String str, String str2, String str3, List list, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f251652a = type;
        this.f251653b = str;
        this.f251654c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f251652a == bVar.f251652a && Intrinsics.f(this.f251653b, bVar.f251653b) && Intrinsics.f(this.f251654c, bVar.f251654c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f251652a.hashCode() * 31;
        String str = this.f251653b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f251654c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}
