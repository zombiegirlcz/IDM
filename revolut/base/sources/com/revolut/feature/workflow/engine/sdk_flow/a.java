package com.revolut.feature.workflow.engine.sdk_flow;

import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            f fVar = this.v;
            String f96583a = fVar.o.getF96583a();
            FlowStep flowStepD = fVar.f96606w.d();
            Intrinsics.i(flowStepD, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract.Step.Workflow");
            String f96596a = ((SdkFlowContract$Step.Workflow) flowStepD).getF96596a();
            this.u = 1;
            if (f.K2(fVar, f96583a, f96596a, null, null, this, 12) == aVar) {
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
