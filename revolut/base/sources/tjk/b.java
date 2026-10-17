package tjk;

import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import ggk.p1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static n6 a(PricingPlanLayoutButton pricingPlanLayoutButton, AnalyticsContext analyticsContext) {
        LargeActionButton.ButtonStyle buttonStyle;
        TextClause textClause = new TextClause(pricingPlanLayoutButton.f102832b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        p1 p1Var = pricingPlanLayoutButton.f102831a;
        int i = a.f271802a[p1Var.ordinal()];
        if (i == 1) {
            buttonStyle = LargeActionButton.ButtonStyle.f58725a;
        } else if (i == 2) {
            buttonStyle = LargeActionButton.ButtonStyle.f58726b;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            buttonStyle = LargeActionButton.ButtonStyle.o;
        }
        LargeActionButton.ButtonStyle buttonStyle2 = buttonStyle;
        if (p1Var != p1.PRIMARY) {
            analyticsContext = null;
        }
        return new n6(textClause, buttonStyle2, null, null, false, analyticsContext, null, 956);
    }
}
