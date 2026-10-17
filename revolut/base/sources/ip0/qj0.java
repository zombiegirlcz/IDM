package ip0;

import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qj0 implements qv0.i, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166004c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166006h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166007j;
    public final int k;

    public qj0(String listId, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i2 = R$attr.uikit_dp0;
        this.f166002a = listId;
        this.f166003b = i;
        this.f166004c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166005g = null;
        this.f166006h = i2;
        this.i = i2;
        this.f166007j = i2;
        this.k = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TabsLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53016n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53008a() {
        return this.f166002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj2;
        return this.f166002a.equals(qj0Var.f166002a) && this.f166003b == qj0Var.f166003b && Intrinsics.f(this.f166004c, qj0Var.f166004c) && Intrinsics.f(this.d, qj0Var.d) && Intrinsics.f(this.e, qj0Var.e) && Intrinsics.f(this.f, qj0Var.f) && Intrinsics.f(this.f166005g, qj0Var.f166005g) && this.f166006h == qj0Var.f166006h && this.i == qj0Var.i && this.f166007j == qj0Var.f166007j && this.k == qj0Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f166006h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166006h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166004c, j6.a.b(this.f166003b, this.f166002a.hashCode() * 31, 961), 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166005g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166007j, j6.a.b(this.i, j6.a.b(this.f166006h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166004c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f166004c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f166005g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.f166007j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166005g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof qj0 ? (qj0) oldItem : null) != null) {
            return new rj0(((qj0) oldItem).f166003b != this.f166003b, or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
