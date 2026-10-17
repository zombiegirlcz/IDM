package wxk;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.impl.comms.TaxAdvantageProductCommsCommandProviderImpl$IsaProductWelcomeArticleKey;
import com.revolut.retail.feature.trading_onboarding.impl.comms.TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey;
import com.revolut.retail.feature.trading_onboarding.impl.comms.TaxAdvantageProductCommsCommandProviderImpl$PeaProductWelcomeArticleKey;
import com.revolut.retail.feature.trading_onboarding.impl.comms.TaxAdvantageProductCommsCommandProviderImpl$PersonalJIsaProductWelcomeArticleKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements nxk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qka.c f301010a;

    public g(qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f301010a = productArticleNavigationProvider;
    }

    public final FeatureCommand a(NaviCommand targetCommand) {
        Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
        return e(targetCommand, new TaxAdvantageProductCommsCommandProviderImpl$IsaProductWelcomeArticleKey(0));
    }

    public final FeatureCommand b(NaviCommand targetCommand) {
        Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
        return e(targetCommand, new TaxAdvantageProductCommsCommandProviderImpl$JIsaProductWelcomeArticleKey(0));
    }

    public final FeatureCommand c(NaviCommand targetCommand) {
        Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
        return e(targetCommand, new TaxAdvantageProductCommsCommandProviderImpl$PeaProductWelcomeArticleKey(0));
    }

    public final FeatureCommand d(NaviCommand targetCommand) {
        Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
        return e(targetCommand, new TaxAdvantageProductCommsCommandProviderImpl$PersonalJIsaProductWelcomeArticleKey(0));
    }

    public final FeatureCommand e(NaviCommand naviCommand, ProductArticleKey productArticleKey) {
        return gc0.c.f(cka.b.a(this.f301010a, new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(productArticleKey)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, new ProductArticleCommandInterceptor(naviCommand, null, null, naviCommand, 2), null, null, SyslogConstants.LOG_CLOCK));
    }
}
