package tpd;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.l0;
import pcd.s;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final xi0.b a(IncomeSorterDestinationInfo incomeSorterDestinationInfo) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationInfo, "<this>");
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Investment) {
            IncomeSorterDestinationInfo.Investment investment = (IncomeSorterDestinationInfo.Investment) incomeSorterDestinationInfo;
            if (investment instanceof IncomeSorterDestinationInfo.Investment.CashHolding) {
                return ((IncomeSorterDestinationInfo.Investment.CashHolding) investment).f87465a;
            }
            if (investment instanceof IncomeSorterDestinationInfo.Investment.Instrument) {
                return ((IncomeSorterDestinationInfo.Investment.Instrument) investment).d;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.JointPocket) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((IncomeSorterDestinationInfo.JointPocket) incomeSorterDestinationInfo).f87479a.f163147c;
            aVar.getClass();
            return xi0.a.a(str);
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) {
            xi0.a aVar2 = xi0.b.Companion;
            String str2 = ((IncomeSorterDestinationInfo.PersonalCurrencyPocket) incomeSorterDestinationInfo).f87484a.f163147c;
            aVar2.getClass();
            return xi0.a.a(str2);
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.RoboPortfolio) {
            return ((IncomeSorterDestinationInfo.RoboPortfolio) incomeSorterDestinationInfo).f87488c.f115083b;
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Savings) {
            return kii.e.u(((IncomeSorterDestinationInfo.Savings) incomeSorterDestinationInfo).f87489a.f86460a, xi0.b.Companion);
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.SubaccountPocket) {
            return ((IncomeSorterDestinationInfo.SubaccountPocket) incomeSorterDestinationInfo).f87492a.getCurrency();
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) {
            return ((IncomeSorterDestinationInfo.PeerToPeerTransfer) incomeSorterDestinationInfo).f87483c;
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer) {
            return ((IncomeSorterDestinationInfo.BankTransfer) incomeSorterDestinationInfo).f87458c;
        }
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Crypto) {
            return ((IncomeSorterDestinationInfo.Crypto) incomeSorterDestinationInfo).getF87462a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(IncomeSorterDestinationInfo.Savings savings) {
        Intrinsics.checkNotNullParameter(savings, "<this>");
        return savings.f87489a.f86460a.f234889n == pcd.b.PERSONAL_JOINT;
    }

    public static final boolean c(IncomeSorterDestinationInfo incomeSorterDestinationInfo) {
        SavingsAccountDetails savingsAccountDetails;
        s sVar;
        Intrinsics.checkNotNullParameter(incomeSorterDestinationInfo, "<this>");
        l0 l0Var = null;
        IncomeSorterDestinationInfo.Savings savings = incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Savings ? (IncomeSorterDestinationInfo.Savings) incomeSorterDestinationInfo : null;
        if (savings != null && (savingsAccountDetails = savings.f87489a) != null && (sVar = savingsAccountDetails.f86460a) != null) {
            l0Var = sVar.e;
        }
        return l0Var == l0.MONEY_MARKET_FUND_SAVINGS;
    }

    public static final boolean d(IncomeSorterDestinationInfo incomeSorterDestinationInfo, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationInfo, "<this>");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) && Intrinsics.f(a(incomeSorterDestinationInfo), targetCurrency);
    }

    public static final boolean e(RemainingBalanceDestination remainingBalanceDestination, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(remainingBalanceDestination, "<this>");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        if (remainingBalanceDestination instanceof RemainingBalanceDestination.DestinationInfo) {
            return d(((RemainingBalanceDestination.DestinationInfo) remainingBalanceDestination).f87835a, targetCurrency);
        }
        if (remainingBalanceDestination instanceof RemainingBalanceDestination.PlaceholderCurrencyDestination) {
            return Intrinsics.f(((RemainingBalanceDestination.PlaceholderCurrencyDestination) remainingBalanceDestination).f87837a, targetCurrency);
        }
        throw new NoWhenBranchMatchedException();
    }
}
