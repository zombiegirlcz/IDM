package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState switchToIndividualPromptState = (SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j2 j2Var = this.v.f103105n;
        do {
            value = j2Var.getValue();
        } while (!j2Var.h(value, switchToIndividualPromptState));
        return Unit.f186387a;
    }
}
