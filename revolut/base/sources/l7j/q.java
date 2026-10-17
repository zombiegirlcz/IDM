package l7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public ExchangeOrderDraft u;
    public CommodityExchangeResult v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f192684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f192685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f192686y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, gim.c cVar) {
        super(cVar);
        this.f192685x = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f192684w = obj2;
        this.f192686y |= Integer.MIN_VALUE;
        return z.I2(this.f192685x, this);
    }
}
