package rh8;

import com.revolut.feature.junior_onboarding.impl.navigation.JuniorOnboardingProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends gim.c {
    public JuniorOnboardingProductArticleKey u;
    public ProductArticleParams.ArticleReference.Key v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f254378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f254379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f254380y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f254379x = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f254378w = obj2;
        this.f254380y |= Integer.MIN_VALUE;
        return this.f254379x.b(this);
    }
}
