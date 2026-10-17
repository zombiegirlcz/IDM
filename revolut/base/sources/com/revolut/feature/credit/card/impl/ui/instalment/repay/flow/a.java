package com.revolut.feature.credit.card.impl.ui.instalment.repay.flow;

import al4.m;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import zp5.g;
import zs4.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardInstalmentRepayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.b f69501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f69502r;

    public a(CreditCardInstalmentRepayFlowContract$InputData inputData, m creditCardInstalmentInteractor, vt4.b creditCardDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        this.o = inputData;
        this.f69500p = creditCardInstalmentInteractor;
        this.f69501q = creditCardDialogMapper;
        this.f69502r = d.a(this, new zo2.h(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a r4, java.util.ArrayList r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof zs4.f
            if (r0 == 0) goto L13
            r0 = r6
            zs4.f r0 = (zs4.f) r0
            int r1 = r0.f324811x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324811x = r1
            goto L18
        L13:
            zs4.f r0 = new zs4.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324811x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.ArrayList r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            ql4.j r6 = ql4.j.CUSTOM_AMOUNT
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L50
            r0.u = r5
            r0.f324811x = r3
            java.lang.Object r6 = r4.J2(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            ql4.j r4 = ql4.j.ANTICIPATION
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L5c
            com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step$Anticipation r4 = com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step.Anticipation.f69496a
            return r4
        L5c:
            ql4.j r4 = ql4.j.CUSTOM_AMOUNT
            ql4.j r6 = ql4.j.FUTURE_INSTALMENTS
            ql4.j[] r0 = new ql4.j[]{r4, r6}
            java.util.List r0 = zhm.v.k(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r5.containsAll(r0)
            if (r0 == 0) goto L75
            if (r3 == 0) goto L75
            com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step$SelectPaymentType r4 = com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step.SelectPaymentType.f69499a
            return r4
        L75:
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L7e
            com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step$FutureInstalments r4 = com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step.FutureInstalments.f69498a
            return r4
        L7e:
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L91
            if (r3 == 0) goto L89
            com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step$CustomAmount r4 = com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step.CustomAmount.f69497a
            return r4
        L89:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "CustomAmount is not eligible"
            r4.<init>(r5)
            throw r4
        L91:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "No eligible repayment methods: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a.I2(com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a, java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a.J2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 5), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69502r;
    }
}
