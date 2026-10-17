package k3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RemittanceAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(RemittanceAmountScreen remittanceAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = remittanceAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.v, continuation, 0);
            case 1:
                return new s(this.v, continuation, 1);
            case 2:
                return new s(this.v, continuation, 2);
            case 3:
                return new s(this.v, continuation, 3);
            default:
                return new s(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        RemittanceAmountScreen remittanceAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                remittanceAmountScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((t0) remittanceAmountScreen.T2()).E, false, null, 3);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t0) remittanceAmountScreen.T2()).v2(z.f180811a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0 t0Var = (t0) remittanceAmountScreen.T2();
                t0Var.getClass();
                t0Var.l2(new l0(t0Var, continuation, 2), new yi5.b(26));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t0 t0Var2 = (t0) remittanceAmountScreen.T2();
                t0Var2.getClass();
                t0Var2.l2(new q0(t0Var2, (Continuation) null, 0), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
