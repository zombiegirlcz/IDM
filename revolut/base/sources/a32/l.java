package a32;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.PendingPaymentConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ PendingPaymentConfirmationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pendingPaymentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0Var = (a0) this.u.d();
        a0Var.H2(a0Var.f1012t, new a09.a(27));
        z1 z1Var = a0Var.u;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
