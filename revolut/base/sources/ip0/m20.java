package ip0;

import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class m20 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165305c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165307h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165308j;

    public m20(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165303a = listId;
        this.f165304b = i;
        this.f165305c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PlanTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52373a() {
        return this.f165303a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m20)) {
            return false;
        }
        m20 m20Var = (m20) obj2;
        return this.f165303a.equals(m20Var.f165303a) && this.f165304b == m20Var.f165304b && this.f165305c == m20Var.f165305c && this.d == m20Var.d && this.e == m20Var.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.f165304b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165304b = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f165305c, j6.a.b(this.f165304b, this.f165303a.hashCode() * 961, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.f165308j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f165306g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165307h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.f165305c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165305c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.f165307h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165308j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165306g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }
}
