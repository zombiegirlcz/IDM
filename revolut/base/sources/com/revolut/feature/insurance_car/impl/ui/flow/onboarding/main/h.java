package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            this.v.S2(CarOnboardingFlowContract$Step.EditApplication.f75413a);
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
