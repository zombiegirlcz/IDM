package plb;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f237321a;

    public h(dcd.b interestRateFormatter) {
        Intrinsics.checkNotNullParameter(interestRateFormatter, "interestRateFormatter");
        this.f237321a = interestRateFormatter;
    }

    public final aim.e a(SavingsProduct.InterestRate interestRate, xi0.b currency) {
        TextLocalisedClause textLocalisedClause;
        int i;
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        ArrayList arrayList = interestRate.f86644a;
        aim.e eVarB = u.b();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                int i5 = R$string.savings_product_rate_explanation_dialog_tier_first_title;
                Long l2 = ((SavingsProduct.InterestRate.RateTier) arrayList.get(i2)).f86653b;
                if (l2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                textLocalisedClause = new TextLocalisedClause(i5, u.c(new MoneyClause(new dj0.d(l2.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
            } else if (i3 == v.j(arrayList)) {
                int i6 = R$string.savings_product_rate_explanation_dialog_tier_last_title;
                Long l3 = ((SavingsProduct.InterestRate.RateTier) arrayList.get(i3 - 1)).f86653b;
                if (l3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                textLocalisedClause = new TextLocalisedClause(i6, u.c(new MoneyClause(new dj0.d(l3.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
            } else {
                int i21 = R$string.savings_product_rate_explanation_dialog_tier_middle_title;
                Long l4 = ((SavingsProduct.InterestRate.RateTier) arrayList.get(i3 - 1)).f86653b;
                if (l4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dj0.d dVar = new dj0.d(l4.longValue(), currency);
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var = o9.NON_SENSITIVE;
                MoneyClause moneyClause = new MoneyClause(dVar, defaults, null, o9Var, 4);
                Long l5 = ((SavingsProduct.InterestRate.RateTier) arrayList.get(i3)).f86653b;
                if (l5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                i = i3;
                textLocalisedClause = new TextLocalisedClause(i21, v.k(moneyClause, new MoneyClause(new dj0.d(l5.longValue(), currency), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), null, 12);
                int i22 = i;
                eVarB.add(new CellDetailsDelegate.Model(a0.d.n("SAVINGS-RATE_TIER_LIST_ID_", i22), new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), pbd.a.f(this.f237321a, (SavingsProduct.InterestRate.RateTier) arrayList.get(i22), interestRate), null, null, null, null, 0, null, false, false, null, null, 32760));
                i3 = i22 + 1;
                i2 = 0;
            }
            i = i3;
            int i222 = i;
            eVarB.add(new CellDetailsDelegate.Model(a0.d.n("SAVINGS-RATE_TIER_LIST_ID_", i222), new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), pbd.a.f(this.f237321a, (SavingsProduct.InterestRate.RateTier) arrayList.get(i222), interestRate), null, null, null, null, 0, null, false, false, null, null, 32760));
            i3 = i222 + 1;
            i2 = 0;
        }
        return u.a(eVarB);
    }
}
