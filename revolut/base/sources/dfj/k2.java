package dfj;

import com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 extends gim.c {
    public EsimArticleKey u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l2 f114017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114018x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, gim.c cVar) {
        super(cVar);
        this.f114017w = l2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114018x |= Integer.MIN_VALUE;
        return this.f114017w.b(this);
    }
}
