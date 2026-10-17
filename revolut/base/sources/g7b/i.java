package g7b;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoCard;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsPlanHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsPlanHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarD3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) oVarD3;
        if (obj3 instanceof CobrandedCardsPlanHubInfoCard) {
            y yVar = eVar.f82590w;
            CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = ((n) ((j2) yVar.f22677a).getValue()).f141153b;
            Continuation continuation = null;
            String str = cobrandedCardsPlanHubPlan != null ? cobrandedCardsPlanHubPlan.f82415a : null;
            boolean z = !((n) ((j2) yVar.f22677a).getValue()).d;
            eVar.H2(yVar, new q(z, 0));
            eVar.l2(new ald.m(eVar, str, z, continuation, 19), new yi5.b(26));
        } else {
            eVar.J2(obj3);
        }
        return Unit.f186387a;
    }
}
