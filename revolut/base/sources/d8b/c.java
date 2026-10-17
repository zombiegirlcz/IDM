package d8b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.cobrand_widget_catalogue_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return v.k("CobrandsSmall", "CobrandsMedium");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.cobrand_widget_catalogue_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("CobrandsSmall") ? "CobrandsSmall" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
