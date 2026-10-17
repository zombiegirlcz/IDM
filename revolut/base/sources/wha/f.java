package wha;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subaccount.api.models.SubaccountType;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ l C;
    public int D;
    public SubaccountType u;
    public l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f297454w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProductArticleParams f297455x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f297456y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, gim.c cVar) {
        super(cVar);
        this.C = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return l.c(this.C, null, this);
    }
}
