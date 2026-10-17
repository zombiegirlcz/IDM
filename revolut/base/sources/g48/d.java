package g48;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public NaviCommand u;
    public ProductArticleParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f140358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.domain.a f140359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f140360y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.joint.impl.domain.a aVar, gim.c cVar) {
        super(cVar);
        this.f140359x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f140358w = obj2;
        this.f140360y |= Integer.MIN_VALUE;
        return this.f140359x.b(null, this);
    }
}
