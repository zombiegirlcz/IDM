package vch;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ WithdrawScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WithdrawScreen withdrawScreen, Continuation continuation) {
        super(2, continuation);
        this.u = withdrawScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x0 x0Var = (x0) this.u.T2();
        x0Var.getClass();
        x0Var.l2(new uxe.l(x0Var, null, 15), new yi5.b(26));
        return Unit.f186387a;
    }
}
