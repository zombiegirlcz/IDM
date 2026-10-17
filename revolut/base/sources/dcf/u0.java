package dcf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradingAddOnsMainScreenRevamp v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(TradingAddOnsMainScreenRevamp tradingAddOnsMainScreenRevamp, Continuation continuation) {
        super(2, continuation);
        this.v = tradingAddOnsMainScreenRevamp;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u0 u0Var = new u0(this.v, continuation);
        u0Var.u = obj2;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVarT2 = this.v.T2();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.domain.model.addon.TradingAddOnFeature");
        ((i0) wVarT2).z2((lbf.k) obj3);
        return Unit.f186387a;
    }
}
