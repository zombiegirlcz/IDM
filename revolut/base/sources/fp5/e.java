package fp5;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public ProductArticleParams u;
    public ProductArticleDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f137055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f137056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f137057y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f137056x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f137055w = obj2;
        this.f137057y |= Integer.MIN_VALUE;
        return this.f137056x.c(this);
    }
}
