package s01;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.ChartTimeFrameDisplayType;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements qv0.i {
    public p31.c A;
    public int B;
    public int C;
    public final int D;
    public final int E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f258755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdvancedChartSymbol f258756c;
    public final d1b.e d;
    public final c1b.h e;
    public final c1b.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f258757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f258758h;
    public final OverlayPolicy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LockPolicy f258759j;
    public final c1b.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Pair f258760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Pair f258761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d1b.b f258762n;
    public final c1b.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AdvancedChartSymbol f258763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1b.a f258764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f258765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f258766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ChartTimeFrameDisplayType f258767t;
    public final c1b.f u;
    public final d1b.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public qv0.c f258768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p31.c f258769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p31.c f258770y;
    public p31.c z;

    public h(String url2, g state, AdvancedChartSymbol chartSymbol, d1b.e chartStyle, c1b.h chartInterval, c1b.k kVar, Set set, Set selectedIndicators, OverlayPolicy overlayPolicy, LockPolicy lockPolicy, c1b.e eVar, Pair pair, Pair pair2, d1b.b bVar, c1b.j jVar, AdvancedChartSymbol advancedChartSymbol, d1b.a colors, boolean z, d chartHeight, ChartTimeFrameDisplayType chartTimeFrameDisplayType, c1b.f chartHandlerVersion, d1b.d dVar) {
        Intrinsics.checkNotNullParameter("ADVANCED_CHART_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        Intrinsics.checkNotNullParameter(overlayPolicy, "overlayPolicy");
        Intrinsics.checkNotNullParameter(lockPolicy, "lockPolicy");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(chartHeight, "chartHeight");
        Intrinsics.checkNotNullParameter(chartTimeFrameDisplayType, "chartTimeFrameDisplayType");
        Intrinsics.checkNotNullParameter(chartHandlerVersion, "chartHandlerVersion");
        int i = R$attr.uikit_dp16;
        this.f258754a = url2;
        this.f258755b = state;
        this.f258756c = chartSymbol;
        this.d = chartStyle;
        this.e = chartInterval;
        this.f = kVar;
        this.f258757g = set;
        this.f258758h = selectedIndicators;
        this.i = overlayPolicy;
        this.f258759j = lockPolicy;
        this.k = eVar;
        this.f258760l = pair;
        this.f258761m = pair2;
        this.f258762n = bVar;
        this.o = jVar;
        this.f258763p = advancedChartSymbol;
        this.f258764q = colors;
        this.f258765r = z;
        this.f258766s = chartHeight;
        this.f258767t = chartTimeFrameDisplayType;
        this.u = chartHandlerVersion;
        this.v = dVar;
        this.f258768w = c.d.f249513a;
        this.f258769x = null;
        this.f258770y = null;
        this.z = null;
        this.A = null;
        this.B = i;
        this.C = i;
        this.D = i;
        this.E = i;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51769a() {
        return "ADVANCED_CHART_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f258754a, hVar.f258754a) && this.f258755b.equals(hVar.f258755b) && Intrinsics.f(this.f258756c, hVar.f258756c) && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && Intrinsics.f(this.f258757g, hVar.f258757g) && Intrinsics.f(this.f258758h, hVar.f258758h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f258759j, hVar.f258759j) && this.k == hVar.k && Intrinsics.f(this.f258760l, hVar.f258760l) && Intrinsics.f(this.f258761m, hVar.f258761m) && Intrinsics.f(this.f258762n, hVar.f258762n) && Intrinsics.f(this.o, hVar.o) && Intrinsics.f(this.f258763p, hVar.f258763p) && Intrinsics.f(this.f258764q, hVar.f258764q) && this.f258765r == hVar.f258765r && this.f258766s == hVar.f258766s && Intrinsics.f(this.f258767t, hVar.f258767t) && this.u == hVar.u && Intrinsics.f(this.v, hVar.v) && Intrinsics.f(this.f258768w, hVar.f258768w) && Intrinsics.f(this.f258769x, hVar.f258769x) && Intrinsics.f(this.f258770y, hVar.f258770y) && Intrinsics.f(this.z, hVar.z) && Intrinsics.f(this.A, hVar.A) && this.B == hVar.B && this.C == hVar.C && this.D == hVar.D && this.E == hVar.E;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51775l() {
        return this.B;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.B = i;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f258756c.hashCode() + ((this.f258755b.hashCode() + p.a.c(1045571650, 31, this.f258754a)) * 31)) * 31)) * 31)) * 31;
        c1b.k kVar = this.f;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Set set = this.f258757g;
        int iHashCode3 = (this.f258759j.hashCode() + p.a.f(p.a.f((iHashCode2 + (set == null ? 0 : set.hashCode())) * 31, 31, this.f258758h), 31, this.i.f82091a)) * 31;
        c1b.e eVar = this.k;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Pair pair = this.f258760l;
        int iHashCode5 = (iHashCode4 + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair pair2 = this.f258761m;
        int iHashCode6 = (iHashCode5 + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        d1b.b bVar = this.f258762n;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c1b.j jVar = this.o;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        AdvancedChartSymbol advancedChartSymbol = this.f258763p;
        int iHashCode9 = (this.u.hashCode() + ((this.f258767t.hashCode() + ((this.f258766s.hashCode() + j6.a.c((this.f258764q.hashCode() + ((iHashCode8 + (advancedChartSymbol == null ? 0 : advancedChartSymbol.hashCode())) * 31)) * 31, 31, this.f258765r)) * 31)) * 31)) * 31;
        d1b.d dVar = this.v;
        int i = h30.l.i(this.f258768w, (iHashCode9 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        p31.c cVar = this.f258769x;
        int iHashCode10 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f258770y;
        int iHashCode11 = (iHashCode10 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.z;
        int iHashCode12 = (iHashCode11 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.A;
        return Integer.hashCode(this.E) + j6.a.b(this.D, j6.a.b(this.C, j6.a.b(this.B, (iHashCode12 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51773h() {
        return this.f258769x;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f258768w = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getI() {
        return this.f258770y;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.z = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51776m() {
        return this.C;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getO() {
        return this.E;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.C = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51772g() {
        return this.f258768w;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getK() {
        return this.A;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51774j() {
        return this.z;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f258769x = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51777n() {
        return this.D;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f258770y = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.A = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof h)) {
            return null;
        }
        h hVar = (h) oldItem;
        boolean z3 = !Intrinsics.f(hVar.f258754a, this.f258754a);
        boolean z4 = !hVar.f258755b.equals(this.f258755b);
        boolean z6 = !Intrinsics.f(hVar.f258756c, this.f258756c);
        boolean z11 = false;
        if (hVar.d != this.d) {
            z = false;
            z11 = true;
        } else {
            z = false;
        }
        boolean z12 = hVar.e != this.e ? true : z;
        boolean z29 = hVar.f != this.f ? true : z;
        boolean z31 = !Intrinsics.f(hVar.f258757g, this.f258757g);
        boolean z41 = !Intrinsics.f(hVar.o, this.o);
        Pair pair = hVar.f258760l;
        Pair pair2 = this.f258760l;
        if (Intrinsics.f(pair, pair2)) {
            pair2 = null;
        }
        boolean z49 = !Intrinsics.f(hVar.f258762n, this.f258762n);
        boolean z54 = !Intrinsics.f(hVar.f258758h, this.f258758h);
        boolean z74 = !Intrinsics.f(hVar.i, this.i);
        boolean z83 = !Intrinsics.f(hVar.f258759j, this.f258759j);
        boolean z89 = hVar.k != this.k ? true : z;
        boolean z96 = hVar.f258765r != this.f258765r ? true : z;
        AdvancedChartSymbol advancedChartSymbol = hVar.f258763p;
        AdvancedChartSymbol advancedChartSymbol2 = this.f258763p;
        AdvancedChartSymbol advancedChartSymbol3 = !Intrinsics.f(advancedChartSymbol, advancedChartSymbol2) ? advancedChartSymbol2 : null;
        boolean z100 = hVar.f258766s != this.f258766s ? true : z;
        boolean z101 = !Intrinsics.f(hVar.f258767t, this.f258767t);
        Pair pair3 = hVar.f258761m;
        Pair pair4 = this.f258761m;
        return new i(z3, z4, z6, z11, z12, z29, z31, z41, pair2, !Intrinsics.f(pair3, pair4) ? pair4 : null, z49, z54, z74, z83, z89, z96, advancedChartSymbol3, z100, z101, !Intrinsics.f(hVar.v, this.v));
    }
}
