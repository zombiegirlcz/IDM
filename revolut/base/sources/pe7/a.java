package pe7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f235332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235334c;
    public final String d;

    public a(Object src2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(src2, "src");
        this.f235332a = src2;
        this.f235333b = str;
        this.f235334c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f235332a, aVar.f235332a) && Intrinsics.f(this.f235333b, aVar.f235333b) && Intrinsics.f(this.f235334c, aVar.f235334c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f235332a.hashCode() * 31;
        String str = this.f235333b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f235334c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
