package com.revolut.shared.feature.wealth.models.trading_accounts;

import cfl.j;
import cfl.o;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final boolean a(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.Margin) || (tradingAccount instanceof TradingAccount.TaxAdvantage)) {
            return true;
        }
        if ((tradingAccount instanceof TradingAccount.Robo) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Unknown)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(cfl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (c.f105339b[bVar.ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean c(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        return tradingAccount.getE() == j.PERSONAL_JOINT;
    }

    public static final boolean d(cfl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (c.f105339b[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
            case 6:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean e(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        return d(tradingAccount.getD());
    }

    public static final boolean f(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        cfl.b d = tradingAccount.getD();
        Intrinsics.checkNotNullParameter(d, "<this>");
        switch (c.f105339b[d.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                return false;
            case 4:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean g(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        cfl.b d = tradingAccount.getD();
        Intrinsics.checkNotNullParameter(d, "<this>");
        switch (c.f105339b[d.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            case 2:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean h(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        cfl.b d = tradingAccount.getD();
        Intrinsics.checkNotNullParameter(d, "<this>");
        switch (c.f105339b[d.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                return false;
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean i(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        return (tradingAccount.getF105254j() == cfl.c.TOPUP_WITHDRAWAL || tradingAccount.getF105254j() == cfl.c.TOPUP_ONLY) && tradingAccount.getD() == cfl.b.ACTIVE;
    }

    public static final boolean j(List list) {
        List<o> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (o oVar : list2) {
            if (oVar == o.TRANSFER_OUT || oVar == o.TRANSFER_IN) {
                return true;
            }
        }
        return false;
    }

    public static final boolean k(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        if (tradingAccount.getF105254j() == cfl.c.TOPUP_WITHDRAWAL || tradingAccount.getF105254j() == cfl.c.WITHDRAWAL_ONLY) {
            return tradingAccount.getD() == cfl.b.ACTIVE || tradingAccount.getD() == cfl.b.OFFBOARDING;
        }
        return false;
    }

    public static final TradingAccount.Portfolio l(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        Object objD0 = d0.d0(d0.P0(tradingAccount.J(), new cfl.e()));
        if (objD0 != null) {
            return (TradingAccount.Portfolio) objD0;
        }
        throw new IllegalArgumentException(("Portfolio is null for " + tradingAccount.W() + " " + tradingAccount.getF105262a()).toString());
    }
}
