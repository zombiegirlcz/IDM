package uae;

import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerInputData;
import kotlin.jvm.internal.Intrinsics;
import m2j.j;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f278628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f278629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f278630c;
    public final PaymentBalancePickerInputData d;
    public final xua.a e;

    public e(j balancesInteractor, g balancesFilterInteractor, n walletInteractor, b paymentBalancePickerAllCashCalculator, PaymentBalancePickerInputData inputData, xua.a recurringPaymentInteractor, h selectedBalanceInfoFinder) {
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(paymentBalancePickerAllCashCalculator, "paymentBalancePickerAllCashCalculator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(selectedBalanceInfoFinder, "selectedBalanceInfoFinder");
        this.f278628a = balancesInteractor;
        this.f278629b = balancesFilterInteractor;
        this.f278630c = walletInteractor;
        this.d = inputData;
        this.e = recurringPaymentInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (nim.a.a(r1, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(sae.i r24, com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo r25, gim.c r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof uae.d
            if (r3 == 0) goto L19
            r3 = r2
            uae.d r3 = (uae.d) r3
            int r4 = r3.f278627w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f278627w = r4
            goto L1e
        L19:
            uae.d r3 = new uae.d
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f278627w
            xua.a r6 = r0.e
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L3f
            if (r5 == r8) goto L3b
            if (r5 != r7) goto L33
            yhm.o.b(r2)
            goto La5
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            yhm.o.b(r2)
            goto L96
        L3f:
            yhm.o.b(r2)
            r2 = r24
            com.revolut.data.model.Data r2 = r2.f261389a
            java.lang.Object r2 = r2.getContent()
            sae.h r2 = (sae.h) r2
            r5 = 0
            if (r2 == 0) goto L53
            qua.p r2 = r2.f261386a
            r9 = r2
            goto L54
        L53:
            r9 = r5
        L54:
            if (r9 != 0) goto L5e
            java.lang.String r1 = "Payment is not available in domain state"
            r6.b.r(r1)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L5e:
            boolean r2 = r1 instanceof com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance
            if (r2 == 0) goto L65
            com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo$Balance r1 = (com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance) r1
            goto L66
        L65:
            r1 = r5
        L66:
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.f89224a
            r20 = r1
            goto L6f
        L6d:
            r20 = r5
        L6f:
            r21 = -1
            r22 = 33488895(0x1feffff, float:9.36722E-38)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            qua.p r1 = qua.p.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = r6
            yua.q r2 = (yua.q) r2
            ufm.i r1 = r2.y(r1, r5, r5, r5)
            r3.f278627w = r8
            java.lang.Object r1 = nim.a.b(r1, r3)
            if (r1 != r4) goto L96
            goto La4
        L96:
            yua.q r6 = (yua.q) r6
            pfm.a r1 = r6.t(r8)
            r3.f278627w = r7
            java.lang.Object r1 = nim.a.a(r1, r3)
            if (r1 != r4) goto La5
        La4:
            return r4
        La5:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uae.e.a(sae.i, com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo, gim.c):java.lang.Object");
    }
}
