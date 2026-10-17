package kka;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public boolean u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f184560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f184561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184562y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f184561x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184560w = obj2;
        this.f184562y |= Integer.MIN_VALUE;
        return this.f184561x.g(false, null, this);
    }
}
