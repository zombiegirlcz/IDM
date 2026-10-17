package wha;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subaccount.api.models.SubaccountType;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public int A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ l D;
    public int E;
    public SubaccountType u;
    public l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f297457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProductArticleParams f297458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f297459y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, gim.c cVar) {
        super(cVar);
        this.D = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return l.d(this.D, null, null, this);
    }
}
