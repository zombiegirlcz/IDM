package h7j;

import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public ExchangeOrderDraft u;
    public ExchangeResult.Success v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a f149901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149902y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a aVar, gim.c cVar) {
        super(cVar);
        this.f149901x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149900w = obj2;
        this.f149902y |= Integer.MIN_VALUE;
        return this.f149901x.a(null, this);
    }
}
