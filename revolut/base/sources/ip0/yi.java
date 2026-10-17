package ip0;

import com.revolut.core.ui_kit.delegates.FlexibleBarChartLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class yi implements qv0.q, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d5 f167318c;
    public final Object d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f167320h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f167321j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f167322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qv0.c f167323m;

    public /* synthetic */ yi() {
        this("PNL_CHART_LIST_ID", null, aw0.d5.REGULAR);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FlexibleBarChartLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.d;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52438a() {
        return this.f167316a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj2;
        return Intrinsics.f(this.f167316a, yiVar.f167316a) && this.f167317b == yiVar.f167317b && this.f167318c == yiVar.f167318c && Intrinsics.f(this.d, yiVar.d) && Intrinsics.f(this.e, yiVar.e) && Intrinsics.f(this.f, yiVar.f) && Intrinsics.f(this.f167319g, yiVar.f167319g) && Intrinsics.f(this.f167320h, yiVar.f167320h) && this.i == yiVar.i && this.f167321j == yiVar.f167321j && this.k == yiVar.k && this.f167322l == yiVar.f167322l && Intrinsics.f(this.f167323m, yiVar.f167323m);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f167318c.hashCode() + j6.a.c(this.f167316a.hashCode() * 31, 31, this.f167317b)) * 31;
        Object obj2 = this.d;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        p31.c cVar = this.e;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f167319g;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167320h;
        return this.f167323m.hashCode() + j6.a.b(this.f167322l, j6.a.b(this.k, j6.a.b(this.f167321j, j6.a.b(this.i, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52447p() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167323m = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52448q() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f167319g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52444l() {
        return this.f167321j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52446n() {
        return this.f167322l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f167321j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f167323m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52450s() {
        return this.f167320h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52449r() {
        return this.f167319g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52445m() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f167320h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof yi ? (yi) oldItem : null) == null) {
            return null;
        }
        yi yiVar = (yi) oldItem;
        return new zi(this.f167317b != yiVar.f167317b, this.f167318c != yiVar.f167318c, or0.b.l(this, (qv0.i) oldItem));
    }

    public yi(String listId, ind.f fVar, aw0.d5 heightMode) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        int i = R$attr.uikit_dp0;
        this.f167316a = listId;
        this.f167317b = true;
        this.f167318c = heightMode;
        this.d = fVar;
        this.e = null;
        this.f = null;
        this.f167319g = null;
        this.f167320h = null;
        this.i = i;
        this.f167321j = i;
        this.k = i;
        this.f167322l = i;
        this.f167323m = c.d.f249513a;
    }
}
