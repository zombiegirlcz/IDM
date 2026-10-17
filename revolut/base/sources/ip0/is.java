package ip0;

import com.revolut.core.ui_kit.delegates.LargeSliderLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class is implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164739c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164741h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164742j;

    public is(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int i = R$attr.uikit_dp16;
        this.f164737a = listId;
        this.f164738b = i;
        this.f164739c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
        this.f164740g = null;
        this.f164741h = null;
        this.i = null;
        this.f164742j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new LargeSliderLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return this.f164737a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof is)) {
            return false;
        }
        is isVar = (is) obj2;
        return Intrinsics.f(this.f164737a, isVar.f164737a) && this.f164738b == isVar.f164738b && this.f164739c == isVar.f164739c && this.d == isVar.d && this.e == isVar.e && Intrinsics.f(this.f, isVar.f) && Intrinsics.f(this.f164740g, isVar.f164740g) && Intrinsics.f(this.f164741h, isVar.f164741h) && Intrinsics.f(this.i, isVar.i) && Intrinsics.f(this.f164742j, isVar.f164742j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f164738b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164738b = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f164739c, j6.a.b(this.f164738b, this.f164737a.hashCode() * 923521, 31), 31), 31), 31), 31);
        p31.c cVar = this.f164740g;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164741h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164742j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f164740g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.f164741h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f164739c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164739c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f164742j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164740g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164741h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164742j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof is ? (is) oldItem : null) == null) {
            return null;
        }
        ((is) oldItem).getClass();
        return new js(!true, !true, !true, or0.b.l(this, (qv0.i) oldItem));
    }
}
