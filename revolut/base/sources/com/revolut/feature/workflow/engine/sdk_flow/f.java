package com.revolut.feature.workflow.engine.sdk_flow;

import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import uv1.c0;
import wuh.g;
import wuh.i;
import wuh.m;
import wuh.r;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends h implements wuh.b {

    @NotNull
    public static final i Companion = new i();
    public final SdkFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final til.d f96601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f96602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kvh.f f96603r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wy8.a f96604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ivh.c f96605t;
    public final g u;
    public final xuh.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.i f96606w;

    public f(SdkFlowContract$InputData inputData, til.d navigationProvider, jvh.a workflowInteractor, kvh.f sdkVendorInfoMapper, wy8.a documentScanNavigationProvider, ivh.c errorHandlerExtension, g sdkFlowDialogProvider, xuh.b sdkFlowAnalyticsTracker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(sdkVendorInfoMapper, "sdkVendorInfoMapper");
        Intrinsics.checkNotNullParameter(documentScanNavigationProvider, "documentScanNavigationProvider");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(sdkFlowDialogProvider, "sdkFlowDialogProvider");
        Intrinsics.checkNotNullParameter(sdkFlowAnalyticsTracker, "sdkFlowAnalyticsTracker");
        this.o = inputData;
        this.f96601p = navigationProvider;
        this.f96602q = workflowInteractor;
        this.f96603r = sdkVendorInfoMapper;
        this.f96604s = documentScanNavigationProvider;
        this.f96605t = errorHandlerExtension;
        this.u = sdkFlowDialogProvider;
        this.v = sdkFlowAnalyticsTracker;
        this.f96606w = d8l.d.a(this, new wtj.c(this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f5, code lost:
    
        if (r8 == r11) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.workflow.engine.sdk_flow.f r8, com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo r9, java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.sdk_flow.f.I2(com.revolut.feature.workflow.engine.sdk_flow.f, com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo, java.lang.String, gim.c):java.lang.Object");
    }

    public static /* synthetic */ Object K2(f fVar, String str, String str2, String str3, sil.i iVar, Continuation continuation, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            iVar = null;
        }
        return fVar.J2(str, str2, str3, iVar, continuation);
    }

    public static /* synthetic */ void P2(f fVar) {
        fVar.O2(TransitionAnimation.SLIDE_END_TO_START.f98395a);
    }

    public static void R2(f fVar, Function1 function1, r rVar, Function1 function12, int i) {
        fVar.f96605t.b3("SDK_FLOW", function12, new cia.d(1, fVar, f.class, "onErrorDialogDismiss", "onErrorDialogDismiss()V", 4, 9), (i & 1) != 0 ? new wsg.a(29) : function1, (i & 2) != 0 ? new r(fVar, null, 3) : rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.String r10, java.lang.String r11, java.lang.String r12, sil.i r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r14 instanceof wuh.k
            if (r0 == 0) goto L13
            r0 = r14
            wuh.k r0 = (wuh.k) r0
            int r1 = r0.f300154w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300154w = r1
            goto L18
        L13:
            wuh.k r0 = new wuh.k
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300154w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L5a
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r14)
            r0.f300154w = r3
            jvh.a r14 = r9.f96602q
            zuh.o r6 = r14.f178883a
            r6.getClass()
            xkl.e r2 = new xkl.e
            r8 = 0
            r7 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)
            if (r10 != r1) goto L50
            goto L52
        L50:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L52:
            if (r10 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L57:
            if (r10 != r1) goto L5a
            return r1
        L5a:
            wuh.d r10 = new wuh.d
            r11 = 0
            r10.<init>(r11)
            r9.C2(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.sdk_flow.f.J2(java.lang.String, java.lang.String, java.lang.String, sil.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void L2(od9.e eVar) {
        Continuation continuation = null;
        if (eVar instanceof od9.d) {
            R2(this, null, null, new m(this, continuation, 1), 3);
            return;
        }
        if (eVar instanceof od9.c) {
            R2(this, null, null, new m(this, continuation, 2), 3);
            return;
        }
        if (!Intrinsics.f(eVar, od9.a.f224330a) && !Intrinsics.f(eVar, od9.b.f224331a)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result for DAP flow in SdkFlow: " + eVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // yki.j
    public final void M0() {
        SdkFlowContract$InputData sdkFlowContract$InputData = this.o;
        Continuation continuation = null;
        SdkFlowContract$InputData.Predefined predefined = sdkFlowContract$InputData instanceof SdkFlowContract$InputData.Predefined ? (SdkFlowContract$InputData.Predefined) sdkFlowContract$InputData : null;
        String str = predefined != null ? predefined.f96581b : null;
        if (str == null || str.length() == 0) {
            P2(this);
            return;
        }
        if (d0.J(str, "ua-gov-auth", false)) {
            M2(new od9.d(null));
            return;
        }
        if (d0.J(str, "sg_gov_auth", false)) {
            N2(new od9.d(null));
            return;
        }
        if (d0.J(str, "qes/dap", false)) {
            M2(new od9.d(str));
            return;
        }
        if (d0.J(str, "kyc/dap", false)) {
            L2(new od9.d(null));
            return;
        }
        if (d0.J(str, "itsme", false)) {
            M2(new od9.d(str));
            return;
        }
        if (d0.J(str, "id_austria", false)) {
            M2(new od9.d(str));
            return;
        }
        if (d0.J(str, "bank_id", false)) {
            M2(new od9.d(null));
            return;
        }
        if (d0.J(str, "idura", false)) {
            M2(new od9.d(str));
            return;
        }
        if (d0.J(str, "uae_pass", false)) {
            R2(this, null, null, new m(this, continuation, 7), 3);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected deeplink in SdkFlow: ".concat(str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        P2(this);
    }

    public final void M2(od9.e eVar) {
        Continuation continuation = null;
        if (eVar instanceof od9.d) {
            R2(this, null, null, new c0(this, eVar, continuation, 13), 3);
            return;
        }
        if (Intrinsics.f(eVar, od9.a.f224330a)) {
            C2(wuh.c.f300148a);
            return;
        }
        if (!Intrinsics.f(eVar, od9.b.f224331a) && !(eVar instanceof od9.c)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result for ExternalKycProvider flow in SdkFlow: " + eVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void N2(od9.e eVar) {
        if (eVar instanceof od9.d) {
            R2(this, new wuh.h(this, 1), null, new b(this, null), 2);
            return;
        }
        if (Intrinsics.f(eVar, od9.a.f224330a)) {
            B2();
            return;
        }
        if (!Intrinsics.f(eVar, od9.b.f224331a) && !(eVar instanceof od9.c)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result for MyInfo flow in SdkFlow: " + eVar);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void O2(TransitionAnimation transitionAnimation) {
        SdkFlowContract$InputData sdkFlowContract$InputData = this.o;
        if (sdkFlowContract$InputData instanceof SdkFlowContract$InputData.Predefined) {
            R2(this, null, null, new c(this, transitionAnimation, null), 3);
            return;
        }
        if (sdkFlowContract$InputData instanceof SdkFlowContract$InputData.Workflow) {
            R2(this, null, null, new d(this, transitionAnimation, null), 3);
        } else {
            if (!(sdkFlowContract$InputData instanceof SdkFlowContract$InputData.PennyTopUp)) {
                throw new NoWhenBranchMatchedException();
            }
            SdkFlowContract$InputData.PennyTopUp pennyTopUp = (SdkFlowContract$InputData.PennyTopUp) sdkFlowContract$InputData;
            h.t2(this, this.f96606w, new SdkFlowContract$Step.PennyTopUp(pennyTopUp.f96578b, pennyTopUp.f96579c, pennyTopUp.d, pennyTopUp.e, pennyTopUp.f), false, transitionAnimation, false, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof wuh.t
            if (r0 == 0) goto L13
            r0 = r7
            wuh.t r0 = (wuh.t) r0
            int r1 = r0.f300165w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300165w = r1
            goto L18
        L13:
            wuh.t r0 = new wuh.t
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300165w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            r0.f300165w = r3
            jvh.a r7 = r4.f96602q
            java.lang.Object r5 = r7.g(r5, r6, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            wuh.d r5 = new wuh.d
            r6 = 0
            r5.<init>(r6)
            r4.C2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.workflow.engine.sdk_flow.f.Q2(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96606w;
    }
}
