package com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card;

import com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.CardOrderExperimentFlowContract$Step;
import gim.i;
import hha.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pmk.t;
import q33.e;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CardOrderExperimentFlowContract$Step cardOrderExperimentFlowContract$Step;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            t tVar = new t(bVar, null, 11);
            this.u = 1;
            if (bVar.p2(this, tVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        d dVar = bVar.f65226t;
        if (dVar == null || !dVar.f152296p) {
            bVar.I2();
            return Unit.f186387a;
        }
        int i2 = e.f241789a[bVar.u.ordinal()];
        if (i2 == 1 || i2 == 2) {
            cardOrderExperimentFlowContract$Step = CardOrderExperimentFlowContract$Step.MarketingPrompt.f65218a;
        } else if (i2 == 3) {
            cardOrderExperimentFlowContract$Step = CardOrderExperimentFlowContract$Step.PhysicalCatalogue.f65219a;
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.I2();
                return Unit.f186387a;
            }
            cardOrderExperimentFlowContract$Step = CardOrderExperimentFlowContract$Step.VirtualCatalogue.f65221a;
        }
        bVar.K2(cardOrderExperimentFlowContract$Step, false);
        return Unit.f186387a;
    }
}
