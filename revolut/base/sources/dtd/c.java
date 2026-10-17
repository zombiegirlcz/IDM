package dtd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.product_article.CustomAssetSmartEstimationProductArticleKey;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ d B;
    public int C;
    public d u;
    public CustomAssetSmartEstimationProductArticleKey v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l71.d f117428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f117429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f117430y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(this);
    }
}
