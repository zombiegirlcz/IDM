package zsd;

import amd.g0;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.navigation.models.TradingOnboardingState;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f324891a;

    public f(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f324891a = savingsInterestRateFormatter;
    }

    public final ArrayList a(List savingsAccountsDetails, cfl.b bVar) {
        jjb.c cVarA;
        Clause clauseD;
        CircleBadgeModel inactiveCircleBadge;
        int i;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(savingsAccountsDetails, "savingsAccountsDetails");
        ArrayList<SavingsAccountDetails> arrayList = new ArrayList();
        for (Object obj2 : savingsAccountsDetails) {
            if (((SavingsAccountDetails) obj2).f86460a.f234885h.f234861c >= 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (SavingsAccountDetails savingsAccountDetails : arrayList) {
            s sVar = savingsAccountDetails.f86460a;
            Image image = savingsAccountDetails.f86461b;
            SavingsProductData savingsProductData = savingsAccountDetails.f86462c;
            if (savingsProductData != null) {
                jjb.c.Companion.getClass();
                cVarA = jjb.b.a(savingsProductData, bVar);
            } else {
                cVarA = null;
            }
            TextClause textClause = new TextClause(sVar.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (cVarA != null) {
                ncd.j jVar = sVar.i().e;
                int i2 = e.f324890a[cVarA.ordinal()];
                if (i2 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_selector_status_application_rejected, null, null, 14);
                } else if (i2 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_selector_status_application_under_review, null, null, 14);
                } else if (i2 == 3) {
                    textLocalisedClause = new TextLocalisedClause(R$string.savings_account_switcher_selector_status_interest_paused, null, null, 14);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clauseD = pbd.a.d(this.f324891a, jVar, null, 6);
                }
                clauseD = textLocalisedClause;
            } else {
                clauseD = null;
            }
            MoneyClause moneyClause = new MoneyClause(new dj0.d(sVar.f234885h.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            if (cVarA == null || (i = e.f324890a[cVarA.ordinal()]) == 1) {
                inactiveCircleBadge = null;
            } else if (i == 2) {
                inactiveCircleBadge = new InactiveCircleBadge(dw0.a.Awaiting);
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                inactiveCircleBadge = null;
            } else {
                inactiveCircleBadge = new DangerCircleBadge(dw0.a.Suspicious);
            }
            String str = sVar.f234881a;
            String str2 = savingsProductData != null ? savingsProductData.f86683a.f86617a : null;
            TradingOnboardingState.INSTANCE.getClass();
            int i3 = bVar == null ? -1 : com.revolut.feature.retail.savings.api.navigation.models.a.f83183a[bVar.ordinal()];
            TradingOnboardingState.Rejected rejected = TradingOnboardingState.Rejected.f83181a;
            TradingOnboardingState tradingOnboardingState = TradingOnboardingState.Passed.f83179a;
            switch (i3) {
                case -1:
                    tradingOnboardingState = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 6:
                    tradingOnboardingState = rejected;
                    break;
                case 2:
                    tradingOnboardingState = TradingOnboardingState.Pending.f83180a;
                    break;
                case 3:
                case 4:
                case 5:
                    break;
            }
            arrayList2.add(new amd.f(textClause, clauseD, moneyClause, null, image, inactiveCircleBadge, new g0(str, str2, tradingOnboardingState), 136));
        }
        return arrayList2;
    }
}
