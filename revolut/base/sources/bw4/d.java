package bw4;

import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardStatementFinancingConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardStatementFinancingConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) ((k) creditCardStatementFinancingConfirmationScreen.T.getValue())).C2(g.f19226a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar3 = (com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) ((k) creditCardStatementFinancingConfirmationScreen.T.getValue());
                if (aVar3.I2().f19224c.f291902b) {
                    aVar3.C2(new i(pyd.c.H(aVar3.o.f69732b.f68802b, aVar3.I2().f19224c.f291901a)));
                } else {
                    aVar3.n2(new r(aVar3, null, 0), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
