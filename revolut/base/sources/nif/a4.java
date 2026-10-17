package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215705c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215707h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215708j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f215711n;
    public final String o;

    public a4(String key, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f215703a = key;
        this.f215704b = str;
        this.f215705c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f215706g = str6;
        this.f215707h = str7;
        this.i = str8;
        this.f215708j = str9;
        this.k = str10;
        this.f215709l = str11;
        this.f215710m = str12;
        this.f215711n = str13;
        this.o = str14;
    }

    public final String a() {
        return this.f215709l;
    }

    public final String b() {
        return this.f215711n;
    }

    public final String c() {
        return this.f215707h;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.f215703a, a4Var.f215703a) && Intrinsics.f(this.f215704b, a4Var.f215704b) && Intrinsics.f(this.f215705c, a4Var.f215705c) && Intrinsics.f(this.d, a4Var.d) && Intrinsics.f(this.e, a4Var.e) && Intrinsics.f(this.f, a4Var.f) && Intrinsics.f(this.f215706g, a4Var.f215706g) && Intrinsics.f(this.f215707h, a4Var.f215707h) && Intrinsics.f(this.i, a4Var.i) && Intrinsics.f(this.f215708j, a4Var.f215708j) && Intrinsics.f(this.k, a4Var.k) && Intrinsics.f(this.f215709l, a4Var.f215709l) && Intrinsics.f(this.f215710m, a4Var.f215710m) && Intrinsics.f(this.f215711n, a4Var.f215711n) && Intrinsics.f(this.o, a4Var.o);
    }

    public final String f() {
        return this.o;
    }

    public final String g() {
        return this.f215703a;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f215703a.hashCode() * 31;
        String str = this.f215704b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215705c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f215706g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215707h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f215708j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f215709l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f215710m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f215711n;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.o;
        return iHashCode14 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String i() {
        return this.f215705c;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.f215708j;
    }

    public final String l() {
        return this.k;
    }

    public final String m() {
        return this.f215710m;
    }

    public final String n() {
        return this.f215704b;
    }

    public final String o() {
        return this.f215706g;
    }
}
