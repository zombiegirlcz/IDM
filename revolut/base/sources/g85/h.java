package g85;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        String str;
        TextLocalisedClause textLocalisedClause;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f141284a;
        StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType = domainState.f141285b;
        List<StrategyPickerContract$RepaymentStrategyType> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType2 : list2) {
            boolean zF = Intrinsics.f(strategyPickerContract$RepaymentStrategyType2, strategyPickerContract$RepaymentStrategyType);
            boolean z = strategyPickerContract$RepaymentStrategyType2 instanceof StrategyPickerContract$RepaymentStrategyType.AmountReduction;
            if (z) {
                str = "STRATEGY_AMOUNT_REDUCTION";
            } else {
                if (!(strategyPickerContract$RepaymentStrategyType2 instanceof StrategyPickerContract$RepaymentStrategyType.TermReduction)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "STRATEGY_TERM_REDUCTION";
            }
            String str2 = str;
            if (z) {
                textLocalisedClause = new TextLocalisedClause(R$string.loan_management_repayment_v2_strategy_selection_option_lower_monthly_repayment, null, null, 14);
            } else {
                if (!(strategyPickerContract$RepaymentStrategyType2 instanceof StrategyPickerContract$RepaymentStrategyType.TermReduction)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.loan_management_repayment_v2_strategy_selection_option_reduce_loan_term, null, null, 14);
            }
            arrayList.add(new SingleChoiceDelegate.Model(str2, textLocalisedClause, zF, null, strategyPickerContract$RepaymentStrategyType2, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.credit_common_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, strategyPickerContract$RepaymentStrategyType != null, null, null, null, 988), null, null, 55), arrayList, new lw0.a(new TextLocalisedClause(R$string.loan_management_repayment_v2_strategy_selection_title, null, null, 14), null, null, null, false, 30));
    }
}
