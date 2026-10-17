package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = new a(3, (Continuation) obj4);
        aVar.v = (FlowCollector) obj2;
        return aVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.NotRequired.f103100a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
