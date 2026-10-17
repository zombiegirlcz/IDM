package azg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import iwg.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static ResourceImage a(c calculationMethod) {
        int i;
        Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
        int i2 = a.f11458a[calculationMethod.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_time;
        } else if (i2 == 2) {
            i = R$drawable.uikit_icn_24_coins;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_percent;
        }
        return new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public static TextLocalisedClause b(c calculationMethod) {
        int i;
        Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
        int i2 = a.f11458a[calculationMethod.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_analytics_widgetised_performance_time_weighted;
        } else if (i2 == 2) {
            i = R$string.wealth_analytics_widgetised_performance_money_weighted;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_analytics_widgetised_performance_simple_return;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
