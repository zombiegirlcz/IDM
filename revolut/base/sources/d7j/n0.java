package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrderDraft f112031b;

    public /* synthetic */ n0(ExchangeOrderDraft exchangeOrderDraft, int i) {
        this.f112030a = i;
        this.f112031b = exchangeOrderDraft;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112030a) {
            case 0:
                w update = (w) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return w.a(update, null, null, null, null, null, null, new e0(this.f112031b), null, null, 959);
            case 1:
                w update2 = (w) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return w.a(update2, null, null, null, null, null, null, new e0(this.f112031b), null, null, 959);
            case 2:
                qua.p result = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ExchangeOrderDraft exchangeOrderDraft = this.f112031b;
                return new CommodityExchangeResult.Success(exchangeOrderDraft.f99885a.f99903a, exchangeOrderDraft.f99886b.f99903a, exchangeOrderDraft.f99887c, exchangeOrderDraft.d, exchangeOrderDraft.e, null, null);
            default:
                return l7j.g.a((l7j.g) obj2, this.f112031b, null, null, null, 14);
        }
    }
}
