package pqd;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sx4.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public a(end.f investmentsDestinationUiMapper) {
        Intrinsics.checkNotNullParameter(investmentsDestinationUiMapper, "investmentsDestinationUiMapper");
    }

    public final Clause a(IncomeSorterHomeContract$DestinationValue destinationValue, dj0.d total) {
        TextClause textClause;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(destinationValue, "destinationValue");
        Intrinsics.checkNotNullParameter(total, "total");
        PercentageClause percentageClause = new PercentageClause(lqd.a.a(destinationValue.f87826b, total), new PercentageClause.Format.Custom(0, 12, null, null, RoundingMode.HALF_UP), (Custom) null, 4);
        IncomeSorterDestinationInfo incomeSorterDestinationInfo = destinationValue.f87825a;
        Clause clauseC = null;
        if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.SubaccountPocket) {
            IncomeSorterDestinationInfo.SubaccountPocket subaccountPocket = (IncomeSorterDestinationInfo.SubaccountPocket) incomeSorterDestinationInfo;
            dj0.d dVar = subaccountPocket.f87494c;
            dj0.d dVar2 = subaccountPocket.d;
            if (dVar != null) {
                clauseC = new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_linked_bills_description, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            } else if (dVar2 != null) {
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_goal_description, v.k(new MoneyClause(subaccountPocket.f87492a.getBalance(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                clauseC = textLocalisedClause;
            }
        } else if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Savings) {
            IncomeSorterDestinationInfo.Savings savings = (IncomeSorterDestinationInfo.Savings) incomeSorterDestinationInfo;
            dj0.d dVar3 = savings.f87490b;
            if (dVar3 != null) {
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_to_goal_description, v.k(new MoneyClause(savings.f87489a.f86460a.c(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                clauseC = textLocalisedClause;
            }
        } else if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) {
            String str = ((IncomeSorterDestinationInfo.PeerToPeerTransfer) incomeSorterDestinationInfo).f87482b;
            if (str != null) {
                textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                clauseC = textClause;
            }
        } else if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer) {
            String str2 = ((IncomeSorterDestinationInfo.BankTransfer) incomeSorterDestinationInfo).f87457b;
            if (str2 != null) {
                textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                clauseC = textClause;
            }
        } else if (incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Investment.Instrument) {
            IncomeSorterDestinationInfo.Investment.Instrument instrument = (IncomeSorterDestinationInfo.Investment.Instrument) incomeSorterDestinationInfo;
            clauseC = end.f.c(instrument.k, u.c(incomeSorterDestinationInfo), instrument.f87475j);
        } else if (!(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Investment.CashHolding) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.JointPocket) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.RoboPortfolio) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Crypto)) {
            throw new NoWhenBranchMatchedException();
        }
        return clauseC != null ? new CompositeClause(v.k(clauseC, percentageClause), g.d(1), null, null, 12) : percentageClause;
    }
}
