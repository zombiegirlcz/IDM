package ip0;

import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class bo0 implements tw0.y, qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163646c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163648h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163649j;

    public bo0(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163644a = listId;
        this.f163645b = i;
        this.f163646c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f163647g = null;
        this.f163648h = null;
        this.i = null;
        this.f163649j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new VoucherSmallLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55201b() {
        return this.f163644a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bo0)) {
            return false;
        }
        bo0 bo0Var = (bo0) obj2;
        return Intrinsics.f(this.f163644a, bo0Var.f163644a) && this.f163645b == bo0Var.f163645b && this.f163646c == bo0Var.f163646c && this.d == bo0Var.d && this.e == bo0Var.e && Intrinsics.f(this.f, bo0Var.f) && Intrinsics.f(this.f163647g, bo0Var.f163647g) && Intrinsics.f(this.f163648h, bo0Var.f163648h) && Intrinsics.f(this.i, bo0Var.i) && Intrinsics.f(this.f163649j, bo0Var.f163649j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f163645b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163645b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f163646c, j6.a.b(this.f163645b, this.f163644a.hashCode() * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f163647g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f163648h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163649j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f163649j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.f163647g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163648h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f163646c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f163646c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.f163648h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163649j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f163647g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
