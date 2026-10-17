package j1g;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.experiences.impl.ui.flow.home.b f170460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f170461x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar, gim.c cVar) {
        super(cVar);
        this.f170460w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f170461x |= Integer.MIN_VALUE;
        return com.revolut.feature.travel.experiences.impl.ui.flow.home.b.I2(this.f170460w, this);
    }
}
