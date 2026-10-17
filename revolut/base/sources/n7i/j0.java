package n7i;

import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i.b f213120a;

    public j0(w5i.b eligibilityChecker) {
        Intrinsics.checkNotNullParameter(eligibilityChecker, "eligibilityChecker");
        this.f213120a = eligibilityChecker;
    }

    public final efm.d0 a(AccountSource source, j8l.a type, x5i.d destinationType, AccountWrapper oppositeAccount) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(oppositeAccount, "oppositeAccount");
        boolean z = source instanceof AccountSource.PocketSource;
        w5i.b bVar = this.f213120a;
        if (z) {
            return ((s) bVar).b(((AccountSource.PocketSource) source).f97213a, yoj.b.y(type), destinationType, oppositeAccount);
        }
        if (source instanceof AccountSource.VaultSource) {
            AccountSource.VaultSource vaultSource = (AccountSource.VaultSource) source;
            pcd.s vault = vaultSource.f97223a;
            if (!opg.c.f(vault)) {
                s sVar = (s) bVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(vault, "vault");
                return sVar.f213142g.c(oppositeAccount, vault, destinationType);
            }
            pcd.s vault2 = vaultSource.f97223a;
            s sVar2 = (s) bVar;
            sVar2.getClass();
            Intrinsics.checkNotNullParameter(vault2, "vault");
            return te0.w.o0(p0.f264003c, new mtj.i(7, sVar2, vault2, oppositeAccount, destinationType, (Continuation) null));
        }
        if (source instanceof AccountSource.JointVaultSource) {
            pcd.s vault3 = ((AccountSource.JointVaultSource) source).f97202a;
            s sVar3 = (s) bVar;
            sVar3.getClass();
            Intrinsics.checkNotNullParameter(vault3, "vault");
            return sVar3.f213142g.c(oppositeAccount, vault3, destinationType);
        }
        if (source instanceof AccountSource.SavingsSource) {
            SavingsAccountDetails account = ((AccountSource.SavingsSource) source).f97216a;
            s sVar4 = (s) bVar;
            sVar4.getClass();
            Intrinsics.checkNotNullParameter(account, "account");
            return sVar4.f213143h.s(account, oppositeAccount, destinationType);
        }
        if (source instanceof AccountSource.JointSavingsSource) {
            SavingsAccountDetails account2 = ((AccountSource.JointSavingsSource) source).f97201a;
            s sVar5 = (s) bVar;
            sVar5.getClass();
            Intrinsics.checkNotNullParameter(account2, "account");
            return sVar5.f213143h.s(account2, oppositeAccount, destinationType);
        }
        if (source instanceof AccountSource.CreditCardSource) {
            CreditCard creditCard = ((AccountSource.CreditCardSource) source).f97192a;
            s sVar6 = (s) bVar;
            sVar6.getClass();
            Intrinsics.checkNotNullParameter(creditCard, "creditCard");
            return te0.w.o0(p0.f264003c, new mtj.i(6, sVar6, creditCard, oppositeAccount, destinationType, (Continuation) null));
        }
        if (source instanceof AccountSource.RevPointsPocketSource) {
            return ((s) bVar).c();
        }
        if (source instanceof AccountSource.JuniorPocketSource) {
            AccountSource.JuniorPocketSource juniorPocketSource = (AccountSource.JuniorPocketSource) source;
            JuniorInfo juniorProfile = juniorPocketSource.f97203a;
            io3.d pocket = juniorPocketSource.f97204b;
            s sVar7 = (s) bVar;
            sVar7.getClass();
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            return sVar7.d.d(juniorProfile, pocket, destinationType, oppositeAccount);
        }
        if (source instanceof AccountSource.JuniorVaultSource) {
            AccountSource.JuniorVaultSource juniorVaultSource = (AccountSource.JuniorVaultSource) source;
            JuniorInfo juniorProfile2 = juniorVaultSource.f97208a;
            pcd.s vault4 = juniorVaultSource.f97209b;
            s sVar8 = (s) bVar;
            sVar8.getClass();
            Intrinsics.checkNotNullParameter(juniorProfile2, "juniorProfile");
            Intrinsics.checkNotNullParameter(vault4, "vault");
            return sVar8.d.f(juniorProfile2, vault4, destinationType, oppositeAccount);
        }
        if (source instanceof AccountSource.JuniorSavingsSource) {
            AccountSource.JuniorSavingsSource juniorSavingsSource = (AccountSource.JuniorSavingsSource) source;
            JuniorInfo juniorProfile3 = juniorSavingsSource.f97206a;
            SavingsAccountDetails account3 = juniorSavingsSource.f97207b;
            s sVar9 = (s) bVar;
            sVar9.getClass();
            Intrinsics.checkNotNullParameter(juniorProfile3, "juniorProfile");
            Intrinsics.checkNotNullParameter(account3, "account");
            return sVar9.d.e(juniorProfile3, account3, destinationType, oppositeAccount);
        }
        Continuation continuation = null;
        if (source instanceof AccountSource.TeenPocketSource) {
            io3.d pocket2 = ((AccountSource.TeenPocketSource) source).f97220b;
            s sVar10 = (s) bVar;
            sVar10.getClass();
            Intrinsics.checkNotNullParameter(pocket2, "pocket");
            return te0.w.o0(p0.f264003c, new lhk.a0(sVar10, pocket2, destinationType, continuation, 17));
        }
        if (source instanceof AccountSource.TeenVaultSource) {
            pcd.s vault5 = ((AccountSource.TeenVaultSource) source).f97222b;
            s sVar11 = (s) bVar;
            sVar11.getClass();
            Intrinsics.checkNotNullParameter(vault5, "vault");
            return te0.w.o0(p0.f264003c, new lhk.a0(sVar11, vault5, destinationType, continuation, 18));
        }
        if (source instanceof AccountSource.InvestCashHolding) {
            AccountSource.InvestCashHolding investCashHolding = (AccountSource.InvestCashHolding) source;
            TradingAccount tradingAccount = investCashHolding.f97198a;
            kel.b tradingAccountCashHolding = investCashHolding.f97199b;
            s sVar12 = (s) bVar;
            sVar12.getClass();
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(tradingAccountCashHolding, "tradingAccountCashHolding");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            return te0.w.o0(p0.f264003c, new mp6.j(sVar12, tradingAccount, tradingAccountCashHolding, destinationType, oppositeAccount, (Continuation) null));
        }
        if (source instanceof AccountSource.NonExistingCurrencyAccount) {
            xi0.b currency = ((AccountSource.NonExistingCurrencyAccount) source).f97210a;
            s sVar13 = (s) bVar;
            sVar13.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            ufm.c cVar = new ufm.c(new a9j.k(currency, sVar13, oppositeAccount), 2);
            Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
            return cVar;
        }
        if (source instanceof AccountSource.SpotMarginCollateralSource) {
            s sVar14 = (s) bVar;
            sVar14.getClass();
            Intrinsics.checkNotNullParameter(oppositeAccount, "oppositeAccount");
            r7i.w wVar = sVar14.f213146m;
            j8l.a accountType = oppositeAccount.f97224a;
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            ufm.b bVarM = efm.d0.m(Boolean.valueOf(wVar.f252253a.contains(accountType)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!(source instanceof AccountSource.FuturesCollateralSource)) {
            throw new NoWhenBranchMatchedException();
        }
        s sVar15 = (s) bVar;
        sVar15.getClass();
        Intrinsics.checkNotNullParameter(oppositeAccount, "oppositeAccount");
        r7i.h hVar = sVar15.f213147n;
        j8l.a accountType2 = oppositeAccount.f97224a;
        Intrinsics.checkNotNullParameter(accountType2, "accountType");
        ufm.b bVarM2 = efm.d0.m(Boolean.valueOf(hVar.f252218a.contains(accountType2)));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
