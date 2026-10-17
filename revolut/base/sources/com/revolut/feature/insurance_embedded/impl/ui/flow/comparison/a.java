package com.revolut.feature.insurance_embedded.impl.ui.flow.comparison;

import com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.PlanComparisonFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = ((Boolean) obj2).booleanValue();
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((a) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (z) {
            b bVar = this.v;
            if (Intrinsics.f(bVar.A2().f98430b, PlanComparisonFlowContract$Step.PlanComparison.f76043a)) {
                bVar.E2(PlanComparisonFlowContract$Step.PlanCoverage.f76044a, false, null, false);
            }
        }
        return Unit.f186387a;
    }
}
