package tmk;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {
    public static n6 a(PricingPlanLayoutButton button) {
        LargeActionButton.ButtonStyle buttonStyle;
        Intrinsics.checkNotNullParameter(button, "button");
        m6 m6Var = n6.Companion;
        TextClause textClause = new TextClause(button.f102832b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = j.f272238a[button.f102831a.ordinal()];
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
        return m6.c(m6Var, textClause, buttonStyle, null, null, false, null, null, button.f102833c, 508);
    }
}
