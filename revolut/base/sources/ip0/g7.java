package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class g7 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7 f164354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f164355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164356c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164358h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164359j;

    public g7(f7 f7Var) {
        Intrinsics.checkNotNullParameter("TRANSFER_RATE_LOADING_ITEM_ID", "listId");
        int i = R$attr.uikit_dp16;
        this.f164354a = f7Var;
        this.f164355b = c.d.f249513a;
        this.f164356c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164357g = i;
        this.f164358h = i;
        this.i = i;
        this.f164359j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CellDetailsHeadlineLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55187b() {
        return "TRANSFER_RATE_LOADING_ITEM_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj2;
        return this.f164354a.equals(g7Var.f164354a) && Intrinsics.f(this.f164355b, g7Var.f164355b) && Intrinsics.f(this.f164356c, g7Var.f164356c) && Intrinsics.f(this.d, g7Var.d) && Intrinsics.f(this.e, g7Var.e) && Intrinsics.f(this.f, g7Var.f) && this.f164357g == g7Var.f164357g && this.f164358h == g7Var.f164358h && this.i == g7Var.i && this.f164359j == g7Var.f164359j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53410n() {
        return this.f164357g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164357g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164355b, j6.a.c(-635597049, 31, false), 31);
        p31.c cVar = this.f164356c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f164359j) + j6.a.b(this.i, j6.a.b(this.f164358h, j6.a.b(this.f164357g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53407j() {
        return this.f164356c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164355b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getO() {
        return this.f164358h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53412q() {
        return this.f164359j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164358h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getI() {
        return this.f164355b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53409m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53408l() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164356c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53411p() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }
}
