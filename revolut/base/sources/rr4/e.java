package rr4;

import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardInstalmentAgreementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditCardInstalmentAgreementScreen creditCardInstalmentAgreementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardInstalmentAgreementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardInstalmentAgreementScreen creditCardInstalmentAgreementScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.instalment.agreement.a) creditCardInstalmentAgreementScreen.e3()).C2(j.f256688a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.instalment.agreement.a) creditCardInstalmentAgreementScreen.e3()).C2(i.f256687a);
                break;
        }
        return Unit.f186387a;
    }
}
