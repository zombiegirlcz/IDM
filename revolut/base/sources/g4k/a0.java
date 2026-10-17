package g4k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends s {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final be5.a f140532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xdk.g f140533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final osf.g f140534n;
    public final ga2.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f2k.n f140535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xg6.l f140536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f140537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f80.a f140538s;

    public a0(be5.a cryptoConvertDialogDisclaimerExtension, xdk.g pocketExtension, osf.g transferReasonLauncherExtension, ga2.d aliasBeneficiaryCheckExtension, f2k.n legacyEgiroErrorDialogProvider, xg6.l linkExternalInstitutionsInteractor, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        Intrinsics.checkNotNullParameter(aliasBeneficiaryCheckExtension, "aliasBeneficiaryCheckExtension");
        Intrinsics.checkNotNullParameter(legacyEgiroErrorDialogProvider, "legacyEgiroErrorDialogProvider");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f140532l = cryptoConvertDialogDisclaimerExtension;
        this.f140533m = pocketExtension;
        this.f140534n = transferReasonLauncherExtension;
        this.o = aliasBeneficiaryCheckExtension;
        this.f140535p = legacyEgiroErrorDialogProvider;
        this.f140536q = linkExternalInstitutionsInteractor;
        this.f140537r = externalPocketNavigationFactory;
        this.f140538s = uriHelper;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f140532l, null);
        w2(this.f140533m, null);
        w2(this.f140534n, null);
        w2(this.o, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.o);
        m2(this.f140534n);
        m2(this.f140533m);
        m2(this.f140532l);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // g4k.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(f5j.a r27, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r28, boolean r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.a0.Z2(f5j.a, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // g4k.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(f5j.a r21, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r22, gim.c r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof g4k.v
            if (r4 == 0) goto L1b
            r4 = r3
            g4k.v r4 = (g4k.v) r4
            int r5 = r4.f140589y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f140589y = r5
            goto L20
        L1b:
            g4k.v r4 = new g4k.v
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.f140587w
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f140589y
            r7 = 1
            if (r6 == 0) goto L40
            if (r6 != r7) goto L38
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r1 = r4.v
            f5j.a r2 = r4.u
            yhm.o.b(r3)
            r19 = r2
            r2 = r1
            r1 = r19
            goto L50
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            yhm.o.b(r3)
            r4.u = r1
            r4.v = r2
            r4.f140589y = r7
            java.io.Serializable r3 = r0.c3(r1, r2, r4)
            if (r3 != r5) goto L50
            return r5
        L50:
            r9 = r3
            rtf.c r9 = (rtf.c) r9
            if (r9 != 0) goto L58
            g4k.b0 r1 = g4k.b0.f140539a
            return r1
        L58:
            g4k.c0 r3 = new g4k.c0
            r16 = 0
            r17 = 1048511(0xfffbf, float:1.469277E-39)
            r5 = r3
            r3 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r18 = r15
            r15 = 0
            r0 = r18
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r2 = com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData.a(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.a0.b3(f5j.a, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c3(f5j.a r12, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof g4k.w
            if (r0 == 0) goto L13
            r0 = r14
            g4k.w r0 = (g4k.w) r0
            int r1 = r0.f140590w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140590w = r1
            goto L18
        L13:
            g4k.w r0 = new g4k.w
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140590w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L4b
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r14)
            bsf.b r4 = new bsf.b
            long r5 = r13.f101924a
            xi0.b r7 = r13.f101925b
            com.revolut.feature.transfer.core.models.FundingSource r8 = r13.d
            rtf.c r9 = r13.f101927g
            r10 = r12
            r4.<init>(r5, r7, r8, r9, r10)
            r0.f140590w = r3
            osf.g r12 = r11.f140534n
            java.lang.Object r14 = r12.Z2(r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            bsf.h r14 = (bsf.h) r14
            bsf.g r12 = bsf.g.f18201a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r14, r12)
            if (r12 == 0) goto L57
            r12 = 0
            return r12
        L57:
            boolean r12 = r14 instanceof bsf.f
            if (r12 == 0) goto L60
            bsf.f r14 = (bsf.f) r14
            rtf.c r12 = r14.f18200a
            return r12
        L60:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.a0.c3(f5j.a, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4k.z
            if (r0 == 0) goto L13
            r0 = r6
            g4k.z r0 = (g4k.z) r0
            int r1 = r0.f140592w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140592w = r1
            goto L18
        L13:
            g4k.z r0 = new g4k.z
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140592w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            xi0.b r5 = r5.f101926c
            ae5.c r5 = ae5.c.CTA_CLICKED
            r0.f140592w = r3
            be5.a r5 = r4.f140532l
            r5.getClass()
            ae5.b r6 = ae5.b.CONTINUE_FLOW
            if (r6 != r1) goto L42
            return r1
        L42:
            ae5.b r6 = (ae5.b) r6
            ae5.b r5 = ae5.b.CONTINUE_FLOW
            if (r6 != r5) goto L49
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.a0.d3(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, gim.c):java.lang.Object");
    }
}
