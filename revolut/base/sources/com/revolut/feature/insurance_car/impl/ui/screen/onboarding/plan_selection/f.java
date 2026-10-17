package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kp7.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f75618w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f75618w = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f75618w, continuation);
        fVar.v = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r1.a(r8, r9, false) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r1.a(r8, r9, false) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r3;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kp7.w r0 = r8.f75618w
            ll7.u r1 = r0.f188201m
            java.lang.Object r2 = r8.v
            java.lang.String r2 = (java.lang.String) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L21
            if (r4 == r6) goto L1d
            if (r4 != r5) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L5f
        L21:
            yhm.o.b(r9)
            java.lang.String r9 = r0.o
            if (r9 == 0) goto L5f
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r2, r9)
            if (r9 != 0) goto L5f
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData r9 = r0.f188200l
            boolean r4 = r9 instanceof com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData.Application
            r7 = 0
            if (r4 == 0) goto L44
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData$Application r9 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData.Application) r9
            java.lang.String r9 = r9.f75606a
            r8.v = r2
            r8.u = r6
            java.lang.Object r9 = r1.a(r8, r9, r7)
            if (r9 != r3) goto L5f
            goto L58
        L44:
            boolean r4 = r9 instanceof com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData.RenewalPolicy
            if (r4 == 0) goto L59
            com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData$RenewalPolicy r9 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData.RenewalPolicy) r9
            com.revolut.feature.insurance_car.impl.data.model.ApplicationForm r9 = r9.f75610b
            java.lang.String r9 = r9.f75166a
            r8.v = r2
            r8.u = r5
            java.lang.Object r9 = r1.a(r8, r9, r7)
            if (r9 != r3) goto L5f
        L58:
            return r3
        L59:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L5f:
            r0.o = r2
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
