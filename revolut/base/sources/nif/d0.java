package nif;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215745c;
    public final b0 d;
    public final b0 e;
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f215746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f215747h;
    public final b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215748j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f215749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f215750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0 f215751n;
    public final f0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f215752p;

    public d0(String legId, String accountId, String accountScopedAssetId, b0 amount, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, String str, BigDecimal bigDecimal, c0 c0Var, e0 e0Var, f0 f0Var, f0 f0Var2, String str2) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountScopedAssetId, "accountScopedAssetId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f215743a = legId;
        this.f215744b = accountId;
        this.f215745c = accountScopedAssetId;
        this.d = amount;
        this.e = b0Var;
        this.f = b0Var2;
        this.f215746g = b0Var3;
        this.f215747h = b0Var4;
        this.i = b0Var5;
        this.f215748j = str;
        this.k = bigDecimal;
        this.f215749l = c0Var;
        this.f215750m = e0Var;
        this.f215751n = f0Var;
        this.o = f0Var2;
        this.f215752p = str2;
    }

    public final String a() {
        return this.f215744b;
    }

    public final String b() {
        return this.f215745c;
    }

    public final b0 c() {
        return this.d;
    }

    public final c0 d() {
        return this.f215749l;
    }

    public final String e() {
        return this.f215752p;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f215743a, d0Var.f215743a) && Intrinsics.f(this.f215744b, d0Var.f215744b) && Intrinsics.f(this.f215745c, d0Var.f215745c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f215746g, d0Var.f215746g) && Intrinsics.f(this.f215747h, d0Var.f215747h) && Intrinsics.f(this.i, d0Var.i) && Intrinsics.f(this.f215748j, d0Var.f215748j) && Intrinsics.f(this.k, d0Var.k) && Intrinsics.f(this.f215749l, d0Var.f215749l) && Intrinsics.f(this.f215750m, d0Var.f215750m) && Intrinsics.f(this.f215751n, d0Var.f215751n) && Intrinsics.f(this.o, d0Var.o) && Intrinsics.f(this.f215752p, d0Var.f215752p);
    }

    public final b0 f() {
        return this.i;
    }

    public final String g() {
        return this.f215748j;
    }

    public final b0 h() {
        return this.f215747h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f215743a.hashCode() * 31, 31, this.f215744b), 31, this.f215745c)) * 31;
        b0 b0Var = this.e;
        int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        b0 b0Var2 = this.f;
        int iHashCode3 = (iHashCode2 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        b0 b0Var3 = this.f215746g;
        int iHashCode4 = (iHashCode3 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
        b0 b0Var4 = this.f215747h;
        int iHashCode5 = (iHashCode4 + (b0Var4 == null ? 0 : b0Var4.hashCode())) * 31;
        b0 b0Var5 = this.i;
        int iHashCode6 = (iHashCode5 + (b0Var5 == null ? 0 : b0Var5.hashCode())) * 31;
        String str = this.f215748j;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.k;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        c0 c0Var = this.f215749l;
        int iHashCode9 = (iHashCode8 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        e0 e0Var = this.f215750m;
        int iHashCode10 = (iHashCode9 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        f0 f0Var = this.f215751n;
        int iHashCode11 = (iHashCode10 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        f0 f0Var2 = this.o;
        int iHashCode12 = (iHashCode11 + (f0Var2 == null ? 0 : f0Var2.hashCode())) * 31;
        String str2 = this.f215752p;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final b0 i() {
        return this.e;
    }

    public final b0 j() {
        return this.f215746g;
    }

    public final b0 k() {
        return this.f;
    }

    public final String l() {
        return this.f215743a;
    }

    public final e0 m() {
        return this.f215750m;
    }

    public final BigDecimal n() {
        return this.k;
    }

    public final f0 o() {
        return this.f215751n;
    }

    public final f0 p() {
        return this.o;
    }
}
