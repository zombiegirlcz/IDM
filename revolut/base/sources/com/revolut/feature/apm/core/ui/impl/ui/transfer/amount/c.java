package com.revolut.feature.apm.core.ui.impl.ui.transfer.amount;

import aw0.f4;
import bsf.i;
import cli.n;
import cli.y;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import h52.e;
import i52.a0;
import ip0.v7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import t3b.g;
import t42.d0;
import t42.s;
import t42.x;
import vkm.j2;
import vkm.q;
import vkm.v1;
import x02.d;
import yji.l;
import zhm.f0;
import zof.f;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements t42.h {

    @NotNull
    public static final s Companion = new s();
    public final s42.c A;
    public final c52.a B;
    public final f C;
    public final i D;
    public final TransferAmountContract$InputData E;
    public final ApmTransferContract$InputData F;
    public final y G;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f62444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c52.c f62445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xdk.b f62446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s5k.a f62447t;
    public final n60.a u;
    public final ldd.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w80.b f62448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wj0.a f62449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v42.c f62450y;
    public final kz9.a z;

    public c(b interactor, d router, e validatorExtension, c52.c transferExtension, xdk.b pocketExtension, s5k.a transferWalletLimitsExtension, n60.a keyboardExtension, ldd.b focusRequesterDelegate, w80.b amountFormatter, wj0.a idempotencyKeyHolder, v42.c periodicLimitExceededDialogProvider, kz9.a chatNavigationProvider, s42.c expiryExtension, c52.a expiryDialogProvider, f transferFeatureScreensProvider, i transferReasonLauncherExtension, TransferAmountContract$InputData inputData, ApmTransferContract$InputData flowInputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(periodicLimitExceededDialogProvider, "periodicLimitExceededDialogProvider");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(expiryExtension, "expiryExtension");
        Intrinsics.checkNotNullParameter(expiryDialogProvider, "expiryDialogProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f62443p = router;
        this.f62444q = validatorExtension;
        this.f62445r = transferExtension;
        this.f62446s = pocketExtension;
        this.f62447t = transferWalletLimitsExtension;
        this.u = keyboardExtension;
        this.v = focusRequesterDelegate;
        this.f62448w = amountFormatter;
        this.f62449x = idempotencyKeyHolder;
        this.f62450y = periodicLimitExceededDialogProvider;
        this.z = chatNavigationProvider;
        this.A = expiryExtension;
        this.B = expiryDialogProvider;
        this.C = transferFeatureScreensProvider;
        this.D = transferReasonLauncherExtension;
        this.E = inputData;
        this.F = flowInputData;
        ApmTransferDirection f62429a = inputData.getF62429a();
        ApmTransferContract$InputData.FooterConfig f62431c = inputData.getF62431c();
        hrf.h.Companion.getClass();
        this.G = mra.d.b(this, new t42.b(f62429a, f62431c, null, new t42.c(null, null, hrf.h.d, f0.f322471a), inputData.getD(), inputData.getE(), 0, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof t42.u
            if (r0 == 0) goto L13
            r0 = r9
            t42.u r0 = (t42.u) r0
            int r1 = r0.f267869x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267869x = r1
            goto L18
        L13:
            t42.u r0 = new t42.u
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267869x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r2 = r0.u
            yhm.o.b(r9)
            goto L54
        L38:
            yhm.o.b(r9)
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r2 = r8.N2()
            xdk.b r9 = r8.f62446s
            com.revolut.core.model.account.AccountId r5 = r2.d
            com.revolut.feature.transfer.core.models.FundingSource r6 = r2.f62453a
            xi0.b r7 = r6.f92241b
            java.lang.String r6 = r6.f92240a
            r0.u = r2
            r0.f267869x = r4
            java.lang.Object r9 = r9.b3(r5, r7, r6, r0)
            if (r9 != r1) goto L54
            goto L6a
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5f
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L5f:
            r9 = 0
            r0.u = r9
            r0.f267869x = r3
            java.lang.Object r8 = r8.M2(r2, r0)
            if (r8 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.I2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof t42.v
            if (r0 == 0) goto L13
            r0 = r5
            t42.v r0 = (t42.v) r0
            int r1 = r0.f267870w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267870w = r1
            goto L18
        L13:
            t42.v r0 = new t42.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267870w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.f267870w = r3
            t42.z r5 = new t42.z
            r2 = 0
            r3 = 2
            r5.<init>(r4, r2, r3)
            nki.a r2 = r4.k
            java.lang.String r3 = "APM_INITIATE_TRANSFER_TASK_ID"
            java.lang.Object r5 = pu7.a.B(r2, r3, r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r5 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo) r5
            if (r5 == 0) goto L56
            t42.e r0 = new t42.e
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r1 = r4.N2()
            r0.<init>(r1, r5)
            r4.C2(r0)
        L56:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.J2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c r5, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof t42.a0
            if (r0 == 0) goto L13
            r0 = r7
            t42.a0 r0 = (t42.a0) r0
            int r1 = r0.f267836x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267836x = r1
            goto L18
        L13:
            t42.a0 r0 = new t42.a0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267836x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c r6 = r0.u
            yhm.o.b(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            ldd.b r7 = r5.v
            r7.f194072c = r3
            x02.d r7 = r5.f62443p
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountContract$InputData r2 = r5.E
            com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile r2 = r2.getF()
            int[] r4 = t42.t.f267867b
            int r2 = r2.ordinal()
            r2 = r4[r2]
            if (r2 == r3) goto L56
            r4 = 2
            if (r2 != r4) goto L50
            x02.c r2 = x02.c.CORAL
            goto L58
        L50:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L56:
            x02.c r2 = x02.c.CORAL_PRO
        L58:
            r0.u = r5
            r0.f267836x = r3
            q12.l r7 = (q12.l) r7
            java.lang.Object r7 = r7.a(r6, r2, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r6 = r5
        L66:
            r0 = r7
            com.revolut.kompot.navigable.flow.BaseFlow r0 = (com.revolut.kompot.navigable.flow.BaseFlow) r0
            sii.a r1 = new sii.a
            r2 = 19
            r1.<init>(r5, r2)
            r0.l2(r1)
            dki.p r7 = (dki.p) r7
            t42.q r0 = new t42.q
            r1 = 2
            r0.<init>(r5, r1)
            r5 = 0
            yji.l.i2(r6, r7, r5, r0, r3)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.K2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof t42.c0
            if (r0 == 0) goto L13
            r0 = r5
            t42.c0 r0 = (t42.c0) r0
            int r1 = r0.f267846w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267846w = r1
            goto L18
        L13:
            t42.c0 r0 = new t42.c0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267846w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            tji.f r5 = r4.X()
            c52.a r2 = r4.B
            r2.getClass()
            nii.y0 r2 = c52.a.a()
            rv6.e r5 = r5.d(r2)
            r0.f267846w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            t42.d r5 = t42.d.f267847a
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.L2(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.v;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        l2(new x(this, continuation, 0), new yi5.b(26));
        l.a1(this, q.Q(v7.w(this.G.B(new g(7))), new s9b.n(continuation, this, 21)), null, null, new t42.y(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof t42.b0
            if (r0 == 0) goto L13
            r0 = r13
            t42.b0 r0 = (t42.b0) r0
            int r1 = r0.f267842w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267842w = r1
            goto L18
        L13:
            t42.b0 r0 = new t42.b0
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267842w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L5e
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData r13 = r11.F
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData$TransferReasonConfig r2 = r13.o
            if (r2 != 0) goto L3b
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L3b:
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r13 = r13.f62280a
            boolean r13 = r13 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Outgoing
            if (r13 != 0) goto L44
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L44:
            bsf.a r4 = new bsf.a
            long r5 = r12.f62454b
            xi0.b r7 = r12.f62455c
            com.revolut.feature.transfer.core.models.FundingSource r8 = r12.f62453a
            rtf.c r9 = r12.f62457h
            wi0.b r10 = r2.f62292a
            r4.<init>(r5, r7, r8, r9, r10)
            r0.f267842w = r3
            bsf.i r12 = r11.D
            java.lang.Object r13 = r12.Z2(r4, r0)
            if (r13 != r1) goto L5e
            return r1
        L5e:
            bsf.h r13 = (bsf.h) r13
            bsf.g r12 = bsf.g.f18201a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r13, r12)
            if (r12 == 0) goto L6a
            r3 = 0
            goto L79
        L6a:
            boolean r12 = r13 instanceof bsf.f
            if (r12 == 0) goto L7e
            l9k.q r12 = new l9k.q
            bsf.f r13 = (bsf.f) r13
            r0 = 3
            r12.<init>(r13, r0)
            r11.O2(r12)
        L79:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        L7e:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.M2(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData, gim.c):java.lang.Object");
    }

    public final TransferData N2() {
        TransferData transferData = ((t42.b) ((j2) this.G.f22677a).getValue()).f267839c;
        if (transferData != null) {
            return transferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void O2(Function1 function1) {
        H2(this.G, new sx2.h(function1, this, 19));
    }

    @Override // yji.l
    public final void P1() {
        H2(this.G, new t42.q(this, 3));
    }

    @Override // yji.l
    public final void T1(long j2) {
        ApmTransferContract$InputData.FooterConfig f62431c = this.E.getF62431c();
        ApmFooterContent apmFooterContent = f62431c != null ? f62431c.f62289a : null;
        if (apmFooterContent instanceof ApmFooterContent.TextOnly) {
            H2(this.G, new a0((ApmFooterContent.TextOnly) apmFooterContent, 1));
            return;
        }
        if (!(apmFooterContent instanceof ApmFooterContent.Expiry)) {
            if (!(apmFooterContent instanceof ApmFooterContent.ImageOnly) && apmFooterContent != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            long j3 = ((ApmFooterContent.Expiry) apmFooterContent).f62231a;
            s42.c cVar = this.A;
            cVar.getClass();
            l.b1(this, new v1(new s42.b(cVar, j3, null)), null, new d0(this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
