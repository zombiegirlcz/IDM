package ip0;

import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalLoadingV2Delegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class y30 implements tw0.y, qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f167241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f167242c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167244h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f167245j;

    public y30(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp4;
        this.f167240a = listId;
        this.f167241b = i;
        this.f167242c = i;
        this.d = i2;
        this.e = i2;
        this.f = c.d.f249513a;
        this.f167243g = null;
        this.f167244h = null;
        this.i = null;
        this.f167245j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProgressStepHorizontalLoadingV2Delegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f167240a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y30)) {
            return false;
        }
        y30 y30Var = (y30) obj2;
        return Intrinsics.f(this.f167240a, y30Var.f167240a) && this.f167241b == y30Var.f167241b && this.f167242c == y30Var.f167242c && this.d == y30Var.d && this.e == y30Var.e && Intrinsics.f(this.f, y30Var.f) && Intrinsics.f(this.f167243g, y30Var.f167243g) && Intrinsics.f(this.f167244h, y30Var.f167244h) && Intrinsics.f(this.i, y30Var.i) && Intrinsics.f(this.f167245j, y30Var.f167245j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f167241b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167241b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f167242c, j6.a.b(this.f167241b, this.f167240a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f167243g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f167244h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167245j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f167245j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f167243g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167244h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f167242c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167242c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52017g() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52019j() {
        return this.f167244h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167245j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52022n() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f167243g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
