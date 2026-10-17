package com.revolut.feature.salary_switch.impl.ui.flow;

import aqc.k;
import com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step;
import d8l.d;
import ebg.o;
import eh3.s;
import erc.b;
import erc.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wsg.n;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final drc.a f85314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vpc.a f85315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f85316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f85317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f85318t;

    public a(c inputData, drc.a switchSalaryAccountCurrencyDialogProvider, vpc.a salarySwitchInteractor, k salarySwitchProcessInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(switchSalaryAccountCurrencyDialogProvider, "switchSalaryAccountCurrencyDialogProvider");
        Intrinsics.checkNotNullParameter(salarySwitchInteractor, "salarySwitchInteractor");
        Intrinsics.checkNotNullParameter(salarySwitchProcessInteractor, "salarySwitchProcessInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = inputData;
        this.f85314p = switchSalaryAccountCurrencyDialogProvider;
        this.f85315q = salarySwitchInteractor;
        this.f85316r = salarySwitchProcessInteractor;
        this.f85317s = walletInteractor;
        this.f85318t = d.a(this, new s(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.salary_switch.impl.ui.flow.a r7, erc.c r8, gim.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof erc.f
            if (r0 == 0) goto L13
            r0 = r9
            erc.f r0 = (erc.f) r0
            int r1 = r0.f128638w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128638w = r1
            goto L18
        L13:
            erc.f r0 = new erc.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128638w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L50
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r9)
            java.lang.String r8 = r8.f128634b
            if (r8 == 0) goto L43
            boolean r9 = kotlin.text.d0.W(r8)
            if (r9 == 0) goto L3d
            goto L43
        L3d:
            r7.K2(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L43:
            aqc.k r8 = r7.f85316r
            r0.f128638w = r3
            aqc.h r8 = (aqc.h) r8
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            bqc.n r9 = (bqc.n) r9
            if (r9 == 0) goto L57
            bqc.k r8 = r9.f17814b
            goto L58
        L57:
            r8 = 0
        L58:
            bqc.k r0 = bqc.k.IN_PROGRESS
            if (r8 != r0) goto L62
            java.lang.String r8 = r9.f17813a
            r7.K2(r8)
            goto L6f
        L62:
            yki.i r1 = r7.f85318t
            r5 = 0
            r6 = 12
            com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step$MxSalarySwitchPromo r2 = com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step.MxSalarySwitchPromo.f85310a
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.salary_switch.impl.ui.flow.a.I2(com.revolut.feature.salary_switch.impl.ui.flow.a, erc.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.salary_switch.impl.ui.flow.a r7, gim.c r8) {
        /*
            yki.i r1 = r7.f85318t
            boolean r0 = r8 instanceof erc.g
            if (r0 == 0) goto L15
            r0 = r8
            erc.g r0 = (erc.g) r0
            int r2 = r0.f128641y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.f128641y = r2
            goto L1a
        L15:
            erc.g r0 = new erc.g
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.f128639w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.f128641y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            java.lang.String r2 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r8)
            goto L70
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r8)
            goto L50
        L3c:
            yhm.o.b(r8)
            wsg.n r8 = r7.f85317s
            com.revolut.core.model.account.AccountId$Personal r3 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r8 = r8.x(r3)
            r0.f128641y = r5
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r2) goto L50
            goto L6b
        L50:
            xi0.b r8 = (xi0.b) r8
            java.lang.String r8 = r8.f306286a
            erc.c r3 = r7.o
            java.lang.String r3 = r3.f128633a
            if (r3 != 0) goto L5b
            r3 = r8
        L5b:
            vpc.a r5 = r7.f85315q
            r0.u = r8
            r0.v = r3
            r0.f128641y = r4
            aqc.h r5 = (aqc.h) r5
            java.lang.Object r0 = r5.e(r8, r3, r0)
            if (r0 != r2) goto L6c
        L6b:
            return r2
        L6c:
            r2 = r0
            r0 = r8
            r8 = r2
            r2 = r3
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L83
            com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step$CurrencySwitch r7 = new com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step$CurrencySwitch
            r7.<init>(r2, r0)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r1, r7, r8)
            goto L91
        L83:
            com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step$ShareSalaryDetails r2 = new com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step$ShareSalaryDetails
            r2.<init>(r0)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L91:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.salary_switch.impl.ui.flow.a.J2(com.revolut.feature.salary_switch.impl.ui.flow.a, gim.c):java.lang.Object");
    }

    public final void K2(String str) {
        h.t2(this, this.f85318t, new SalarySwitchFlowContract$Step.SalarySwitchMx(str), false, null, false, 12);
    }

    @Override // yki.j
    public final void M0() {
        l2(new o(this, null, 25), new erc.d(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85318t;
    }
}
