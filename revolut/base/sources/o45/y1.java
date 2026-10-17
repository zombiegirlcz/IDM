package o45;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222146c;
    public final String d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f222147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f222148h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f222149j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f222150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f222151m;

    public y1(String refinancingIdentifier, String refinancingState, String loanId, String id10, String mode, long j2, String currency, String type, String state, boolean z, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
        Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f222144a = refinancingIdentifier;
        this.f222145b = refinancingState;
        this.f222146c = loanId;
        this.d = id10;
        this.e = mode;
        this.f = j2;
        this.f222147g = currency;
        this.f222148h = type;
        this.i = state;
        this.f222149j = z;
        this.k = str;
        this.f222150l = str2;
        this.f222151m = str3;
    }

    public final long a() {
        return this.f;
    }

    public final String b() {
        return this.k;
    }

    public final String c() {
        return this.f222147g;
    }

    public final String d() {
        return this.f222150l;
    }

    public final String e() {
        return this.f222151m;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.f222144a, y1Var.f222144a) && Intrinsics.f(this.f222145b, y1Var.f222145b) && Intrinsics.f(this.f222146c, y1Var.f222146c) && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e) && this.f == y1Var.f && Intrinsics.f(this.f222147g, y1Var.f222147g) && Intrinsics.f(this.f222148h, y1Var.f222148h) && Intrinsics.f(this.i, y1Var.i) && this.f222149j == y1Var.f222149j && Intrinsics.f(this.k, y1Var.k) && Intrinsics.f(this.f222150l, y1Var.f222150l) && Intrinsics.f(this.f222151m, y1Var.f222151m);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f222146c;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c(a0.d.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f222144a.hashCode() * 31, 31, this.f222145b), 31, this.f222146c), 31, this.d), 31, this.e), 31, this.f), 31, this.f222147g), 31, this.f222148h), 31, this.i), 31, this.f222149j);
        String str = this.k;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f222150l;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f222151m;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean i() {
        return this.f222149j;
    }

    public final String j() {
        return this.f222144a;
    }

    public final String k() {
        return this.f222145b;
    }

    public final String l() {
        return this.i;
    }

    public final String m() {
        return this.f222148h;
    }
}
