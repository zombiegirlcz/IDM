package xlb;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.c {
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e A;
    public int B;
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SavingsProductData f307000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProductGroup.ProductArticle f307001x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ProductArticleParams f307002y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.A = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.Q2(false, null, this);
    }
}
