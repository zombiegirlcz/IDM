package com.revolut.feature.junior_onboarding.impl.ui.creation;

import bhi.c;
import bi8.b;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import com.revolut.feature.junior_onboarding.impl.ui.creation.JuniorCreationFlowContract$Step;
import d8l.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import prl.e;
import rh8.d0;
import til.m;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f76991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f76992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f76993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hj8.a f76994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q78.e f76995t;
    public final i u;

    public a(m workflowFlowProvider, e juniorOnboardingCommandProvider, d0 juniorOnboardingWorkflowInteractor, gte.a featureToggleInteractor, hj8.a juniorProfileInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(juniorOnboardingCommandProvider, "juniorOnboardingCommandProvider");
        Intrinsics.checkNotNullParameter(juniorOnboardingWorkflowInteractor, "juniorOnboardingWorkflowInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.o = workflowFlowProvider;
        this.f76991p = juniorOnboardingCommandProvider;
        this.f76992q = juniorOnboardingWorkflowInteractor;
        this.f76993r = featureToggleInteractor;
        this.f76994s = juniorProfileInteractor;
        this.f76995t = juniorAccountDestinationResolver;
        this.u = d.a(this, new c(this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (r5.K2(r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_onboarding.impl.ui.creation.a r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.creation.a.I2(com.revolut.feature.junior_onboarding.impl.ui.creation.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof bi8.e
            if (r0 == 0) goto L13
            r0 = r8
            bi8.e r0 = (bi8.e) r0
            int r1 = r0.f15443w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15443w = r1
            goto L18
        L13:
            bi8.e r0 = new bi8.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f15443w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L4b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            r0.f15443w = r3
            rh8.d0 r8 = r7.f76992q
            wh8.j r8 = r8.f254330a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            w76.a r3 = new w76.a
            r4 = 0
            r5 = 13
            r3.<init>(r8, r4, r5)
            java.lang.Object r8 = skm.e0.J(r2, r3, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.junior_onboarding.api.model.OnboardingWorkflow r8 = (com.revolut.feature.junior_onboarding.api.model.OnboardingWorkflow) r8
            com.revolut.feature.junior_onboarding.impl.ui.creation.JuniorCreationFlowContract$Step$Workflow r2 = new com.revolut.feature.junior_onboarding.impl.ui.creation.JuniorCreationFlowContract$Step$Workflow
            r2.<init>(r8)
            r5 = 0
            r6 = 12
            yki.i r1 = r7.u
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.creation.a.J2(gim.c):java.lang.Object");
    }

    public final Object K2(gim.c cVar) throws Throwable {
        if (((jte.d) this.f76993r).c(JuniorOnboardingApi$Toggles.JuniorCreationWorkflow.f76948c)) {
            Object objJ2 = J2(cVar);
            return objJ2 == fim.a.COROUTINE_SUSPENDED ? objJ2 : Unit.f186387a;
        }
        h.t2(this, this.u, JuniorCreationFlowContract$Step.JuniorPersonalDataCreation.f76989a, false, null, false, 12);
        return Unit.f186387a;
    }

    @Override // yki.j
    public final void M0() {
        n2(new bi8.c(this, null, 1), new whi.b(6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
