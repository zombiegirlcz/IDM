package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143668c;
    public final String d;
    public final String e;
    public final String f;

    public t(String str, String str2, String normal, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.f143666a = str;
        this.f143667b = str2;
        this.f143668c = normal;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f143666a, tVar.f143666a) && Intrinsics.f(this.f143667b, tVar.f143667b) && Intrinsics.f(this.f143668c, tVar.f143668c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f);
    }

    public final int hashCode() {
        String str = this.f143666a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f143667b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f143668c);
        String str3 = this.d;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }
}
