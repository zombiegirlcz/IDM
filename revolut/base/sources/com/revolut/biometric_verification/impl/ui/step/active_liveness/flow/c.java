package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow;

import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$Step;
import k7c.n;
import knd.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks.e;
import ks.i;
import ks.m;
import nq.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import py.d;
import vkm.q;
import vkm.q0;
import vkm.z1;
import zhm.f0;
import zr.k;
import zr.l;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends h implements ks.c {

    @NotNull
    public static final e Companion = new e();
    public final z1 A;
    public final yki.a B;
    public final BiometricVerificationActiveLivenessStepFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f50504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f50505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ks.a f50506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f50507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f01.a f50508t;
    public final qs.a u;
    public final onh.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f50509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ds.a f50510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final iy.b f50511y;
    public final qki.d z;

    public c(BiometricVerificationActiveLivenessStepFlowContract$InputData inputData, l biometricVerificationMediaManager, m biometricVerificationActiveLivenessStepResultMapper, ks.a dialogMapper, d cameraKitFlowStateHandler, f01.a uiKitResources, qs.a validatorConfigsProvider, onh.b activeLivenessCodeMapper, k biometricVerificationInteractor, ds.a biometricVerificationDialogMapper, iy.b experimentsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(biometricVerificationMediaManager, "biometricVerificationMediaManager");
        Intrinsics.checkNotNullParameter(biometricVerificationActiveLivenessStepResultMapper, "biometricVerificationActiveLivenessStepResultMapper");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(cameraKitFlowStateHandler, "cameraKitFlowStateHandler");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(validatorConfigsProvider, "validatorConfigsProvider");
        Intrinsics.checkNotNullParameter(activeLivenessCodeMapper, "activeLivenessCodeMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationInteractor, "biometricVerificationInteractor");
        Intrinsics.checkNotNullParameter(biometricVerificationDialogMapper, "biometricVerificationDialogMapper");
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        this.o = inputData;
        this.f50504p = biometricVerificationMediaManager;
        this.f50505q = biometricVerificationActiveLivenessStepResultMapper;
        this.f50506r = dialogMapper;
        this.f50507s = cameraKitFlowStateHandler;
        this.f50508t = uiKitResources;
        this.u = validatorConfigsProvider;
        this.v = activeLivenessCodeMapper;
        this.f50509w = biometricVerificationInteractor;
        this.f50510x = biometricVerificationDialogMapper;
        this.f50511y = experimentsInteractor;
        BiometricVerificationActiveLivenessStepFlowContract$Step.Intro intro = new BiometricVerificationActiveLivenessStepFlowContract$Step.Intro(inputData.f50496b);
        f0 f0Var = f0.f322471a;
        this.z = hx7.e.b(this, new BiometricVerificationActiveLivenessStepFlowContract$State(f0Var));
        this.A = q.b(0, 7, null);
        this.B = cp5.d.a(this, intro, f0Var, new kj4.c(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.I2(com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ks.k
            if (r0 == 0) goto L13
            r0 = r5
            ks.k r0 = (ks.k) r0
            int r1 = r0.f189059w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189059w = r1
            goto L18
        L13:
            ks.k r0 = new ks.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189059w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            py.d r5 = r4.f50507s
            r0.f189059w = r3
            py.b r2 = py.b.f240638a
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            nq.c0 r5 = new nq.c0
            qki.d r0 = r4.z
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$State r0 = (com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$State) r0
            java.util.List r0 = r0.f50498a
            r5.<init>(r0)
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.J2(com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c, gim.c):java.lang.Object");
    }

    public final void K2(String str) {
        H2(this.z, new n(str, 18));
    }

    public final void L2(Throwable th10, Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (czi.c.x(401, th10)) {
            C2(z.f218339a);
        } else {
            this.f50510x.getClass();
            yji.l.a1(this, X1(ds.a.c()), null, null, new h0(function1, function0, (Continuation) null), 3);
        }
    }

    public final void M2(String str, boolean z) {
        n2(new ald.m(this, str, z, (Continuation) null, 29), new g48.h(this, str, z, 25));
    }

    public final void N2(boolean z) {
        n2(new i(z, this, null, 0), new gae.a(this, z, 28));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, new q0(this.A, new krc.h(this, null, 2), 1), null, null, 7);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.z;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.B;
    }
}
