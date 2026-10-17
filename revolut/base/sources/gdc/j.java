package gdc;

import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddPaymentMethodScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AddPaymentMethodScreen addPaymentMethodScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addPaymentMethodScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            default:
                return new j(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddPaymentMethodScreen addPaymentMethodScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.shared.ui.add_payment_method.c cVar = (com.revolut.feature.revolutpay.shared.ui.add_payment_method.c) addPaymentMethodScreen.e3();
                cVar.getClass();
                cVar.n2(new s(cVar, null), new whi.b(6));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                addPaymentMethodScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.revolutpay.shared.ui.add_payment_method.c) addPaymentMethodScreen.e3()).f84713s, AddPaymentMethodScreenContract$ModalStep.EncryptedByRevolut.f84707a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
