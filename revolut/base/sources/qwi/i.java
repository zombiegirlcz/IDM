package qwi;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import hha.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import svi.a0;
import svi.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep recurringPassWelcome;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        z zVar = (z) pair.f186385a;
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) pair.f186386b;
        com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar = this.v;
        qki.d dVar = eVar.z;
        if (((AirportLoungePassDetailsFlowContract$State) ((j2) dVar.f22677a).getValue()).f98988c || ((AirportLoungePassDetailsFlowContract$State) ((j2) dVar.f22677a).getValue()).d) {
            return Unit.f186387a;
        }
        if (zVar instanceof z.c) {
            recurringPassWelcome = s.p(pricingPlanSubscription.f81129a) ? new AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Ultra(pricingPlanSubscription, ((z.c) zVar).f266019a) : s.o(pricingPlanSubscription.f81129a) ? new AirportLoungePassDetailsFlowContract$Step.UnlimitedPassWelcome.Private(pricingPlanSubscription, ((z.c) zVar).f266019a) : null;
        } else if (zVar instanceof a0) {
            recurringPassWelcome = new AirportLoungePassDetailsFlowContract$Step.RecurringPassWelcome(pricingPlanSubscription, ((a0) zVar).f265873a);
        } else {
            if (!Intrinsics.f(zVar, z.a.f266017a) && !Intrinsics.f(zVar, z.b.f266018a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (recurringPassWelcome == null) {
            com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.I2(eVar);
            return Unit.f186387a;
        }
        eVar.H2(dVar, new qwd.o(16));
        oki.h.w2(eVar.A, recurringPassWelcome, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
