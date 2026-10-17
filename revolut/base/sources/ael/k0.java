package ael;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradingAccountType f3636b;

    public /* synthetic */ k0(TradingAccountType tradingAccountType, int i) {
        this.f3635a = i;
        this.f3636b = tradingAccountType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        boolean z3;
        TradingAccountType tradingAccountType;
        Object next;
        Object next2;
        switch (this.f3635a) {
            case 0:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                List<TradingAccount> list = tradingAccounts.f105278a;
                boolean z4 = list instanceof Collection;
                TradingAccountType tradingAccountType2 = this.f3636b;
                boolean z6 = true;
                if (z4 && list.isEmpty()) {
                    z = false;
                } else {
                    for (TradingAccount tradingAccount : list) {
                        if (Intrinsics.f(tradingAccount.W(), tradingAccountType2)) {
                            Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
                            if (com.revolut.shared.feature.wealth.models.trading_accounts.d.b(tradingAccount.getD())) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                }
                List list2 = tradingAccounts.f105279b;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z3 = false;
                } else {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((TradingAccountAvailableToOnboard) it8.next()).d, tradingAccountType2)) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                if (!z && !z3) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                TradingAccounts tradingAccounts2 = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts2, "tradingAccounts");
                Iterator it9 = tradingAccounts2.f105278a.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    tradingAccountType = this.f3636b;
                    if (zHasNext) {
                        next = it9.next();
                        TradingAccount tradingAccount2 = (TradingAccount) next;
                        if (tradingAccount2.getD() == cfl.b.TERMINATED || !Intrinsics.f(tradingAccount2.W(), tradingAccountType)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccount tradingAccount3 = (TradingAccount) next;
                Iterator it10 = tradingAccounts2.f105279b.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next2 = it10.next();
                        if (Intrinsics.f(((TradingAccountAvailableToOnboard) next2).d, tradingAccountType)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) next2;
                String str = tradingAccountAvailableToOnboard != null ? tradingAccountAvailableToOnboard.f105265a : null;
                if (tradingAccount3 != null) {
                    return new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount3);
                }
                if (str != null) {
                    return new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId(str, null);
                }
                throw new IllegalStateException(a10.b.s("No suitable account for ", tradingAccountType.getLabel(), " type found"));
            case 2:
                x8h.m0 stockLendingPortfolioInfo = (x8h.m0) obj2;
                Intrinsics.checkNotNullParameter(stockLendingPortfolioInfo, "stockLendingPortfolioInfo");
                return new n4l.c(stockLendingPortfolioInfo.f303364b == wel.j.ENABLED, TradingProductCode.StockLendingUS.f105336a, this.f3636b, stockLendingPortfolioInfo.f303363a);
            default:
                TradingAccount account = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return Boolean.valueOf(Intrinsics.f(account.W(), this.f3636b));
        }
    }
}
