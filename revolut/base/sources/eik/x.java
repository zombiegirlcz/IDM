package eik;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsArticleKey;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.c {
    public pck.d u;
    public PlanReferralsArticleKey v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProductArticleParams f126693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f126694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f126695y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f126695y = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f126694x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f126695y.a(null, this);
    }
}
