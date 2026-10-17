package a6i;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import j8l.d;
import j8l.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x5i.l;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final String a(WalletAutomation.Limit limit) {
        return "Limit(max=" + d(limit.f86449a) + ", period=" + limit.f86450b + ")";
    }

    public static final String b(AccountWrapper accountWrapper) {
        String str;
        Intrinsics.checkNotNullParameter(accountWrapper, "<this>");
        j8l.a aVar = accountWrapper.f97224a;
        String id10 = accountWrapper.getId();
        String pocketId = accountWrapper.getPocketId();
        AccountSource accountSource = accountWrapper.d;
        if (accountSource instanceof AccountSource.PocketSource) {
            str = "PocketSource";
        } else if (accountSource instanceof AccountSource.VaultSource) {
            str = "VaultSource";
        } else if (accountSource instanceof AccountSource.SavingsSource) {
            str = "SavingsSource";
        } else if (accountSource instanceof AccountSource.CreditCardSource) {
            str = "CreditCardSource";
        } else if (accountSource instanceof AccountSource.RevPointsPocketSource) {
            str = "RevPointsPocketSource";
        } else if (accountSource instanceof AccountSource.JuniorPocketSource) {
            str = "JuniorPocketSource";
        } else if (accountSource instanceof AccountSource.JuniorVaultSource) {
            str = "JuniorVaultSource";
        } else if (accountSource instanceof AccountSource.JuniorSavingsSource) {
            str = "JuniorSavingsSource";
        } else if (accountSource instanceof AccountSource.TeenPocketSource) {
            str = "TeenPocketSource";
        } else if (accountSource instanceof AccountSource.TeenVaultSource) {
            str = "TeenVaultSource";
        } else if (accountSource instanceof AccountSource.JointVaultSource) {
            str = "JointVaultSource";
        } else if (accountSource instanceof AccountSource.JointSavingsSource) {
            str = "JointSavingsSource";
        } else if (accountSource instanceof AccountSource.InvestCashHolding) {
            str = "InvestCashHolding";
        } else if (accountSource instanceof AccountSource.NonExistingCurrencyAccount) {
            str = "NonExistingCurrencyAccount";
        } else if (accountSource instanceof AccountSource.SpotMarginCollateralSource) {
            str = "SpotMarginCollateralSource";
        } else {
            if (!(accountSource instanceof AccountSource.FuturesCollateralSource)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "FuturesCollateralSource";
        }
        StringBuilder sb6 = new StringBuilder("AccountWrapper(type=");
        sb6.append(aVar);
        sb6.append(", id=");
        sb6.append(id10);
        sb6.append(", pocketId=");
        return j6.a.w(sb6, pocketId, ", sourceType=", str, ")");
    }

    public static final String c(OrderMode orderMode) {
        String strW;
        Intrinsics.checkNotNullParameter(orderMode, "<this>");
        if (orderMode instanceof OrderMode.Market) {
            return "Market(notePresent=" + (((OrderMode.Market) orderMode).f97228a != null) + ")";
        }
        if (orderMode instanceof OrderMode.Scheduling) {
            return "Scheduling(notePresent=" + (((OrderMode.Scheduling) orderMode).f97230b != null) + ")";
        }
        if (orderMode instanceof OrderMode.Threshold) {
            OrderMode.Threshold threshold = (OrderMode.Threshold) orderMode;
            l lVar = threshold.f97231a;
            String str = threshold.f97232b.f306286a;
            String str2 = threshold.f97233c.f306286a;
            d dVar = threshold.d;
            String plainString = threshold.e.toPlainString();
            StringBuilder sb6 = new StringBuilder("Threshold(type=");
            sb6.append(lVar);
            sb6.append(", sourceCurrency=");
            sb6.append(str);
            sb6.append(", targetCurrency=");
            sb6.append(str2);
            sb6.append(", buyMode=");
            sb6.append(dVar);
            sb6.append(", rate=");
            return v0.a.i(sb6, plainString, ")");
        }
        if (!(orderMode instanceof OrderMode.Automation)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletAutomation walletAutomation = ((OrderMode.Automation) orderMode).f97227a;
        if (walletAutomation instanceof WalletAutomation.DropsBelow) {
            WalletAutomation.DropsBelow dropsBelow = (WalletAutomation.DropsBelow) walletAutomation;
            String strD = d(dropsBelow.f86443a);
            String strD2 = d(dropsBelow.f86444b);
            String str3 = dropsBelow.f86445c;
            String str4 = dropsBelow.d;
            WalletAutomation.Limit limit = dropsBelow.e;
            String strA = limit != null ? a(limit) : null;
            StringBuilder sbM = v0.a.m("DropsBelow(topupAmount=", strD, ", threshold=", strD2, ", monitoredPocket=");
            j6.a.D(sbM, str3, ", topupFrom=", str4, ", limit=");
            strW = v0.a.i(sbM, strA, ")");
        } else {
            if (!(walletAutomation instanceof WalletAutomation.Exceeds)) {
                throw new NoWhenBranchMatchedException();
            }
            WalletAutomation.Exceeds exceeds = (WalletAutomation.Exceeds) walletAutomation;
            String strD3 = d(exceeds.f86446a);
            String str5 = exceeds.f86447b;
            String str6 = exceeds.f86448c;
            WalletAutomation.Limit limit2 = exceeds.d;
            strW = j6.a.w(v0.a.m("Exceeds(threshold=", strD3, ", monitoredPocket=", str5, ", receiver="), str6, ", limit=", limit2 != null ? a(limit2) : null, ")");
        }
        return p.a.p("Automation(", strW, ")");
    }

    public static final String d(dj0.d dVar) {
        return "Money(amount=" + dVar.f115082a + ", currency=" + dVar.f115083b.f306286a + ")";
    }

    public static final String e(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof AccountWrapper) {
            return b((AccountWrapper) hVar);
        }
        j8l.a aVar = ((AccountWrapper) hVar).f97224a;
        AccountWrapper accountWrapper = (AccountWrapper) hVar;
        String id10 = accountWrapper.getId();
        String pocketId = accountWrapper.getPocketId();
        String name = hVar.getClass().getName();
        StringBuilder sb6 = new StringBuilder("MoveMoneyAccount(type=");
        sb6.append(aVar);
        sb6.append(", id=");
        sb6.append(id10);
        sb6.append(", pocketId=");
        return j6.a.w(sb6, pocketId, ", class=", name, ")");
    }
}
