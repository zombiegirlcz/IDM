package xlb;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public SavingsChallengeOnboarding.Config.ProductArticle u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f306996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f306997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e f306998y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.f306998y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f306997x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f306998y.M2(null, false, this);
    }
}
