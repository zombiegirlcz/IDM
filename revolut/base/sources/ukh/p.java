package ukh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        WealthAccount wealthAccount = (WealthAccount) obj2;
        int i2 = 8;
        if (wealthAccount instanceof WealthAccount.Securities) {
            int i3 = o.f280766a[((WealthAccount.Securities) wealthAccount).f95239b.ordinal()];
            if (i3 == 1) {
                i = 1;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 3;
            }
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            i = 2;
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            i = 4;
        } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            i = 5;
        } else if (wealthAccount instanceof WealthAccount.Commodities) {
            i = 6;
        } else if (wealthAccount instanceof WealthAccount.Margin) {
            i = 7;
        } else {
            if (!(wealthAccount instanceof WealthAccount.Robo)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        Integer numValueOf = Integer.valueOf(i);
        WealthAccount wealthAccount2 = (WealthAccount) obj3;
        if (wealthAccount2 instanceof WealthAccount.Securities) {
            int i5 = o.f280766a[((WealthAccount.Securities) wealthAccount2).f95239b.ordinal()];
            if (i5 == 1) {
                i2 = 1;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 3;
            }
        } else if (wealthAccount2 instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            i2 = 2;
        } else if (wealthAccount2 instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            i2 = 4;
        } else if (wealthAccount2 instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            i2 = 5;
        } else if (wealthAccount2 instanceof WealthAccount.Commodities) {
            i2 = 6;
        } else if (wealthAccount2 instanceof WealthAccount.Margin) {
            i2 = 7;
        } else if (!(wealthAccount2 instanceof WealthAccount.Robo)) {
            throw new NoWhenBranchMatchedException();
        }
        return cim.b.b(numValueOf, Integer.valueOf(i2));
    }
}
