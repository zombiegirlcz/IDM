package nid;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f215673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215674x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f215673w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f215674x |= Integer.MIN_VALUE;
        return this.f215673w.b(false, this);
    }
}
