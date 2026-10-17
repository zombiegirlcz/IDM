package ip0;

import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class og implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165659c;
    public final int d;
    public final int e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165661h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f165662j;

    public og(String listId) {
        int i = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f165657a = listId;
        this.f165658b = i;
        this.f165659c = i;
        this.d = i;
        this.e = i;
        this.f = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ExpandableCellLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52373a() {
        return this.f165657a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof og)) {
            return false;
        }
        og ogVar = (og) obj2;
        return Intrinsics.f(this.f165657a, ogVar.f165657a) && this.f165658b == ogVar.f165658b && this.f165659c == ogVar.f165659c && this.d == ogVar.d && this.e == ogVar.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52384r() {
        return this.f165658b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165658b = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f165659c, j6.a.b(this.f165658b, this.f165657a.hashCode() * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52381n() {
        return this.f165660g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f165661h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52385s() {
        return this.f165659c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165659c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52380m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52383q() {
        return this.f165662j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52382p() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165660g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52386t() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165661h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165662j = cVar;
    }
}
