package ip0;

import com.revolut.core.ui_kit.delegates.GaugeSteppedHorizontalLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nk implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f165524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f165525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f165526c;
    public p31.c d;
    public p31.c e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f165527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165528h;
    public int i;

    @Override // koi.j
    public final koi.k T1() {
        return new GaugeSteppedHorizontalLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return "MAINTENANCE_MARGIN_WIDGET_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nk)) {
            return false;
        }
        nk nkVar = (nk) obj2;
        return Intrinsics.f(this.f165524a, nkVar.f165524a) && Intrinsics.f(this.f165525b, nkVar.f165525b) && Intrinsics.f(this.f165526c, nkVar.f165526c) && Intrinsics.f(this.d, nkVar.d) && Intrinsics.f(this.e, nkVar.e) && this.f == nkVar.f && this.f165527g == nkVar.f165527g && this.f165528h == nkVar.f165528h && this.i == nkVar.i;
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
        int i = h30.l.i(this.f165524a, -37735761, 31);
        p31.c cVar = this.f165525b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165526c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return Integer.hashCode(this.i) + j6.a.b(this.f165528h, j6.a.b(this.f165527g, j6.a.b(this.f, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165524a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.f165525b;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165526c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f165527g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.i;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165527g = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f165524a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.f165526c;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f165528h;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165525b = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.d = cVar;
    }
}
