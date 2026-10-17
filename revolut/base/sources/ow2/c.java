package ow2;

import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.GooglePayConfirmationController;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import om4.m1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GooglePayConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GooglePayConfirmationController googlePayConfirmationController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = googlePayConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a.C0461a c0461a = a.C0461a.f64492a;
        GooglePayConfirmationController googlePayConfirmationController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) googlePayConfirmationController.e3()).C2(c0461a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) googlePayConfirmationController.e3();
                eVar.getClass();
                eVar.l2(new k(eVar, null), new m1(1, eVar, com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 8));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) googlePayConfirmationController.e3()).C2(c0461a);
                break;
        }
        return Unit.f186387a;
    }
}
