package com.revolut.feature.apm.swish.impl.domain;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1.a f62908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce2.a f62909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f62910c;

    public a(fx1.a apmOnboardingRepository, ce2.a swishRepository, f userInteractor) {
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        Intrinsics.checkNotNullParameter(swishRepository, "swishRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f62908a = apmOnboardingRepository;
        this.f62909b = swishRepository;
        this.f62910c = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ie2.a
            if (r0 == 0) goto L13
            r0 = r5
            ie2.a r0 = (ie2.a) r0
            int r1 = r0.f160622w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160622w = r1
            goto L18
        L13:
            ie2.a r0 = new ie2.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160622w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f160622w = r3
            i4g.d r5 = new i4g.d
            r2 = 0
            r3 = 1
            r5.<init>(r4, r2, r3)
            java.lang.Object r5 = skm.e0.o(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent r5 = (com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent) r5
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$Registered r0 = new com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$Registered
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.swish.impl.domain.a.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ie2.c
            if (r0 == 0) goto L13
            r0 = r6
            ie2.c r0 = (ie2.c) r0
            int r1 = r0.f160625x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160625x = r1
            goto L18
        L13:
            ie2.c r0 = new ie2.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f160625x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            com.revolut.feature.apm.swish.impl.domain.a r2 = r0.u
            yhm.o.b(r6)
            goto L4b
        L38:
            yhm.o.b(r6)
            dx1.g r6 = dx1.g.f120517a
            r0.u = r5
            r0.f160625x = r4
            fx1.a r2 = r5.f62908a
            java.lang.Object r6 = fx1.a.a(r2, r6, r0)
            if (r6 != r1) goto L4a
            goto L58
        L4a:
            r2 = r5
        L4b:
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r6 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus) r6
            r4 = 0
            r0.u = r4
            r0.f160625x = r3
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.swish.impl.domain.a.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.Active
            if (r0 == 0) goto L10
            java.lang.Object r8 = r7.a(r9)
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            if (r8 != r9) goto Ld
            return r8
        Ld:
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus r8 = (com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus) r8
            return r8
        L10:
            boolean r9 = r8 instanceof com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.NotRegistered
            if (r9 == 0) goto L6b
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus$NotRegistered r8 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.NotRegistered) r8
            java.util.List r9 = r8.f61971g
            r0 = 0
            if (r9 == 0) goto L3e
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L21:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingAccountDetails r2 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingAccountDetails) r2
            i02.c r2 = r2.f61957a
            i02.c r3 = i02.c.PERSONAL
            if (r2 != r3) goto L21
            goto L36
        L35:
            r1 = r0
        L36:
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingAccountDetails r1 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingAccountDetails) r1
            if (r1 == 0) goto L3e
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict r9 = r1.e
            r6 = r9
            goto L3f
        L3e:
            r6 = r0
        L3f:
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$NotRegistered r1 = new com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$NotRegistered
            java.lang.String r2 = r8.f61968a
            java.lang.String r3 = r8.f61969b
            java.lang.String r9 = "Required value was null."
            if (r3 == 0) goto L65
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusUserDetailsDetails r4 = r8.f
            if (r4 == 0) goto L4f
            java.lang.String r0 = r4.f61982c
        L4f:
            r4 = r0
            if (r4 == 0) goto L5f
            java.util.List r8 = r8.e
            java.lang.Object r8 = zhm.d0.b0(r8)
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L5f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r9)
            throw r8
        L65:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r9)
            throw r8
        L6b:
            boolean r9 = r8 instanceof com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.Pending
            if (r9 == 0) goto L72
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$Pending r8 = com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.Pending.f62904a
            return r8
        L72:
            boolean r9 = r8 instanceof com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.PendingUserAction
            if (r9 == 0) goto L79
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$PendingUserAction r8 = com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus.PendingUserAction.f62905a
            return r8
        L79:
            boolean r9 = r8 instanceof com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.RemediationRequired
            if (r9 == 0) goto L87
            com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus$RemediationRequired r8 = (com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.RemediationRequired) r8
            com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$RemediationRequired r9 = new com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus$RemediationRequired
            java.lang.String r8 = r8.f61975a
            r9.<init>(r8)
            return r9
        L87:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.swish.impl.domain.a.c(com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus, gim.c):java.lang.Object");
    }
}
