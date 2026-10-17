package ip0;

import com.revolut.core.ui_kit.delegates.OrderBookHeaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class nz implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mz f165590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f165591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165592c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165594h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f165595j;

    public nz(mz headerData) {
        Intrinsics.checkNotNullParameter("OrderBook_Header", "listId");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        int i = R$attr.uikit_dp0;
        this.f165590a = headerData;
        this.f165591b = c.d.f249513a;
        this.f165592c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f165593g = i;
        this.f165594h = i;
        this.i = i;
        this.f165595j = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new OrderBookHeaderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return "OrderBook_Header";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nz)) {
            return false;
        }
        nz nzVar = (nz) obj2;
        return this.f165590a.equals(nzVar.f165590a) && Intrinsics.f(this.f165591b, nzVar.f165591b) && Intrinsics.f(this.f165592c, nzVar.f165592c) && Intrinsics.f(this.d, nzVar.d) && Intrinsics.f(this.e, nzVar.e) && Intrinsics.f(this.f, nzVar.f) && this.f165593g == nzVar.f165593g && this.f165594h == nzVar.f165594h && this.i == nzVar.i && this.f165595j == nzVar.f165595j;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f165593g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165593g = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165591b, (this.f165590a.hashCode() + 1384613355) * 31, 31);
        p31.c cVar = this.f165592c;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return Integer.hashCode(this.f165595j) + j6.a.b(this.i, j6.a.b(this.f165594h, j6.a.b(this.f165593g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f165592c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165591b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.f165594h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f165595j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165594h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f165591b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165592c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
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

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof nz)) {
            return null;
        }
        return new oz(!this.f165590a.equals(((nz) oldItem).f165590a), or0.b.l(this, (qv0.i) oldItem));
    }
}
