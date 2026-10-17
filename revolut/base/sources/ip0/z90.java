package ip0;

import com.revolut.core.ui_kit.delegates.RectangularButtonLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class z90 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f167427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f167428c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f167429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167430h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167431j;

    public z90(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f167426a = listId;
        this.f167427b = c.d.f249513a;
        this.f167428c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f167429g = i;
        this.f167430h = i;
        this.i = i;
        this.f167431j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RectangularButtonLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return this.f167426a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z90)) {
            return false;
        }
        z90 z90Var = (z90) obj2;
        return Intrinsics.f(this.f167426a, z90Var.f167426a) && Intrinsics.f(this.f167427b, z90Var.f167427b) && Intrinsics.f(this.f167428c, z90Var.f167428c) && Intrinsics.f(this.d, z90Var.d) && Intrinsics.f(this.e, z90Var.e) && Intrinsics.f(this.f, z90Var.f) && this.f167429g == z90Var.f167429g && this.f167430h == z90Var.f167430h && this.i == z90Var.i && this.f167431j == z90Var.f167431j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f167429g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167429g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167427b, this.f167426a.hashCode() * 31, 31);
        p31.c cVar = this.f167428c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f167431j) + j6.a.b(this.i, j6.a.b(this.f167430h, j6.a.b(this.f167429g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f167428c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167427b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f167430h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f167431j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167430h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f167427b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167428c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }
}
