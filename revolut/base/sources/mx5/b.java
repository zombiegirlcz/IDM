package mx5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.RetailCryptoTradeFlow;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RetailCryptoTradeFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RetailCryptoTradeFlow retailCryptoTradeFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = retailCryptoTradeFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RetailCryptoTradeFlow retailCryptoTradeFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((lx5.b) ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) retailCryptoTradeFlow.e3()).f71557q).f200528b.k(iw5.b.f168962a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((lx5.b) ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) retailCryptoTradeFlow.e3()).f71557q).f200528b.k(new iw5.e());
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((lx5.b) ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) retailCryptoTradeFlow.e3()).f71557q).f200528b.k(iw5.c.f168963a);
                break;
        }
        return Unit.f186387a;
    }
}
