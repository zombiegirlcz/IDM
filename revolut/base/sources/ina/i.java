package ina;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        WealthAccount wealthAccount = (WealthAccount) obj2;
        int i2 = Integer.MAX_VALUE;
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            i = 2;
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            i = 3;
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            i = 4;
        } else if (wealthAccount instanceof WealthAccount.Commodities) {
            i = 5;
        } else if (wealthAccount instanceof WealthAccount.Margin) {
            i = 6;
        } else if (wealthAccount instanceof WealthAccount.Robo) {
            i = 7;
        } else {
            if (!(wealthAccount instanceof WealthAccount.Securities)) {
                throw new NoWhenBranchMatchedException();
            }
            i = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(i);
        WealthAccount wealthAccount2 = (WealthAccount) obj3;
        if (wealthAccount2 instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            i2 = 2;
        } else if (wealthAccount2 instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            i2 = 3;
        } else if (wealthAccount2 instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            i2 = 4;
        } else if (wealthAccount2 instanceof WealthAccount.Commodities) {
            i2 = 5;
        } else if (wealthAccount2 instanceof WealthAccount.Margin) {
            i2 = 6;
        } else if (wealthAccount2 instanceof WealthAccount.Robo) {
            i2 = 7;
        } else if (!(wealthAccount2 instanceof WealthAccount.Securities)) {
            throw new NoWhenBranchMatchedException();
        }
        return cim.b.b(numValueOf, Integer.valueOf(i2));
    }
}
