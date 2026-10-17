package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215765c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f215766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f215767h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f215768j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f215769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f215770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f215771n;
    public final Long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f215772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Long f215773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Long f215774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Long f215775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f215776t;
    public final Long u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f215777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f215778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f215779y;
    public final q2 z;

    public e1(String legId, String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, Long l5, Long l22, Long l31, Long l37, Long l39, Long l51, Long l52, Long l60, Long l66, Long l69, Long l79, Long l81, Long l82, String str5, String str6, String str7, String str8, q2 q2Var) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f215763a = legId;
        this.f215764b = str;
        this.f215765c = str2;
        this.d = str3;
        this.e = str4;
        this.f = l2;
        this.f215766g = l3;
        this.f215767h = l4;
        this.i = l5;
        this.f215768j = l22;
        this.k = l31;
        this.f215769l = l37;
        this.f215770m = l39;
        this.f215771n = l51;
        this.o = l52;
        this.f215772p = l60;
        this.f215773q = l66;
        this.f215774r = l69;
        this.f215775s = l79;
        this.f215776t = l81;
        this.u = l82;
        this.v = str5;
        this.f215777w = str6;
        this.f215778x = str7;
        this.f215779y = str8;
        this.z = q2Var;
    }

    public final String a() {
        return this.f215777w;
    }

    public final String b() {
        return this.v;
    }

    public final String c() {
        return this.f215778x;
    }

    public final String d() {
        return this.f215763a;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f215763a, e1Var.f215763a) && Intrinsics.f(this.f215764b, e1Var.f215764b) && Intrinsics.f(this.f215765c, e1Var.f215765c) && Intrinsics.f(this.d, e1Var.d) && Intrinsics.f(this.e, e1Var.e) && Intrinsics.f(this.f, e1Var.f) && Intrinsics.f(this.f215766g, e1Var.f215766g) && Intrinsics.f(this.f215767h, e1Var.f215767h) && Intrinsics.f(this.i, e1Var.i) && Intrinsics.f(this.f215768j, e1Var.f215768j) && Intrinsics.f(this.k, e1Var.k) && Intrinsics.f(this.f215769l, e1Var.f215769l) && Intrinsics.f(this.f215770m, e1Var.f215770m) && Intrinsics.f(this.f215771n, e1Var.f215771n) && Intrinsics.f(this.o, e1Var.o) && Intrinsics.f(this.f215772p, e1Var.f215772p) && Intrinsics.f(this.f215773q, e1Var.f215773q) && Intrinsics.f(this.f215774r, e1Var.f215774r) && Intrinsics.f(this.f215775s, e1Var.f215775s) && Intrinsics.f(this.f215776t, e1Var.f215776t) && Intrinsics.f(this.u, e1Var.u) && Intrinsics.f(this.v, e1Var.v) && Intrinsics.f(this.f215777w, e1Var.f215777w) && Intrinsics.f(this.f215778x, e1Var.f215778x) && Intrinsics.f(this.f215779y, e1Var.f215779y) && Intrinsics.f(this.z, e1Var.z);
    }

    public final String f() {
        return this.d;
    }

    public final Long g() {
        return this.f215769l;
    }

    public final Long h() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = this.f215763a.hashCode() * 31;
        String str = this.f215764b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215765c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f215766g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f215767h;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.i;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.f215768j;
        int iHashCode10 = (iHashCode9 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.k;
        int iHashCode11 = (iHashCode10 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l37 = this.f215769l;
        int iHashCode12 = (iHashCode11 + (l37 == null ? 0 : l37.hashCode())) * 31;
        Long l39 = this.f215770m;
        int iHashCode13 = (iHashCode12 + (l39 == null ? 0 : l39.hashCode())) * 31;
        Long l51 = this.f215771n;
        int iHashCode14 = (iHashCode13 + (l51 == null ? 0 : l51.hashCode())) * 31;
        Long l52 = this.o;
        int iHashCode15 = (iHashCode14 + (l52 == null ? 0 : l52.hashCode())) * 31;
        Long l60 = this.f215772p;
        int iHashCode16 = (iHashCode15 + (l60 == null ? 0 : l60.hashCode())) * 31;
        Long l66 = this.f215773q;
        int iHashCode17 = (iHashCode16 + (l66 == null ? 0 : l66.hashCode())) * 31;
        Long l69 = this.f215774r;
        int iHashCode18 = (iHashCode17 + (l69 == null ? 0 : l69.hashCode())) * 31;
        Long l79 = this.f215775s;
        int iHashCode19 = (iHashCode18 + (l79 == null ? 0 : l79.hashCode())) * 31;
        Long l81 = this.f215776t;
        int iHashCode20 = (iHashCode19 + (l81 == null ? 0 : l81.hashCode())) * 31;
        Long l82 = this.u;
        int iHashCode21 = (iHashCode20 + (l82 == null ? 0 : l82.hashCode())) * 31;
        String str5 = this.v;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f215777w;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215778x;
        int iHashCode24 = (iHashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f215779y;
        int iHashCode25 = (iHashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        q2 q2Var = this.z;
        return iHashCode25 + (q2Var != null ? q2Var.hashCode() : 0);
    }

    public final Long i() {
        return this.f215768j;
    }

    public final Long j() {
        return this.f215770m;
    }

    public final Long k() {
        return this.f215776t;
    }

    public final Long l() {
        return this.f215772p;
    }

    public final Long m() {
        return this.o;
    }

    public final Long n() {
        return this.f215771n;
    }

    public final Long o() {
        return this.f215773q;
    }

    public final Long p() {
        return this.u;
    }

    public final Long q() {
        return this.f215774r;
    }

    public final String r() {
        return this.f215779y;
    }

    public final Long s() {
        return this.f215767h;
    }

    public final Long t() {
        return this.f215766g;
    }

    public final Long u() {
        return this.f;
    }

    public final Long v() {
        return this.i;
    }

    public final Long w() {
        return this.f215775s;
    }

    public final String x() {
        return this.f215765c;
    }

    public final String y() {
        return this.f215764b;
    }

    public final q2 z() {
        return this.z;
    }
}
