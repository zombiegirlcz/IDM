package nh9;

import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BillPaymentNavigation$InputData f215385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gf9.b f215386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wo1.b f215387n;
    public final wsg.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f215388p;

    public d(BillPaymentNavigation$InputData flowInputData, gf9.b warningExtension, wo1.b billsInteractor, wsg.n walletInteractor, h scheduledDataExtension) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(warningExtension, "warningExtension");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(scheduledDataExtension, "scheduledDataExtension");
        this.f215385l = flowInputData;
        this.f215386m = warningExtension;
        this.f215387n = billsInteractor;
        this.o = walletInteractor;
        this.f215388p = scheduledDataExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r12, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof nh9.b
            if (r0 == 0) goto L13
            r0 = r14
            nh9.b r0 = (nh9.b) r0
            int r1 = r0.f215382y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215382y = r1
            goto L18
        L13:
            nh9.b r0 = new nh9.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f215380w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215382y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            xo1.f r12 = r0.v
            yhm.o.b(r14)
            return r12
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r12 = r0.u
            yhm.o.b(r14)
            r6 = r11
            goto L55
        L3c:
            yhm.o.b(r14)
            mh1.d r5 = new mh1.d
            r10 = 14
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.u = r7
            r0.f215382y = r4
            java.lang.Object r14 = do3.q.u(r11, r5, r0)
            if (r14 != r1) goto L54
            goto L88
        L54:
            r12 = r7
        L55:
            xo1.f r14 = (xo1.f) r14
            com.revolut.core.model.account.AccountId r12 = r12.d
            r0.u = r9
            r0.v = r14
            r0.f215382y = r3
            wsg.n r13 = r6.o
            efm.b r2 = r13.j0(r12)
            pfm.a r12 = r13.k0(r12)
            efm.f[] r13 = new efm.f[r3]
            r3 = 0
            r13[r3] = r2
            r13[r4] = r12
            efm.b r12 = efm.b.p(r13)
            java.lang.String r13 = "mergeArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            pfm.a r12 = ue0.e.v(r12)
            java.lang.Object r12 = nim.a.a(r12, r0)
            if (r12 != r1) goto L84
            goto L86
        L84:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L86:
            if (r12 != r1) goto L89
        L88:
            return r1
        L89:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nh9.d.Z2(com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData, com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r14, gim.c r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof nh9.c
            if (r0 == 0) goto L13
            r0 = r15
            nh9.c r0 = (nh9.c) r0
            int r1 = r0.f215384x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215384x = r1
            goto L18
        L13:
            nh9.c r0 = new nh9.c
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215384x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            xo1.n r14 = r0.u
            yhm.o.b(r15)
            goto L7f
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            yhm.o.b(r15)
            goto L6f
        L39:
            yhm.o.b(r15)
            xo1.l r6 = new xo1.l
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData r15 = r13.f215385l
            xo1.g r7 = r15.f78670a
            com.revolut.feature.apm.bills.core.api.model.BillTransferType r8 = r15.f78671b
            java.util.List r9 = r15.f78672c
            dj0.d r10 = r14.getF72729b()
            com.revolut.feature.transfer.core.models.FundingSource r14 = r14.f78793a
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r11 = oc.c.u(r14)
            com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails r12 = r15.f78673g
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.f215384x = r4
            wo1.b r14 = r13.f215387n
            vp1.c r14 = (vp1.c) r14
            rp1.j r14 = r14.f291042a
            rm6.c r15 = new rm6.c
            r2 = 13
            r15.<init>(r14, r6, r5, r2)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r14, r15, r0)
            if (r15 != r1) goto L6f
            goto L7e
        L6f:
            r14 = r15
            xo1.n r14 = (xo1.n) r14
            r0.u = r14
            r0.f215384x = r3
            gf9.b r15 = r13.f215386m
            java.lang.Object r15 = r15.Z2(r14, r0)
            if (r15 != r1) goto L7f
        L7e:
            return r1
        L7f:
            gf9.a r15 = (gf9.a) r15
            int[] r0 = nh9.a.f215379a
            int r15 = r15.ordinal()
            r15 = r0[r15]
            if (r15 == r4) goto L94
            if (r15 != r3) goto L8e
            return r5
        L8e:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L94:
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo r0 = new com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo
            r15 = r5
            com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider r5 = r14.e
            if (r5 == 0) goto L9d
            java.lang.String r15 = r5.f61448b
        L9d:
            r1 = r15
            dj0.d r2 = r14.f307582a
            java.util.ArrayList r3 = r14.f307583b
            java.time.LocalDate r4 = r14.f307584c
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nh9.d.b3(com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData, gim.c):java.lang.Object");
    }
}
