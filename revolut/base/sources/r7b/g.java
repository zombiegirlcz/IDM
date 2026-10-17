package r7b;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsPlanHubTransactionDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CobrandedCardsPlanHubTransactionDetailsScreen cobrandedCardsPlanHubTransactionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsPlanHubTransactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.d();
        String str = lVar.o.f82610a.f82421g;
        if (str != null) {
            lVar.C1(new BridgeDestination(new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(61, str, null, null, null))));
        }
        return Unit.f186387a;
    }
}
