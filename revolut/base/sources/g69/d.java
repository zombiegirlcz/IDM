package g69;

import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import oz1.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MasavPayToMerchantConfirmationScreenContract$InputData f140891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f140892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f140893c;
    public final x02.a d;

    public d(MasavPayToMerchantConfirmationScreenContract$InputData inputData, j pendingActionInteractor, wsg.b walletInteractor, x02.a apmPocketInteractor, e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pendingActionInteractor, "pendingActionInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(apmPocketInteractor, "apmPocketInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f140891a = inputData;
        this.f140892b = pendingActionInteractor;
        this.f140893c = walletInteractor;
        this.d = apmPocketInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r5, com.revolut.feature.transfer.core.models.FundingSource r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof g69.a
            if (r0 == 0) goto L13
            r0 = r7
            g69.a r0 = (g69.a) r0
            int r1 = r0.f140886w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140886w = r1
            goto L18
        L13:
            g69.a r0 = new g69.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140886w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r7 = r5.B3()
            if (r7 == 0) goto L4f
            j02.b r2 = new j02.b
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r6 = oc.c.u(r6)
            r2.<init>(r6)
            r0.f140886w = r3
            oz1.j r6 = r4.f140892b
            java.lang.Object r5 = r6.a(r7, r5, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Can't approve MASAV Pay to Merchant without payment method"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g69.d.a(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction, com.revolut.feature.transfer.core.models.FundingSource, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g69.c
            if (r0 == 0) goto L13
            r0 = r6
            g69.c r0 = (g69.c) r0
            int r1 = r0.f140890w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140890w = r1
            goto L18
        L13:
            g69.c r0 = new g69.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140890w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r6 = r5.B3()
            if (r6 == 0) goto L46
            r0.f140890w = r3
            oz1.j r2 = r4.f140892b
            java.lang.Object r5 = r2.d(r6, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Can't reject MASAV Pay to Merchant without payment method"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g69.d.b(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction, gim.c):java.lang.Object");
    }
}
