package ip0;

import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class u20 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w20 f166579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166580c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166582h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166583j;
    public final int k;

    public u20(String listId, w20 image) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        int i = R$attr.uikit_dp0;
        this.f166578a = listId;
        this.f166579b = image;
        this.f166580c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166581g = null;
        this.f166582h = i;
        this.i = i;
        this.f166583j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ProductSelectionLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52424a() {
        return this.f166578a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u20)) {
            return false;
        }
        u20 u20Var = (u20) obj2;
        return Intrinsics.f(this.f166578a, u20Var.f166578a) && this.f166579b == u20Var.f166579b && Intrinsics.f(this.f166580c, u20Var.f166580c) && Intrinsics.f(this.d, u20Var.d) && Intrinsics.f(this.e, u20Var.e) && Intrinsics.f(this.f, u20Var.f) && Intrinsics.f(this.f166581g, u20Var.f166581g) && this.f166582h == u20Var.f166582h && this.i == u20Var.i && this.f166583j == u20Var.f166583j && this.k == u20Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f166582h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166582h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166580c, (this.f166579b.hashCode() + (this.f166578a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166581g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166583j, j6.a.b(this.i, j6.a.b(this.f166582h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52435r() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166580c = cVar;
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
        return this.f166580c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52434q() {
        return this.f166581g;
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
        return this.f166583j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166581g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof u20 ? (u20) oldItem : null) == null) {
            return null;
        }
        u20 u20Var = (u20) oldItem;
        return new v20(this.f166579b != u20Var.f166579b, (Intrinsics.f(this.f166580c, u20Var.f166580c) && this.f166582h == u20Var.f166582h && this.i == u20Var.i && this.f166583j == u20Var.f166583j && this.k == u20Var.k) ? false : true);
    }
}
