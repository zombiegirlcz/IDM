package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215987c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215989h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215990j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f215991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f215993n;
    public final String o;

    public o3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String legId, long j2, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f215985a = str;
        this.f215986b = str2;
        this.f215987c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f215988g = str7;
        this.f215989h = str8;
        this.i = str9;
        this.f215990j = str10;
        this.k = legId;
        this.f215991l = j2;
        this.f215992m = str11;
        this.f215993n = str12;
        this.o = str13;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.f215985a, o3Var.f215985a) && Intrinsics.f(this.f215986b, o3Var.f215986b) && Intrinsics.f(this.f215987c, o3Var.f215987c) && Intrinsics.f(this.d, o3Var.d) && Intrinsics.f(this.e, o3Var.e) && Intrinsics.f(this.f, o3Var.f) && Intrinsics.f(this.f215988g, o3Var.f215988g) && Intrinsics.f(this.f215989h, o3Var.f215989h) && Intrinsics.f(this.i, o3Var.i) && Intrinsics.f(this.f215990j, o3Var.f215990j) && Intrinsics.f(this.k, o3Var.k) && this.f215991l == o3Var.f215991l && Intrinsics.f(this.f215992m, o3Var.f215992m) && Intrinsics.f(this.f215993n, o3Var.f215993n) && Intrinsics.f(this.o, o3Var.o);
    }

    public final int hashCode() {
        String str = this.f215985a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215986b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215987c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215988g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f215989h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f215990j;
        int iC = a0.d.c(p.a.c((iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.k), 31, this.f215991l);
        String str11 = this.f215992m;
        int iHashCode10 = (iC + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f215993n;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.o;
        return iHashCode11 + (str13 != null ? str13.hashCode() : 0);
    }
}
