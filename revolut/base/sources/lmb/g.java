package lmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rnb.w f196921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.k f196922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f196923n;

    public g(rnb.w savingsVaultInteractor, ybl.k tradingAccountsInteractor, l dialogConfigProvider) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(dialogConfigProvider, "dialogConfigProvider");
        this.f196921l = savingsVaultInteractor;
        this.f196922m = tradingAccountsInteractor;
        this.f196923n = dialogConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // lmb.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination.Fund r25, gim.c r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof lmb.d
            if (r3 == 0) goto L19
            r3 = r2
            lmb.d r3 = (lmb.d) r3
            int r4 = r3.f196918y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f196918y = r4
            goto L1e
        L19:
            lmb.d r3 = new lmb.d
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f196916w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f196918y
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L41
            if (r5 == r7) goto L3b
            if (r5 != r6) goto L33
            boolean r1 = r3.v
            yhm.o.b(r2)
            goto L6e
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination$Fund r1 = r3.u
            yhm.o.b(r2)
            goto L51
        L41:
            yhm.o.b(r2)
            boolean r2 = r1.f
            r3.u = r1
            r3.f196918y = r7
            java.lang.Object r2 = r0.b3(r2, r3)
            if (r2 != r4) goto L51
            goto L68
        L51:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            lmb.e r5 = new lmb.e
            r5.<init>(r0, r1, r8)
            r3.u = r8
            r3.v = r2
            r3.f196918y = r6
            java.lang.Object r1 = do3.q.u(r0, r5, r3)
            if (r1 != r4) goto L69
        L68:
            return r4
        L69:
            r23 = r2
            r2 = r1
            r1 = r23
        L6e:
            pcd.s r2 = (pcd.s) r2
            if (r1 != 0) goto Lae
            pcd.g0 r1 = r2.f234885h
            java.lang.String r1 = r1.f234859a
            lmb.l r3 = r0.f196923n
            r3.getClass()
            java.lang.String r3 = "moneyBoxName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            nii.g0 r9 = new nii.g0
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.retail.savings.api.R$string.savings_account_creation_succeed_title
            java.util.List r1 = zhm.u.c(r1)
            r4 = 12
            r10.<init>(r3, r1, r8, r4)
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.vaults.R$string.mmf_account_creation_pending_subtitle
            r3 = 14
            r11.<init>(r1, r8, r8, r3)
            r21 = 0
            r22 = 16380(0x3ffc, float:2.2953E-41)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = r9
        Lae:
            lmb.h r1 = new lmb.h
            r1.<init>(r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lmb.g.Z2(com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination$Fund, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lmb.f
            if (r0 == 0) goto L13
            r0 = r7
            lmb.f r0 = (lmb.f) r0
            int r1 = r0.f196920w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196920w = r1
            goto L18
        L13:
            lmb.f r0 = new lmb.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196920w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L78
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            if (r6 == 0) goto L37
            w4l.i r6 = w4l.i.f294643c
            goto L39
        L37:
            w4l.h r6 = w4l.h.f294642c
        L39:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$MoneyMarketFunds r7 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.MoneyMarketFunds.f105272a
            r2 = 4
            ybl.k r4 = r5.f196922m
            akg.n r6 = ybl.k.h(r4, r7, r6, r2)
            zhm.h0 r7 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r7)
            llb.e r7 = new llb.e
            r2 = 7
            r7.<init>(r2)
            cxe.u r6 = nim.a.y(r6, r7)
            llb.e r7 = new llb.e
            r2 = 8
            r7.<init>(r2)
            akg.n r6 = nim.a.v(r6, r7)
            lk7.m r7 = new lk7.m
            r2 = 13
            r7.<init>(r2)
            lk7.m r2 = new lk7.m
            r4 = 14
            r2.<init>(r4)
            jhi.b r6 = mo3.a.e(r6, r7, r2)
            r0.f196920w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L78
            return r1
        L78:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r7
            boolean r6 = com.revolut.shared.feature.wealth.models.trading_accounts.d.e(r7)
            if (r6 == 0) goto L81
            goto L88
        L81:
            boolean r6 = com.revolut.shared.feature.wealth.models.trading_accounts.d.g(r7)
            if (r6 == 0) goto L8d
            r3 = 0
        L88:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L8d:
            com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TradingOnboardingFailException r6 = new com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$TradingOnboardingFailException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lmb.g.b3(boolean, gim.c):java.lang.Object");
    }
}
