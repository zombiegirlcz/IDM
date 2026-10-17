package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f215861c;
    public final Integer d;
    public final Integer e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215863h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215864j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215865l;

    public i1(String str, String str2, Boolean bool, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f215859a = str;
        this.f215860b = str2;
        this.f215861c = bool;
        this.d = num;
        this.e = num2;
        this.f = str3;
        this.f215862g = str4;
        this.f215863h = str5;
        this.i = str6;
        this.f215864j = str7;
        this.k = str8;
        this.f215865l = str9;
    }

    public final String a() {
        return this.f215859a;
    }

    public final String b() {
        return this.f215862g;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.f215863h;
    }

    public final Boolean e() {
        return this.f215861c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f215859a, i1Var.f215859a) && Intrinsics.f(this.f215860b, i1Var.f215860b) && Intrinsics.f(this.f215861c, i1Var.f215861c) && Intrinsics.f(this.d, i1Var.d) && Intrinsics.f(this.e, i1Var.e) && Intrinsics.f(this.f, i1Var.f) && Intrinsics.f(this.f215862g, i1Var.f215862g) && Intrinsics.f(this.f215863h, i1Var.f215863h) && Intrinsics.f(this.i, i1Var.i) && Intrinsics.f(this.f215864j, i1Var.f215864j) && Intrinsics.f(this.k, i1Var.k) && Intrinsics.f(this.f215865l, i1Var.f215865l);
    }

    public final String f() {
        return this.k;
    }

    public final String g() {
        return this.f215864j;
    }

    public final String h() {
        return this.f215865l;
    }

    public final int hashCode() {
        String str = this.f215859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215860b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f215861c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f215862g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f215863h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215864j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f215865l;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final Integer i() {
        return this.d;
    }

    public final Integer j() {
        return this.e;
    }

    public final String k() {
        return this.f215860b;
    }

    public final String l() {
        return this.i;
    }
}
