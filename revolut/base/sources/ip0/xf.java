package ip0;

import com.revolut.core.ui_kit.delegates.EpsChartDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class xf implements qv0.i {

    @NotNull
    public static final vf Companion = new vf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf f167152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f167153c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f167154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f167155h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167156j;
    public final int k;

    public xf(uf chartData) {
        Intrinsics.checkNotNullParameter("eps-chart-list-id", "listId");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        c.e eVar = new c.e((qv0.h) null, 3);
        int i = R$attr.uikit_dp16;
        this.f167151a = "eps-chart-list-id";
        this.f167152b = chartData;
        this.f167153c = eVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f167154g = null;
        this.f167155h = i;
        this.i = i;
        this.f167156j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new EpsChartDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52256a() {
        return this.f167151a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj2;
        return Intrinsics.f(this.f167151a, xfVar.f167151a) && Intrinsics.f(this.f167152b, xfVar.f167152b) && Intrinsics.f(this.f167153c, xfVar.f167153c) && Intrinsics.f(this.d, xfVar.d) && Intrinsics.f(this.e, xfVar.e) && Intrinsics.f(this.f, xfVar.f) && Intrinsics.f(this.f167154g, xfVar.f167154g) && this.f167155h == xfVar.f167155h && this.i == xfVar.i && this.f167156j == xfVar.f167156j && this.k == xfVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52263m() {
        return this.f167155h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f167155h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f167153c, (this.f167152b.hashCode() + (this.f167151a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f167154g;
        return Integer.hashCode(this.k) + j6.a.b(this.f167156j, j6.a.b(this.i, j6.a.b(this.f167155h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f167153c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52261j() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52264n() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52265p() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52260h() {
        return this.f167153c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52262l() {
        return this.f167154g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getO() {
        return this.f167156j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f167154g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof xf ? (xf) oldItem : null) != null) {
            return new wf(!Intrinsics.f(r4.f167152b, this.f167152b), !Intrinsics.f(r4.f167153c, this.f167153c));
        }
        return null;
    }
}
