package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111002c;
    public final String d;

    public c(String fallback, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        this.f111000a = fallback;
        this.f111001b = str;
        this.f111002c = str2;
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
        return Intrinsics.f(this.f111000a, cVar.f111000a) && Intrinsics.f(this.f111001b, cVar.f111001b) && Intrinsics.f(this.f111002c, cVar.f111002c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f111000a.hashCode() * 31;
        String str = this.f111001b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f111002c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
