package com.revolut.feature.apm.wero.impl.ui.flow;

import c12.r;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step;
import f62.o;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sh2.d;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements th2.b {
    public final WeroNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qh2.a f63058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f63059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f63060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d12.b f63061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f63062t;
    public final yki.a u;

    public b(WeroNavigation$InputData flowInputData, qh2.a weroInteractor, d newContactNavigationProvider, o recipientListNavigationProvider, d12.b entryExtension, r pendingExtension) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(weroInteractor, "weroInteractor");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        Intrinsics.checkNotNullParameter(pendingExtension, "pendingExtension");
        this.o = flowInputData;
        this.f63058p = weroInteractor;
        this.f63059q = newContactNavigationProvider;
        this.f63060r = recipientListNavigationProvider;
        this.f63061s = entryExtension;
        this.f63062t = pendingExtension;
        ta8.a aVar = new ta8.a(this, 15);
        this.u = cp5.d.a(this, WeroFlowContract$Step.Intro.f63050a, f0.f322471a, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.wero.impl.ui.flow.b r7, com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof th2.e
            if (r0 == 0) goto L13
            r0 = r9
            th2.e r0 = (th2.e) r0
            int r1 = r0.f271254w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271254w = r1
            goto L18
        L13:
            th2.e r0 = new th2.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271254w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L4c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Pending
            if (r9 == 0) goto L3f
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Pending r8 = new com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Pending
            java.lang.String r9 = "WERO_PENDING_RETRY"
            r8.<init>(r9)
        L3d:
            r2 = r8
            goto L6e
        L3f:
            boolean r9 = r8 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.Active
            if (r9 == 0) goto L50
            r0.f271254w = r3
            java.lang.Object r9 = r7.K2(r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            r8 = r9
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step r8 = (com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step) r8
            goto L3d
        L50:
            boolean r9 = r8 instanceof com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered
            if (r9 == 0) goto L7d
            com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus$NotRegistered r8 = (com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus.NotRegistered) r8
            java.util.List r9 = r8.getTerms()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L68
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Pending r8 = new com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Pending
            java.lang.String r9 = "WERO_PENDING_REGISTER"
            r8.<init>(r9)
            goto L3d
        L68:
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Registration r9 = new com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Registration
            r9.<init>(r8)
            r2 = r9
        L6e:
            yki.a r1 = r7.u
            com.revolut.kompot.navigable.TransitionAnimation$FADE r4 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r5 = 0
            r6 = 8
            r3 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L7d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.flow.b.I2(com.revolut.feature.apm.wero.impl.ui.flow.b, com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.apm.wero.impl.ui.flow.b r10, c12.v r11, gim.c r12) {
        /*
            yki.a r0 = r10.u
            boolean r1 = r12 instanceof th2.f
            if (r1 == 0) goto L15
            r1 = r12
            th2.f r1 = (th2.f) r1
            int r2 = r1.f271257y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f271257y = r2
            goto L1a
        L15:
            th2.f r1 = new th2.f
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.f271255w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f271257y
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            yki.a r0 = r1.v
            com.revolut.feature.apm.wero.impl.ui.flow.b r10 = r1.u
            yhm.o.b(r12)
        L2c:
            r3 = r10
            r4 = r0
            goto L5c
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            yhm.o.b(r12)
            c12.s r12 = c12.s.f20349a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r11, r12)
            if (r12 != 0) goto L6f
            c12.t r12 = c12.t.f20351a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r11, r12)
            if (r12 == 0) goto L4b
            goto L6f
        L4b:
            boolean r11 = r11 instanceof c12.u
            if (r11 == 0) goto L69
            r1.u = r10
            r1.v = r0
            r1.f271257y = r4
            java.lang.Object r12 = r10.K2(r1)
            if (r12 != r2) goto L2c
            return r2
        L5c:
            r5 = r12
            com.revolut.kompot.navigable.flow.FlowStep r5 = (com.revolut.kompot.navigable.flow.FlowStep) r5
            com.revolut.kompot.navigable.TransitionAnimation$FADE r7 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r8 = 0
            r9 = 8
            r6 = 0
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            goto L72
        L69:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L6f:
            oki.h.D2(r0)
        L72:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.flow.b.J2(com.revolut.feature.apm.wero.impl.ui.flow.b, c12.v, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof th2.d
            if (r0 == 0) goto L13
            r0 = r5
            th2.d r0 = (th2.d) r0
            int r1 = r0.f271253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271253w = r1
            goto L18
        L13:
            th2.d r0 = new th2.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271253w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$InputData r5 = r4.o
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType r5 = r5.f63018a
            boolean r2 = r5 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType.Area
            if (r2 == 0) goto L3d
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Area r5 = com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step.Area.f63049a
            return r5
        L3d:
            boolean r2 = r5 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType.PaymentArea
            if (r2 == 0) goto L44
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$PaymentArea r5 = com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step.PaymentArea.f63053a
            return r5
        L44:
            boolean r2 = r5 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType.NewContact
            if (r2 == 0) goto L5d
            r0.f271253w = r3
            qh2.a r5 = r4.f63058p
            qh2.h r5 = (qh2.h) r5
            java.io.Serializable r5 = r5.c(r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            wi0.b r5 = (wi0.b) r5
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$NewContact r0 = new com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$NewContact
            r0.<init>(r5)
            return r0
        L5d:
            boolean r0 = r5 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType.RecipientList
            if (r0 == 0) goto L64
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$RecipientList r5 = com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step.RecipientList.f63055a
            return r5
        L64:
            boolean r0 = r5 instanceof com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType.Pay
            if (r0 == 0) goto L70
            com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Pay r0 = new com.revolut.feature.apm.wero.impl.ui.flow.WeroFlowContract$Step$Pay
            com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType$Pay r5 = (com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType.Pay) r5
            r0.<init>(r5)
            return r0
        L70:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.flow.b.K2(gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
