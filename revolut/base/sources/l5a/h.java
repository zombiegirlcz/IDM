package l5a;

import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentsIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PaymentsIntroScreen paymentsIntroScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentsIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentsIntroScreen paymentsIntroScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) paymentsIntroScreen.R2();
                eVar.getClass();
                eVar.l2(new t(eVar, null, 2), new yi5.b(26));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar2 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) paymentsIntroScreen.R2();
                if (eVar2.H.E()) {
                    yji.l.j2(eVar2, eVar2.e1(h9b.a.f150222a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) paymentsIntroScreen.R2();
                eVar3.getClass();
                eVar3.l2(new t(eVar3, null, 3), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
