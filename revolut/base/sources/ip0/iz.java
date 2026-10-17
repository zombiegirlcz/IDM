package ip0;

import com.revolut.core.ui_kit.delegates.OrderBookChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class iz implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.m8 f164757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f164758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164759c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f164760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164761h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164762j;
    public p31.c k;

    public iz(aw0.m8 chartModel, List labels, int i) {
        labels = (i & 4) != 0 ? zhm.f0.f322471a : labels;
        Intrinsics.checkNotNullParameter("OrderBook_Chart", "listId");
        Intrinsics.checkNotNullParameter(chartModel, "chartModel");
        Intrinsics.checkNotNullParameter(labels, "labels");
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp16;
        this.f164757a = chartModel;
        this.f164758b = labels;
        this.f164759c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i5;
        this.f164760g = c.C1364c.f249512a;
        this.f164761h = null;
        this.i = null;
        this.f164762j = null;
        this.k = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new OrderBookChartDelegate(0);
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51938a() {
        return "OrderBook_Chart";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof iz)) {
            return false;
        }
        iz izVar = (iz) obj2;
        return this.f164757a.equals(izVar.f164757a) && Intrinsics.f(this.f164758b, izVar.f164758b) && this.f164759c == izVar.f164759c && this.d == izVar.d && this.e == izVar.e && this.f == izVar.f && Intrinsics.f(this.f164760g, izVar.f164760g) && Intrinsics.f(this.f164761h, izVar.f164761h) && Intrinsics.f(this.i, izVar.i) && Intrinsics.f(this.f164762j, izVar.f164762j) && Intrinsics.f(this.k, izVar.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51945m() {
        return this.f164759c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164759c = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164760g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f164759c, j6.a.c(p.a.d((this.f164757a.hashCode() + 2121060874) * 31, 31, this.f164758b), 961, false), 31), 31), 31), 31), 31);
        p31.c cVar = this.f164761h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164762j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f164761h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164760g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51943j() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164762j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51946n() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51947p() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51941g() {
        return this.f164760g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51944l() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f164762j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164761h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof iz ? (iz) oldItem : null) == null) {
            return null;
        }
        iz izVar = (iz) oldItem;
        return new jz(!izVar.f164757a.equals(this.f164757a), !Intrinsics.f(izVar.f164758b, this.f164758b), false, or0.b.l(this, (qv0.i) oldItem));
    }
}
