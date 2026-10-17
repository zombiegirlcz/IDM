package rc7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.widgets_catalogue_netWorth_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return v.k("TotalWealthSmall", "TotalWealthItems");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.widgets_catalogue_netWorth_large_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("TotalWealthSmall") ? "TotalWealthSmall" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
