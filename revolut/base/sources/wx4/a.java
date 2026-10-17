package wx4;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import gim.c;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends c {
    public SkipShownArticleBehaviour.SkipIfWasAlreadyShown u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f300752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f300753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f300754y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f300754y = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f300753x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f300754y.a(null, null, null, this);
    }
}
