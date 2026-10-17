package iid;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.flow.session.c f161603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f161604x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.shops.impl.flow.session.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f161603w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f161604x |= Integer.MIN_VALUE;
        return this.f161603w.I2(this);
    }
}
