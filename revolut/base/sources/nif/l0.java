package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f215909c;
    public final h1 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f215911h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215912j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f215915n;
    public final Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f215916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f215917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f215918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f215919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f215920t;
    public final t1 u;
    public final c1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n1 f215921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p1 f215922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0 f215923y;

    public l0(String legId, String str, Boolean bool, h1 h1Var, String str2, String str3, String str4, Boolean bool2, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool3, Boolean bool4, Boolean bool5, String str11, String str12, String str13, t1 t1Var, c1 c1Var, n1 n1Var, p1 p1Var, o0 o0Var) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f215907a = legId;
        this.f215908b = str;
        this.f215909c = bool;
        this.d = h1Var;
        this.e = str2;
        this.f = str3;
        this.f215910g = str4;
        this.f215911h = bool2;
        this.i = str5;
        this.f215912j = str6;
        this.k = str7;
        this.f215913l = str8;
        this.f215914m = str9;
        this.f215915n = str10;
        this.o = bool3;
        this.f215916p = bool4;
        this.f215917q = bool5;
        this.f215918r = str11;
        this.f215919s = str12;
        this.f215920t = str13;
        this.u = t1Var;
        this.v = c1Var;
        this.f215921w = n1Var;
        this.f215922x = p1Var;
        this.f215923y = o0Var;
    }

    public final Boolean a() {
        return this.o;
    }

    public final o0 b() {
        return this.f215923y;
    }

    public final String c() {
        return this.f215914m;
    }

    public final Boolean d() {
        return this.f215916p;
    }

    public final Boolean e() {
        return this.f215909c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f215907a, l0Var.f215907a) && Intrinsics.f(this.f215908b, l0Var.f215908b) && Intrinsics.f(this.f215909c, l0Var.f215909c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f215910g, l0Var.f215910g) && Intrinsics.f(this.f215911h, l0Var.f215911h) && Intrinsics.f(this.i, l0Var.i) && Intrinsics.f(this.f215912j, l0Var.f215912j) && Intrinsics.f(this.k, l0Var.k) && Intrinsics.f(this.f215913l, l0Var.f215913l) && Intrinsics.f(this.f215914m, l0Var.f215914m) && Intrinsics.f(this.f215915n, l0Var.f215915n) && Intrinsics.f(this.o, l0Var.o) && Intrinsics.f(this.f215916p, l0Var.f215916p) && Intrinsics.f(this.f215917q, l0Var.f215917q) && Intrinsics.f(this.f215918r, l0Var.f215918r) && Intrinsics.f(this.f215919s, l0Var.f215919s) && Intrinsics.f(this.f215920t, l0Var.f215920t) && Intrinsics.f(this.u, l0Var.u) && Intrinsics.f(this.v, l0Var.v) && Intrinsics.f(this.f215921w, l0Var.f215921w) && Intrinsics.f(this.f215922x, l0Var.f215922x) && Intrinsics.f(this.f215923y, l0Var.f215923y);
    }

    public final String f() {
        return this.f215910g;
    }

    public final String g() {
        return this.f215912j;
    }

    public final String h() {
        return this.f215915n;
    }

    public final int hashCode() {
        int iHashCode = this.f215907a.hashCode() * 31;
        String str = this.f215908b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f215909c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        h1 h1Var = this.d;
        int iHashCode4 = (iHashCode3 + (h1Var == null ? 0 : h1Var.f215841a.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f215910g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f215911h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f215912j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f215913l;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f215914m;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f215915n;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.o;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f215916p;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f215917q;
        int iHashCode17 = (iHashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str11 = this.f215918r;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f215919s;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f215920t;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        t1 t1Var = this.u;
        int iHashCode21 = (iHashCode20 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        c1 c1Var = this.v;
        int iHashCode22 = (iHashCode21 + (c1Var == null ? 0 : c1Var.f215726a.hashCode())) * 31;
        n1 n1Var = this.f215921w;
        int iHashCode23 = (iHashCode22 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        p1 p1Var = this.f215922x;
        int iHashCode24 = (iHashCode23 + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        o0 o0Var = this.f215923y;
        return iHashCode24 + (o0Var != null ? o0Var.hashCode() : 0);
    }

    public final String i() {
        return this.f215920t;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.f215907a;
    }

    public final c1 l() {
        return this.v;
    }

    public final h1 m() {
        return this.d;
    }

    public final String n() {
        return this.f215918r;
    }

    public final n1 o() {
        return this.f215921w;
    }

    public final p1 p() {
        return this.f215922x;
    }

    public final t1 q() {
        return this.u;
    }

    public final String r() {
        return this.f215908b;
    }

    public final Boolean s() {
        return this.f215911h;
    }

    public final String t() {
        return this.i;
    }

    public final Boolean u() {
        return this.f215917q;
    }

    public final String v() {
        return this.f215913l;
    }

    public final String w() {
        return this.f215919s;
    }

    public final String x() {
        return this.k;
    }

    public final String y() {
        return this.f;
    }
}
