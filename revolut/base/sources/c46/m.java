package c46;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiExchangeSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(DeFiExchangeSummaryScreen deFiExchangeSummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiExchangeSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a aVar2 = (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) eVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.f71783y.a();
        return Unit.f186387a;
    }
}
