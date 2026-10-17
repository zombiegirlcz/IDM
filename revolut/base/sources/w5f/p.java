package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.chart.ManagedPortfolioDetailsChartContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.fees.ManagedPortfolioDetailsFeesExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.template_risk_level.TemplateRiskLevelControllerExtensionContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements xki.e {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.j f295211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6f.l f295212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ManagedPortfolioDetailsAboutInfoExtensionContract$InputData f295213c;
    public final j6f.d d;
    public final ManagedPortfolioDetailsAllocationContract$InputData e;
    public final o6f.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ManagedPortfolioDetailsChartContract$InputData f295214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r6f.h f295215h;
    public final ManagedPortfolioDetailsFeesExtensionContract$InputData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b7f.f f295216j;
    public final ManagedPortfolioPerformanceExtensionContract$InputData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qy5.a f295217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TemplateRiskLevelControllerExtensionContract$InputData f295218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ManagedPortfoliosSimpleTemplateControllerContract$InputData f295219n;
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f295220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f295221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f295222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f295223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f295224t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f295225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f295226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f295227y;
    public final e4m.e z;

    public p(m mVar, ViewController viewController, ManagedPortfoliosSimpleTemplateControllerContract$InputData managedPortfoliosSimpleTemplateControllerContract$InputData, ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData, o6f.d dVar, ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData, j6f.d dVar2, ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData, t6f.l lVar, ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData, r6f.h hVar, ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData, b7f.f fVar, TemplateRiskLevelControllerExtensionContract$InputData templateRiskLevelControllerExtensionContract$InputData, qy5.a aVar, d1h.j jVar) {
        this.o = mVar;
        this.f295211a = jVar;
        this.f295212b = lVar;
        this.f295213c = managedPortfolioDetailsAboutInfoExtensionContract$InputData;
        this.d = dVar2;
        this.e = managedPortfolioDetailsAllocationContract$InputData;
        this.f = dVar;
        this.f295214g = managedPortfolioDetailsChartContract$InputData;
        this.f295215h = hVar;
        this.i = managedPortfolioDetailsFeesExtensionContract$InputData;
        this.f295216j = fVar;
        this.k = managedPortfolioPerformanceExtensionContract$InputData;
        this.f295217l = aVar;
        this.f295218m = templateRiskLevelControllerExtensionContract$InputData;
        this.f295219n = managedPortfoliosSimpleTemplateControllerContract$InputData;
        int i = 11;
        this.f295220p = e4m.b.b(new vzc.j(mVar, this, 0, i));
        this.f295221q = e4m.b.b(new vzc.j(mVar, this, 2, i));
        this.f295222r = e4m.b.b(new vzc.j(mVar, this, 1, i));
        this.f295223s = e4m.b.b(new vzc.j(mVar, this, 4, i));
        this.f295224t = e4m.b.b(new vzc.j(mVar, this, 3, i));
        this.u = e4m.b.b(new vzc.j(mVar, this, 6, i));
        this.v = e4m.b.b(new vzc.j(mVar, this, 5, i));
        this.f295225w = e4m.b.b(new vzc.j(mVar, this, 8, i));
        this.f295226x = e4m.b.b(new vzc.j(mVar, this, 7, i));
        this.f295227y = e4m.b.b(new vzc.j(mVar, this, 10, i));
        this.z = e4m.b.b(new vzc.j(mVar, this, 9, i));
        this.A = e4m.b.b(new vzc.j(mVar, this, 11, i));
        this.B = e4m.b.b(new vzc.j(mVar, this, 13, i));
        this.C = e4m.b.b(new vzc.j(mVar, this, 14, i));
        this.D = e4m.b.b(new vzc.j(mVar, this, 16, i));
        this.E = e4m.b.b(new vzc.j(mVar, this, 15, i));
        this.F = e4m.b.b(e4m.c.a(viewController));
        int i2 = 11;
        this.G = e4m.b.b(new vzc.j(mVar, this, 17, i2));
        this.H = e4m.b.b(new vzc.j(mVar, this, 12, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of(dw3.l.m((d1h.e) this.f295220p.get()), (yji.n) this.f295221q.get(), (yji.n) this.f295223s.get(), (yji.n) this.u.get(), (yji.n) this.f295225w.get(), (yji.n) this.f295227y.get(), (yji.n) this.A.get());
    }

    @Override // xki.e
    public final Set g() {
        gah.f fVarA = ((u8h.b) this.o.f295191c).a();
        vc.s.j(fVarA);
        aah.g gVarL = dw3.l.l(fVarA, this.f295211a, (d1h.e) this.f295220p.get());
        yji.d dVar = (yji.d) this.f295222r.get();
        yji.d dVar2 = (yji.d) this.f295224t.get();
        yji.d dVar3 = (yji.d) this.v.get();
        yji.d dVar4 = (yji.d) this.f295226x.get();
        yji.d dVar5 = (yji.d) this.z.get();
        b7f.h model = (b7f.h) this.f295227y.get();
        qy5.a view = this.f295217l;
        Intrinsics.checkNotNullParameter(view, "view");
        ManagedPortfolioPerformanceExtensionContract$InputData inputData = this.k;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(model, "model");
        return ImmutableSet.of(gVarL, dVar, dVar2, dVar3, dVar4, dVar5, new l8f.a());
    }
}
