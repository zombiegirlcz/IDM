package com.revolut.feature.wealth.impl.ui.flows.dual_add_money;

import com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oah.c;
import oah.d;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final epc.h f95558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kge.d f95559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final epc.c f95560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f95561s;

    public a(d input, epc.h dialogProvider, kge.d depositDelegate, epc.c depositInfoResultHandler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(depositDelegate, "depositDelegate");
        Intrinsics.checkNotNullParameter(depositInfoResultHandler, "depositInfoResultHandler");
        this.o = input;
        this.f95558p = dialogProvider;
        this.f95559q = depositDelegate;
        this.f95560r = depositInfoResultHandler;
        this.f95561s = cp5.d.a(this, input.f223638c == null ? DualAddMoneyFlowContract$Step.CreateOrUpdateRecurringDeposit.f95556a : DualAddMoneyFlowContract$Step.CreateOneOffDeposit.f95555a, f0.f322471a, new oa4.c(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r5, com.revolut.feature.wealth.api.navigation.models.DepositInfo.RecurringDeposit r6, gim.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof oah.f
            if (r0 == 0) goto L16
            r0 = r7
            oah.f r0 = (oah.f) r0
            int r1 = r0.f223644x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f223644x = r1
            goto L1b
        L16:
            oah.f r0 = new oah.f
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223644x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r5 = r0.u
            yhm.o.b(r7)
            goto L4a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            kge.d r7 = r5.f95559q
            oah.g r2 = new oah.g
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.u = r5
            r0.f223644x = r3
            java.lang.Object r7 = r7.c(r5, r6, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            nii.h r7 = (nii.h) r7
            boolean r6 = r7 instanceof nii.g
            if (r6 == 0) goto L56
            yki.a r5 = r5.f95561s
            oki.h.D2(r5)
            goto L5d
        L56:
            r5.getClass()
            boolean r5 = r7 instanceof nii.f
            if (r5 == 0) goto L60
        L5d:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L60:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.I2(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a, com.revolut.feature.wealth.api.navigation.models.DepositInfo$RecurringDeposit, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7.K2((nii.h) r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.feature.wealth.api.navigation.models.DepositInfo r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof oah.e
            if (r0 == 0) goto L13
            r0 = r8
            oah.e r0 = (oah.e) r0
            int r1 = r0.f223642x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223642x = r1
            goto L18
        L13:
            oah.e r0 = new oah.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223642x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L5e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L39:
            yhm.o.b(r8)
            nk9.l r8 = new nk9.l
            r2 = 21
            r8.<init>(r6, r7, r5, r2)
            r0.u = r6
            r0.f223642x = r4
            kge.d r2 = r6.f95559q
            java.lang.Object r8 = r2.c(r6, r7, r8, r0)
            if (r8 != r1) goto L50
            goto L5d
        L50:
            r7 = r6
        L51:
            nii.h r8 = (nii.h) r8
            r0.u = r5
            r0.f223642x = r3
            java.lang.Object r7 = r7.K2(r8, r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.J2(com.revolut.feature.wealth.api.navigation.models.DepositInfo, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(nii.h r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof oah.i
            if (r0 == 0) goto L13
            r0 = r10
            oah.i r0 = (oah.i) r0
            int r1 = r0.f223649x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223649x = r1
            goto L18
        L13:
            oah.i r0 = new oah.i
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223649x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            nii.g r9 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            goto L54
        L29:
            r0 = move-exception
            r10 = r0
            goto L59
        L2c:
            r0 = move-exception
            r9 = r0
            goto L95
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            yhm.o.b(r10)
            boolean r10 = r9 instanceof nii.g
            if (r10 == 0) goto L96
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            epc.c r10 = r8.f95560r     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            oah.d r2 = r8.o     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r2 = r2.f223636a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            r4 = r9
            nii.g r4 = (nii.g) r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            r0.u = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            r0.f223649x = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            java.lang.Object r10 = r10.a(r2, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            if (r10 != r1) goto L54
            return r1
        L54:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2c
            goto L5f
        L59:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r10 = yhm.o.a(r10)
        L5f:
            java.lang.Throwable r10 = yhm.m.a(r10)
            if (r10 == 0) goto L68
            hx7.e.n(r10)
        L68:
            nii.g r9 = (nii.g) r9
            nii.n1 r9 = r9.f216153b
            boolean r10 = r9 instanceof nii.l1
            yki.a r2 = r8.f95561s
            if (r10 == 0) goto L7e
            r6 = 0
            r7 = 12
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step$CreateOrUpdateRecurringDeposit r3 = com.revolut.feature.wealth.impl.ui.flows.dual_add_money.DualAddMoneyFlowContract$Step.CreateOrUpdateRecurringDeposit.f95556a
            r4 = 0
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            goto L9a
        L7e:
            boolean r10 = r9 instanceof nii.j1
            if (r10 != 0) goto L9a
            boolean r10 = r9 instanceof nii.m1
            if (r10 != 0) goto L91
            boolean r9 = r9 instanceof nii.k1
            if (r9 == 0) goto L8b
            goto L91
        L8b:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L91:
            oki.h.D2(r2)
            goto L9a
        L95:
            throw r9
        L96:
            boolean r9 = r9 instanceof nii.f
            if (r9 == 0) goto L9d
        L9a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L9d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.K2(nii.h, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final b s() {
        return this.f95561s;
    }
}
