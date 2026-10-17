package loc;

import emc.e;
import kge.d;
import kotlin.jvm.internal.Intrinsics;
import x8h.k;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f197446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f197447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qmc.d f197448c;
    public final f d;
    public final gte.a e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final toh.d f197449g;

    public b(e templatesInteractor, d complexAnalyticsInteractorAdapter, qmc.d roboPortfolioBalanceProvider, f portfolioInteractor, gte.a featureToggleInteractor, k displayCurrencyInteractor, toh.d performanceParametersInteractor) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractorAdapter, "complexAnalyticsInteractorAdapter");
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceProvider, "roboPortfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersInteractor, "performanceParametersInteractor");
        this.f197446a = templatesInteractor;
        this.f197447b = complexAnalyticsInteractorAdapter;
        this.f197448c = roboPortfolioBalanceProvider;
        this.d = portfolioInteractor;
        this.e = featureToggleInteractor;
        this.f = displayCurrencyInteractor;
        this.f197449g = performanceParametersInteractor;
    }
}
