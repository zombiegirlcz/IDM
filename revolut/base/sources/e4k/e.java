package e4k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f122586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f122587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f122588c;
    public final cw9.d d;
    public final om4.k0 e;
    public final h30.q f;

    public e(oy1.b apmNavigationProvider, fk3.a configurationInteractor, gte.a featureToggleInteractor, n8b.a countryInteractor, cw9.d paymentsProductFeatureChecker, om4.k0 creditCardFeatureInteractor, h30.q brazilianBankTransferAmountInteractor) {
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(brazilianBankTransferAmountInteractor, "brazilianBankTransferAmountInteractor");
        this.f122586a = configurationInteractor;
        this.f122587b = featureToggleInteractor;
        this.f122588c = countryInteractor;
        this.d = paymentsProductFeatureChecker;
        this.e = creditCardFeatureInteractor;
        this.f = brazilianBankTransferAmountInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.transfer.core.models.TransferFlowType r35, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r36, aim.o r37, java.util.Set r38, boolean r39, gim.c r40) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4k.e.a(com.revolut.feature.transfer.core.models.TransferFlowType, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, aim.o, java.util.Set, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.transfer.core.models.TransferFlowType r20, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r21, boolean r22, java.util.Set r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4k.e.b(com.revolut.feature.transfer.core.models.TransferFlowType, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, boolean, java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e4k.d
            if (r0 == 0) goto L13
            r0 = r7
            e4k.d r0 = (e4k.d) r0
            int r1 = r0.f122583w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122583w = r1
            goto L18
        L13:
            e4k.d r0 = new e4k.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122583w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            e7l.g$b r7 = e7l.g.b.f123407a
            fk3.a r2 = r6.f122586a
            ik3.c r2 = (ik3.c) r2
            efm.r r7 = r2.k(r7)
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            efm.d0 r7 = r7.firstOrError()
            e1d.h r2 = new e1d.h
            r4 = 28
            r2.<init>(r4)
            e31.e r4 = new e31.e
            r5 = 10
            r4.<init>(r5, r2)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f122583w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e4k.e.c(gim.c):java.lang.Object");
    }
}
