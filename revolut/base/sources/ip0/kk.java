package ip0;

import com.revolut.core.ui_kit.delegates.GaugeSteppedHorizontalDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class kk implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk f165027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hk f165028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f165029c;
    public final int d;
    public qv0.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f165030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f165031h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f165032j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f165033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f165034m;

    public kk(hk primaryProgress, hk secondaryProgress, List steps, int i) {
        Intrinsics.checkNotNullParameter("MAINTENANCE_MARGIN_WIDGET_ID", "listId");
        Intrinsics.checkNotNullParameter(primaryProgress, "primaryProgress");
        Intrinsics.checkNotNullParameter(secondaryProgress, "secondaryProgress");
        Intrinsics.checkNotNullParameter(steps, "steps");
        int i2 = R$attr.uikit_dp0;
        this.f165027a = primaryProgress;
        this.f165028b = secondaryProgress;
        this.f165029c = steps;
        this.d = i;
        this.e = c.d.f249513a;
        this.f = null;
        this.f165030g = null;
        this.f165031h = null;
        this.i = null;
        this.f165032j = i2;
        this.k = i2;
        this.f165033l = i2;
        this.f165034m = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new GaugeSteppedHorizontalDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51938a() {
        return "MAINTENANCE_MARGIN_WIDGET_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj2;
        return this.f165027a.equals(kkVar.f165027a) && this.f165028b.equals(kkVar.f165028b) && Intrinsics.f(this.f165029c, kkVar.f165029c) && this.d == kkVar.d && Intrinsics.f(this.e, kkVar.e) && Intrinsics.f(this.f, kkVar.f) && Intrinsics.f(this.f165030g, kkVar.f165030g) && Intrinsics.f(this.f165031h, kkVar.f165031h) && Intrinsics.f(this.i, kkVar.i) && this.f165032j == kkVar.f165032j && this.k == kkVar.k && this.f165033l == kkVar.f165033l && this.f165034m == kkVar.f165034m;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51945m() {
        return this.f165032j;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f165032j = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.e, j6.a.b(this.d, p.a.d((this.f165028b.hashCode() + ((this.f165027a.hashCode() - 37735761) * 31)) * 31, 31, this.f165029c), 31), 31);
        p31.c cVar = this.f;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f165030g;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f165031h;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.i;
        return Integer.hashCode(this.f165034m) + j6.a.b(this.f165033l, j6.a.b(this.k, j6.a.b(this.f165032j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.e = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51943j() {
        return this.f165030g;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f165031h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51946n() {
        return this.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51947p() {
        return this.f165034m;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.k = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51941g() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51944l() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f165031h;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f165033l;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f165030g = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.i = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        kk kkVar = oldItem instanceof kk ? (kk) oldItem : null;
        if (kkVar != null) {
            return new lk((kkVar.f165027a.equals(this.f165027a) && kkVar.f165028b.equals(this.f165028b)) ? false : true, !Intrinsics.f(kkVar.f165029c, this.f165029c), kkVar.d != this.d, or0.b.l(kkVar, this));
        }
        return null;
    }
}
