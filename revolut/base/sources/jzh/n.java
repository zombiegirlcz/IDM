package jzh;

import aw0.n6;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OrderSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(OrderSummaryScreen orderSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = orderSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.v, continuation, 0);
            default:
                return new n(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OrderSummaryScreen orderSummaryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_crypto_order_flow.impl.order_summary.a) orderSummaryScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar3 = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) orderSummaryScreen.R2();
                aVar3.getClass();
                aVar3.l2(new s0(1, aVar3, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
