package ip0;

import com.revolut.core.ui_kit.delegates.ListingCardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class ru implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f166237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166238c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166240h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166241j;

    public ru(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166236a = listId;
        this.f166237b = c.d.f249513a;
        this.f166238c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166239g = i;
        this.f166240h = i;
        this.i = i;
        this.f166241j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListingCardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52483a() {
        return this.f166236a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj2;
        return Intrinsics.f(this.f166236a, ruVar.f166236a) && Intrinsics.f(this.f166237b, ruVar.f166237b) && Intrinsics.f(this.f166238c, ruVar.f166238c) && Intrinsics.f(this.d, ruVar.d) && Intrinsics.f(this.e, ruVar.e) && Intrinsics.f(this.f, ruVar.f) && this.f166239g == ruVar.f166239g && this.f166240h == ruVar.f166240h && this.i == ruVar.i && this.f166241j == ruVar.f166241j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF58142n() {
        return this.f166239g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166239g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166237b, this.f166236a.hashCode() * 31, 31);
        p31.c cVar = this.f166238c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f166241j) + j6.a.b(this.i, j6.a.b(this.f166240h, j6.a.b(this.f166239g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF58139j() {
        return this.f166238c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166237b = cVar;
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
        return this.f166240h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF58144q() {
        return this.f166241j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166240h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getI() {
        return this.f166237b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF58141m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF58140l() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166238c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF58143p() {
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
