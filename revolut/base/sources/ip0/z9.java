package ip0;

import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class z9 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f167421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f167422c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f167423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167424h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167425j;

    public z9(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp0;
        this.f167420a = listId;
        this.f167421b = c.d.f249513a;
        this.f167422c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f167423g = i;
        this.f167424h = i;
        this.i = i;
        this.f167425j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ChallengeMediumImageCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f167420a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj2;
        return Intrinsics.f(this.f167420a, z9Var.f167420a) && Intrinsics.f(this.f167421b, z9Var.f167421b) && Intrinsics.f(this.f167422c, z9Var.f167422c) && Intrinsics.f(this.d, z9Var.d) && Intrinsics.f(this.e, z9Var.e) && Intrinsics.f(this.f, z9Var.f) && this.f167423g == z9Var.f167423g && this.f167424h == z9Var.f167424h && this.i == z9Var.i && this.f167425j == z9Var.f167425j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f167423g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167423g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167421b, this.f167420a.hashCode() * 31, 31);
        p31.c cVar = this.f167422c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f167425j) + j6.a.b(this.i, j6.a.b(this.f167424h, j6.a.b(this.f167423g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f167422c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167421b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f167424h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f167425j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167424h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f167421b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f167422c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
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

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof z9 ? (z9) oldItem : null) != null) {
            return new aa(or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
