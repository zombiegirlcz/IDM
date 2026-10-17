package a32;

import a32.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PendingPaymentConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pendingPaymentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            case 2:
                return new j(this.v, continuation, 2);
            default:
                return new j(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((np0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0Var = (a0) pendingPaymentConfirmationScreen.e3();
                a0Var.getClass();
                a0.J2("closed");
                a0Var.C2(o.b.f1035a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0Var2 = (a0) pendingPaymentConfirmationScreen.e3();
                a0Var2.getClass();
                a0.J2("confirmed");
                a0Var2.l2(new t(a0Var2, null, 0), new yi5.b(26));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0Var3 = (a0) pendingPaymentConfirmationScreen.e3();
                a0Var3.getClass();
                a0.J2("rejected");
                a0Var3.l2(new t(a0Var3, null, 3), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0Var4 = (a0) pendingPaymentConfirmationScreen.e3();
                a0Var4.getClass();
                a0.J2("timeout");
                yji.l.a1(a0Var4, a0Var4.X1(new y0(null, new nii.z(new TextLocalisedClause(R.string.transaction_threeds_timedout, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new u(a0Var4, null, 0), 3);
                break;
        }
        return Unit.f186387a;
    }
}
