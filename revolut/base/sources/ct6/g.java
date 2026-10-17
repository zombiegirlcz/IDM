package ct6;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public gim.i u;
    public gim.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProductArticleParams f108622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f108623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f108624y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.f108624y = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f108623x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f108624y.c(null, null, this);
    }
}
