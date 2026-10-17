package com.revolut.feature.joint.impl.ui.close_flow;

import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step;
import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import or4.i;
import org.jetbrains.annotations.NotNull;
import p48.b;
import p48.c;
import p48.d;
import p48.k;
import wsg.n;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final JointCloseFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f76517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f76518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f76519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f76520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f76521t;

    public a(JointCloseFlowContract$InputData input, r0 interactor, k closeValidateExtension, n walletInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(closeValidateExtension, "closeValidateExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = input;
        this.f76517p = interactor;
        this.f76518q = closeValidateExtension;
        this.f76519r = walletInteractor;
        i iVar = new i(this, 27);
        this.f76520s = cp5.d.a(this, JointCloseFlowContract$Step.Confirmation.f76514a, f0.f322471a, iVar);
        this.f76521t = new c(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.joint.impl.ui.close_flow.a r7, gim.c r8) {
        /*
            yki.a r1 = r7.f76520s
            boolean r0 = r8 instanceof p48.h
            if (r0 == 0) goto L15
            r0 = r8
            p48.h r0 = (p48.h) r0
            int r2 = r0.f232845w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.f232845w = r2
            goto L1a
        L15:
            p48.h r0 = new p48.h
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.f232845w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            p48.k r8 = r7.f76518q
            r0.f232845w = r4
            java.lang.Object r8 = r8.c3(r0)
            if (r8 != r2) goto L3f
            return r2
        L3f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4a
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L4a:
            com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$InputData r8 = r7.o
            com.revolut.feature.joint.api.data.JointAccountCloseReason r8 = r8.f76513b
            boolean r0 = r8 instanceof com.revolut.feature.joint.api.data.JointAccountCloseReason.UserIntention
            if (r0 == 0) goto L5e
            r5 = 0
            r6 = 12
            com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step$LoseBenefit r2 = com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step.LoseBenefit.f76515a
            r3 = 1
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L6d
        L5e:
            r0 = r7
            boolean r7 = r8 instanceof com.revolut.feature.joint.api.data.JointAccountCloseReason.ForceOffBoarding
            if (r7 == 0) goto L70
            r5 = 0
            r6 = 12
            com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step$Statement r2 = com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step.Statement.f76516a
            r3 = 1
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L70:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.joint.impl.ui.close_flow.a.I2(com.revolut.feature.joint.impl.ui.close_flow.a, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76520s;
    }
}
