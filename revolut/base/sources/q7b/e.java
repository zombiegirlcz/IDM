package q7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsTransaction;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubTransactionsScreen f242795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242795w = cobrandedCardsPlanHubTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f242795w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f242795w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CobrandedCardsTransaction cobrandedCardsTransaction = (CobrandedCardsTransaction) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(cobrandedCardsTransaction, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        CobrandedCardsPlanHubTransactionsScreen cobrandedCardsPlanHubTransactionsScreen = this.f242795w;
        switch (i) {
            case 0:
                CobrandedCardsTransaction transaction = (CobrandedCardsTransaction) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a aVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a) cobrandedCardsPlanHubTransactionsScreen.d3();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                oki.h.v2(aVar2.u, new CobrandedCardsPlanHubTransactionsScreenContract$ModalStep.TransactionDetails(transaction), popup);
                break;
            default:
                CobrandedCardsTransaction transaction2 = (CobrandedCardsTransaction) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a aVar4 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a) cobrandedCardsPlanHubTransactionsScreen.d3();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(transaction2, "transaction");
                oki.h.v2(aVar4.u, new CobrandedCardsPlanHubTransactionsScreenContract$ModalStep.TransactionDetails(transaction2), popup);
                break;
        }
        return Unit.f186387a;
    }
}
