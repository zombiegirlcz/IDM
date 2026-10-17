package mcd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204341c;
    public final String d;

    public c(String str, String str2, String str3, List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.f204339a = keys;
        this.f204340b = str;
        this.f204341c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f204339a, cVar.f204339a) && Intrinsics.f(this.f204340b, cVar.f204340b) && Intrinsics.f(this.f204341c, cVar.f204341c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f204339a.hashCode() * 31;
        String str = this.f204340b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f204341c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
