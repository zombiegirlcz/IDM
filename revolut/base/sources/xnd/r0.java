package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f307440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f307441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f307442c;
    public final q0 d;
    public final o0 e;
    public final k0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f307443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f307444h;
    public final n0 i;

    public r0(y0 y0Var, m0 m0Var, p0 p0Var, q0 q0Var, o0 o0Var, k0 k0Var, Boolean bool, boolean z, n0 n0Var) {
        this.f307440a = y0Var;
        this.f307441b = m0Var;
        this.f307442c = p0Var;
        this.d = q0Var;
        this.e = o0Var;
        this.f = k0Var;
        this.f307443g = bool;
        this.f307444h = z;
        this.i = n0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f307440a, r0Var.f307440a) && Intrinsics.f(this.f307441b, r0Var.f307441b) && Intrinsics.f(this.f307442c, r0Var.f307442c) && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e) && Intrinsics.f(this.f, r0Var.f) && Intrinsics.f(this.f307443g, r0Var.f307443g) && this.f307444h == r0Var.f307444h && Intrinsics.f(this.i, r0Var.i);
    }

    public final int hashCode() {
        y0 y0Var = this.f307440a;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        m0 m0Var = this.f307441b;
        int iHashCode2 = (iHashCode + (m0Var == null ? 0 : m0Var.f307423a.hashCode())) * 31;
        p0 p0Var = this.f307442c;
        int iHashCode3 = (iHashCode2 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        q0 q0Var = this.d;
        int iHashCode4 = (iHashCode3 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        o0 o0Var = this.e;
        int iHashCode5 = (iHashCode4 + (o0Var == null ? 0 : o0Var.f307431a.hashCode())) * 31;
        k0 k0Var = this.f;
        int iHashCode6 = (iHashCode5 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        Boolean bool = this.f307443g;
        int iC = j6.a.c((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f307444h);
        n0 n0Var = this.i;
        return iC + (n0Var != null ? n0Var.hashCode() : 0);
    }
}
