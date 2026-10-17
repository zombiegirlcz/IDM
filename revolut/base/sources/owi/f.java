package owi;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f230457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f230458x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f230457w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f230458x |= Integer.MIN_VALUE;
        return this.f230457w.b(this);
    }
}
