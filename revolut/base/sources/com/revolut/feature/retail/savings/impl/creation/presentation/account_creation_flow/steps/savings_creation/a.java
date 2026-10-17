package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation;

import clb.c;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationContract$ModalStep;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lk4.g;
import lmb.a0;
import lmb.b0;
import lmb.j;
import lmb.k;
import lmb.l;
import lmb.o;
import lmb.p;
import lmb.z;
import oki.h;
import pcd.s;
import rnb.w;
import til.m;
import vkm.j2;
import vkm.q;
import yi5.b;
import yki.i;
import zfe.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements j {
    public final j2 A;
    public final i B;
    public final SavingsAccountCreationStepDestination o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lmb.i f83310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f83311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wlb.a f83312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f83313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f83314t;
    public final b0 u;
    public final ijb.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f83315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f83316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ugc.a f83317y;
    public final z z;

    public a(SavingsAccountCreationStepDestination inputData, lmb.i depositsCreationApi, k fundsCreationApi, wlb.a resultDelegate, c savingsErrorHandlingApi, l dialogConfigProvider, b0 savingsHomeNavigationResolver, ijb.a savingsProductInteractor, m workflowFlowProvider, w savingsVaultInteractor, ugc.a savingsChallengeInteractor, z savingsAccountCreationPromptProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(depositsCreationApi, "depositsCreationApi");
        Intrinsics.checkNotNullParameter(fundsCreationApi, "fundsCreationApi");
        Intrinsics.checkNotNullParameter(resultDelegate, "resultDelegate");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(dialogConfigProvider, "dialogConfigProvider");
        Intrinsics.checkNotNullParameter(savingsHomeNavigationResolver, "savingsHomeNavigationResolver");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountCreationPromptProvider, "savingsAccountCreationPromptProvider");
        this.o = inputData;
        this.f83310p = depositsCreationApi;
        this.f83311q = fundsCreationApi;
        this.f83312r = resultDelegate;
        this.f83313s = savingsErrorHandlingApi;
        this.f83314t = dialogConfigProvider;
        this.u = savingsHomeNavigationResolver;
        this.v = savingsProductInteractor;
        this.f83315w = workflowFlowProvider;
        this.f83316x = savingsVaultInteractor;
        this.f83317y = savingsChallengeInteractor;
        this.z = savingsAccountCreationPromptProvider;
        this.A = q.c(null);
        this.B = d.a(this, new lcc.c(this, 25));
    }

    public static final Object I2(a aVar, s sVar, gim.i iVar) {
        ProductAccountId.Payload personal;
        e eVar = aVar.u.f196914a;
        ProductId productId = ProductId.SAVINGS;
        String str = sVar.f234881a;
        pcd.a aVarA = opg.c.a(sVar);
        String str2 = aVarA != null ? aVarA.f234844g : null;
        if (str2 == null || str2.length() == 0) {
            int i = a0.f196911a[sVar.f234889n.ordinal()];
            if (i == 1) {
                personal = new SavingsProductAccountPayload.Personal(0);
            } else if (i == 2) {
                personal = SavingsProductAccountPayload.Joint.INSTANCE;
            } else if (i == 3) {
                personal = SavingsProductAccountPayload.Teen.INSTANCE;
            } else if (i == 4) {
                personal = SavingsProductAccountPayload.Youth.INSTANCE;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                personal = null;
            }
        } else {
            personal = new SavingsProductAccountPayload.Challenge(0);
        }
        return ((cge.e) eVar).b(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, personal), productId), ibb.c.f160140a, null, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (r4.M2(r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[PHI: r5
      0x008d: PHI (r5v2 pcd.s) = (r5v0 pcd.s), (r5v0 pcd.s), (r5v1 pcd.s), (r5v11 pcd.s) binds: [B:32:0x008a, B:19:0x005a, B:15:0x003c, B:27:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a r4, pcd.s r5, gim.c r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a.J2(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a, pcd.s, gim.c):java.lang.Object");
    }

    public static void P2(WorkflowFlow workflowFlow, Function0 function0) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        llh.j block = new llh.j(ref$ObjectRef, function0, 4);
        Intrinsics.checkNotNullParameter(block, "block");
        workflowFlow.H = block;
        workflowFlow.l2(new o(ref$ObjectRef, function0, 0));
    }

    public final void K2(s sVar) {
        SavingsChallengeOnboarding savingsChallengeOnboarding;
        SavingsChallengeOnboarding.Config config;
        SavingsAccountCreationStepDestination savingsAccountCreationStepDestination = this.o;
        SavingsChallengeCreationData f83234g = savingsAccountCreationStepDestination.getF83234g();
        Continuation continuation = null;
        SavingsChallengeOnboarding.Config.SuccessInfo successInfo = (f83234g == null || (savingsChallengeOnboarding = f83234g.f83096a) == null || (config = savingsChallengeOnboarding.f83100b) == null) ? null : config.f83103c;
        boolean f83235h = savingsAccountCreationStepDestination.getF83235h();
        i iVar = this.B;
        if (!f83235h) {
            if (successInfo != null) {
                h.w2(iVar, new SavingsAccountCreationContract$ModalStep.ChallengePrompt(successInfo, sVar), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                return;
            } else {
                l2(new lb0.b0(this, sVar, continuation, 22), new b(26));
                return;
            }
        }
        xib.a result = new xib.a(sVar.f234881a);
        wlb.a aVar = this.f83312r;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        aVar.f298469a.k(result);
        h.D2(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lmb.t
            if (r0 == 0) goto L13
            r0 = r8
            lmb.t r0 = (lmb.t) r0
            int r1 = r0.f196940w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196940w = r1
            goto L18
        L13:
            lmb.t r0 = new lmb.t
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196940w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L5d
        L27:
            r7 = move-exception
            goto L62
        L29:
            r7 = move-exception
            goto L74
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            ugc.a r8 = r6.f83317y     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            w4l.i r2 = w4l.i.f294643c     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vkm.d r7 = r8.j(r7, r2)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            ie6.q r8 = new ie6.q     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 2
            r4 = 25
            r5 = 0
            r8.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vkm.y r2 = new vkm.y     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r2.<init>(r7, r8)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            zhm.h0 r7 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            vkm.y r7 = rd0.e.d(r2, r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f196940w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r8 = vkm.q.z(r7, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r8 != r1) goto L5d
            return r1
        L5d:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L68
        L62:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r8 = yhm.o.a(r7)
        L68:
            java.lang.Throwable r7 = yhm.m.a(r8)
            if (r7 == 0) goto L71
            hx7.e.n(r7)
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L74:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a.L2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new p(this, null, 1), new g(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lmb.u
            if (r0 == 0) goto L13
            r0 = r5
            lmb.u r0 = (lmb.u) r0
            int r1 = r0.f196941w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196941w = r1
            goto L18
        L13:
            lmb.u r0 = new lmb.u
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196941w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27
            goto L4f
        L27:
            r5 = move-exception
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ugc.a r5 = r4.f83317y     // Catch: java.lang.Exception -> L27
            r0.f196941w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.f279998b     // Catch: java.lang.Exception -> L27
            tjb.g r5 = (tjb.g) r5     // Catch: java.lang.Exception -> L27
            x4l.c r5 = r5.d     // Catch: java.lang.Exception -> L27
            kotlin.Unit r2 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            r3 = 0
            java.lang.Object r5 = r5.d(r2, r3, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L48
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 != r1) goto L4c
            r2 = r5
        L4c:
            if (r2 != r1) goto L4f
            return r1
        L4f:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L5c
        L52:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a.M2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof lmb.v
            if (r0 == 0) goto L13
            r0 = r5
            lmb.v r0 = (lmb.v) r0
            int r1 = r0.f196942w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196942w = r1
            goto L18
        L13:
            lmb.v r0 = new lmb.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196942w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            rnb.w r5 = r4.f83316x     // Catch: java.lang.Exception -> L27
            pcd.b r2 = pcd.b.YOUTH     // Catch: java.lang.Exception -> L27
            r0.f196942w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.f(r2, r3, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L4e
        L44:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
        L4e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a.N2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(ncd.h r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lmb.x
            if (r0 == 0) goto L13
            r0 = r6
            lmb.x r0 = (lmb.x) r0
            int r1 = r0.f196946w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196946w = r1
            goto L18
        L13:
            lmb.x r0 = new lmb.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196946w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L40
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ijb.a r6 = r4.v     // Catch: java.lang.Exception -> L27
            r0.f196946w = r3     // Catch: java.lang.Exception -> L27
            r2 = 2
            java.lang.Object r5 = ijb.a.e(r6, r5, r0, r2)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L40
            return r1
        L40:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L27
            goto L4d
        L43:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
        L4d:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a.O2(ncd.h, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.B;
    }
}
