package m6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y {
    public static final Pair a(io3.l lVar, tof.a aVar, xi0.b bVar) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        tof.c cVar = aVar.f272572a;
        tof.b bVar2 = aVar.f272574c;
        String str4 = aVar.f272573b;
        switch (x.f203214a[cVar.ordinal()]) {
            case 1:
                if (str4 != null) {
                    return new Pair(str4, lVar == io3.l.REVX_FIAT ? k1j.a.REVOLUT_X_FIAT : cp5.d.y(bVar) ? k1j.a.COMMODITIES : cp5.d.z(bVar) ? k1j.a.CRYPTO : k1j.a.POCKETS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.PRO_VAULTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.PRO);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 4:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.VAULTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 5:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.VAULTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                if (bVar2 != null && (str = bVar2.f272634a) != null) {
                    str4 = str;
                }
                if (str4 != null) {
                    return new Pair(str4, k1j.a.SAVINGS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 7:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.JOINT_ACCOUNT);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 8:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.JOINT_VAULTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                if (bVar2 != null && (str2 = bVar2.f272634a) != null) {
                    str4 = str2;
                }
                if (str4 != null) {
                    return new Pair(str4, k1j.a.JOINT_SAVINGS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 10:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.REV_POINTS_POCKETS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 11:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.CREDIT_CARDS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 12:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.YOUTH_POCKETS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 13:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.YOUTH_VAULTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 14:
                if (bVar2 != null && (str3 = bVar2.f272634a) != null) {
                    str4 = str3;
                }
                if (str4 != null) {
                    return new Pair(str4, k1j.a.YOUTH_SAVINGS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 15:
            case 16:
            case 17:
            case 18:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.TRADING_ACCOUNTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.JOINT_TRADING_ACCOUNTS);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 20:
                if (str4 != null) {
                    return new Pair(str4, k1j.a.REVOLUT_X_FIAT);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 21:
                throw new IllegalStateException("Can't extract account info from unknown type");
            case 22:
                throw new IllegalStateException("Bereavement accounts are not supported in Move Money preselection");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final c4i.a b(AccountWrapper sourceAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        switch (x.f203216c[sourceAccount.f97224a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 22:
                return c4i.a.EXCHANGE;
            case 9:
                return c4i.a.CREDIT_CARD;
            case 13:
                return c4i.a.COMMODITY_ORDER;
            case 19:
            case 20:
                return c4i.a.EXCHANGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final tof.c c(AccountWrapper accountWrapper) throws Throwable {
        Intrinsics.checkNotNullParameter(accountWrapper, "<this>");
        j8l.a aVar = accountWrapper.f97224a;
        AccountSource accountSource = accountWrapper.d;
        switch (x.f203216c[aVar.ordinal()]) {
            case 1:
                return tof.c.PERSONAL;
            case 2:
                return tof.c.JOINT;
            case 3:
                return tof.c.JOINT_VAULT;
            case 4:
                return tof.c.JOINT_SAVINGS;
            case 5:
                return tof.c.PRO;
            case 6:
                return tof.c.PRO_VAULT;
            case 7:
                AccountSource.VaultSource vaultSource = accountSource instanceof AccountSource.VaultSource ? (AccountSource.VaultSource) accountSource : null;
                return (vaultSource == null || !opg.c.d(vaultSource.f97223a)) ? tof.c.VAULT : tof.c.GROUP_VAULT;
            case 8:
                return tof.c.SAVINGS;
            case 9:
                return tof.c.CREDIT;
            case 10:
            case 11:
                AccountSource.InvestCashHolding investCashHolding = accountSource instanceof AccountSource.InvestCashHolding ? (AccountSource.InvestCashHolding) accountSource : null;
                TradingAccount tradingAccount = investCashHolding != null ? investCashHolding.f97198a : null;
                if (tradingAccount instanceof TradingAccount.GIA) {
                    int i = x.f203215b[((TradingAccount.GIA) tradingAccount).e.ordinal()];
                    if (i == 1) {
                        return tof.c.INVEST_GIA;
                    }
                    if (i == 2) {
                        return tof.c.INVEST_GIA_JOINT;
                    }
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.D("Trading account with TradingAccountHolderType.YOUTH is not supported transaction AccountType");
                    return tof.c.INVEST_GIA;
                }
                if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                    return tof.c.INVEST_ISA;
                }
                if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                    return tof.c.INVEST_CUSTODIAN_JISA;
                }
                if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                    return tof.c.INVEST_PERSONAL_JISA;
                }
                hx7.e.n(new IllegalStateException("Trading account " + (tradingAccount != null ? tradingAccount.W() : null) + " is not supported transaction AccountType"));
                return tof.c.INVEST_GIA;
            case 12:
            case 13:
                return tof.c.PERSONAL;
            case 14:
                return tof.c.REVX_FIAT;
            case 15:
                return tof.c.LOYALTY_VAULT;
            case 16:
                return tof.c.JUNIOR_PERSONAL;
            case 17:
                return tof.c.JUNIOR_VAULT;
            case 18:
                return tof.c.JUNIOR_SAVINGS;
            case 19:
            case 20:
                return tof.c.PERSONAL;
            case 21:
                return tof.c.PERSONAL;
            case 22:
                return tof.c.VAULT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
