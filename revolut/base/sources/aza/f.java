package aza;

import com.revolut.feature.product_article.api.models.ProductArticleParams;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public ProductArticleParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e f11419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11420x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e eVar, gim.c cVar) {
        super(cVar);
        this.f11419w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f11420x |= Integer.MIN_VALUE;
        return com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e.I2(this.f11419w, this);
    }
}
