package c7e;

import com.revolut.feature.card_payment_method.api.declaration.LinkCardToPocketNavigationDestination;
import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.c {
    public LinkCardToPocketNavigationDestination u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f21958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21959y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, gim.c cVar) {
        super(cVar);
        this.f21958x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21957w = obj2;
        this.f21959y |= Integer.MIN_VALUE;
        return this.f21958x.Z2(null, this);
    }
}
