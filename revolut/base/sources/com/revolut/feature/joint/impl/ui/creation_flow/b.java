package com.revolut.feature.joint.impl.ui.creation_flow;

import d8l.d;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import uxe.l;
import v48.c;
import w38.t;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements v48.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r38.b f76532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f76533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cu8.r0 f76534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f76535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f76536t;
    public final i u;

    public b(c inputData, r38.b jointProductInteractor, r0 jointAccountsInteractor, cu8.r0 kycRequiredActionTransformer, gte.a featureToggleInteractor, t pendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        this.o = inputData;
        this.f76532p = jointProductInteractor;
        this.f76533q = jointAccountsInteractor;
        this.f76534r = kycRequiredActionTransformer;
        this.f76535s = featureToggleInteractor;
        this.f76536t = pendingAccountBottomSheetProvider;
        this.u = d.a(this, new v48.d(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r5.J2(r13, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.joint.impl.ui.creation_flow.b r12, n38.d0 r13, gim.c r14) {
        /*
            boolean r0 = r14 instanceof v48.f
            if (r0 == 0) goto L13
            r0 = r14
            v48.f r0 = (v48.f) r0
            int r1 = r0.f285990x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285990x = r1
            goto L18
        L13:
            v48.f r0 = new v48.f
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f285990x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L7b
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            n38.d0 r13 = r0.u
            yhm.o.b(r14)
            r5 = r12
            goto L69
        L39:
            yhm.o.b(r14)
            gte.a r14 = r12.f76535s
            com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointOnboardingWorkflow r2 = com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointOnboardingWorkflow.f76463c
            jte.d r14 = (jte.d) r14
            boolean r14 = r14.c(r2)
            if (r14 == 0) goto L5b
            yki.i r6 = r12.u
            com.revolut.feature.joint.impl.ui.creation_flow.JointAccountCreationFlowContract$Step$Creation r7 = new com.revolut.feature.joint.impl.ui.creation_flow.JointAccountCreationFlowContract$Step$Creation
            r7.<init>(r13)
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            r5 = r12
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L5b:
            r5 = r12
            cu8.r0 r12 = r5.f76534r
            r0.u = r13
            r0.f285990x = r4
            java.lang.Object r14 = ks8.m.b(r12, r0)
            if (r14 != r1) goto L69
            goto L7a
        L69:
            ks8.j r14 = (ks8.j) r14
            boolean r12 = r14 instanceof ks8.j.a
            if (r12 == 0) goto L7e
            r12 = 0
            r0.u = r12
            r0.f285990x = r3
            java.lang.Object r12 = r5.J2(r13, r0)
            if (r12 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L7e:
            boolean r12 = r14 instanceof ks8.i
            if (r12 == 0) goto L90
            ks8.i r14 = (ks8.i) r14
            com.revolut.retail.core.navigation.FeatureCommand r12 = r14.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = zh9.u0.b(r12)
            r5.C1(r12)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L90:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.creation_flow.b.I2(com.revolut.feature.joint.impl.ui.creation_flow.b, n38.d0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(n38.d0 r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.creation_flow.b.J2(n38.d0, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new l(this, null, 7), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
