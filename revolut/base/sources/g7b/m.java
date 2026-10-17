package g7b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsPlanHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsPlanHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.v.d()).J2(tVar.f54722b.f51596l);
        return Unit.f186387a;
    }
}
