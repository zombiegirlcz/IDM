package xjh;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private c() {
    }

    public static int a(WealthAction wealthAction) {
        Intrinsics.checkNotNullParameter(wealthAction, "<this>");
        if (wealthAction instanceof WealthAction.Trade) {
            return 0;
        }
        if (wealthAction instanceof WealthAction.AddMoney) {
            return 1;
        }
        if ((wealthAction instanceof WealthAction.Withdraw) || (wealthAction instanceof WealthAction.MoveMoney)) {
            return 2;
        }
        if (wealthAction instanceof WealthAction.Documents) {
            return 3;
        }
        if (wealthAction instanceof WealthAction.Analytics) {
            return 4;
        }
        if (wealthAction instanceof WealthAction.Settings) {
            return 5;
        }
        if (wealthAction instanceof WealthAction.InviteFriends) {
            return 6;
        }
        if (wealthAction instanceof WealthAction.TransferInvestments) {
            return 7;
        }
        if (wealthAction instanceof WealthAction.Theme) {
            return 8;
        }
        if (wealthAction instanceof WealthAction.HoldingsInformation) {
            return 9;
        }
        if (wealthAction instanceof WealthAction.TradingAddOns) {
            return 10;
        }
        if ((wealthAction instanceof WealthAction.StartOnboarding) || (wealthAction instanceof WealthAction.TeenJisaStartOnboarding)) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
