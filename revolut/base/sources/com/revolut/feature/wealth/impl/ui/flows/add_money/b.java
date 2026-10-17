package com.revolut.feature.wealth.impl.ui.flows.add_money;

import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d8l.d;
import gvc.m;
import h1c.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ybl.k;
import yki.i;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements hah.b {
    public final AddMoneyFeatureConfig.CompositeAddMoney.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wzg.a f95537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f95538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f95539r;

    public b(AddMoneyFeatureConfig.CompositeAddMoney.InputData inputData, wzg.a cashHoldingsInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.o = inputData;
        this.f95537p = cashHoldingsInteractor;
        this.f95538q = tradingAccountsInteractor;
        this.f95539r = d.a(this, new c(this, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.wealth.impl.ui.flows.add_money.b r13, com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithAccountIdAndHoldingId r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.flows.add_money.b.I2(com.revolut.feature.wealth.impl.ui.flows.add_money.b, com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithAccountIdAndHoldingId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.wealth.impl.ui.flows.add_money.b r9, com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithPocketId r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof hah.e
            if (r0 == 0) goto L13
            r0 = r11
            hah.e r0 = (hah.e) r0
            int r1 = r0.f150519y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150519y = r1
            goto L18
        L13:
            hah.e r0 = new hah.e
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f150517w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f150519y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r9 = r0.v
            com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithPocketId r10 = r0.u
            yhm.o.b(r11)
            goto L5a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r11)
            java.lang.String r11 = r10.d
            wzg.a r9 = r9.f95537p
            cfl.g r2 = cfl.g.f23742a
            c9h.k r9 = (c9h.k) r9
            w4l.h r4 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r9 = r9.i(r11, r2, r4)
            r2 = 3
            r4 = 0
            jhi.b r9 = mo3.a.g(r9, r4, r4, r2)
            r0.u = r10
            r0.v = r11
            r0.f150519y = r3
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            r8 = r11
            r11 = r9
            r9 = r8
        L5a:
            od0.i r11 = (od0.i) r11
            if (r11 == 0) goto Lbb
            java.lang.Object r11 = r11.f224257a
            kotlin.Pair r11 = (kotlin.Pair) r11
            if (r11 == 0) goto Lbb
            java.lang.Object r9 = r11.f186385a
            kel.b r9 = (kel.b) r9
            java.lang.Object r11 = r11.f186386b
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r11 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r11
            boolean r0 = com.revolut.shared.feature.wealth.models.trading_accounts.d.i(r11)
            if (r0 == 0) goto La3
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r0 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(r11)
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r7 = K2(r11)
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId$CashHolding r6 = new com.revolut.feature.wealth.models.addmoney.TransferSubjectId$CashHolding
            java.util.UUID r11 = r0.f105210a
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            kel.a r0 = r9.f183148a
            java.lang.String r1 = r0.f183145a
            java.lang.String r0 = r0.e
            java.lang.String r9 = r9.f183150c
            r6.<init>(r11, r1, r0, r9)
            com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step$AddMoney r9 = new com.revolut.feature.wealth.impl.ui.flows.add_money.InvestAddMoneyFlowContract$Step$AddMoney
            com.revolut.kompot.bridge.navigation.KompotDestination r2 = r10.f95177a
            j0h.a r3 = r10.f95178b
            long r4 = r10.f95179c
            com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithTransferSubjectIdAndWealthAccountType r1 = new com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithTransferSubjectIdAndWealthAccountType
            r1.<init>(r2, r3, r4, r6, r7)
            r9.<init>(r1)
            return r9
        La3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Top up is not available for trading account="
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lbb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Trading account cannot be found by pocketId="
            java.lang.String r9 = h30.l.r(r11, r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.impl.ui.flows.add_money.b.J2(com.revolut.feature.wealth.impl.ui.flows.add_money.b, com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig$CompositeAddMoney$InputData$WithPocketId, gim.c):java.lang.Object");
    }

    public static WealthAccountType K2(TradingAccount tradingAccount) {
        WealthAccountType wealthAccountType;
        if (tradingAccount instanceof TradingAccount.GIA) {
            wealthAccountType = WealthAccountType.SECURITIES;
        } else if (tradingAccount instanceof TradingAccount.Margin) {
            wealthAccountType = WealthAccountType.MARGIN;
        } else if (tradingAccount instanceof TradingAccount.Robo.Regular) {
            wealthAccountType = WealthAccountType.ROBO;
        } else if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea)) {
            wealthAccountType = WealthAccountType.TAA;
        } else {
            if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            wealthAccountType = null;
        }
        if (wealthAccountType != null) {
            return wealthAccountType;
        }
        throw new IllegalStateException(("Trading account " + tradingAccount + " not supported").toString());
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 11), new h56.a(this, 19));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f95539r;
    }
}
