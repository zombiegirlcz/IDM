package acf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.trading_add_ons.impl.data.article_keys.FeatureKeys;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lbf.m;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements h {
    public static ProductArticleDestination a(ProductArticleKey productArticleKey, Map map) {
        return new ProductArticleDestination(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(productArticleKey), map), SkipShownArticleBehaviour.AlwaysShow.f81285a, (ProductArticleCommandInterceptor) null, (ProductArticleDestinationInterceptor) null, (AnalyticsProduct) null, (AnalyticsContext) null, (TransitionAnimation) null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ProductArticleDestination b(lbf.k feature, m plan) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(plan, "plan");
        switch (i.f3136a[feature.ordinal()]) {
            case 1:
                return a(FeatureKeys.ADVANCED_ANALYTICS, r0.g());
            case 2:
                return a(FeatureKeys.WEB_TERMINAL, r0.g());
            case 3:
                return a(FeatureKeys.ORDER_LIMIT, r0.g());
            case 4:
                Pair pairA = nbf.a.a(plan);
                if (pairA == null) {
                    return null;
                }
                return a(FeatureKeys.NO_MINIMUM_FEES, r0.k(new Pair("discount", (String) pairA.f186385a), new Pair("commission", (String) pairA.f186386b)));
            case 5:
                Pair pairA2 = nbf.a.a(plan);
                if (pairA2 == null) {
                    return null;
                }
                return a(FeatureKeys.STOCKS, r0.k(new Pair("discount", (String) pairA2.f186385a), new Pair("commission", (String) pairA2.f186386b)));
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
