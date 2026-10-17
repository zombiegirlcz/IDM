package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215874c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i1 f215876h;

    public j1(String str, String str2, String str3, String str4, String str5, String str6, String str7, i1 i1Var) {
        this.f215872a = str;
        this.f215873b = str2;
        this.f215874c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f215875g = str7;
        this.f215876h = i1Var;
    }

    public final i1 a() {
        return this.f215876h;
    }

    public final String b() {
        return this.f215875g;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f215873b;
    }

    public final String e() {
        return this.f215872a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f215872a, j1Var.f215872a) && Intrinsics.f(this.f215873b, j1Var.f215873b) && Intrinsics.f(this.f215874c, j1Var.f215874c) && Intrinsics.f(this.d, j1Var.d) && Intrinsics.f(this.e, j1Var.e) && Intrinsics.f(this.f, j1Var.f) && Intrinsics.f(this.f215875g, j1Var.f215875g) && Intrinsics.f(this.f215876h, j1Var.f215876h);
    }

    public final String f() {
        return this.f215874c;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f215872a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215873b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215874c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215875g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        i1 i1Var = this.f215876h;
        return iHashCode7 + (i1Var != null ? i1Var.hashCode() : 0);
    }
}
