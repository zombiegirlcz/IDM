package gm5;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import gm5.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public b.a u;
    public ProductArticleKey v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f144760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f144761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f144762y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f144761x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f144760w = obj2;
        this.f144762y |= Integer.MIN_VALUE;
        return this.f144761x.e3(null, this);
    }
}
