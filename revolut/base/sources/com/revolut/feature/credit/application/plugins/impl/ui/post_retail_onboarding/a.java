package com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding;

import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q5g.f0;
import qg4.b;
import qg4.g;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardPostRetailOnboardingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f68220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f68221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qg4.h f68222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68223s;

    public a(CreditCardPostRetailOnboardingFlowContract$InputData inputData, j creditApplicationLifecycleInteractor, g creditCardPostRetailOnboardingPromptMapper, qg4.h creditCardPostRetailOnboardingSuccessDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(creditCardPostRetailOnboardingPromptMapper, "creditCardPostRetailOnboardingPromptMapper");
        Intrinsics.checkNotNullParameter(creditCardPostRetailOnboardingSuccessDialogProvider, "creditCardPostRetailOnboardingSuccessDialogProvider");
        this.o = inputData;
        this.f68220p = creditApplicationLifecycleInteractor;
        this.f68221q = creditCardPostRetailOnboardingPromptMapper;
        this.f68222r = creditCardPostRetailOnboardingSuccessDialogProvider;
        f0 f0Var = new f0(this, 19);
        this.f68223s = d.a(this, CreditCardPostRetailOnboardingFlowContract$Step.Intro.f68218a, zhm.f0.f322471a, f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a r17, gim.c r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof qg4.c
            if (r2 == 0) goto L18
            r2 = r1
            qg4.c r2 = (qg4.c) r2
            int r3 = r2.f245647w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f245647w = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            qg4.c r2 = new qg4.c
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f245647w
            r4 = 1
            r9 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            yhm.o.b(r1)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r0 = move-exception
            goto L71
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            yhm.o.b(r1)
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2e
            xq3.j r3 = r0.f68220p     // Catch: java.lang.Throwable -> L2e
            ft3.d1 r1 = new ft3.d1     // Catch: java.lang.Throwable -> L2e
            ft3.j1 r5 = ft3.j1.CREDIT_CARD     // Catch: java.lang.Throwable -> L2e
            gt3.c r6 = gt3.c.PREMIUM     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r5, r6, r9)     // Catch: java.lang.Throwable -> L2e
            com.revolut.feature.credit.application.api.models.IntendedPricingPlan r6 = new com.revolut.feature.credit.application.api.models.IntendedPricingPlan     // Catch: java.lang.Throwable -> L2e
            com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$InputData r0 = r0.o     // Catch: java.lang.Throwable -> L2e
            com.revolut.feature.credit.application.api.models.IntendedPricingPlan r0 = r0.f68216a     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.f66194a     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r9, r0, r9)     // Catch: java.lang.Throwable -> L2e
            ft3.a1 r7 = new ft3.a1     // Catch: java.lang.Throwable -> L2e
            grl.r2 r11 = grl.r2.RETAIL_ONBOARDING     // Catch: java.lang.Throwable -> L2e
            r15 = 0
            r16 = 30
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L2e
            r8.f245647w = r4     // Catch: java.lang.Throwable -> L2e
            r5 = 0
            r4 = r1
            java.lang.Object r1 = r3.c(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 != r2) goto L6c
            return r2
        L6c:
            it3.c r1 = (it3.c) r1     // Catch: java.lang.Throwable -> L2e
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2e
            goto L77
        L71:
            yhm.m$a r1 = yhm.m.INSTANCE
            yhm.n r1 = yhm.o.a(r0)
        L77:
            java.lang.Throwable r0 = yhm.m.a(r1)
            if (r0 != 0) goto L7e
            goto L89
        L7e:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            java.lang.String r3 = "CreditCardPostRetailOnboardingFlowModel"
            rd0.d.a(r2, r3, r9, r0, r1)
        L89:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a.I2(com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68223s;
    }
}
