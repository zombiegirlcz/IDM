package ip0;

import com.revolut.core.ui_kit.delegates.ComparisonLineChartLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class qb implements qv0.q, qv0.p, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.x1 f165953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f165954c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f165955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165956h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165957j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f165958l;

    public qb(String listId, aw0.x1 heightMode, ind.f fVar, int i, int i2, int i3) {
        fVar = (i3 & 4) != 0 ? null : fVar;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f165952a = listId;
        this.f165953b = heightMode;
        this.f165954c = fVar;
        this.d = i5;
        this.e = i5;
        this.f = i;
        this.f165955g = i2;
        this.f165958l = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ComparisonLineChartLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52567m() {
        return this.f165954c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53482a() {
        return this.f165952a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj2;
        return Intrinsics.f(this.f165952a, qbVar.f165952a) && this.f165953b == qbVar.f165953b && Intrinsics.f(this.f165954c, qbVar.f165954c) && this.d == qbVar.d && this.e == qbVar.e && this.f == qbVar.f && this.f165955g == qbVar.f165955g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f165953b.hashCode() + (this.f165952a.hashCode() * 31)) * 31;
        Object obj2 = this.f165954c;
        return Integer.hashCode(this.f165955g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.f165956h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165958l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165957j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.f165955g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f165958l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.f165957j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165956h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f;
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
        if ((oldItem instanceof qb ? (qb) oldItem : null) != null) {
            return new rb(this.f165953b != ((qb) oldItem).f165953b, or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
