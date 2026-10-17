package upb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.savings_common_product_name, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("EarnedInterestSmall");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.savings_widget_earn_interest_catalogue_subtitle, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("EarnedInterestSmall") ? "EarnedInterestSmall" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
