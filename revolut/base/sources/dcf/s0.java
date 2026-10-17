package dcf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ TradingAddOnsMainScreenRevamp u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp, Continuation continuation) {
        super(2, continuation);
        this.u = tradingAddOnsMainScreenRevamp;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ihm.b bVar = ((i0) this.u.T2()).D;
        Unit unit = Unit.f186387a;
        bVar.onNext(unit);
        return unit;
    }
}
