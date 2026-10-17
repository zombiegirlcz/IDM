package ip0;

import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ed0 implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.models.h f164065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f164066c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164068h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164069j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f164070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uw0.i f164071m;

    public ed0(String listId, com.revolut.core.ui_kit.models.h chartData, ind.f fVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        int i = R$attr.uikit_dp0;
        this.f164064a = listId;
        this.f164065b = chartData;
        this.f164066c = fVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164067g = null;
        this.f164068h = i;
        this.i = i;
        this.f164069j = i;
        this.k = i;
        this.f164070l = c.d.f249513a;
        this.f164071m = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SegmentedGaugeChartDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return this.f164066c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52424a() {
        return this.f164064a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ed0)) {
            return false;
        }
        ed0 ed0Var = (ed0) obj2;
        return Intrinsics.f(this.f164064a, ed0Var.f164064a) && Intrinsics.f(this.f164065b, ed0Var.f164065b) && Intrinsics.f(this.f164066c, ed0Var.f164066c) && Intrinsics.f(this.d, ed0Var.d) && Intrinsics.f(this.e, ed0Var.e) && Intrinsics.f(this.f, ed0Var.f) && Intrinsics.f(this.f164067g, ed0Var.f164067g) && this.f164068h == ed0Var.f164068h && this.i == ed0Var.i && this.f164069j == ed0Var.f164069j && this.k == ed0Var.k && Intrinsics.f(this.f164070l, ed0Var.f164070l);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f164068h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164068h = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f164065b.hashCode() + (this.f164064a.hashCode() * 31)) * 31;
        Object obj2 = this.f164066c;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        p31.c cVar = this.d;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164067g;
        return this.f164070l.hashCode() + j6.a.b(this.k, j6.a.b(this.f164069j, j6.a.b(this.i, j6.a.b(this.f164068h, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52435r() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164070l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52430l() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52432n() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52436s() {
        return this.f164070l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52434q() {
        return this.f164067g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52433p() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52431m() {
        return this.f164069j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164067g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof ed0)) {
            return null;
        }
        ed0 ed0Var = (ed0) oldItem;
        return new fd0(!Intrinsics.f(this.f164065b, ed0Var.f164065b), or0.b.l(this, (qv0.i) oldItem), !Intrinsics.f(this.f164071m, ed0Var.f164071m));
    }
}
