package z66;

import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import z55.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DefiTradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(DefiTradeScreen defiTradeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = defiTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DefiTradeScreen defiTradeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar3 = (com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.e3();
                aVar3.H2(aVar3.f71892x, new w(8));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar5 = (com.revolut.feature.defi.trade.impl.ui.trade.a) defiTradeScreen.e3();
                aVar5.H2(aVar5.f71892x, new w(7));
                break;
        }
        return Unit.f186387a;
    }
}
