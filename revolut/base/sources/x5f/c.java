package x5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.h f302949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.f f302950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ztg.n f302951c;

    public c(qmc.h roboPortfolioInfoProvider, zjh.f portfolioInteractor, ztg.n wealthAccountClosureApi) {
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountClosureApi, "wealthAccountClosureApi");
        this.f302949a = roboPortfolioInfoProvider;
        this.f302950b = portfolioInteractor;
        this.f302951c = wealthAccountClosureApi;
    }
}
