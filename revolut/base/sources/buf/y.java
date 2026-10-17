package buf;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ ManualTransferScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ManualTransferScreen manualTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.u = manualTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a1 a1Var = (a1) this.u.T2();
        a1Var.getClass();
        a1Var.l2(new e0(a1Var, null, 2), new yi5.b(26));
        return Unit.f186387a;
    }
}
