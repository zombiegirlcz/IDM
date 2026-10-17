package h7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public ExchangeOrderDraft u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a f149906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149907x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a aVar, gim.c cVar) {
        super(cVar);
        this.f149906w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f149907x |= Integer.MIN_VALUE;
        return this.f149906w.c(null, this);
    }
}
