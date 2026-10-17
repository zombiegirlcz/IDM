package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p2 implements b4 {

    @NotNull
    public static final o2 Companion = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216002c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f216003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f216004h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f216005j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f216006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f216007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f216008n;

    public p2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f216000a = str;
        this.f216001b = str2;
        this.f216002c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f216003g = str7;
        this.f216004h = str8;
        this.i = str9;
        this.f216005j = str10;
        this.k = str11;
        this.f216006l = str12;
        this.f216007m = str13;
        this.f216008n = str14;
    }

    @Override // nif.b4
    public final String N0() {
        return this.f;
    }

    @Override // nif.b4
    public final String O0() {
        return this.f216005j;
    }

    @Override // nif.b4
    public final String P0() {
        return this.f216007m;
    }

    @Override // nif.b4
    public final String Q0() {
        return this.f216008n;
    }

    @Override // nif.b4
    public final String R0() {
        return this.f216000a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f216000a, p2Var.f216000a) && Intrinsics.f(this.f216001b, p2Var.f216001b) && Intrinsics.f(this.f216002c, p2Var.f216002c) && Intrinsics.f(this.d, p2Var.d) && Intrinsics.f(this.e, p2Var.e) && Intrinsics.f(this.f, p2Var.f) && Intrinsics.f(this.f216003g, p2Var.f216003g) && Intrinsics.f(this.f216004h, p2Var.f216004h) && Intrinsics.f(this.i, p2Var.i) && Intrinsics.f(this.f216005j, p2Var.f216005j) && Intrinsics.f(this.k, p2Var.k) && Intrinsics.f(this.f216006l, p2Var.f216006l) && Intrinsics.f(this.f216007m, p2Var.f216007m) && Intrinsics.f(this.f216008n, p2Var.f216008n);
    }

    @Override // nif.b4
    public final String getCode() {
        return this.f216003g;
    }

    @Override // nif.b4
    public final String getCountry() {
        return this.f216004h;
    }

    @Override // nif.b4
    public final String getFirstName() {
        return this.f216002c;
    }

    @Override // nif.b4
    public final String getLastName() {
        return this.d;
    }

    @Override // nif.b4
    public final String getLegalName() {
        return this.f216001b;
    }

    @Override // nif.b4
    public final String getPhone() {
        return this.e;
    }

    @Override // nif.b4
    public final String getPocketId() {
        return this.i;
    }

    @Override // nif.b4
    public final String getType() {
        return this.f216006l;
    }

    public final int hashCode() {
        String str = this.f216000a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f216001b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f216002c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f216003g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f216004h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f216005j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f216006l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f216007m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f216008n;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }
}
