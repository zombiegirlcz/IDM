package g64;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b93.e eVar = b93.e.PHYSICAL;
        xfa.b bVar = xfa.b.CARDS_TAB_FULL_SCREEN;
        com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar2 = this.u;
        CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = aVar2.f67204q;
        return aVar2.C1(new BridgeDestination(new FeatureCommand(new CardDesignFeatureConfig(eVar, AccountId.Personal.f51414a, null, null, null, true, null, false, false, null, bVar, null, null, null, null, null, null, cardOrderingFlowContract$InputData.getD(), cardOrderingFlowContract$InputData.getE(), null, null, false, false, null, 522153914))));
    }
}
