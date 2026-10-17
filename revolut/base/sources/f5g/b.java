package f5g;

import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.u8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8 f132313b;

    public b(String bookingId, u8 listingTileModel) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(listingTileModel, "listingTileModel");
        this.f132312a = bookingId;
        this.f132313b = listingTileModel;
    }

    @Override // koi.j
    public final koi.k T1() {
        this.f132313b.getClass();
        return new ListingTileDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51997a() {
        return this.f132313b.f54807a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f132312a, bVar.f132312a) && Intrinsics.f(this.f132313b, bVar.f132313b);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52003l() {
        return this.f132313b.f54817q;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f132313b.f54817q = i;
    }

    public final int hashCode() {
        return this.f132313b.hashCode() + (this.f132312a.hashCode() * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52001h() {
        return this.f132313b.u;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f132313b.j(cVar);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.f132313b.v;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f132313b.f54821w = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52004m() {
        return this.f132313b.f54818r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.f132313b.f54820t;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f132313b.f54818r = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52000g() {
        return this.f132313b.f54823y;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.f132313b.f54822x;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52002j() {
        return this.f132313b.f54821w;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f132313b.u = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52005n() {
        return this.f132313b.f54819s;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f132313b.v = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f132313b.f54822x = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof b)) {
            return null;
        }
        return this.f132313b.z(((b) oldItem).f132313b);
    }
}
