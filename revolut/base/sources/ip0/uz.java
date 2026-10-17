package ip0;

import com.revolut.core.ui_kit.delegates.OrderBookItemLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class uz implements qv0.q, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f166742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f166743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f166744c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f166745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f166746h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new OrderBookItemLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return "OrderBook_ItemsLoading";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj2;
        return Intrinsics.f(this.f166742a, uzVar.f166742a) && Intrinsics.f(this.f166743b, uzVar.f166743b) && Intrinsics.f(this.f166744c, uzVar.f166744c) && Intrinsics.f(this.d, uzVar.d) && Intrinsics.f(this.e, uzVar.e) && this.f == uzVar.f && this.f166745g == uzVar.f166745g && this.f166746h == uzVar.f166746h && this.i == uzVar.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f166742a, -723949828, 31);
        p31.c cVar = this.f166743b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f166744c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return Integer.hashCode(this.i) + j6.a.b(this.f166746h, j6.a.b(this.f166745g, j6.a.b(this.f, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.f166743b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f166742a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.f166744c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f166745g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f166745g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f166742a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f166743b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f166746h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f166744c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }
}
