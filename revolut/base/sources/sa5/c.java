package sa5;

import aim.e;
import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sx4.f;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("CREDIT_POST_TERMINATION_PLAN_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.post_termination_plan_section_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final e a(CreditPostTerminationPlanDetails details) {
        ?? r2;
        CellDetailsDelegate.Model model;
        int i;
        ?? model2;
        ?? model3;
        Intrinsics.checkNotNullParameter(details, "details");
        e eVarB = u.b();
        eVarB.add(new CellDetailsDelegate.Model("CREDIT_POST_TERMINATION_PLAN_AMOUNT_DUE", new t0((Clause) new TextLocalisedClause(R$string.post_termination_plan_section_amount_due_title, null, null, 14), (Image) null, 0, false, 30), f.b(3, null, null, details.f70654c), null, null, null, null, 0, null, false, false, null, null, 32760));
        dj0.d dVar = details.d;
        if (dVar == null) {
            r2 = 0;
            model = null;
        } else {
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.post_termination_plan_section_discounted_amount_title, null, null, 14), (Image) null, 0, false, 30);
            MoneyClause moneyClauseB = f.b(3, null, null, dVar);
            r2 = 0;
            model = new CellDetailsDelegate.Model("CREDIT_POST_TERMINATION_PLAN_DISCOUNTED_AMOUNT", t0Var, moneyClauseB, null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        n14.e.b(eVarB, model);
        dj0.d dVar2 = details.e;
        if (dVar2 == null) {
            model2 = r2;
            i = 14;
        } else {
            t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.post_termination_plan_section_left_to_repay_title, r2, r2, 14), (Image) null, 0, false, 30);
            MoneyClause moneyClauseB2 = f.b(3, r2, r2, dVar2);
            i = 14;
            model2 = new CellDetailsDelegate.Model("CREDIT_POST_TERMINATION_PLAN_LEFT_TO_REPAY", t0Var2, moneyClauseB2, null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        n14.e.b(eVarB, model2);
        Integer num = details.f;
        if (num != null) {
            model3 = new CellDetailsDelegate.Model("CREDIT_POST_TERMINATION_PLAN_REPAYMENT_DAY", new t0((Clause) new TextLocalisedClause(R$string.post_termination_plan_section_repayment_day_title, r2, r2, i), (Image) null, 0, false, 30), new TextClause(String.valueOf(num.intValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        } else {
            model3 = r2;
        }
        n14.e.b(eVarB, model3);
        eVarB.add(new CellDetailsDelegate.Model("CREDIT_POST_TERMINATION_PLAN_REMAINING_REPAYMENTS", new t0((Clause) new TextLocalisedClause(R$string.post_termination_plan_section_remaining_repayments_title, r2, r2, i), (Image) null, 0, false, 30), new TextClause(String.valueOf(details.f70655g), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        return u.a(eVarB);
    }
}
