package ip0;

import com.revolut.core.ui_kit.delegates.PlanWidgetLoadingDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p20 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f165757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165759c;
    public int d;
    public int e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165761h;
    public p31.c i;

    @Override // koi.j
    public final koi.k T1() {
        return new PlanWidgetLoadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53559c() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53557a() {
        return "ID_PLAN";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj2;
        return Intrinsics.f(this.f165757a, p20Var.f165757a) && this.f165758b == p20Var.f165758b && this.f165759c == p20Var.f165759c && this.d == p20Var.d && this.e == p20Var.e && Intrinsics.f(this.f, p20Var.f) && Intrinsics.f(this.f165760g, p20Var.f165760g) && Intrinsics.f(this.f165761h, p20Var.f165761h) && Intrinsics.f(this.i, p20Var.i);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52479r() {
        return this.f165758b;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165758b = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f165759c, j6.a.b(this.f165758b, h30.l.i(this.f165757a, j6.a.c(1392823763, 961, false), 31), 31), 31), 31), 31);
        p31.c cVar = this.f;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165760g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165761h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52476n() {
        return this.i;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f165757a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165760g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52480s() {
        return this.f165759c;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.e;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f165759c = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52475m() {
        return this.f165757a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52478q() {
        return this.f165761h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52477p() {
        return this.f165760g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getK() {
        return this.d;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f165761h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof p20 ? (p20) oldItem : null) != null) {
            return new q20(or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
