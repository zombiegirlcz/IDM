package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f216073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4 f216074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f216075c;
    public final k1 d;
    public final m1 e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f216076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f216077h;
    public final z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f216078j;

    public y0(f3 transactionEntity, a4 a4Var, a4 a4Var2, k1 k1Var, m1 m1Var, c cVar, e1 e1Var, l0 l0Var, z zVar, d0 d0Var) {
        Intrinsics.checkNotNullParameter(transactionEntity, "transactionEntity");
        this.f216073a = transactionEntity;
        this.f216074b = a4Var;
        this.f216075c = a4Var2;
        this.d = k1Var;
        this.e = m1Var;
        this.f = cVar;
        this.f216076g = e1Var;
        this.f216077h = l0Var;
        this.i = zVar;
        this.f216078j = d0Var;
    }

    public final c a() {
        return this.f;
    }

    public final z b() {
        return this.i;
    }

    public final d0 c() {
        return this.f216078j;
    }

    public final l0 d() {
        return this.f216077h;
    }

    public final e1 e() {
        return this.f216076g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f216073a, y0Var.f216073a) && Intrinsics.f(this.f216074b, y0Var.f216074b) && Intrinsics.f(this.f216075c, y0Var.f216075c) && Intrinsics.f(this.d, y0Var.d) && Intrinsics.f(this.e, y0Var.e) && Intrinsics.f(this.f, y0Var.f) && Intrinsics.f(this.f216076g, y0Var.f216076g) && Intrinsics.f(this.f216077h, y0Var.f216077h) && Intrinsics.f(this.i, y0Var.i) && Intrinsics.f(this.f216078j, y0Var.f216078j);
    }

    public final k1 f() {
        return this.d;
    }

    public final m1 g() {
        return this.e;
    }

    public final a4 h() {
        return this.f216074b;
    }

    public final int hashCode() {
        int iHashCode = this.f216073a.hashCode() * 31;
        a4 a4Var = this.f216074b;
        int iHashCode2 = (iHashCode + (a4Var == null ? 0 : a4Var.hashCode())) * 31;
        a4 a4Var2 = this.f216075c;
        int iHashCode3 = (iHashCode2 + (a4Var2 == null ? 0 : a4Var2.hashCode())) * 31;
        k1 k1Var = this.d;
        int iHashCode4 = (iHashCode3 + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        m1 m1Var = this.e;
        int iHashCode5 = (iHashCode4 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        c cVar = this.f;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e1 e1Var = this.f216076g;
        int iHashCode7 = (iHashCode6 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        l0 l0Var = this.f216077h;
        int iHashCode8 = (iHashCode7 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        z zVar = this.i;
        int iHashCode9 = (iHashCode8 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        d0 d0Var = this.f216078j;
        return iHashCode9 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final a4 i() {
        return this.f216075c;
    }

    public final f3 j() {
        return this.f216073a;
    }
}
