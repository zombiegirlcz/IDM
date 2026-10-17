package h7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public ExchangeOrderDraft u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f149903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a f149904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149905y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a aVar, gim.c cVar) {
        super(cVar);
        this.f149904x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f149903w = obj2;
        this.f149905y |= Integer.MIN_VALUE;
        return this.f149904x.b(null, this);
    }
}
