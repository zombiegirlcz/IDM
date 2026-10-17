package dcf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends gim.i implements Function2 {
    public final /* synthetic */ TradingAddOnsMainScreenRevamp u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp, Continuation continuation) {
        super(2, continuation);
        this.u = tradingAddOnsMainScreenRevamp;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w0) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i0 i0Var = (i0) this.u.T2();
        i0Var.getClass();
        i0Var.l2(new c0(1, i0Var, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
