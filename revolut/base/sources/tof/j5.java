package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272850c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f272851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f272852h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f272853j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f272854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f272855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f272856n;
    public final j1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f272857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s5 f272858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final co3.a f272859r;

    public j5(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, j1 j1Var, String str14, s5 s5Var, co3.a aVar) {
        this.f272848a = str;
        this.f272849b = str2;
        this.f272850c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f272851g = str7;
        this.f272852h = str8;
        this.i = str9;
        this.f272853j = str10;
        this.k = str11;
        this.f272854l = str12;
        this.f272855m = str13;
        this.f272856n = bool;
        this.o = j1Var;
        this.f272857p = str14;
        this.f272858q = s5Var;
        this.f272859r = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj2;
        return Intrinsics.f(this.f272848a, j5Var.f272848a) && Intrinsics.f(this.f272849b, j5Var.f272849b) && Intrinsics.f(this.f272850c, j5Var.f272850c) && Intrinsics.f(this.d, j5Var.d) && Intrinsics.f(this.e, j5Var.e) && Intrinsics.f(this.f, j5Var.f) && Intrinsics.f(this.f272851g, j5Var.f272851g) && Intrinsics.f(this.f272852h, j5Var.f272852h) && Intrinsics.f(this.i, j5Var.i) && Intrinsics.f(this.f272853j, j5Var.f272853j) && Intrinsics.f(this.k, j5Var.k) && Intrinsics.f(this.f272854l, j5Var.f272854l) && Intrinsics.f(this.f272855m, j5Var.f272855m) && Intrinsics.f(this.f272856n, j5Var.f272856n) && this.o == j5Var.o && Intrinsics.f(this.f272857p, j5Var.f272857p) && this.f272858q == j5Var.f272858q && Intrinsics.f(this.f272859r, j5Var.f272859r);
    }

    public final int hashCode() {
        String str = this.f272848a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272849b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f272850c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f272851g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f272852h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f272853j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f272854l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f272855m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.f272856n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        j1 j1Var = this.o;
        int iHashCode15 = (iHashCode14 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        String str14 = this.f272857p;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        s5 s5Var = this.f272858q;
        int iHashCode17 = (iHashCode16 + (s5Var == null ? 0 : s5Var.hashCode())) * 31;
        co3.a aVar = this.f272859r;
        return iHashCode17 + (aVar != null ? aVar.hashCode() : 0);
    }
}
