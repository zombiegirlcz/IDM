package m1j;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.retail.feature.balance.picker.api.models.TeenInfo;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import pyd.c;
import xi0.b;
import z92.f;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final BalanceWrapper a(BalanceWrapper balanceWrapper, n9l.a exchangeRate) {
        b bVar = exchangeRate.f213662b;
        double d = exchangeRate.f213663c;
        Intrinsics.checkNotNullParameter(balanceWrapper, "<this>");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        if (balanceWrapper instanceof BalanceWrapper.PocketBalanceWrapper) {
            BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) balanceWrapper;
            d dVarJ = f.j(pocketBalanceWrapper.i);
            if (dVarJ.k()) {
                return pocketBalanceWrapper;
            }
            d dVarK = c.K(dVarJ, d, bVar);
            String displayName = pocketBalanceWrapper.f99431h;
            io3.d pocket = pocketBalanceWrapper.i;
            AccountId accountId = pocketBalanceWrapper.f99432j;
            k1j.a type = pocketBalanceWrapper.f99433l;
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(type, "type");
            return new BalanceWrapper.PocketBalanceWrapper(displayName, pocket, accountId, dVarK, type);
        }
        if (balanceWrapper instanceof BalanceWrapper.CreditCardBalanceWrapper) {
            BalanceWrapper.CreditCardBalanceWrapper creditCardBalanceWrapper = (BalanceWrapper.CreditCardBalanceWrapper) balanceWrapper;
            CreditCard creditCard = creditCardBalanceWrapper.i;
            if (creditCard.d.k()) {
                return creditCardBalanceWrapper;
            }
            d dVarK2 = c.K(creditCard.d, d, bVar);
            String displayName2 = creditCardBalanceWrapper.f99412h;
            Intrinsics.checkNotNullParameter(displayName2, "displayName");
            Intrinsics.checkNotNullParameter(creditCard, "creditCard");
            return new BalanceWrapper.CreditCardBalanceWrapper(creditCard, dVarK2, displayName2);
        }
        if (balanceWrapper instanceof BalanceWrapper.JuniorPocketBalanceWrapper) {
            BalanceWrapper.JuniorPocketBalanceWrapper juniorPocketBalanceWrapper = (BalanceWrapper.JuniorPocketBalanceWrapper) balanceWrapper;
            d dVarJ2 = f.j(juniorPocketBalanceWrapper.f99420j);
            if (dVarJ2.k()) {
                return juniorPocketBalanceWrapper;
            }
            d balanceBaseCurrency = c.K(dVarJ2, d, bVar);
            String id10 = juniorPocketBalanceWrapper.f99419h;
            String name = juniorPocketBalanceWrapper.i;
            io3.d pocket2 = juniorPocketBalanceWrapper.f99420j;
            JuniorInfo ownerInfo = juniorPocketBalanceWrapper.k;
            boolean z = juniorPocketBalanceWrapper.f99421l;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(pocket2, "pocket");
            Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency, "balanceBaseCurrency");
            return new BalanceWrapper.JuniorPocketBalanceWrapper(id10, name, pocket2, ownerInfo, z, balanceBaseCurrency);
        }
        if (balanceWrapper instanceof BalanceWrapper.JuniorSavingsBalanceWrapper) {
            b bVar2 = balanceWrapper.f99406c;
            BalanceWrapper.JuniorSavingsBalanceWrapper juniorSavingsBalanceWrapper = (BalanceWrapper.JuniorSavingsBalanceWrapper) balanceWrapper;
            SavingsAccountDetails account = juniorSavingsBalanceWrapper.f99423h;
            if (new d(account.f86460a.f234885h.f234861c, bVar2).k()) {
                return juniorSavingsBalanceWrapper;
            }
            d dVarK3 = c.K(new d(account.f86460a.f234885h.f234861c, bVar2), d, bVar);
            JuniorInfo ownerInfo2 = juniorSavingsBalanceWrapper.i;
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(ownerInfo2, "ownerInfo");
            return new BalanceWrapper.JuniorSavingsBalanceWrapper(account, ownerInfo2, dVarK3);
        }
        if (balanceWrapper instanceof BalanceWrapper.JuniorVaultBalanceWrapper) {
            BalanceWrapper.JuniorVaultBalanceWrapper juniorVaultBalanceWrapper = (BalanceWrapper.JuniorVaultBalanceWrapper) balanceWrapper;
            d dVar = new d(juniorVaultBalanceWrapper.f99426j.f234885h.f234861c, balanceWrapper.f99406c);
            if (dVar.k()) {
                return juniorVaultBalanceWrapper;
            }
            d balanceBaseCurrency2 = c.K(dVar, d, bVar);
            String id11 = juniorVaultBalanceWrapper.f99425h;
            String name2 = juniorVaultBalanceWrapper.i;
            s vault = juniorVaultBalanceWrapper.f99426j;
            JuniorInfo ownerInfo3 = juniorVaultBalanceWrapper.k;
            Intrinsics.checkNotNullParameter(id11, "id");
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(ownerInfo3, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency2, "balanceBaseCurrency");
            return new BalanceWrapper.JuniorVaultBalanceWrapper(id11, name2, vault, ownerInfo3, balanceBaseCurrency2);
        }
        if (balanceWrapper instanceof BalanceWrapper.TeenPocketBalanceWrapper) {
            BalanceWrapper.TeenPocketBalanceWrapper teenPocketBalanceWrapper = (BalanceWrapper.TeenPocketBalanceWrapper) balanceWrapper;
            d dVarJ3 = f.j(teenPocketBalanceWrapper.f99443j);
            if (dVarJ3.k()) {
                return teenPocketBalanceWrapper;
            }
            d balanceBaseCurrency3 = c.K(dVarJ3, d, bVar);
            String id12 = teenPocketBalanceWrapper.f99442h;
            String name3 = teenPocketBalanceWrapper.i;
            io3.d pocket3 = teenPocketBalanceWrapper.f99443j;
            TeenInfo ownerInfo4 = teenPocketBalanceWrapper.k;
            Intrinsics.checkNotNullParameter(id12, "id");
            Intrinsics.checkNotNullParameter(name3, "name");
            Intrinsics.checkNotNullParameter(pocket3, "pocket");
            Intrinsics.checkNotNullParameter(ownerInfo4, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency3, "balanceBaseCurrency");
            return new BalanceWrapper.TeenPocketBalanceWrapper(id12, name3, pocket3, ownerInfo4, balanceBaseCurrency3);
        }
        if (balanceWrapper instanceof BalanceWrapper.TeenVaultBalanceWrapper) {
            BalanceWrapper.TeenVaultBalanceWrapper teenVaultBalanceWrapper = (BalanceWrapper.TeenVaultBalanceWrapper) balanceWrapper;
            s vault2 = teenVaultBalanceWrapper.f99445h;
            d dVar2 = new d(vault2.f234885h.f234861c, balanceWrapper.f99406c);
            if (dVar2.k()) {
                return teenVaultBalanceWrapper;
            }
            d balanceBaseCurrency4 = c.K(dVar2, d, bVar);
            TeenInfo ownerInfo5 = teenVaultBalanceWrapper.i;
            Intrinsics.checkNotNullParameter(vault2, "vault");
            Intrinsics.checkNotNullParameter(ownerInfo5, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency4, "balanceBaseCurrency");
            return new BalanceWrapper.TeenVaultBalanceWrapper(vault2, ownerInfo5, balanceBaseCurrency4);
        }
        if ((balanceWrapper instanceof BalanceWrapper.RevPointsPocketBalanceWrapper) || (balanceWrapper instanceof BalanceWrapper.RevPointsAccountBalanceWrapper)) {
            return balanceWrapper;
        }
        if (balanceWrapper instanceof BalanceWrapper.SavingsBalanceWrapper) {
            b bVar3 = balanceWrapper.f99406c;
            BalanceWrapper.SavingsBalanceWrapper savingsBalanceWrapper = (BalanceWrapper.SavingsBalanceWrapper) balanceWrapper;
            SavingsAccountDetails account2 = savingsBalanceWrapper.f99439h;
            if (new d(account2.f86460a.f234885h.f234861c, bVar3).k()) {
                return savingsBalanceWrapper;
            }
            d dVarK4 = c.K(new d(account2.f86460a.f234885h.f234861c, bVar3), d, bVar);
            BalanceWrapper.SavingsBalanceWrapper.Disclaimers disclaimers = savingsBalanceWrapper.i;
            AccountId accountId2 = savingsBalanceWrapper.f99440j;
            Intrinsics.checkNotNullParameter(account2, "account");
            Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
            Intrinsics.checkNotNullParameter(accountId2, "accountId");
            return new BalanceWrapper.SavingsBalanceWrapper(account2, disclaimers, accountId2, dVarK4);
        }
        if (balanceWrapper instanceof BalanceWrapper.TradingAccountBalanceWrapper) {
            BalanceWrapper.TradingAccountBalanceWrapper tradingAccountBalanceWrapper = (BalanceWrapper.TradingAccountBalanceWrapper) balanceWrapper;
            d dVar3 = tradingAccountBalanceWrapper.f99448j;
            if (dVar3.k()) {
                return tradingAccountBalanceWrapper;
            }
            d dVarK5 = c.K(dVar3, d, bVar);
            TradingAccount tradingAccount = tradingAccountBalanceWrapper.f99447h;
            CashHoldingAvailability cashHoldingAvailability = tradingAccountBalanceWrapper.i;
            d availableToMove = tradingAccountBalanceWrapper.f99448j;
            String displayName3 = tradingAccountBalanceWrapper.k;
            AccountId accountId3 = tradingAccountBalanceWrapper.f99449l;
            k1j.a type2 = tradingAccountBalanceWrapper.f99450m;
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(cashHoldingAvailability, "cashHoldingAvailability");
            Intrinsics.checkNotNullParameter(availableToMove, "availableToMove");
            Intrinsics.checkNotNullParameter(displayName3, "displayName");
            Intrinsics.checkNotNullParameter(accountId3, "accountId");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new BalanceWrapper.TradingAccountBalanceWrapper(tradingAccount, cashHoldingAvailability, availableToMove, displayName3, accountId3, type2, dVarK5);
        }
        if (balanceWrapper instanceof BalanceWrapper.VaultBalanceWrapper) {
            b bVar4 = balanceWrapper.f99406c;
            BalanceWrapper.VaultBalanceWrapper vaultBalanceWrapper = (BalanceWrapper.VaultBalanceWrapper) balanceWrapper;
            s vault3 = vaultBalanceWrapper.f99452h;
            if (new d(vault3.f234885h.f234861c, bVar4).k()) {
                return vaultBalanceWrapper;
            }
            d dVarK6 = c.K(new d(vault3.f234885h.f234861c, bVar4), d, bVar);
            AccountId accountId4 = vaultBalanceWrapper.i;
            Intrinsics.checkNotNullParameter(vault3, "vault");
            Intrinsics.checkNotNullParameter(accountId4, "accountId");
            return new BalanceWrapper.VaultBalanceWrapper(vault3, accountId4, dVarK6);
        }
        if (balanceWrapper instanceof BalanceWrapper.ProVaultBalanceWrapper) {
            b bVar5 = balanceWrapper.f99406c;
            BalanceWrapper.ProVaultBalanceWrapper proVaultBalanceWrapper = (BalanceWrapper.ProVaultBalanceWrapper) balanceWrapper;
            s vault4 = proVaultBalanceWrapper.f99434h;
            if (new d(vault4.f234885h.f234861c, bVar5).k()) {
                return proVaultBalanceWrapper;
            }
            d dVarK7 = c.K(new d(vault4.f234885h.f234861c, bVar5), d, bVar);
            Intrinsics.checkNotNullParameter(vault4, "vault");
            return new BalanceWrapper.ProVaultBalanceWrapper(vault4, dVarK7);
        }
        if ((balanceWrapper instanceof BalanceWrapper.NonExistingCurrencyBalanceWrapper) || (balanceWrapper instanceof BalanceWrapper.DeFiBalanceWrapper)) {
            return balanceWrapper;
        }
        if (!(balanceWrapper instanceof BalanceWrapper.CollateralBalanceWrapper)) {
            throw new NoWhenBranchMatchedException();
        }
        BalanceWrapper.CollateralBalanceWrapper collateralBalanceWrapper = (BalanceWrapper.CollateralBalanceWrapper) balanceWrapper;
        d dVar4 = collateralBalanceWrapper.k;
        if (dVar4.k()) {
            return collateralBalanceWrapper;
        }
        d dVarK8 = c.K(dVar4, d, bVar);
        String id13 = collateralBalanceWrapper.f99408h;
        b currency = collateralBalanceWrapper.i;
        String displayName4 = collateralBalanceWrapper.f99409j;
        d availableMoney = collateralBalanceWrapper.k;
        k1j.a type3 = collateralBalanceWrapper.f99410l;
        Intrinsics.checkNotNullParameter(id13, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(displayName4, "displayName");
        Intrinsics.checkNotNullParameter(availableMoney, "availableMoney");
        Intrinsics.checkNotNullParameter(type3, "type");
        return new BalanceWrapper.CollateralBalanceWrapper(id13, currency, displayName4, availableMoney, type3, dVarK8);
    }
}
