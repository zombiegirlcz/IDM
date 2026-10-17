package eh9;

import aw0.f4;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends oki.h implements i {

    @NotNull
    public static final s Companion = new s();
    public final cli.y A;
    public final com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x02.d f125804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rh9.e f125805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nh9.d f125806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xdk.b f125807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s5k.a f125808t;
    public final n60.a u;
    public final ldd.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w80.b f125809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zof.f f125810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final nh9.e f125811y;
    public final PaymentAmountContract$InputData z;

    public z(com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.b interactor, x02.d router, rh9.e validatorExtension, nh9.d paymentExtension, xdk.b pocketExtension, s5k.a transferWalletLimitsExtension, n60.a keyboardExtension, ldd.b focusRequesterDelegate, w80.b amountFormatter, zof.f transferFeatureScreensProvider, nh9.e paymentResultExtension, PaymentAmountContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(paymentExtension, "paymentExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(paymentResultExtension, "paymentResultExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f125804p = router;
        this.f125805q = validatorExtension;
        this.f125806r = paymentExtension;
        this.f125807s = pocketExtension;
        this.f125808t = transferWalletLimitsExtension;
        this.u = keyboardExtension;
        this.v = focusRequesterDelegate;
        this.f125809w = amountFormatter;
        this.f125810x = transferFeatureScreensProvider;
        this.f125811y = paymentResultExtension;
        this.z = inputData;
        hrf.h.Companion.getClass();
        this.A = mra.d.b(this, new a(null, new b(null, null, null, hrf.h.d, f0.f322471a), inputData.getF78768c(), 0, new TransferScheduleData(0L, (jli.c) null, 7), inputData.getF(), inputData.getF78770h(), inputData.getF78767b()), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(eh9.z r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof eh9.t
            if (r0 == 0) goto L13
            r0 = r6
            eh9.t r0 = (eh9.t) r0
            int r1 = r0.f125795w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125795w = r1
            goto L18
        L13:
            eh9.t r0 = new eh9.t
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125795w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r6 = r5.L2()
            xdk.b r5 = r5.f125807s
            com.revolut.core.model.account.AccountId r2 = r6.d
            com.revolut.feature.transfer.core.models.FundingSource r6 = r6.f78793a
            xi0.b r4 = r6.f92241b
            java.lang.String r6 = r6.f92240a
            r0.f125795w = r3
            java.lang.Object r6 = r5.b3(r2, r4, r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eh9.z.I2(eh9.z, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(eh9.z r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof eh9.v
            if (r0 == 0) goto L13
            r0 = r5
            eh9.v r0 = (eh9.v) r0
            int r1 = r0.f125797w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125797w = r1
            goto L18
        L13:
            eh9.v r0 = new eh9.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125797w
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
            r0.f125797w = r3
            eh9.w r5 = new eh9.w
            r2 = 0
            r3 = 5
            r5.<init>(r4, r2, r3)
            nki.a r2 = r4.k
            java.lang.String r3 = "APM_INITIATE_TRANSFER_TASK_ID"
            java.lang.Object r5 = pu7.a.B(r2, r3, r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo r5 = (com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo) r5
            if (r5 == 0) goto L64
            eh9.d r0 = new eh9.d
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r1 = r4.L2()
            cli.y r2 = r4.A
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            eh9.a r2 = (eh9.a) r2
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r2 = r2.e
            r0.<init>(r1, r5, r2)
            r4.C2(r0)
        L64:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eh9.z.J2(eh9.z, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(eh9.z r4, com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof eh9.x
            if (r0 == 0) goto L13
            r0 = r6
            eh9.x r0 = (eh9.x) r0
            int r1 = r0.f125800x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125800x = r1
            goto L18
        L13:
            eh9.x r0 = new eh9.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125800x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eh9.z r5 = r0.u
            yhm.o.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            ldd.b r6 = r4.v
            r6.f194072c = r3
            x02.d r6 = r4.f125804p
            x02.c r2 = x02.c.BILLS
            r0.u = r4
            r0.f125800x = r3
            q12.l r6 = (q12.l) r6
            java.lang.Object r6 = r6.a(r5, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            r0 = r6
            com.revolut.kompot.navigable.flow.BaseFlow r0 = (com.revolut.kompot.navigable.flow.BaseFlow) r0
            e58.e r1 = new e58.e
            r2 = 9
            r1.<init>(r4, r2)
            r0.l2(r1)
            dki.p r6 = (dki.p) r6
            eh9.r r0 = new eh9.r
            r1 = 0
            r0.<init>(r4, r1)
            r4 = 0
            yji.l.i2(r5, r6, r4, r0, r3)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eh9.z.K2(eh9.z, com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.v;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        l2(new u(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, vkm.q.Q(v7.w(this.A.B(new efb.i(17))), new dz6.n(continuation, this, 10)), null, null, new ea4.d(this, continuation, 14), 3);
    }

    public final PaymentData L2() {
        PaymentData paymentData = ((a) ((j2) this.A.f22677a).getValue()).f125765a;
        if (paymentData != null) {
            return paymentData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void P1() {
        H2(this.A, new r(this, 1));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
