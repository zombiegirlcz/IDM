package ip0;

import com.revolut.core.ui_kit.delegates.WalletWidgetLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class to0 implements qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f166552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166553c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166555h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166556j;

    public to0() {
        Intrinsics.checkNotNullParameter("ID_PASS_ITEM", "listId");
        c.e eVar = new c.e((qv0.h) null, 3);
        this.f166551a = "ID_PASS_ITEM";
        this.f166552b = eVar;
        this.f166553c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        int i = R$attr.uikit_dp0;
        this.f166554g = i;
        this.f166555h = i;
        this.i = i;
        this.f166556j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new WalletWidgetLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f166551a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof to0)) {
            return false;
        }
        to0 to0Var = (to0) obj2;
        return Intrinsics.f(this.f166551a, to0Var.f166551a) && Intrinsics.f(this.f166552b, to0Var.f166552b) && Intrinsics.f(this.f166553c, to0Var.f166553c) && Intrinsics.f(this.d, to0Var.d) && Intrinsics.f(this.e, to0Var.e) && Intrinsics.f(this.f, to0Var.f);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f166554g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166554g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166552b, this.f166551a.hashCode() * 31, 31);
        p31.c cVar = this.f166553c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166552b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.f166553c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f166555h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f166556j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166555h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f166552b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166553c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        to0 to0Var = oldItem instanceof to0 ? (to0) oldItem : null;
        if (to0Var != null) {
            return new uo0(or0.b.l(this, to0Var));
        }
        return null;
    }
}
