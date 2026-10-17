package n8f;

import cli.y;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreenContract$InputData;
import j6f.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r40.y0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends oki.h implements j {
    public final StrategyOverviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jlc.d f213389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final emc.e f213390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b7f.h f213391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j6f.b f213392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r6f.d f213393t;
    public final d1h.e u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f213394w;

    public s(StrategyOverviewScreenContract$InputData inputData, jlc.d projectionChartWidgetExtension, emc.e templatesInteractor, b7f.h performanceExtension, j6f.b allocationExtension, r6f.d feesExtension, d1h.e disclaimersExtension, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(projectionChartWidgetExtension, "projectionChartWidgetExtension");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(performanceExtension, "performanceExtension");
        Intrinsics.checkNotNullParameter(allocationExtension, "allocationExtension");
        Intrinsics.checkNotNullParameter(feesExtension, "feesExtension");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f213389p = projectionChartWidgetExtension;
        this.f213390q = templatesInteractor;
        this.f213391r = performanceExtension;
        this.f213392s = allocationExtension;
        this.f213393t = feesExtension;
        this.u = disclaimersExtension;
        this.v = new vii.b();
        this.f213394w = mra.d.b(this, new h(null, null, new b7f.c(0), new r6f.e(0), new j6f.a(0), new d1h.g(null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        jlc.l lVar = new jlc.l(this.o.f91490a, u.c(rdh.b.STRATEGIES_PROJECTION_WIDGET_DISCLAIMER));
        jlc.d dVar = this.f213389p;
        dVar.e3(lVar);
        Continuation continuation = null;
        yji.l.b1(this, dVar.c3(), null, new r(this, continuation, 0), 3);
        yji.l.b1(this, vkm.q.Q(this.v, new mk0.f(continuation, this, 18)), null, new r(this, continuation, 1), 3);
        yji.l.b1(this, this.f213391r.o.B(new b73.h(9)), null, new r(this, continuation, 2), 3);
        yji.l.b1(this, ((t) this.f213392s).f171764t.B(new j3f.d(22)), null, new r(this, continuation, 3), 3);
        yji.l.b1(this, ((r6f.l) this.f213393t).f251837p.B(new y0(23)), null, new r(this, continuation, 4), 3);
        yji.l.b1(this, ((gah.e) this.u).Z2(u.c(rdh.b.STRATEGIES_RISK_WARNING)), null, new r(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f213394w;
    }
}
