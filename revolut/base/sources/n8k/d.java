package n8k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final eli.j f213500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wsg.n f213501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f213502n;
    public final vv9.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8k.c f213503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PaymentLinksAmountScreenContract$InputData f213504q;

    public d(eli.j twoFaErrorHandler, wsg.n walletInteractor, k61.a transferInteractor, vv9.c moneyRequestInteractor, x8k.c p2pTransferInteractor, PaymentLinksAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(p2pTransferInteractor, "p2pTransferInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f213500l = twoFaErrorHandler;
        this.f213501m = walletInteractor;
        this.f213502n = transferInteractor;
        this.o = moneyRequestInteractor;
        this.f213503p = p2pTransferInteractor;
        this.f213504q = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof n8k.b
            if (r0 == 0) goto L13
            r0 = r15
            n8k.b r0 = (n8k.b) r0
            int r1 = r0.f213497w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213497w = r1
            goto L18
        L13:
            n8k.b r0 = new n8k.b
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213497w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L7c
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData r15 = r13.f213504q
            boolean r2 = r15 instanceof com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData.NewPaymentLink
            if (r2 == 0) goto L84
            dj0.d r5 = r14.f102239j
            java.lang.String r10 = r14.f
            java.lang.String r11 = r14.f102237g
            com.revolut.domain.models.tracking.MoneyRequestAppSource r12 = com.revolut.domain.models.tracking.MoneyRequestAppSource.DEFAULT
            vv9.c r14 = r13.o
            r4 = r14
            u6k.h r4 = (u6k.h) r4
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            rfm.f0 r14 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12)
            ufm.i r14 = l89.e.b(r14)
            eli.j r15 = r13.f213500l
            eli.a r15 = sjg.a.a(r15)
            efm.d0 r14 = r14.g(r15)
            n8i.q0 r15 = new n8i.q0
            r2 = 1
            r15.<init>(r2)
            n4d.a0 r2 = new n4d.a0
            r4 = 21
            r2.<init>(r15, r4)
            ufm.i r15 = new ufm.i
            r4 = 1
            r15.<init>(r14, r2, r4)
            java.lang.String r14 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            r0.f213497w = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto L7c
            return r1
        L7c:
            java.lang.String r14 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            n8k.k r15 = (n8k.k) r15
            return r15
        L84:
            boolean r15 = r15 instanceof com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData.RequestCustomAmountAndNote
            if (r15 == 0) goto L92
            n8k.i r15 = new n8k.i
            dj0.d r0 = r14.f102239j
            java.lang.String r14 = r14.f
            r15.<init>(r0, r14)
            return r15
        L92:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n8k.d.Z2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        if (r2 != r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8k.d.b3(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData, gim.c):java.lang.Object");
    }
}
