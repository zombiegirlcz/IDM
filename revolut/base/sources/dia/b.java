package dia;

import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import nhe.p;
import yfe.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends yfe.c {
    @Override // yfe.c
    public final Object b3(h.c cVar, p pVar) {
        A2(new FreelancerBizFeatureConfig.Onboarding.Default(new FreelancerOnboardingArticleConfig.ShowArticle(dr6.a.GENERAL), FreelancerOnboardingNavStrategy.NavigateToMain.f73261a, 1));
        return Boolean.TRUE;
    }
}
