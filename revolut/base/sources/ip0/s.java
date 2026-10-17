package ip0;

import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f166257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166258c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166260h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166261j;
    public final int k;

    public s(String listId) {
        r widgetTheme = r.REGULAR;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
        int i = R$attr.uikit_dp0;
        this.f166256a = listId;
        this.f166257b = widgetTheme;
        this.f166258c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166259g = null;
        this.f166260h = i;
        this.i = i;
        this.f166261j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ActionWidgetLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.f166256a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f166256a, sVar.f166256a) && this.f166257b == sVar.f166257b && Intrinsics.f(this.f166258c, sVar.f166258c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f166259g, sVar.f166259g) && this.f166260h == sVar.f166260h && this.i == sVar.i && this.f166261j == sVar.f166261j && this.k == sVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getA() {
        return this.f166260h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166260h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166258c, (this.f166257b.hashCode() + (this.f166256a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166259g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166261j, j6.a.b(this.i, j6.a.b(this.f166260h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51992p() {
        return this.f166259g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166258c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51993q() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getB() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getD() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.f166258c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51995s() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51994r() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166259g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getC() {
        return this.f166261j;
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
