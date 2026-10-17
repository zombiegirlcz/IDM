package k28;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.wealth_invest_widget_collections_header_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("CollectionsDynamic");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.wealth_invest_widget_collections_header_subtitle, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        return "CollectionsDynamic";
    }
}
