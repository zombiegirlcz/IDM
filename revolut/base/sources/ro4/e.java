package ro4;

import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$Action;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$DueDateOption;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ro4.c;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class e {
    public static final ul4.a a(d dVar) {
        CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!(dVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        c cVar = (c) dVar;
        int day = cVar.getDay();
        List<c.a> dueDateSelections = cVar.getDueDateSelections();
        ArrayList arrayList = new ArrayList(w.t(dueDateSelections, 10));
        for (c.a aVar : dueDateSelections) {
            arrayList.add(new CreditCardSettings$RepaymentPreferenceSettings$DueDateOption(aVar.getDay(), aVar.getCurrentDueDate(), aVar.getNextDueDate()));
        }
        c.b ineligibilityReason = cVar.getIneligibilityReason();
        if (ineligibilityReason != null) {
            String title = ineligibilityReason.getTitle();
            String description = ineligibilityReason.getDescription();
            b button = ineligibilityReason.getButton();
            creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason = new CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason(title, description, new CreditCardSettings$Action(button.getText(), button.getAction()));
        } else {
            creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason = null;
        }
        return new ul4.a(day, arrayList, creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason, cVar.getCooldownPeriodMonths());
    }
}
