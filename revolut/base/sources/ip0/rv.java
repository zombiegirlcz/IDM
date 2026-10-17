package ip0;

import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class rv implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv f166243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f166244c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f166245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166246h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166247j;
    public final int k;

    public rv(String listId, qv shimmerOverlay, int i) {
        shimmerOverlay = (i & 2) != 0 ? qv.PURPLE_GREY : shimmerOverlay;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(shimmerOverlay, "shimmerOverlay");
        this.f166242a = listId;
        this.f166243b = shimmerOverlay;
        this.f166244c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f166245g = null;
        this.f166246h = i2;
        this.i = i2;
        this.f166247j = i2;
        this.k = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ListingTileLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52956a() {
        return this.f166242a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj2;
        return Intrinsics.f(this.f166242a, rvVar.f166242a) && this.f166243b == rvVar.f166243b && Intrinsics.f(this.f166244c, rvVar.f166244c) && Intrinsics.f(this.d, rvVar.d) && Intrinsics.f(this.e, rvVar.e) && Intrinsics.f(this.f, rvVar.f) && Intrinsics.f(this.f166245g, rvVar.f166245g) && this.f166246h == rvVar.f166246h && this.i == rvVar.i && this.f166247j == rvVar.f166247j && this.k == rvVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.f166246h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f166246h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166244c, (this.f166243b.hashCode() + (this.f166242a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f166245g;
        return Integer.hashCode(this.k) + j6.a.b(this.f166247j, j6.a.b(this.i, j6.a.b(this.f166246h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52968s() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166244c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52969t() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52965p() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52967r() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52964n() {
        return this.f166244c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return this.f166245g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52966q() {
        return this.f166247j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f166245g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        rv rvVar = oldItem instanceof rv ? (rv) oldItem : null;
        if (rvVar == null) {
            return null;
        }
        return new sv(rvVar.f166243b != this.f166243b);
    }
}
