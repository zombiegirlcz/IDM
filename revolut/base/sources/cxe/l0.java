package cxe;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ CheckoutTopupScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(CheckoutTopupScreen checkoutTopupScreen, Continuation continuation) {
        super(2, continuation);
        this.u = checkoutTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.u.R2();
        cVar.getClass();
        cVar.l2(new y(cVar, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
