package pq0;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.lb0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f238640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model f238641c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f238642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f238643h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f238644j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f238645l;

    public f(String listId, e widgetTheme, RowDelegate.Model rowData) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        int i = R$attr.uikit_dp16;
        this.f238639a = listId;
        this.f238640b = widgetTheme;
        this.f238641c = rowData;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f238642g = null;
        this.f238643h = null;
        this.i = i;
        this.f238644j = i;
        this.k = i;
        this.f238645l = i;
    }

    public final RowDelegate.Model a() {
        return this.f238641c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53563a() {
        return this.f238639a;
    }

    public final e e() {
        return this.f238640b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f238639a, fVar.f238639a) && Intrinsics.f(this.f238640b, fVar.f238640b) && Intrinsics.f(this.f238641c, fVar.f238641c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f238642g, fVar.f238642g) && Intrinsics.f(this.f238643h, fVar.f238643h) && this.i == fVar.i && this.f238644j == fVar.f238644j && this.k == fVar.k && this.f238645l == fVar.f238645l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53567h() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.d, (this.f238641c.hashCode() + ((this.f238640b.hashCode() + (this.f238639a.hashCode() * 31)) * 31)) * 31, 31);
        p31.c cVar = this.e;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f238642g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f238643h;
        return Integer.hashCode(this.f238645l) + j6.a.b(this.k, j6.a.b(this.f238644j, j6.a.b(this.i, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53569l() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53570m() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f238642g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getI() {
        return this.f238644j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getK() {
        return this.f238645l;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f238644j = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53566g() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f238643h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53571n() {
        return this.f238642g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53568j() {
        return this.k;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f238643h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        g gVar = null;
        f fVar = oldItem instanceof f ? (f) oldItem : null;
        if (fVar != null) {
            gVar = new g(!((f) oldItem).f238640b.equals(this.f238640b) || or0.b.l(this, (qv0.i) oldItem), (lb0) this.f238641c.z(fVar.f238641c));
        }
        return gVar;
    }
}
