package j7b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsPlanHubRewardsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CobrandedCardsPlanHubRewardsScreen cobrandedCardsPlanHubRewardsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsPlanHubRewardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) this.u.R2()).f82597p.a();
        return Unit.f186387a;
    }
}
