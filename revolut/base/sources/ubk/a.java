package ubk;

import ch.qos.logback.core.net.SyslogConstants;
import cka.b;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.plan_gifting.api.articles.PlanGiftingArticleKey;
import com.revolut.retail.feature.plan_gifting.api.navigation.PlanGiftingConfig;
import kbk.l;
import kotlin.jvm.internal.Intrinsics;
import qka.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements lbk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f278927a;

    public a(c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f278927a = productArticleNavigationProvider;
    }

    public static FeatureCommand c(kbk.a aVar, l lVar) {
        return new FeatureCommand(new PlanGiftingConfig.Sender(aVar, lVar));
    }

    public final FeatureCommand b(boolean z, boolean z3, boolean z4, l lVar) {
        if (z) {
            return c(kbk.a.SKIP, lVar);
        }
        if (z3) {
            return new FeatureCommand(b.a(this.f278927a, new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PlanGiftingArticleKey.SENDER_INTRO)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, new ProductArticleCommandInterceptor(c(z4 ? kbk.a.FORCE_SHOW : kbk.a.SKIP, lVar), c(z4 ? kbk.a.FORCE_SHOW : kbk.a.SHOW_IF_NEEDED, lVar), null, c(z4 ? kbk.a.FORCE_SHOW : kbk.a.SKIP, lVar), 4), null, null, SyslogConstants.LOG_CLOCK));
        }
        return c(z4 ? kbk.a.FORCE_SHOW : kbk.a.SHOW_IF_NEEDED, lVar);
    }
}
