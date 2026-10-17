package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f75432w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f75432w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f75432w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (((ll7.e0) r9).f(r1, r8) != r0) goto L31;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j r5 = r8.v
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r9)
            goto L9a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L87
        L22:
            yhm.o.b(r9)
            goto L76
        L26:
            yhm.o.b(r9)
            ll7.a r9 = r5.f75433t
            com.revolut.kompot.navigable.flow.FlowStateWrapper r1 = r5.A2()
            com.revolut.kompot.navigable.flow.FlowState r1 = r1.f98429a
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State r1 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State) r1
            com.revolut.feature.insurance_car.impl.data.model.ApplicationForm r1 = r1.f75402a
            java.lang.String r1 = r1.f75166a
            r8.u = r4
            ll7.h r9 = (ll7.h) r9
            w4l.f r4 = r9.f196635h
            java.util.List r9 = r9.a()
            if (r9 != 0) goto L45
            zhm.f0 r9 = zhm.f0.f322471a
        L45:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r9 = zhm.d0.f1(r9)
            l3d.a r6 = new l3d.a
            r7 = 18
            r6.<init>(r1, r7)
            akl.p r1 = new akl.p
            r7 = 10
            r1.<init>(r6, r7)
            boolean r1 = r9.removeIf(r1)
            if (r1 == 0) goto L71
            kotlin.Unit r1 = kotlin.Unit.f186387a
            r4.j(r1, r9)
            r9 = 0
            efm.b r9 = r4.g(r1, r9)
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r0) goto L73
            r1 = r9
            goto L73
        L71:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L73:
            if (r1 != r0) goto L76
            goto L99
        L76:
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData r9 = r5.f75436y
            boolean r9 = r9 instanceof com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData.RenewalPolicy
            if (r9 == 0) goto L9a
            ll7.v r9 = r5.v
            r8.u = r3
            java.lang.Object r9 = ll7.v.c(r9, r8)
            if (r9 != r0) goto L87
            goto L99
        L87:
            ll7.v r9 = r5.v
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData r1 = r5.f75436y
            com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData$RenewalPolicy r1 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData.RenewalPolicy) r1
            java.lang.String r1 = r1.f75400a
            r8.u = r2
            ll7.e0 r9 = (ll7.e0) r9
            java.lang.Object r9 = r9.f(r1, r8)
            if (r9 != r0) goto L9a
        L99:
            return r0
        L9a:
            mm7.b r9 = new mm7.b
            java.lang.String r0 = r8.f75432w
            r9.<init>(r0)
            r5.G2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
