package ip0;

import com.revolut.core.ui_kit.delegates.PieChartVerticalLegendDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class e10 implements qv0.q, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f164001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.eb f164002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f164003c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164005h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f164006j;
    public qv0.c k;

    public e10(List slices, aw0.eb legend) {
        Intrinsics.checkNotNullParameter("PIE_CHART_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(slices, "slices");
        Intrinsics.checkNotNullParameter(legend, "legend");
        int i = R$attr.uikit_dp16;
        this.f164001a = slices;
        this.f164002b = legend;
        this.f164003c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f164004g = i;
        this.f164005h = i;
        this.i = i;
        this.f164006j = i;
        this.k = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PieChartVerticalLegendDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return "PIE_CHART_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj2;
        return Intrinsics.f(this.f164001a, e10Var.f164001a) && this.f164002b.equals(e10Var.f164002b) && Intrinsics.f(this.f164003c, e10Var.f164003c) && Intrinsics.f(this.d, e10Var.d) && Intrinsics.f(this.e, e10Var.e) && Intrinsics.f(this.f, e10Var.f) && this.f164004g == e10Var.f164004g && this.f164005h == e10Var.f164005h && this.i == e10Var.i && this.f164006j == e10Var.f164006j && Intrinsics.f(this.k, e10Var.k);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f164004g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f164004g = i;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(376622520, 31, this.f164001a), 31, this.f164002b.f10302a);
        p31.c cVar = this.f164003c;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f;
        return h30.l.i(this.k, j6.a.b(this.f164006j, j6.a.b(this.i, j6.a.b(this.f164005h, j6.a.b(this.f164004g, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f164003c;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.k = cVar;
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
    public final int getF52634h() {
        return this.f164005h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f164006j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f164005h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f164003c = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
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
        if ((oldItem instanceof e10 ? (e10) oldItem : null) != null) {
            return new f10(!Intrinsics.f(this.f164001a, r5.f164001a), !this.f164002b.equals(r5.f164002b), !Intrinsics.f(this.k, r5.k));
        }
        return null;
    }
}
