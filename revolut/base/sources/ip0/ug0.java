package ip0;

import com.revolut.core.ui_kit.delegates.SmartTileTextLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ug0 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f166660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f166661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166662c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166664h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new SmartTileTextLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return "THINKING_ITEM_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ug0)) {
            return false;
        }
        ug0 ug0Var = (ug0) obj2;
        return Intrinsics.f(this.f166660a, ug0Var.f166660a) && Intrinsics.f(this.f166661b, ug0Var.f166661b) && Intrinsics.f(this.f166662c, ug0Var.f166662c) && Intrinsics.f(this.d, ug0Var.d) && Intrinsics.f(this.e, ug0Var.e) && this.f == ug0Var.f && this.f166663g == ug0Var.f166663g && this.f166664h == ug0Var.f166664h && this.i == ug0Var.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166660a, 72223944, 31);
        p31.c cVar = this.f166661b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166662c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return Integer.hashCode(this.i) + j6.a.b(this.f166664h, j6.a.b(this.f166663g, j6.a.b(this.f, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f166661b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166660a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f166662c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f166663g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166663g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f166660a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166661b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.f166664h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166662c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
