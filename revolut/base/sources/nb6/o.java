package nb6;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.overview.b f214004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214005x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar, gim.c cVar) {
        super(cVar);
        this.f214004w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214005x |= Integer.MIN_VALUE;
        return com.revolut.feature.donations.impl.ui.kompot.flow.overview.b.I2(this.f214004w, this);
    }
}
