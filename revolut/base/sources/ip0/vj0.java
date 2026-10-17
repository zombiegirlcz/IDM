package ip0;

import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class vj0 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagViewData f166826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jp f166827c;
    public final boolean d;
    public final Object e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f166829h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qv0.c f166830j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f166831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f166832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f166833n;

    public vj0(String listId, TagViewData tagData, boolean z, Object obj2, int i, int i2, int i3, int i5, int i6) {
        jp gravity = (i6 & 4) != 0 ? uj0.f166689b : tj0.f166533b;
        z = (i6 & 8) != 0 ? false : z;
        obj2 = (i6 & 16) != 0 ? null : obj2;
        i = (i6 & 32) != 0 ? R$attr.uikit_dp16 : i;
        i2 = (i6 & 64) != 0 ? R$attr.uikit_dp16 : i2;
        i3 = (i6 & 128) != 0 ? R$attr.uikit_dp16 : i3;
        i5 = (i6 & 256) != 0 ? R$attr.uikit_dp16 : i5;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(tagData, "tagData");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.f166825a = listId;
        this.f166826b = tagData;
        this.f166827c = gravity;
        this.d = z;
        this.e = obj2;
        this.f = i;
        this.f166828g = i2;
        this.f166829h = i3;
        this.i = i5;
        this.f166830j = c.d.f249513a;
        this.k = null;
        this.f166831l = null;
        this.f166832m = null;
        this.f166833n = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TagDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF51565t() {
        return this.e;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51552a() {
        return this.f166825a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj2;
        return Intrinsics.f(this.f166825a, vj0Var.f166825a) && Intrinsics.f(this.f166826b, vj0Var.f166826b) && Intrinsics.f(this.f166827c, vj0Var.f166827c) && this.d == vj0Var.d && Intrinsics.f(this.e, vj0Var.e) && this.f == vj0Var.f && this.f166828g == vj0Var.f166828g && this.f166829h == vj0Var.f166829h && this.i == vj0Var.i && Intrinsics.f(this.f166830j, vj0Var.f166830j) && Intrinsics.f(this.k, vj0Var.k) && Intrinsics.f(this.f166831l, vj0Var.f166831l) && Intrinsics.f(this.f166832m, vj0Var.f166832m) && Intrinsics.f(this.f166833n, vj0Var.f166833n);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51561p() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f166827c.hashCode() + ((this.f166826b.hashCode() + (this.f166825a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Object obj2 = this.e;
        int i = h30.l.i(this.f166830j, j6.a.b(this.i, j6.a.b(this.f166829h, j6.a.b(this.f166828g, j6.a.b(this.f, (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.k;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166831l;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f166832m;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166833n;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51558l() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166830j = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51559m() {
        return this.f166831l;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f166832m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51562q() {
        return this.f166828g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51564s() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166828g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f166830j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f166833n;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51560n() {
        return this.f166832m;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51563r() {
        return this.f166829h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166831l = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166833n = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        vj0 vj0Var = oldItem instanceof vj0 ? (vj0) oldItem : null;
        if (vj0Var != null) {
            return new wj0(!Intrinsics.f(vj0Var.f166826b, this.f166826b), !Intrinsics.f(vj0Var.f166827c, this.f166827c), vj0Var.d != this.d, or0.b.l(vj0Var, this));
        }
        return null;
    }
}
