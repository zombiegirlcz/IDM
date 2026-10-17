package com.revolut.feature.voluntary.offboarding.impl.ui.flow;

import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import te0.w;
import xce.f;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            pfm.a aVarE = w.g0(((f) eVar.u.b).f304119a.terminateAccount()).h(sjg.a.b(eVar.v)).e(pd.b.n(p0.f264003c, new jsg.e(eVar, null, 2))).e((efm.b) eVar.f94839w.f206964a.d.getValue());
            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
            this.u = 1;
            if (nim.a.a(aVarE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        eVar.E2(VoluntaryOffboardingFlowContract$Step.ApologyStep.f94830a, false, null, false);
        return Unit.f186387a;
    }
}
