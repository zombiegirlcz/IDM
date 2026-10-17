package iw4;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardStatementFinancingSetupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardStatementFinancingSetupScreen;
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
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) creditCardStatementFinancingSetupScreen.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b bVar = (com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) creditCardStatementFinancingSetupScreen.e3();
                bVar.C2(new m(bVar.I2().f168949c));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b bVar2 = (com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) creditCardStatementFinancingSetupScreen.e3();
                bVar2.H2(bVar2.f69779t, new iui.a(22));
                break;
        }
        return Unit.f186387a;
    }
}
