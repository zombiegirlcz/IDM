package dcf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading_add_ons.impl.navigation.GoodbyeDestination;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ TradingAddOnsMainScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(TradingAddOnsMainScreen tradingAddOnsMainScreen, Continuation continuation) {
        super(2, continuation);
        this.u = tradingAddOnsMainScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i0 i0Var = (i0) this.u.T2();
        i0Var.getClass();
        i0Var.C1(new GoodbyeDestination(lbf.f.TRADING_PRO));
        return Unit.f186387a;
    }
}
