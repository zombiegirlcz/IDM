package e7f;

import ael.z;
import kotlin.jvm.internal.Intrinsics;
import vdl.i0;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.d f123314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qmc.h f123315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f123316c;
    public final z d;
    public final l e;

    public b(qmc.d portfolioBalanceProvider, qmc.h portfolioInfoProvider, i0 performanceParametersRepository, z performanceCalculator, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(portfolioBalanceProvider, "portfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(performanceParametersRepository, "performanceParametersRepository");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f123314a = portfolioBalanceProvider;
        this.f123315b = portfolioInfoProvider;
        this.f123316c = performanceParametersRepository;
        this.d = performanceCalculator;
        this.e = tradingConfigInteractor;
    }
}
