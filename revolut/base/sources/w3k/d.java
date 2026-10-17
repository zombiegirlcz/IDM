package w3k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1k.a f294417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3a.b f294418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f294419c;

    public d(y1k.a bankTransferInteractor, d3a.b paymentsSearchInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f294417a = bankTransferInteractor;
        this.f294418b = paymentsSearchInteractor;
        this.f294419c = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(f5j.a r11, com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof w3k.b
            if (r0 == 0) goto L13
            r0 = r13
            w3k.b r0 = (w3k.b) r0
            int r1 = r0.f294415w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294415w = r1
            goto L18
        L13:
            w3k.b r0 = new w3k.b
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294415w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L4e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            xi0.b r5 = r12.f102050b
            wi0.b r6 = f5j.c.e(r11)
            long r7 = r12.f102049a
            java.lang.String r9 = r11.f132329a
            y1k.a r11 = r10.f294417a
            r4 = r11
            q2k.e r4 = (q2k.e) r4
            efm.d0 r11 = r4.b(r5, r6, r7, r9)
            r0.f294415w = r3
            java.lang.Object r13 = nim.a.b(r11, r0)
            if (r13 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w3k.d.a(f5j.a, com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r7, com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3k.d.b(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData, com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig, gim.c):java.lang.Object");
    }
}
