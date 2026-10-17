package com.revolut.feature.junior_onboarding.impl.ui.post_onboarding;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lh8.d;
import oi8.c;
import oi8.f;
import oki.h;
import prl.e;
import til.m;
import til.n;
import til.o;
import til.p;
import til.q;
import til.r;
import yhm.m;
import yi5.b;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements c {
    public final JuniorOnboardingDestination.PostOnboarding.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f77068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f77069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f77070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q78.e f77071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f77072t;

    public a(JuniorOnboardingDestination.PostOnboarding.InputData inputData, m workflowFlowProvider, d juniorPostOnboardingActionResolver, e juniorOnboardingCommandProvider, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(juniorPostOnboardingActionResolver, "juniorPostOnboardingActionResolver");
        Intrinsics.checkNotNullParameter(juniorOnboardingCommandProvider, "juniorOnboardingCommandProvider");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.o = inputData;
        this.f77068p = workflowFlowProvider;
        this.f77069q = juniorPostOnboardingActionResolver;
        this.f77070r = juniorOnboardingCommandProvider;
        this.f77071s = juniorAccountDestinationResolver;
        this.f77072t = d8l.d.a(this, new oa4.c(this, 18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r7.K2(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof oi8.i
            if (r0 == 0) goto L13
            r0 = r8
            oi8.i r0 = (oi8.i) r0
            int r1 = r0.f225464w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225464w = r1
            goto L18
        L13:
            oi8.i r0 = new oi8.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225464w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L5d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L4a
        L36:
            yhm.o.b(r8)
            lh8.d r8 = r7.f77069q
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$PostOnboarding$InputData r2 = r7.o
            java.lang.String r2 = r2.f76968a
            r0.f225464w = r4
            rh8.k0 r8 = (rh8.k0) r8
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L4a
            goto L5c
        L4a:
            mh8.k r8 = (mh8.k) r8
            mh8.i r2 = mh8.i.f205430a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 == 0) goto L60
            r0.f225464w = r3
            java.lang.Object r7 = r7.K2(r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L60:
            boolean r0 = r8 instanceof mh8.j
            if (r0 == 0) goto L80
            mh8.j r8 = (mh8.j) r8
            java.lang.String r8 = r8.f205431a
            yki.i r1 = r7.f77072t
            com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlowContract$Step$ArtificialFirstStep r2 = new com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlowContract$Step$ArtificialFirstStep
            com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlowContract$Step$Workflow r0 = new com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlowContract$Step$Workflow
            r0.<init>(r8)
            r2.<init>(r0)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L80:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a.I2(com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a, gim.c):java.lang.Object");
    }

    public final void J2(r rVar) throws Throwable {
        Continuation continuation = null;
        if (Intrinsics.f(rVar, n.f271581a) || Intrinsics.f(rVar, q.f271586a)) {
            l2(new f(this, continuation, 0), new oi8.d(this, 2));
            return;
        }
        int i = 26;
        int i2 = 1;
        if (rVar instanceof o) {
            l2(new f(this, continuation, i2), new b(i));
            return;
        }
        if (!(rVar instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalStateException("Unexpected workflow result: RedirectStep");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA != null) {
                hx7.e.n(thA);
            }
            l2(new f(this, continuation, i2), new b(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof oi8.g
            if (r0 == 0) goto L13
            r0 = r5
            oi8.g r0 = (oi8.g) r0
            int r1 = r0.f225462x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225462x = r1
            goto L18
        L13:
            oi8.g r0 = new oi8.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225462x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a r0 = r0.u
            yhm.o.b(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$PostOnboarding$InputData r5 = r4.o
            java.lang.String r5 = r5.f76968a
            r0.u = r4
            r0.f225462x = r3
            prl.e r2 = r4.f77070r
            java.lang.Object r5 = r2.n(r0, r5, r3)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            r0.C1(r5)
            yki.i r5 = r4.f77072t
            oki.h.D2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a.K2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 2), new oi8.d(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77072t;
    }
}
