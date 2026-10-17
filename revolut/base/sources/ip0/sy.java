package ip0;

import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class sy implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ry f166403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166404c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166406h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166407j;
    public p31.c k;

    public sy(String listId, ry style, int i) {
        style = (i & 2) != 0 ? ry.DEFAULT : style;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f166402a = listId;
        this.f166403b = style;
        this.f166404c = i2;
        this.d = i2;
        this.e = i2;
        this.f = i2;
        this.f166405g = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new NewsLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52866a() {
        return this.f166402a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sy)) {
            return false;
        }
        sy syVar = (sy) obj2;
        return Intrinsics.f(this.f166402a, syVar.f166402a) && this.f166403b == syVar.f166403b && this.f166404c == syVar.f166404c && this.d == syVar.d && this.e == syVar.e && this.f == syVar.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52878s() {
        return this.f166404c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166404c = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166404c, (this.f166403b.hashCode() + (this.f166402a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166405g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52875p() {
        return this.f166406h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52879t() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getV() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52874n() {
        return this.f166405g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52877r() {
        return this.f166407j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52876q() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getU() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166406h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166407j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof sy ? (sy) oldItem : null) != null) {
            return new ty(((sy) oldItem).f166403b != this.f166403b);
        }
        return null;
    }
}
