package q7b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsPlanHubTransactionsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsPlanHubTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a aVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a) this.u.d();
        aVar2.f82607r.a();
        aVar2.n2(new i(aVar2, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
