package qaf;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import gim.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {
    public ProductArticleKey u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f244028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f244029x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f244028w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f244029x |= Integer.MIN_VALUE;
        return this.f244028w.a(null, this);
    }
}
