package ip0;

import com.revolut.core.ui_kit.delegates.TripDetailsLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qm0 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f166017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166018c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166020h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166021j;

    public qm0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f166016a = listId;
        this.f166017b = c.d.f249513a;
        this.f166018c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f166019g = null;
        this.f166020h = null;
        this.i = null;
        this.f166021j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TripDetailsLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return this.f166016a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qm0)) {
            return false;
        }
        qm0 qm0Var = (qm0) obj2;
        return Intrinsics.f(this.f166016a, qm0Var.f166016a) && Intrinsics.f(this.f166017b, qm0Var.f166017b) && this.f166018c == qm0Var.f166018c && this.d == qm0Var.d && this.e == qm0Var.e && this.f == qm0Var.f && Intrinsics.f(this.f166019g, qm0Var.f166019g) && Intrinsics.f(this.f166020h, qm0Var.f166020h) && Intrinsics.f(this.i, qm0Var.i) && Intrinsics.f(this.f166021j, qm0Var.f166021j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f166018c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166018c = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166018c, h30.l.i(this.f166017b, this.f166016a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f166019g;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166020h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166021j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f166019g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166017b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.f166020h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f166017b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f166021j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166019g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166020h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166021j = cVar;
    }
}
