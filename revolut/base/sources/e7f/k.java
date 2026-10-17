package e7f;

import ael.z;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_summary.ManagedPortfolioPerformanceSummaryExtensionContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vdl.i0;
import ybl.l;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qmc.h f123327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qmc.d f123328n;
    public final i0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f123329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f123330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ManagedPortfolioPerformanceSummaryExtensionContract$InputData f123331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vki.a f123332s;

    public k(qmc.h portfolioInfoProvider, qmc.d portfolioBalanceProvider, i0 performanceParametersRepository, z performanceCalculator, l tradingConfigInteractor, ManagedPortfolioPerformanceSummaryExtensionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioBalanceProvider, "portfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(performanceParametersRepository, "performanceParametersRepository");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f123327m = portfolioInfoProvider;
        this.f123328n = portfolioBalanceProvider;
        this.o = performanceParametersRepository;
        this.f123329p = performanceCalculator;
        this.f123330q = tradingConfigInteractor;
        this.f123331r = inputData;
        this.f123332s = pyd.c.a(this, new e(null, null, null, null));
    }

    @Override // yji.n
    public final void H2() {
        ManagedPortfolioPerformanceSummaryExtensionContract$InputData managedPortfolioPerformanceSummaryExtensionContract$InputData = this.f123331r;
        String str = managedPortfolioPerformanceSummaryExtensionContract$InputData.f91348a;
        qmc.h hVar = this.f123327m;
        w4l.h hVar2 = w4l.h.f294642c;
        Continuation continuation = null;
        n.l2(this, Z2(xam.a.h(new j(this, continuation, 0), hVar.e(str, hVar2))), null, new j(this, continuation, 1), 3);
        String str2 = managedPortfolioPerformanceSummaryExtensionContract$InputData.f91348a;
        n.l2(this, Z2(xam.a.h(new j(this, continuation, 2), hVar.e(str2, hVar2))), null, new j(this, continuation, 3), 3);
        n.l2(this, Z2(xam.a.h(new j(this, continuation, 4), hVar.e(str2, hVar2))), null, new j(this, continuation, 5), 3);
        n.l2(this, Z2(l.d(this.f123330q)), null, new j(this, continuation, 6), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f123332s;
    }
}
