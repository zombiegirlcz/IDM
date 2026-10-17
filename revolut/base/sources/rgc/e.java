package rgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f254077c;
    public final String d;
    public final String e;
    public final String f;

    public e(String str, String str2, String normal, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.f254075a = str;
        this.f254076b = str2;
        this.f254077c = normal;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f254075a, eVar.f254075a) && Intrinsics.f(this.f254076b, eVar.f254076b) && Intrinsics.f(this.f254077c, eVar.f254077c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        String str = this.f254075a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f254076b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f254077c);
        String str3 = this.d;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }
}
