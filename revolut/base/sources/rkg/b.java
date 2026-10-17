package rkg;

import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final NonProductAccountFilter.Invest a(WealthAccount wealthAccount) {
        Intrinsics.checkNotNullParameter(wealthAccount, "wealthAccount");
        if (!wealthAccount.Q2()) {
            return null;
        }
        if (wealthAccount instanceof WealthAccount.Commodities) {
            return NonProductAccountFilter.Invest.Commodities.f89717a;
        }
        if (wealthAccount instanceof WealthAccount.Margin) {
            return NonProductAccountFilter.Invest.Cfd.f89716a;
        }
        if (wealthAccount instanceof WealthAccount.Robo) {
            return NonProductAccountFilter.Invest.Robo.f89723a;
        }
        if (wealthAccount instanceof WealthAccount.Securities) {
            int i = a.f254857a[((WealthAccount.Securities) wealthAccount).f95239b.ordinal()];
            if (i == 1) {
                return NonProductAccountFilter.Invest.Securities.f89724a;
            }
            if (i == 2) {
                return NonProductAccountFilter.Invest.JointSecurities.f89720a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            return NonProductAccountFilter.Invest.Isa.f89719a;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            return NonProductAccountFilter.Invest.Pea.f89721a;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal) {
            return NonProductAccountFilter.Invest.PersonalJisa.f89722a;
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) {
            return new NonProductAccountFilter.Invest.CustodianJisa(((WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) wealthAccount).f.f105176b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
