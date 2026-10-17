package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ep7.g f75431w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, ep7.g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f75431w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f75431w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ApplicationForm applicationFormA = ApplicationForm.a(j.P2(jVar).f75402a, null, null, null, null, ((ep7.f) this.f75431w).f128096a, 991);
            this.u = 1;
            if (j.Q2(jVar, applicationFormA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        jVar.r2();
        jVar.E2(new CarOnboardingFlowContract$Step.PlanSelector(j.P2(jVar).f75402a.f75166a, false, ((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75402a.f75171j), false, null, false);
        return Unit.f186387a;
    }
}
