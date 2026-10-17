package cxe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutTopupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(CheckoutTopupScreen checkoutTopupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.v, continuation);
        j0Var.u = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) oVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        cVar.J2();
        return Unit.f186387a;
    }
}
