package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215844c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215846h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215847j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f215849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f215850n;

    public h2(String relatedTransactionId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(relatedTransactionId, "relatedTransactionId");
        this.f215842a = relatedTransactionId;
        this.f215843b = str;
        this.f215844c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f215845g = str6;
        this.f215846h = str7;
        this.i = str8;
        this.f215847j = str9;
        this.k = str10;
        this.f215848l = str11;
        this.f215849m = str12;
        this.f215850n = str13;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f215849m;
    }

    public final String e() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f215842a, h2Var.f215842a) && Intrinsics.f(this.f215843b, h2Var.f215843b) && Intrinsics.f(this.f215844c, h2Var.f215844c) && Intrinsics.f(this.d, h2Var.d) && Intrinsics.f(this.e, h2Var.e) && Intrinsics.f(this.f, h2Var.f) && Intrinsics.f(this.f215845g, h2Var.f215845g) && Intrinsics.f(this.f215846h, h2Var.f215846h) && Intrinsics.f(this.i, h2Var.i) && Intrinsics.f(this.f215847j, h2Var.f215847j) && Intrinsics.f(this.k, h2Var.k) && Intrinsics.f(this.f215848l, h2Var.f215848l) && Intrinsics.f(this.f215849m, h2Var.f215849m) && Intrinsics.f(this.f215850n, h2Var.f215850n);
    }

    public final String f() {
        return this.f215848l;
    }

    public final String g() {
        return this.f215850n;
    }

    public final String h() {
        return this.f215847j;
    }

    public final int hashCode() {
        int iHashCode = this.f215842a.hashCode() * 31;
        String str = this.f215843b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215844c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f215845g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215846h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f215847j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f215848l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f215849m;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f215850n;
        return iHashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String i() {
        return this.f215845g;
    }

    public final String j() {
        return this.f215843b;
    }

    public final String k() {
        return this.f215846h;
    }

    public final String l() {
        return this.f215844c;
    }

    public final String m() {
        return this.i;
    }
}
