package g48;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.domain.a f140353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f140354x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.joint.impl.domain.a aVar, gim.c cVar) {
        super(cVar);
        this.f140353w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f140354x |= Integer.MIN_VALUE;
        return this.f140353w.a(this);
    }
}
