package bbk;

import aw0.n6;
import bbk.o;
import com.revolut.retail.feature.pending_payments.impl.ui.confirmation.PendingPaymentConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PendingPaymentConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pendingPaymentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var = (d0) pendingPaymentConfirmationScreen.d();
                d0Var.getClass();
                d0.I2("close");
                if (((i) ((j2) d0Var.f14323t.f22677a).getValue()).f14325a) {
                    d0Var.C2(o.a.f14334a);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var2 = (d0) pendingPaymentConfirmationScreen.d();
                d0Var2.getClass();
                d0.I2("timeout");
                d0Var2.l2(new u(1, d0Var2, continuation), new yi5.b(26));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var3 = (d0) pendingPaymentConfirmationScreen.d();
                d0Var3.getClass();
                d0.I2("accept");
                d0Var3.l2(new u(0, d0Var3, continuation), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var4 = (d0) pendingPaymentConfirmationScreen.d();
                d0Var4.getClass();
                d0.I2("decline");
                d0Var4.l2(new u(2, d0Var4, continuation), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
