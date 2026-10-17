package vxb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f293031c;
    public final long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f293032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f293033h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f293034j;
    public final a0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z f293035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f293036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f293037n;
    public final a0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f293038p;

    public y(String pointsTransactionId, String type, double d, long j2, String str, String str2, String state, String description, String str3, c0 c0Var, a0 a0Var, z zVar, String str4, String str5, a0 a0Var2, a0 a0Var3) {
        Intrinsics.checkNotNullParameter(pointsTransactionId, "pointsTransactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f293029a = pointsTransactionId;
        this.f293030b = type;
        this.f293031c = d;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.f293032g = state;
        this.f293033h = description;
        this.i = str3;
        this.f293034j = c0Var;
        this.k = a0Var;
        this.f293035l = zVar;
        this.f293036m = str4;
        this.f293037n = str5;
        this.o = a0Var2;
        this.f293038p = a0Var3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f293029a, yVar.f293029a) && Intrinsics.f(this.f293030b, yVar.f293030b) && Double.compare(this.f293031c, yVar.f293031c) == 0 && this.d == yVar.d && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f293032g, yVar.f293032g) && Intrinsics.f(this.f293033h, yVar.f293033h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f293034j, yVar.f293034j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f293035l, yVar.f293035l) && Intrinsics.f(this.f293036m, yVar.f293036m) && Intrinsics.f(this.f293037n, yVar.f293037n) && Intrinsics.f(this.o, yVar.o) && Intrinsics.f(this.f293038p, yVar.f293038p);
    }

    public final int hashCode() {
        int iC = a0.d.c(m72.b.c(p.a.c(this.f293029a.hashCode() * 31, 31, this.f293030b), this.f293031c, 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iC2 = p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f293032g), 31, this.f293033h);
        String str3 = this.i;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c0 c0Var = this.f293034j;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        a0 a0Var = this.k;
        int iHashCode4 = (iHashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        z zVar = this.f293035l;
        int iHashCode5 = (iHashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str4 = this.f293036m;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f293037n;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        a0 a0Var2 = this.o;
        int iHashCode8 = (iHashCode7 + (a0Var2 == null ? 0 : a0Var2.hashCode())) * 31;
        a0 a0Var3 = this.f293038p;
        return iHashCode8 + (a0Var3 != null ? a0Var3.hashCode() : 0);
    }
}
