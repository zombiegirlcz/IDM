package ip0;

import com.revolut.core.ui_kit.delegates.MarginChartLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fx implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qv0.c f164316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f164317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164318c;
    public p31.c d;
    public p31.c e;

    @Override // koi.j
    public final koi.k T1() {
        return new MarginChartLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52256a() {
        return "MARGIN_CHART_LOADING";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj2;
        return Intrinsics.f(this.f164316a, fxVar.f164316a) && Intrinsics.f(this.f164317b, fxVar.f164317b) && Intrinsics.f(this.f164318c, fxVar.f164318c) && Intrinsics.f(this.d, fxVar.d) && Intrinsics.f(this.e, fxVar.e);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52263m() {
        return R$attr.uikit_dp0;
    }

    @Override // qv0.o
    public final void g(int i) {
    }

    public final int hashCode() {
        int i = h30.l.i(this.f164316a, -1277034378, 31);
        p31.c cVar = this.f164317b;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f164318c;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f164316a = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52261j() {
        return this.f164317b;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164318c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52264n() {
        return R$attr.uikit_dp0;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52265p() {
        return R$attr.uikit_dp0;
    }

    @Override // qv0.o
    public final void o(int i) {
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52260h() {
        return this.f164316a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52262l() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f164318c;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return R$attr.uikit_dp0;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f164317b = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.d = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        fx fxVar = oldItem instanceof fx ? (fx) oldItem : null;
        if (fxVar != null) {
            return new gx(or0.b.l(this, fxVar));
        }
        return null;
    }
}
