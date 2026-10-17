package qwg;

import com.revolut.feature.wealth.analytics.insights.network.PortfolioInsightsService;
import e4m.e;
import ik0.b;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements e {
    public static PortfolioInsightsService a(ek.a converterFactory, b retrofitFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PortfolioInsightsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PortfolioInsightsService portfolioInsightsService = (PortfolioInsightsService) objCreate;
        s.k(portfolioInsightsService);
        return portfolioInsightsService;
    }
}
