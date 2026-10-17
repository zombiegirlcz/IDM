package k3k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3k.d f180768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f180769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f180770c;
    public final om4.k0 d;

    public i(g3k.d remittanceInteractor, fk3.a configurationInteractor, gte.a featureToggleInteractor, om4.k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(remittanceInteractor, "remittanceInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f180768a = remittanceInteractor;
        this.f180769b = configurationInteractor;
        this.f180770c = featureToggleInteractor;
        this.d = creditCardFeatureInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.transfer.core.models.TransferFlowType r29, com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r30, java.util.Set r31, boolean r32, gim.c r33) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3k.i.a(com.revolut.feature.transfer.core.models.TransferFlowType, com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData, java.util.Set, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r13, java.util.Set r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof k3k.e
            if (r0 == 0) goto L13
            r0 = r15
            k3k.e r0 = (k3k.e) r0
            int r1 = r0.f180758y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180758y = r1
            goto L18
        L13:
            k3k.e r0 = new k3k.e
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f180756w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180758y
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Set r13 = r0.v
            r14 = r13
            java.util.Set r14 = (java.util.Set) r14
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r13 = r0.u
            yhm.o.b(r15)
        L2d:
            r5 = r14
            goto L4e
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            yhm.o.b(r15)
            yw4.f r15 = yw4.f.POCKET_TRANSFER
            r0.u = r13
            r2 = r14
            java.util.Set r2 = (java.util.Set) r2
            r0.v = r2
            r0.f180758y = r3
            om4.k0 r2 = r12.d
            java.lang.Object r15 = r2.e(r15, r0)
            if (r15 != r1) goto L2d
            return r1
        L4e:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r14 = r15.booleanValue()
            com.revolut.feature.transfer.core.models.FundingSource r15 = r13.d
            java.lang.String r1 = r15.getF92240a()
            xi0.b r2 = r13.f102051c
            io3.l r3 = io3.l.MERCHANT
            k1j.a r13 = k1j.a.POCKETS
            k1j.a r15 = k1j.a.CRYPTO
            k1j.a r0 = k1j.a.COMMODITIES
            k1j.a r4 = k1j.a.VAULTS
            if (r14 == 0) goto L6b
            k1j.a r14 = k1j.a.CREDIT_CARDS
            goto L6c
        L6b:
            r14 = 0
        L6c:
            k1j.a[] r13 = new k1j.a[]{r13, r15, r0, r4, r14}
            java.util.Set r6 = zhm.z0.i(r13)
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$StartType$BalancePicker r0 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$StartType$BalancePicker
            r8 = 1
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 1688(0x698, float:2.365E-42)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$InputData r13 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$InputData
            r13.<init>(r0)
            k3k.a r14 = new k3k.a
            r14.<init>(r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k3k.i.b(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData, java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.transfer.core.models.TransferFlowType r9, com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r10, com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r11, boolean r12, gim.c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof k3k.f
            if (r0 == 0) goto L14
            r0 = r13
            k3k.f r0 = (k3k.f) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.A = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            k3k.f r0 = new k3k.f
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f180763y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.A
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r7 = 0
            if (r1 == 0) goto L5d
            if (r1 == r5) goto L50
            if (r1 == r4) goto L4c
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            yhm.o.b(r13)
            return r13
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            boolean r12 = r6.f180762x
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r10 = r6.f180761w
            android.os.Parcelable r9 = r6.v
            com.revolut.feature.transfer.core.models.TransferFlowType r9 = (com.revolut.feature.transfer.core.models.TransferFlowType) r9
            k3k.i r11 = r6.u
            yhm.o.b(r13)
            r1 = r11
        L49:
            r3 = r10
            r5 = r12
            goto Lac
        L4c:
            yhm.o.b(r13)
            return r13
        L50:
            boolean r12 = r6.f180762x
            android.os.Parcelable r9 = r6.v
            r10 = r9
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r10 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData) r10
            k3k.i r9 = r6.u
            yhm.o.b(r13)
            goto L74
        L5d:
            yhm.o.b(r13)
            boolean r13 = r9 instanceof com.revolut.feature.transfer.core.models.TransferFlowType.Pro
            if (r13 == 0) goto L86
            r6.u = r8
            r6.v = r10
            r6.f180762x = r12
            r6.A = r5
            java.lang.Object r13 = r8.d(r6)
            if (r13 != r0) goto L73
            goto Lc0
        L73:
            r9 = r8
        L74:
            java.util.Set r13 = (java.util.Set) r13
            r6.u = r7
            r6.v = r7
            r6.f180762x = r12
            r6.A = r4
            java.lang.Object r9 = r9.b(r10, r13, r6)
            if (r9 != r0) goto L85
            goto Lc0
        L85:
            return r9
        L86:
            boolean r13 = r9 instanceof com.revolut.feature.transfer.core.models.TransferFlowType.Default
            if (r13 != 0) goto L99
            boolean r13 = r9 instanceof com.revolut.feature.transfer.core.models.TransferFlowType.Crypto
            if (r13 != 0) goto L99
            boolean r13 = r9 instanceof com.revolut.feature.transfer.core.models.TransferFlowType.JointAccountFlow
            if (r13 == 0) goto L93
            goto L99
        L93:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L99:
            r6.u = r8
            r6.v = r9
            r6.f180761w = r10
            r6.f180762x = r12
            r6.A = r3
            java.lang.Object r13 = r8.e(r11, r6)
            if (r13 != r0) goto Laa
            goto Lc0
        Laa:
            r1 = r8
            goto L49
        Lac:
            r4 = r13
            java.util.Set r4 = (java.util.Set) r4
            r6.u = r7
            r6.v = r7
            r6.f180761w = r7
            r6.f180762x = r5
            r6.A = r2
            r2 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto Lc1
        Lc0:
            return r0
        Lc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k3k.i.c(com.revolut.feature.transfer.core.models.TransferFlowType, com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData, com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof k3k.g
            if (r0 == 0) goto L13
            r0 = r7
            k3k.g r0 = (k3k.g) r0
            int r1 = r0.f180764w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180764w = r1
            goto L18
        L13:
            k3k.g r0 = new k3k.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180764w
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
            fk3.a r2 = r6.f180769b
            ik3.c r2 = (ik3.c) r2
            efm.r r7 = r2.k(r7)
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            efm.d0 r7 = r7.firstOrError()
            k37.s r2 = new k37.s
            r4 = 11
            r2.<init>(r4)
            jyk.g0 r4 = new jyk.g0
            r5 = 27
            r4.<init>(r2, r5)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f180764w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k3k.i.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k3k.h
            if (r0 == 0) goto L13
            r0 = r9
            k3k.h r0 = (k3k.h) r0
            int r1 = r0.f180767x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180767x = r1
            goto L18
        L13:
            k3k.h r0 = new k3k.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180767x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.util.List r8 = r0.u
            java.util.List r8 = (java.util.List) r8
            yhm.o.b(r9)
            goto La9
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L98
        L3b:
            yhm.o.b(r9)
            wi0.b r8 = r8.f101977a
            g3k.d r9 = r7.f180768a
            java.lang.String r2 = "country"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            i3k.e r9 = r9.f140303a
            java.lang.String r8 = r8.f297794a
            i3k.m r9 = (i3k.m) r9
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.RemittanceService r9 = r9.f158251a
            efm.d0 r8 = r9.getRecipientCurrencies(r8)
            i2i.o r9 = new i2i.o
            r2 = 28
            r9.<init>(r2)
            i31.e r2 = new i31.e
            r5 = 7
            r2.<init>(r5, r9)
            r8.getClass()
            ufm.i r9 = new ufm.i
            r5 = 1
            r9.<init>(r8, r2, r5)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            ufm.n r9 = te0.w.i0(r9)
            k37.s r2 = new k37.s
            r5 = 12
            r2.<init>(r5)
            jyk.g0 r5 = new jyk.g0
            r6 = 28
            r5.<init>(r2, r6)
            ufm.i r2 = new ufm.i
            r6 = 1
            r2.<init>(r9, r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            r0.f180767x = r4
            java.lang.Object r9 = nim.a.b(r2, r0)
            if (r9 != r1) goto L98
            goto La8
        L98:
            r8 = r9
            java.util.List r8 = (java.util.List) r8
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r0.u = r9
            r0.f180767x = r3
            java.lang.Object r9 = r7.d(r0)
            if (r9 != r1) goto La9
        La8:
            return r1
        La9:
            java.util.Set r9 = (java.util.Set) r9
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r8 = zhm.d0.B0(r8, r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r8 = zhm.d0.i1(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k3k.i.e(com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData, gim.c):java.lang.Object");
    }
}
