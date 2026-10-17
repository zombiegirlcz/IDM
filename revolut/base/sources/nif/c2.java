package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c2 implements b4 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215729c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215731h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215732j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f215735n;

    public c2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f215727a = str;
        this.f215728b = str2;
        this.f215729c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f215730g = str7;
        this.f215731h = str8;
        this.i = str9;
        this.f215732j = str10;
        this.k = str11;
        this.f215733l = str12;
        this.f215734m = str13;
        this.f215735n = str14;
    }

    @Override // nif.b4
    public final String N0() {
        return this.f;
    }

    @Override // nif.b4
    public final String O0() {
        return this.f215732j;
    }

    @Override // nif.b4
    public final String P0() {
        return this.f215734m;
    }

    @Override // nif.b4
    public final String Q0() {
        return this.f215735n;
    }

    @Override // nif.b4
    public final String R0() {
        return this.f215727a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f215727a, c2Var.f215727a) && Intrinsics.f(this.f215728b, c2Var.f215728b) && Intrinsics.f(this.f215729c, c2Var.f215729c) && Intrinsics.f(this.d, c2Var.d) && Intrinsics.f(this.e, c2Var.e) && Intrinsics.f(this.f, c2Var.f) && Intrinsics.f(this.f215730g, c2Var.f215730g) && Intrinsics.f(this.f215731h, c2Var.f215731h) && Intrinsics.f(this.i, c2Var.i) && Intrinsics.f(this.f215732j, c2Var.f215732j) && Intrinsics.f(this.k, c2Var.k) && Intrinsics.f(this.f215733l, c2Var.f215733l) && Intrinsics.f(this.f215734m, c2Var.f215734m) && Intrinsics.f(this.f215735n, c2Var.f215735n);
    }

    @Override // nif.b4
    public final String getCode() {
        return this.f215730g;
    }

    @Override // nif.b4
    public final String getCountry() {
        return this.f215731h;
    }

    @Override // nif.b4
    public final String getFirstName() {
        return this.f215729c;
    }

    @Override // nif.b4
    public final String getLastName() {
        return this.d;
    }

    @Override // nif.b4
    public final String getLegalName() {
        return this.f215728b;
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
        return this.f215733l;
    }

    public final int hashCode() {
        String str = this.f215727a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215728b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215729c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215730g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f215731h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f215732j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f215733l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f215734m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f215735n;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }
}
