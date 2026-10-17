package ywg;

import bof.r;
import cli.y;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardContract$InputData;
import jul.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yk6.m;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements a {
    public final PortfolioInsightsDashboardContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f317435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f317436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f317437r;

    public l(r stateMapper, PortfolioInsightsDashboardContract$InputData inputData, o portfolioInsightsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInsightsInteractor, "portfolioInsightsInteractor");
        this.o = inputData;
        this.f317435p = portfolioInsightsInteractor;
        this.f317436q = new vii.b();
        this.f317437r = mra.d.b(this, new b(null, inputData.f95020b, inputData.f95021c, inputData.d), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f317436q, new y4f.o(continuation, this, 20)), null, null, new m(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317437r;
    }
}
