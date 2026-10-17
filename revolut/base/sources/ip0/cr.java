package ip0;

import com.revolut.core.ui_kit.delegates.InputSliderLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class cr implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final br f163783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163784c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f163785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f163786h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f163787j;
    public p31.c k;

    public cr(String listId, br gravity) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        int i = R$attr.uikit_dp16;
        this.f163782a = listId;
        this.f163783b = gravity;
        this.f163784c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f163785g = c.d.f249513a;
        this.f163786h = null;
        this.i = null;
        this.f163787j = null;
        this.k = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new InputSliderLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return this.f163782a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj2;
        return Intrinsics.f(this.f163782a, crVar.f163782a) && this.f163783b == crVar.f163783b && this.f163784c == crVar.f163784c && this.d == crVar.d && this.e == crVar.e && this.f == crVar.f && Intrinsics.f(this.f163785g, crVar.f163785g) && Intrinsics.f(this.f163786h, crVar.f163786h) && Intrinsics.f(this.i, crVar.i) && Intrinsics.f(this.f163787j, crVar.f163787j) && Intrinsics.f(this.k, crVar.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f163784c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163784c = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163785g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f163784c, (this.f163783b.hashCode() + (this.f163782a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f163786h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f163787j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f163786h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163785g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f163787j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f163785g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f163787j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f163786h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
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
        if ((oldItem instanceof cr ? (cr) oldItem : null) != null) {
            return new dr(((cr) oldItem).f163783b != this.f163783b, or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
