package xlk;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanBenefitGroupItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static TextLocalisedClause a(PlanBenefitGroupItem.Combined combined) {
        return new TextLocalisedClause(R$string.common_action_tap_to_learn_more, null, new Click(28, (Integer) null, (Object) combined, "ID_COMBINED_PLAN_BENEFIT_ITEM", false), 10);
    }
}
