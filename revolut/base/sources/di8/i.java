package di8;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public SkipShownArticleBehaviour u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.onboarding.b f114956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114957y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar, gim.c cVar) {
        super(cVar);
        this.f114956x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114955w = obj2;
        this.f114957y |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.J2(this.f114956x, null, this);
    }
}
