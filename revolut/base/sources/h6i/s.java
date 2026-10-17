package h6i;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7i.u f149717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoveMoneyInputData f149718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5i.a f149719c;

    public s(r7i.u balancePairEligibilityChecker, MoveMoneyInputData inputData, w5i.a allowedBalancePickerGroupsProvider) {
        Intrinsics.checkNotNullParameter(balancePairEligibilityChecker, "balancePairEligibilityChecker");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        this.f149717a = balancePairEligibilityChecker;
        this.f149718b = inputData;
        this.f149719c = allowedBalancePickerGroupsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r3, com.revolut.feature_move_money.api.model.AccountWrapper r4, com.revolut.feature_move_money.api.model.OrderMode r5, gim.c r6) {
        /*
            r2 = this;
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r0 = r2.f149718b
            com.revolut.shared.feature.move_money.api.navigation.Action r0 = r0.f104833a
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.OpenBalanceAutomation
            if (r1 != 0) goto L9a
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.EditScheduledPayment
            if (r1 != 0) goto L9a
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.Topup
            if (r1 != 0) goto L9a
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.Deposit
            if (r1 != 0) goto L9a
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.EditScheduledAutomation
            if (r1 != 0) goto L9a
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.MoveWithFixedAccount
            if (r1 == 0) goto L1e
            goto L9a
        L1e:
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.Add
            if (r1 != 0) goto L42
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.AddNewScheduledPayment
            if (r1 != 0) goto L42
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.MoveMoney
            if (r1 != 0) goto L42
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.MoveMoneyWithAccountPair
            if (r1 == 0) goto L2f
            goto L42
        L2f:
            boolean r1 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.Action.Withdraw
            if (r1 == 0) goto L3c
            com.revolut.shared.feature.move_money.api.navigation.Action$Withdraw r0 = (com.revolut.shared.feature.move_money.api.navigation.Action.Withdraw) r0
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r0 = r0.f104832a
            boolean r0 = r0 instanceof com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.RevXFiatAccount
            if (r0 != 0) goto L9a
            goto L42
        L3c:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L42:
            boolean r0 = r5 instanceof com.revolut.feature_move_money.api.model.OrderMode.Threshold
            if (r0 != 0) goto L9a
            boolean r0 = r5 instanceof com.revolut.feature_move_money.api.model.OrderMode.Automation
            if (r0 == 0) goto L4b
            goto L9a
        L4b:
            boolean r0 = r5 instanceof com.revolut.feature_move_money.api.model.OrderMode.Scheduling
            if (r0 != 0) goto L5a
            boolean r5 = r5 instanceof com.revolut.feature_move_money.api.model.OrderMode.Market
            if (r5 == 0) goto L54
            goto L5a
        L54:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L5a:
            j8l.a r5 = r3.f97224a
            x5i.d r0 = x5i.d.TARGET
            w5i.a r1 = r2.f149719c
            n7i.a r1 = (n7i.a) r1
            java.util.HashSet r5 = r1.a(r5, r0)
            j8l.a r0 = r4.f97224a
            k1j.a r0 = yoj.b.y(r0)
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L75
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L75:
            com.revolut.feature_move_money.api.model.AccountSource r5 = r4.d
            boolean r0 = r5 instanceof com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding
            if (r0 == 0) goto L7e
            com.revolut.feature_move_money.api.model.AccountSource$InvestCashHolding r5 = (com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding) r5
            goto L7f
        L7e:
            r5 = 0
        L7f:
            if (r5 != 0) goto L82
            goto L93
        L82:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5 = r5.f97198a
            boolean r0 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa
            if (r0 == 0) goto L93
            cfl.c r5 = r5.getF105254j()
            cfl.c r0 = cfl.c.TOPUP_ONLY
            if (r5 != r0) goto L93
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L93:
            r7i.u r5 = r2.f149717a
            java.lang.Object r3 = r5.a(r4, r3, r6)
            return r3
        L9a:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.s.a(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.OrderMode, gim.c):java.lang.Object");
    }
}
