package ip0;

import com.revolut.core.ui_kit.delegates.RateOneClickLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l90 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f165146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f165147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165148c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165150h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new RateOneClickLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52946g() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53544a() {
        return "LIST_ID_RATE_ONE_CLICK";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj2;
        return Intrinsics.f(this.f165146a, l90Var.f165146a) && Intrinsics.f(this.f165147b, l90Var.f165147b) && Intrinsics.f(this.f165148c, l90Var.f165148c) && Intrinsics.f(this.d, l90Var.d) && Intrinsics.f(this.e, l90Var.e) && this.f == l90Var.f && this.f165149g == l90Var.f165149g && this.f165150h == l90Var.f165150h && this.i == l90Var.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getI() {
        return this.f;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f165146a, 1531095693 * 31, 31);
        p31.c cVar = this.f165147b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165148c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return Integer.hashCode(this.i) + j6.a.b(this.f165150h, j6.a.b(this.f165149g, j6.a.b(this.f, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f165147b;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165146a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52952p() {
        return this.f165148c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52948j() {
        return this.f165149g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52949l() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165149g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52951n() {
        return this.f165146a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52954r() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52953q() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f165147b = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.f165150h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165148c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof l90) {
            return new m90(or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
