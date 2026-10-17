package nd3;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cashback.impl.ui.yourcashback.b f214321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214322x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.cashback.impl.ui.yourcashback.b bVar, gim.c cVar) {
        super(cVar);
        this.f214321w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214322x |= Integer.MIN_VALUE;
        return com.revolut.feature.cashback.impl.ui.yourcashback.b.O2(this.f214321w, this);
    }
}
