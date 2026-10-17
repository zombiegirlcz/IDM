package ip0;

import com.revolut.core.ui_kit.delegates.FeedPostLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class di implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fi f163901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f163902c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163904h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163905j;
    public final int k;

    public di(String listId, fi ratio) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.f163900a = listId;
        this.f163901b = ratio;
        this.f163902c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163903g = null;
        this.f163904h = i;
        this.i = i;
        this.f163905j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new FeedPostLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52269a() {
        return this.f163900a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof di)) {
            return false;
        }
        di diVar = (di) obj2;
        return Intrinsics.f(this.f163900a, diVar.f163900a) && this.f163901b == diVar.f163901b && Intrinsics.f(this.f163902c, diVar.f163902c) && Intrinsics.f(this.d, diVar.d) && Intrinsics.f(this.e, diVar.e) && Intrinsics.f(this.f, diVar.f) && Intrinsics.f(this.f163903g, diVar.f163903g) && this.f163904h == diVar.f163904h && this.i == diVar.i && this.f163905j == diVar.f163905j && this.k == diVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52282t() {
        return this.f163904h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163904h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f163902c, (this.f163901b.hashCode() + (this.f163900a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163903g;
        return Integer.hashCode(this.k) + j6.a.b(this.f163905j, j6.a.b(this.i, j6.a.b(this.f163904h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52278p() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f163902c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52279q() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getU() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52283w() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f163902c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52281s() {
        return this.f163903g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52280r() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getV() {
        return this.f163905j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163903g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof di ? (di) oldItem : null) != null) {
            return new ei(((di) oldItem).f163901b != this.f163901b, or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
