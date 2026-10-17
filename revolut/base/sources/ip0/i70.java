package ip0;

import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class i70 implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h70 f164654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f164655c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164657h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f164658j;
    public p31.c k;

    public i70(String listId, h70 loadingState, int i) {
        loadingState = (i & 4) != 0 ? h70.MULTI_LINES : loadingState;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        int i2 = R$attr.uikit_dp0;
        this.f164653a = listId;
        this.f164654b = loadingState;
        this.f164655c = c.d.f249513a;
        this.d = i2;
        this.e = i2;
        this.f = i2;
        this.f164656g = i2;
        this.f164657h = null;
        this.i = null;
        this.f164658j = null;
        this.k = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new QRCodeLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53482a() {
        return this.f164653a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj2;
        return Intrinsics.f(this.f164653a, i70Var.f164653a) && this.f164654b == i70Var.f164654b && Intrinsics.f(this.f164655c, i70Var.f164655c) && this.d == i70Var.d && this.e == i70Var.e && this.f == i70Var.f && this.f164656g == i70Var.f164656g && Intrinsics.f(this.f164657h, i70Var.f164657h) && Intrinsics.f(this.i, i70Var.i) && Intrinsics.f(this.f164658j, i70Var.f164658j) && Intrinsics.f(this.k, i70Var.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f164656g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, h30.l.i(this.f164655c, (this.f164654b.hashCode() + (this.f164653a.hashCode() * 961)) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f164657h;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164658j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getE() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164655c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF() {
        return this.f164657h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53487j() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53488l() {
        return this.f164656g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getD() {
        return this.f164655c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53486h() {
        return this.f164658j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53485g() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164657h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164658j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return Unit.f186387a;
    }
}
