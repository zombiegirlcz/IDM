package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f215950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f215951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f215952c;
    public final k1 d;
    public final m1 e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f215953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f215954h;
    public final h2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k0 f215955j;
    public final z k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f215956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f215957m;

    public n2(f3 transactionEntity, c2 c2Var, p2 p2Var, k1 k1Var, m1 m1Var, c cVar, e1 e1Var, l0 l0Var, h2 h2Var, k0 k0Var, z zVar, d0 d0Var, boolean z) {
        Intrinsics.checkNotNullParameter(transactionEntity, "transactionEntity");
        this.f215950a = transactionEntity;
        this.f215951b = c2Var;
        this.f215952c = p2Var;
        this.d = k1Var;
        this.e = m1Var;
        this.f = cVar;
        this.f215953g = e1Var;
        this.f215954h = l0Var;
        this.i = h2Var;
        this.f215955j = k0Var;
        this.k = zVar;
        this.f215956l = d0Var;
        this.f215957m = z;
    }

    public static n2 a(n2 n2Var, h2 h2Var) {
        f3 transactionEntity = n2Var.f215950a;
        c2 c2Var = n2Var.f215951b;
        p2 p2Var = n2Var.f215952c;
        k1 k1Var = n2Var.d;
        m1 m1Var = n2Var.e;
        c cVar = n2Var.f;
        e1 e1Var = n2Var.f215953g;
        l0 l0Var = n2Var.f215954h;
        k0 k0Var = n2Var.f215955j;
        z zVar = n2Var.k;
        d0 d0Var = n2Var.f215956l;
        boolean z = n2Var.f215957m;
        Intrinsics.checkNotNullParameter(transactionEntity, "transactionEntity");
        return new n2(transactionEntity, c2Var, p2Var, k1Var, m1Var, cVar, e1Var, l0Var, h2Var, k0Var, zVar, d0Var, z);
    }

    public final c b() {
        return this.f;
    }

    public final z c() {
        return this.k;
    }

    public final d0 d() {
        return this.f215956l;
    }

    public final l0 e() {
        return this.f215954h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f215950a, n2Var.f215950a) && Intrinsics.f(this.f215951b, n2Var.f215951b) && Intrinsics.f(this.f215952c, n2Var.f215952c) && Intrinsics.f(this.d, n2Var.d) && Intrinsics.f(this.e, n2Var.e) && Intrinsics.f(this.f, n2Var.f) && Intrinsics.f(this.f215953g, n2Var.f215953g) && Intrinsics.f(this.f215954h, n2Var.f215954h) && Intrinsics.f(this.i, n2Var.i) && Intrinsics.f(this.f215955j, n2Var.f215955j) && Intrinsics.f(this.k, n2Var.k) && Intrinsics.f(this.f215956l, n2Var.f215956l) && this.f215957m == n2Var.f215957m;
    }

    public final k1 f() {
        return this.d;
    }

    public final h2 g() {
        return this.i;
    }

    public final f3 h() {
        return this.f215950a;
    }

    public final int hashCode() {
        int iHashCode = this.f215950a.hashCode() * 31;
        c2 c2Var = this.f215951b;
        int iHashCode2 = (iHashCode + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        p2 p2Var = this.f215952c;
        int iHashCode3 = (iHashCode2 + (p2Var == null ? 0 : p2Var.hashCode())) * 31;
        k1 k1Var = this.d;
        int iHashCode4 = (iHashCode3 + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        m1 m1Var = this.e;
        int iHashCode5 = (iHashCode4 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        c cVar = this.f;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e1 e1Var = this.f215953g;
        int iHashCode7 = (iHashCode6 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        l0 l0Var = this.f215954h;
        int iHashCode8 = (iHashCode7 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        h2 h2Var = this.i;
        int iHashCode9 = (iHashCode8 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        k0 k0Var = this.f215955j;
        int iHashCode10 = (iHashCode9 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        z zVar = this.k;
        int iHashCode11 = (iHashCode10 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        d0 d0Var = this.f215956l;
        return Boolean.hashCode(this.f215957m) + ((iHashCode11 + (d0Var != null ? d0Var.hashCode() : 0)) * 31);
    }
}
