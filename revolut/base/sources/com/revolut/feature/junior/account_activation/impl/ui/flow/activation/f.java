package com.revolut.feature.junior.account_activation.impl.ui.flow.activation;

import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import java.time.LocalDate;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rh8.d0;
import til.m;
import til.n;
import til.o;
import til.p;
import til.r;
import vkm.j2;
import vkm.q;
import w4l.j;
import yhm.m;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements c68.b {

    @NotNull
    public static final c68.f Companion = new c68.f();
    public final hj8.a A;
    public final ang.f B;
    public final wj0.a C;
    public final qki.d D;
    public final i E;
    public final AccountActivationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q58.a f76646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te8.e f76647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b68.a f76648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b68.b f76649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lh8.b f76650t;
    public final ic8.b u;
    public final m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lh8.d f76651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i68.e f76652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d0 f76653y;
    public final gte.a z;

    public f(AccountActivationFlowContract$InputData inputData, q58.a juniorAccountActivationInteractor, te8.e juniorAccountInteractor, b68.a activationStatusDialogFactory, b68.b cardRequestStatusDialogFactory, lh8.b onboardingNavigationHelper, ic8.b juniorCardRequestInteractor, m workflowFlowProvider, lh8.d juniorPostOnboardingActionResolver, i68.e postActivationDestinationProvider, d0 juniorOnboardingWorkflowInteractor, gte.a featureToggleInteractor, hj8.a juniorProfileInteractor, ang.f userInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorAccountActivationInteractor, "juniorAccountActivationInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(activationStatusDialogFactory, "activationStatusDialogFactory");
        Intrinsics.checkNotNullParameter(cardRequestStatusDialogFactory, "cardRequestStatusDialogFactory");
        Intrinsics.checkNotNullParameter(onboardingNavigationHelper, "onboardingNavigationHelper");
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(juniorPostOnboardingActionResolver, "juniorPostOnboardingActionResolver");
        Intrinsics.checkNotNullParameter(postActivationDestinationProvider, "postActivationDestinationProvider");
        Intrinsics.checkNotNullParameter(juniorOnboardingWorkflowInteractor, "juniorOnboardingWorkflowInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f76646p = juniorAccountActivationInteractor;
        this.f76647q = juniorAccountInteractor;
        this.f76648r = activationStatusDialogFactory;
        this.f76649s = cardRequestStatusDialogFactory;
        this.f76650t = onboardingNavigationHelper;
        this.u = juniorCardRequestInteractor;
        this.v = workflowFlowProvider;
        this.f76651w = juniorPostOnboardingActionResolver;
        this.f76652x = postActivationDestinationProvider;
        this.f76653y = juniorOnboardingWorkflowInteractor;
        this.z = featureToggleInteractor;
        this.A = juniorProfileInteractor;
        this.B = userInteractor;
        this.C = idempotencyKeyHolder;
        this.D = hx7.e.b(this, new AccountActivationFlowContract$State(inputData.f76634b));
        this.E = d8l.d.a(this, new a97.i(2, this, f.class, "processStep", "processStep(Lcom/revolut/kompot/navigable/vc/flow/FlowCoordinator;Lcom/revolut/feature/junior/account_activation/impl/ui/flow/activation/AccountActivationFlowContract$Step;)Lcom/revolut/kompot/navigable/Controller;", 0, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r17.U2(r2, r3) == r4) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.I2(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.J2(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f, gim.c):java.lang.Object");
    }

    public final LocalDate K2() {
        LocalDate localDate;
        JuniorAccountActivationFeatureConfig.Request.InputState inputState = ((AccountActivationFlowContract$State) ((j2) this.D.f22677a).getValue()).f76636a;
        return (inputState == null || (localDate = inputState.f76628c) == null) ? this.o.f76633a.i : localDate;
    }

    public final String L2() {
        String str;
        JuniorAccountActivationFeatureConfig.Request.InputState inputState = ((AccountActivationFlowContract$State) ((j2) this.D.f22677a).getValue()).f76636a;
        return (inputState == null || (str = inputState.f76626a) == null) ? this.o.f76633a.f77099b : str;
    }

    @Override // yki.j
    public final void M0() {
        if (((jte.d) this.z).c(JuniorOnboardingApi$Toggles.JuniorActivationWorkflow.f76946c)) {
            l2(new c68.i(this, null, 2), new c68.c(this, 0));
        } else {
            this.C.a("JUNIOR_ACCOUNT_ACTIVATION_TAG");
            h.t2(this, this.E, AccountActivationFlowContract$Step.ActivationLocal.f76637a, true, null, false, 12);
        }
    }

    public final bj0.b M2() {
        bj0.b bVar;
        JuniorAccountActivationFeatureConfig.Request.InputState inputState = ((AccountActivationFlowContract$State) ((j2) this.D.f22677a).getValue()).f76636a;
        return (inputState == null || (bVar = inputState.e) == null) ? this.o.f76633a.d : bVar;
    }

    public final String N2() {
        String str;
        JuniorAccountActivationFeatureConfig.Request.InputState inputState = ((AccountActivationFlowContract$State) ((j2) this.D.f22677a).getValue()).f76636a;
        return (inputState == null || (str = inputState.f76627b) == null) ? this.o.f76633a.f77100c : str;
    }

    public final Object O2(gim.c cVar) {
        return q.x(mo3.a.h(this.B.j(j.f294644c), new b0c.a(24), new c2f.m(11), 2), cVar);
    }

    public final void P2(r rVar, AccountActivationFlowContract$Step.Workflow workflow) {
        if ((rVar instanceof o) || Intrinsics.f(rVar, n.f271581a) || Intrinsics.f(rVar, til.q.f271586a)) {
            l2(new c(workflow, this, null), new c68.c(this, 1));
            return;
        }
        if (!(rVar instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            throw new IllegalStateException("Unexpected workflow result in junior activation flow: RedirectStep");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            Throwable thA = yhm.m.a(yhm.o.a(th10));
            if (thA != null) {
                hx7.e.n(thA);
            }
            T2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof c68.k
            if (r0 == 0) goto L13
            r0 = r8
            c68.k r0 = (c68.k) r0
            int r1 = r0.f21708w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21708w = r1
            goto L18
        L13:
            c68.k r0 = new c68.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21708w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L5a
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData r8 = r7.o
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r8 = r8.f76633a
            java.lang.String r8 = r8.f77103j
            ic8.b r2 = r7.u
            akg.n r8 = ic8.b.a(r2, r8, r3)
            ku1.f0 r2 = new ku1.f0
            r5 = 22
            r2.<init>(r5)
            c2f.m r5 = new c2f.m
            r6 = 13
            r5.<init>(r6)
            jhi.b r8 = mo3.a.e(r8, r2, r5)
            r0.f21708w = r4
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L62
            boolean r3 = r8.booleanValue()
        L62:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.Q2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof c68.l
            if (r0 == 0) goto L13
            r0 = r9
            c68.l r0 = (c68.l) r0
            int r1 = r0.f21709w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21709w = r1
            goto L18
        L13:
            c68.l r0 = new c68.l
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21709w
            r3 = 0
            te8.e r4 = r8.f76647q
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            yhm.o.b(r9)
            goto L75
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            goto L49
        L39:
            r9 = move-exception
            goto L4c
        L3b:
            r9 = move-exception
            goto L89
        L3d:
            yhm.o.b(r9)
            r0.f21709w = r6     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            java.lang.Object r9 = r4.c(r6, r0)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            if (r9 != r1) goto L49
            goto L74
        L49:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            goto L55
        L4c:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r3, r3, r9, r2)
        L55:
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData r9 = r8.o
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r9 = r9.f76633a
            java.lang.String r9 = r9.f77103j
            w4l.j r2 = w4l.j.f294644c
            akg.n r9 = r4.a(r9, r2)
            c2f.m r2 = new c2f.m
            r4 = 12
            r2.<init>(r4)
            jhi.b r9 = mo3.a.g(r9, r3, r2, r6)
            r0.f21709w = r5
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            mf8.e r9 = (mf8.e) r9
            mf8.d r9 = r9.f204961a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            mf8.d r0 = mf8.d.PASSED
            if (r9 != r0) goto L83
            goto L84
        L83:
            r6 = 0
        L84:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            return r9
        L89:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.R2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof c68.m
            if (r0 == 0) goto L13
            r0 = r5
            c68.m r0 = (c68.m) r0
            int r1 = r0.f21710w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21710w = r1
            goto L18
        L13:
            c68.m r0 = new c68.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21710w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData r5 = r4.o
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r5 = r5.f76633a
            java.lang.String r2 = r5.f77103j
            java.lang.String r5 = r5.f77099b
            r0.f21710w = r3
            i68.e r3 = r4.f76652x
            i68.i r3 = (i68.i) r3
            java.lang.Object r5 = r3.b(r2, r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            aii.u r5 = (aii.u) r5
            r4.C1(r5)
            yki.i r5 = r4.E
            oki.h.D2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.S2(gim.c):java.lang.Object");
    }

    public final void T2() {
        l2(new btk.j(this, null, 24), new yi5.b(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (V2(true, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U2(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof c68.o
            if (r0 == 0) goto L13
            r0 = r10
            c68.o r0 = (c68.o) r0
            int r1 = r0.f21711w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21711w = r1
            goto L18
        L13:
            c68.o r0 = new c68.o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21711w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            goto L5f
        L2a:
            r0 = move-exception
            r9 = r0
            goto L62
        L2d:
            r0 = move-exception
            r9 = r0
            goto L73
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yhm.o.b(r10)
            goto L4c
        L3c:
            yhm.o.b(r10)
            r0.f21711w = r4
            lh8.d r10 = r8.f76651w
            rh8.k0 r10 = (rh8.k0) r10
            java.lang.Object r10 = r10.c(r9, r0)
            if (r10 != r1) goto L4c
            goto L5e
        L4c:
            mh8.k r10 = (mh8.k) r10
            mh8.i r9 = mh8.i.f205430a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r10, r9)
            if (r9 == 0) goto L74
            r0.f21711w = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            java.lang.Object r9 = r8.V2(r4, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            if (r9 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2d
            goto L6d
        L62:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r9, r10)
            r9 = r1
        L6d:
            if (r9 != 0) goto L8c
            r8.T2()
            goto L8c
        L73:
            throw r9
        L74:
            boolean r9 = r10 instanceof mh8.j
            if (r9 == 0) goto L8f
            mh8.j r10 = (mh8.j) r10
            java.lang.String r9 = r10.f205431a
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step$Workflow$PostActivation r3 = new com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$Step$Workflow$PostActivation
            r3.<init>(r9)
            r6 = 0
            r7 = 12
            yki.i r2 = r8.E
            r4 = 1
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
        L8c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L8f:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.U2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        if (X2(r2) == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
    
        if (r0 == r3) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V2(boolean r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.V2(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(gim.c r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            boolean r2 = r1 instanceof c68.q
            if (r2 == 0) goto L17
            r2 = r1
            c68.q r2 = (c68.q) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.A = r3
            goto L1c
        L17:
            c68.q r2 = new c68.q
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f21717y
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.A
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.String r3 = r2.f21716x
            java.lang.String r4 = r2.f21715w
            b68.a r5 = r2.v
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f r2 = r2.u
            yhm.o.b(r1)
            goto L5e
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            yhm.o.b(r1)
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData r1 = r0.o
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r1 = r1.f76633a
            java.lang.String r1 = r1.f77099b
            r2.u = r0
            b68.a r4 = r0.f76648r
            r2.v = r4
            java.lang.String r6 = "ID_APPROVAL_SUCCESS_DIALOG"
            r2.f21715w = r6
            r2.f21716x = r1
            r2.A = r5
            java.lang.Object r2 = r0.O2(r2)
            if (r2 != r3) goto L59
            return r3
        L59:
            r3 = r1
            r1 = r2
            r5 = r4
            r4 = r6
            r2 = r0
        L5e:
            wi0.b r1 = (wi0.b) r1
            r5.getClass()
            java.lang.String r5 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.String r5 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "userCountry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            wi0.a r5 = wi0.b.Companion
            r5.getClass()
            wi0.b r5 = wi0.b.y2
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            r5 = 12
            r6 = 0
            if (r1 == 0) goto L8f
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.junior.account_activation.impl.R$string.rev_u18_signup_activation_approval_success_title_sub_account
            java.util.List r3 = zhm.u.c(r3)
            r1.<init>(r7, r3, r6, r5)
        L8d:
            r9 = r1
            goto L9b
        L8f:
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.junior.account_activation.impl.R$string.rev_u18_signup_activation_approval_success_title_gender_neutral
            java.util.List r3 = zhm.u.c(r3)
            r1.<init>(r7, r3, r6, r5)
            goto L8d
        L9b:
            nii.y0 r1 = new nii.y0
            nii.j0 r8 = new nii.j0
            r19 = 0
            r20 = 4094(0xffe, float:5.737E-42)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            r5 = 4
            r1.<init>(r4, r8, r3, r5)
            kotlinx.coroutines.flow.Flow r1 = r2.X1(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.W2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof c68.s
            if (r0 == 0) goto L13
            r0 = r7
            c68.s r0 = (c68.s) r0
            int r1 = r0.f21722x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21722x = r1
            goto L18
        L13:
            c68.s r0 = new c68.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21722x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f r0 = r0.u
            yhm.o.b(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f21722x = r3
            java.lang.Object r7 = r6.Y2(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            r0 = r6
        L40:
            r1 = r7
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            btk.j r4 = new btk.j
            r7 = 0
            r2 = 25
            r4.<init>(r6, r7, r2)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.X2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y2(gim.c r23) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.Y2(gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.D;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.E;
    }
}
