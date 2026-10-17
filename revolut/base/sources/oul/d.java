package oul;

import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TargetPriceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TargetPriceScreen targetPriceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = targetPriceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TargetPriceScreen targetPriceScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar = (com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.e3();
                bVar.getClass();
                bVar.n2(new a0(bVar, null, 2), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar2 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.e3();
                bVar2.getClass();
                bVar2.n2(new a0(bVar2, null, 1), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
