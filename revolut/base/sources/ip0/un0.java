package ip0;

import com.revolut.core.ui_kit.delegates.VoucherExtraSmallLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class un0 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166706c;
    public final int d;
    public final int e;
    public final tn0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f166707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f166708h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f166709j;
    public p31.c k;

    public un0(String listId, tn0 heightMode) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f166704a = listId;
        this.f166705b = i;
        this.f166706c = i;
        this.d = i;
        this.e = i;
        this.f = heightMode;
        this.f166707g = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new VoucherExtraSmallLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53304a() {
        return this.f166704a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof un0)) {
            return false;
        }
        un0 un0Var = (un0) obj2;
        return Intrinsics.f(this.f166704a, un0Var.f166704a) && this.f166705b == un0Var.f166705b && this.f166706c == un0Var.f166706c && this.d == un0Var.d && this.e == un0Var.e && this.f == un0Var.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53315r() {
        return this.f166705b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166705b = i;
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f166706c, j6.a.b(this.f166705b, this.f166704a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53314q() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166707g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53312n() {
        return this.f166708h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53316s() {
        return this.f166706c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166706c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53310l() {
        return this.f166707g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53313p() {
        return this.f166709j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getO() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53317t() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166708h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166709j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof un0 ? (un0) oldItem : null) != null) {
            return new vn0(((un0) oldItem).f != this.f);
        }
        return null;
    }
}
