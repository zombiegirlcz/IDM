package hr6;

import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.retail.core.navigation.FeatureCommand;
import ct6.m;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public interface l {
    static FreelancerBizFeatureConfig.AcquiringOrders a(l lVar) {
        return ((m) lVar).i(cs6.g.ALL_SALES, h0.f322473a);
    }

    static /* synthetic */ FeatureCommand b(l lVar, FreelancerOnboardingNavStrategy.NavigateToMain navigateToMain, gim.c cVar, int i) {
        FreelancerOnboardingArticleConfig.ShowArticle showArticle = new FreelancerOnboardingArticleConfig.ShowArticle(dr6.a.GENERAL);
        if ((i & 2) != 0) {
            navigateToMain = null;
        }
        return ((m) lVar).e(showArticle, navigateToMain);
    }
}
