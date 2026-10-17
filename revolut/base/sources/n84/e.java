package n84;

import com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public DelayedCreditCheckResponse u;
    public DelayedCreditCheckResponse v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a f213199x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213200y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a aVar, gim.c cVar) {
        super(cVar);
        this.f213199x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213198w = obj2;
        this.f213200y |= Integer.MIN_VALUE;
        return this.f213199x.J2(null, this);
    }
}
