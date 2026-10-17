package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215886c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215888h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215889j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f215892n;
    public final Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f215893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f215894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f215895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f215896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f215897t;

    public k1(String key, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, String str16, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f215884a = key;
        this.f215885b = str;
        this.f215886c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f215887g = str6;
        this.f215888h = str7;
        this.i = str8;
        this.f215889j = str9;
        this.k = str10;
        this.f215890l = str11;
        this.f215891m = str12;
        this.f215892n = str13;
        this.o = bool;
        this.f215893p = str14;
        this.f215894q = str15;
        this.f215895r = str16;
        this.f215896s = d;
        this.f215897t = d5;
    }

    public final String a() {
        return this.f215889j;
    }

    public final String b() {
        return this.f215892n;
    }

    public final String c() {
        return this.f215893p;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f215894q;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f215884a, k1Var.f215884a) && Intrinsics.f(this.f215885b, k1Var.f215885b) && Intrinsics.f(this.f215886c, k1Var.f215886c) && Intrinsics.f(this.d, k1Var.d) && Intrinsics.f(this.e, k1Var.e) && Intrinsics.f(this.f, k1Var.f) && Intrinsics.f(this.f215887g, k1Var.f215887g) && Intrinsics.f(this.f215888h, k1Var.f215888h) && Intrinsics.f(this.i, k1Var.i) && Intrinsics.f(this.f215889j, k1Var.f215889j) && Intrinsics.f(this.k, k1Var.k) && Intrinsics.f(this.f215890l, k1Var.f215890l) && Intrinsics.f(this.f215891m, k1Var.f215891m) && Intrinsics.f(this.f215892n, k1Var.f215892n) && Intrinsics.f(this.o, k1Var.o) && Intrinsics.f(this.f215893p, k1Var.f215893p) && Intrinsics.f(this.f215894q, k1Var.f215894q) && Intrinsics.f(this.f215895r, k1Var.f215895r) && Intrinsics.f(this.f215896s, k1Var.f215896s) && Intrinsics.f(this.f215897t, k1Var.f215897t);
    }

    public final Boolean f() {
        return this.o;
    }

    public final String g() {
        return this.f215887g;
    }

    public final String h() {
        return this.f215888h;
    }

    public final int hashCode() {
        int iHashCode = this.f215884a.hashCode() * 31;
        String str = this.f215885b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215886c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f215887g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215888h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f215889j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f215890l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f215891m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f215892n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.o;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str14 = this.f215893p;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f215894q;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f215895r;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Double d = this.f215896s;
        int iHashCode19 = (iHashCode18 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f215897t;
        return iHashCode19 + (d5 != null ? d5.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.f215886c;
    }

    public final String k() {
        return this.f215884a;
    }

    public final Double l() {
        return this.f215896s;
    }

    public final Double m() {
        return this.f215897t;
    }

    public final String n() {
        return this.f215891m;
    }

    public final String o() {
        return this.f;
    }

    public final String p() {
        return this.f215885b;
    }

    public final String q() {
        return this.e;
    }

    public final String r() {
        return this.f215890l;
    }

    public final String s() {
        return this.f215895r;
    }

    public final String t() {
        return this.k;
    }
}
