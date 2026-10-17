package b8k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import opf.z;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinksAmountScreenContract$InputData f13277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8k.f f13278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final opf.b f13279c;
    public final k61.a d;
    public final z e;

    public d(PaymentLinksAmountScreenContract$InputData inputData, g8k.f paymentLinksCurrencyInteractor, opf.b paymentsPocketInteractor, k61.a transferInteractor, z transferFundingSourceInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentLinksCurrencyInteractor, "paymentLinksCurrencyInteractor");
        Intrinsics.checkNotNullParameter(paymentsPocketInteractor, "paymentsPocketInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        this.f13277a = inputData;
        this.f13278b = paymentLinksCurrencyInteractor;
        this.f13279c = paymentsPocketInteractor;
        this.d = transferInteractor;
        this.e = transferFundingSourceInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.model.account.AccountId r11, java.lang.String r12, java.lang.String r13, k1j.a r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8k.d.a(com.revolut.core.model.account.AccountId, java.lang.String, java.lang.String, k1j.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r14) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8k.d.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof b8k.c
            if (r2 == 0) goto L17
            r2 = r1
            b8k.c r2 = (b8k.c) r2
            int r3 = r2.f13276w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f13276w = r3
            goto L1c
        L17:
            b8k.c r2 = new b8k.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f13276w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L5b
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r1 = r17
            xi0.b r7 = r1.f102235b
            gk3.i r9 = gk3.i.TRANSFER_LINK
            r14 = 0
            r15 = 248(0xf8, float:3.48E-43)
            k61.a r6 = r0.d
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            efm.r r1 = k61.a.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = 3
            java.lang.String r6 = "firstOrError(...)"
            r7 = 0
            efm.d0 r1 = prk.o.l(r1, r7, r7, r4, r6)
            r2.f13276w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L5b
            return r3
        L5b:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b8k.d.c(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData, gim.c):java.lang.Object");
    }
}
