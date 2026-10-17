package com.revolut.feature.joint.impl.ui.invite_flow;

import ang.f;
import aza.g;
import b58.k;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import g48.r0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import til.m;
import wsg.n;
import yki.i;
import zfe.e;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements b58.c {

    @NotNull
    public static final b58.h Companion = new b58.h();
    public final gte.a A;
    public final jvh.a B;
    public final qki.d C;
    public final i D;
    public final InviteFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k38.d f76576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f76577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f76578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f76579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bci.d f76580t;
    public final ln3.b u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f76581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k38.a f76582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l58.c f76583y;
    public final m z;

    public d(InviteFlowContract$InputData inputData, k38.d jointAccountsRepository, r0 jointInteractor, n walletInteractor, f userInteractor, bci.d purposeMapper, ln3.b contactsChooserScreenProvider, j60.a bottomDialogExtension, e newAccountDestinationResolver, k38.a initialArticleNavigationDecorator, l58.c jointAccountContactContextHandler, m workflowFlowProvider, gte.a featureToggleInteractor, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountsRepository, "jointAccountsRepository");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(purposeMapper, "purposeMapper");
        Intrinsics.checkNotNullParameter(contactsChooserScreenProvider, "contactsChooserScreenProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(initialArticleNavigationDecorator, "initialArticleNavigationDecorator");
        Intrinsics.checkNotNullParameter(jointAccountContactContextHandler, "jointAccountContactContextHandler");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f76576p = jointAccountsRepository;
        this.f76577q = jointInteractor;
        this.f76578r = walletInteractor;
        this.f76579s = userInteractor;
        this.f76580t = purposeMapper;
        this.u = contactsChooserScreenProvider;
        this.v = bottomDialogExtension;
        this.f76581w = newAccountDestinationResolver;
        this.f76582x = initialArticleNavigationDecorator;
        this.f76583y = jointAccountContactContextHandler;
        this.z = workflowFlowProvider;
        this.A = featureToggleInteractor;
        this.B = workflowInteractor;
        this.C = hx7.e.b(this, new InviteFlowContract$State(0));
        this.D = d8l.d.a(this, new a97.i(2, this, d.class, "getController", "getController(Lcom/revolut/kompot/navigable/vc/flow/FlowCoordinator;Lcom/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$Step;)Lcom/revolut/kompot/navigable/Controller;", 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.joint.impl.ui.invite_flow.d r12, gim.c r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof b58.m
            if (r0 == 0) goto L16
            r0 = r13
            b58.m r0 = (b58.m) r0
            int r1 = r0.f12463w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f12463w = r1
            goto L1b
        L16:
            b58.m r0 = new b58.m
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12463w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L92
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData r13 = r12.o
            n38.d0 r13 = r13.f76557b
            if (r13 == 0) goto L3f
            java.lang.String r2 = r13.f211942j
        L3d:
            r5 = r2
            goto L41
        L3f:
            r2 = 0
            goto L3d
        L41:
            gte.a r2 = r12.A
            com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointOnboardingWorkflow r4 = com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointOnboardingWorkflow.f76463c
            boolean r2 = r2.a(r4)
            r4 = 0
            if (r2 == 0) goto L52
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Consent r12 = new com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Consent
            r12.<init>(r4)
            return r12
        L52:
            if (r13 == 0) goto L7f
            n38.t r13 = r13.f211940g
            n38.t r2 = n38.t.PENDING
            if (r13 == r2) goto L5b
            goto L7f
        L5b:
            if (r5 == 0) goto L79
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Workflow r12 = new com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Workflow
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow r4 = new com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow
            com.revolut.analytics.tracking.v3.AnalyticsProduct$a r13 = com.revolut.analytics.tracking.v3.AnalyticsProduct.INSTANCE
            grl.k9 r0 = grl.k9.JointAccounts
            r13.getClass()
            com.revolut.analytics.tracking.v3.AnalyticsProduct r9 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Companion.b(r0)
            r10 = 0
            r11 = 110(0x6e, float:1.54E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.<init>(r4)
            return r12
        L79:
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Consent r12 = new com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Consent
            r12.<init>(r4)
            return r12
        L7f:
            jvh.a r12 = r12.B
            java.lang.String r13 = "flow"
            java.lang.String r2 = "JOINT_ACCOUNT_ONBOARDING"
            java.util.Map r13 = a0.d.x(r13, r2)
            r0.f12463w = r3
            java.lang.Object r13 = r12.b(r13, r0)
            if (r13 != r1) goto L92
            return r1
        L92:
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Workflow r12 = new com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$Step$Workflow
            com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow r0 = new com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration$Workflow
            com.revolut.analytics.tracking.v3.AnalyticsProduct$a r13 = com.revolut.analytics.tracking.v3.AnalyticsProduct.INSTANCE
            grl.k9 r2 = grl.k9.JointAccounts
            r13.getClass()
            com.revolut.analytics.tracking.v3.AnalyticsProduct r5 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Companion.b(r2)
            r6 = 0
            r7 = 110(0x6e, float:1.54E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.<init>(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.invite_flow.d.I2(com.revolut.feature.joint.impl.ui.invite_flow.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[PHI: r1 r5 r7 r13 r14 r15
      0x006a: PHI (r1v13 java.lang.Object) = (r1v22 java.lang.Object), (r1v1 java.lang.Object) binds: [B:54:0x00fb, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r5v6 int) = (r5v7 int), (r5v16 int) binds: [B:54:0x00fb, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r7v6 int) = (r7v8 int), (r7v16 int) binds: [B:54:0x00fb, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r13v4 int) = (r13v6 int), (r13v13 int) binds: [B:54:0x00fb, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r14v4 int) = (r14v6 int), (r14v13 int) binds: [B:54:0x00fb, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r15v3 n38.d0) = (r15v5 n38.d0), (r15v10 n38.d0) binds: [B:54:0x00fb, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003d, B:36:0x0098, B:40:0x00b1, B:43:0x00d1, B:45:0x00d5, B:48:0x00df, B:50:0x00e5, B:53:0x00eb, B:56:0x00ff, B:58:0x0105, B:61:0x012c, B:63:0x013b, B:67:0x0145, B:70:0x0154, B:23:0x0058, B:26:0x0067, B:29:0x007d, B:32:0x008b), top: B:79:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[Catch: all -> 0x0043, PHI: r1 r5 r7 r13 r14 r15
      0x00d1: PHI (r1v17 java.lang.Object) = (r1v28 java.lang.Object), (r1v1 java.lang.Object) binds: [B:41:0x00cd, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r5v7 int) = (r5v8 int), (r5v15 int) binds: [B:41:0x00cd, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r7v8 int) = (r7v9 int), (r7v15 int) binds: [B:41:0x00cd, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r13v6 int) = (r13v7 int), (r13v12 int) binds: [B:41:0x00cd, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r14v6 int) = (r14v7 int), (r14v12 int) binds: [B:41:0x00cd, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r15v5 n38.d0) = (r15v6 n38.d0), (r15v9 n38.d0) binds: [B:41:0x00cd, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003d, B:36:0x0098, B:40:0x00b1, B:43:0x00d1, B:45:0x00d5, B:48:0x00df, B:50:0x00e5, B:53:0x00eb, B:56:0x00ff, B:58:0x0105, B:61:0x012c, B:63:0x013b, B:67:0x0145, B:70:0x0154, B:23:0x0058, B:26:0x0067, B:29:0x007d, B:32:0x008b), top: B:79:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003d, B:36:0x0098, B:40:0x00b1, B:43:0x00d1, B:45:0x00d5, B:48:0x00df, B:50:0x00e5, B:53:0x00eb, B:56:0x00ff, B:58:0x0105, B:61:0x012c, B:63:0x013b, B:67:0x0145, B:70:0x0154, B:23:0x0058, B:26:0x0067, B:29:0x007d, B:32:0x008b), top: B:79:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003d, B:36:0x0098, B:40:0x00b1, B:43:0x00d1, B:45:0x00d5, B:48:0x00df, B:50:0x00e5, B:53:0x00eb, B:56:0x00ff, B:58:0x0105, B:61:0x012c, B:63:0x013b, B:67:0x0145, B:70:0x0154, B:23:0x0058, B:26:0x0067, B:29:0x007d, B:32:0x008b), top: B:79:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003d, B:36:0x0098, B:40:0x00b1, B:43:0x00d1, B:45:0x00d5, B:48:0x00df, B:50:0x00e5, B:53:0x00eb, B:56:0x00ff, B:58:0x0105, B:61:0x012c, B:63:0x013b, B:67:0x0145, B:70:0x0154, B:23:0x0058, B:26:0x0067, B:29:0x007d, B:32:0x008b), top: B:79:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:16:0x003d, B:36:0x0098, B:40:0x00b1, B:43:0x00d1, B:45:0x00d5, B:48:0x00df, B:50:0x00e5, B:53:0x00eb, B:56:0x00ff, B:58:0x0105, B:61:0x012c, B:63:0x013b, B:67:0x0145, B:70:0x0154, B:23:0x0058, B:26:0x0067, B:29:0x007d, B:32:0x008b), top: B:79:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x016a -> B:74:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x016d -> B:76:0x016f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.joint.impl.ui.invite_flow.d r25, n38.d0 r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.invite_flow.d.J2(com.revolut.feature.joint.impl.ui.invite_flow.d, n38.d0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
    
        if (r12 >= 3) goto L50;
     */
    /* JADX WARN: Path cross not found for [B:40:0x00a1, B:44:0x00b6], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[PHI: r2 r8 r9 r10 r13
      0x004c: PHI (r2v1 int) = (r2v3 int), (r2v8 int) binds: [B:33:0x0090, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r8v0 int) = (r8v4 int), (r8v8 int) binds: [B:33:0x0090, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r9v1 int) = (r9v3 int), (r9v7 int) binds: [B:33:0x0090, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r10v1 int) = (r10v2 int), (r10v7 int) binds: [B:33:0x0090, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r13v4 java.lang.Object) = (r13v16 java.lang.Object), (r13v1 java.lang.Object) binds: [B:33:0x0090, B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:28:0x0065, B:32:0x0078, B:35:0x0093, B:37:0x0097, B:40:0x00a1, B:42:0x00a7, B:45:0x00b8, B:21:0x0049, B:24:0x0059), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:28:0x0065, B:32:0x0078, B:35:0x0093, B:37:0x0097, B:40:0x00a1, B:42:0x00a7, B:45:0x00b8, B:21:0x0049, B:24:0x0059), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:28:0x0065, B:32:0x0078, B:35:0x0093, B:37:0x0097, B:40:0x00a1, B:42:0x00a7, B:45:0x00b8, B:21:0x0049, B:24:0x0059), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:28:0x0065, B:32:0x0078, B:35:0x0093, B:37:0x0097, B:40:0x00a1, B:42:0x00a7, B:45:0x00b8, B:21:0x0049, B:24:0x0059), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00cb -> B:49:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.joint.impl.ui.invite_flow.d r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.invite_flow.d.K2(com.revolut.feature.joint.impl.ui.invite_flow.d, gim.c):java.lang.Object");
    }

    public static final void L2(d dVar, Throwable th10) {
        dVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        dVar.X1(new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.feature.joint.impl.ui.invite_flow.d r6, com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType r7, gim.c r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof b58.p
            if (r0 == 0) goto L16
            r0 = r8
            b58.p r0 = (b58.p) r0
            int r1 = r0.f12470w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f12470w = r1
            goto L1b
        L16:
            b58.p r0 = new b58.p
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12470w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)
            goto L5e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r8)
            goto L4b
        L3a:
            yhm.o.b(r8)
            b58.q r8 = new b58.q
            r8.<init>(r7, r6, r5)
            r0.f12470w = r4
            java.lang.Object r8 = r6.p2(r0, r8)
            if (r8 != r1) goto L4b
            goto L5d
        L4b:
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r8 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r8
            if (r8 == 0) goto L61
            zfe.e r6 = r6.f76581w
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160140a
            r0.f12470w = r3
            cge.e r6 = (cge.e) r6
            java.lang.Object r8 = r6.b(r8, r7, r5, r0)
            if (r8 != r1) goto L5e
        L5d:
            return r1
        L5e:
            com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination$JustShow r8 = (com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination.JustShow) r8
            return r8
        L61:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.invite_flow.d.M2(com.revolut.feature.joint.impl.ui.invite_flow.d, com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 3), new yi5.b(26));
    }

    public final void N2() {
        d0 d0Var = this.o.f76557b;
        if (d0Var == null) {
            h.D2(this.D);
            return;
        }
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_consent_action_yes_continue, null, null, 14);
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("DECLINE_YES_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, d0Var, R$attr.uikit_dp24, i, i, i, 368);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_button_go_back, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        this.v.x(new y(v.k(model, new LargeActionButtonDelegate.Model("DECLINE_NO_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, 0, i2, i2, i2, 1008)), new t(new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.joint_incoming_invitation_action_decline_confirmation_subtitle, u.c(d0Var.d), null, 12), null, 28), l.WINDOW, null, null, null, 1016));
    }

    public final void O2(d0 d0Var) {
        Continuation continuation = null;
        if (!d0Var.f211941h) {
            l2(new k(this, d0Var, continuation, 0), new ax9.d(1, this, d.class, "logAndShowErrorDialog", "logAndShowErrorDialog(Ljava/lang/Throwable;)Z", 0, 4));
            return;
        }
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("VULNERABLE_YES_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, d0Var, R$attr.uikit_dp24, i, i, i, 368);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.joint_consent_action_decline_invitation, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        this.v.x(new y(v.k(model, new LargeActionButtonDelegate.Model("VULNERABLE_NO_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, d0Var, 0, i2, i2, i2, 880)), new t(new TextLocalisedClause(R$string.joint_confirm_number_dialog_incoming_confirmation_title, u.c(d0Var.d), null, 12), new TextLocalisedClause(R$string.joint_confirm_number_dialog_incoming_confirmation_description, null, null, 14), null, 28), l.WINDOW, null, null, null, 1016));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.C;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.D;
    }
}
