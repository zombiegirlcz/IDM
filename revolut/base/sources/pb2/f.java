package pb2;

import aw0.n6;
import com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.PayToConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PayToConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PayToConfirmationScreen payToConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = payToConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayToConfirmationScreen payToConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b) payToConfirmationScreen.e3()).K2(l.f234610a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b) payToConfirmationScreen.e3()).K2(k.f234609a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b) payToConfirmationScreen.e3()).K2(n.f234612a);
                break;
        }
        return Unit.f186387a;
    }
}
