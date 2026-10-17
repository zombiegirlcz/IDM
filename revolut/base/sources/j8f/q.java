package j8f;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateControllerContract$InputData;
import j6f.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l5a.u;
import r40.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends oki.h implements dli.b {
    public final l8f.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t6f.g f172209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o6f.b f172210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b7f.h f172211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j6f.b f172212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r6f.d f172213t;
    public final d1h.e u;
    public final ManagedPortfoliosSimpleTemplateControllerContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f172214w;

    public q(l8f.g templateRiskLevelExtension, t6f.g aboutInfoExtension, o6f.b chartModelExtension, b7f.h performanceExtension, j6f.b allocationExtension, r6f.d feesExtension, d1h.e remoteDisclaimersExtension, ManagedPortfoliosSimpleTemplateControllerContract$InputData inputData, o stateMapper) {
        Intrinsics.checkNotNullParameter(templateRiskLevelExtension, "templateRiskLevelExtension");
        Intrinsics.checkNotNullParameter(aboutInfoExtension, "aboutInfoExtension");
        Intrinsics.checkNotNullParameter(chartModelExtension, "chartModelExtension");
        Intrinsics.checkNotNullParameter(performanceExtension, "performanceExtension");
        Intrinsics.checkNotNullParameter(allocationExtension, "allocationExtension");
        Intrinsics.checkNotNullParameter(feesExtension, "feesExtension");
        Intrinsics.checkNotNullParameter(remoteDisclaimersExtension, "remoteDisclaimersExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = templateRiskLevelExtension;
        this.f172209p = aboutInfoExtension;
        this.f172210q = chartModelExtension;
        this.f172211r = performanceExtension;
        this.f172212s = allocationExtension;
        this.f172213t = feesExtension;
        this.u = remoteDisclaimersExtension;
        this.v = inputData;
        t6f.h hVar = new t6f.h((Data) null, 3);
        o6f.a aVar = new o6f.a(null, null, false, 63);
        b7f.c cVar = new b7f.c(0);
        this.f172214w = mra.d.b(this, new j(null, hVar, new j6f.a(0), new r6f.e(0), aVar, cVar, new d1h.g(null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (this.v.d) {
            yji.l.b1(this, this.o.o.B(new u(17)), null, new p(this, continuation, 0), 3);
        }
        yji.l.b1(this, ((o6f.m) this.f172210q).f222593q.B(new o69.b(6)), null, new p(this, continuation, 1), 3);
        yji.l.b1(this, ((t6f.o) this.f172209p).f268342r.B(new t3b.g(27)), null, new p(this, continuation, 2), 3);
        yji.l.b1(this, ((t) this.f172212s).f171764t.B(new j3f.d(22)), null, new p(this, continuation, 3), 3);
        yji.l.b1(this, this.f172211r.o.B(new b73.h(9)), null, new p(this, continuation, 4), 3);
        yji.l.b1(this, ((gah.e) this.u).Z2(zhm.u.c(rdh.b.ROBO_RISK_WARNING)), null, new p(this, continuation, 5), 3);
        yji.l.b1(this, ((r6f.l) this.f172213t).f251837p.B(new y0(23)), null, new p(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f172214w;
    }
}
