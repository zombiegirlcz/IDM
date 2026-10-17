package e3i;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TPSLAmountController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TPSLAmountController tPSLAmountController, Continuation continuation) {
        super(2, continuation);
        this.u = tPSLAmountController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((s) this.u.k3()).J2();
        return Unit.f186387a;
    }
}
