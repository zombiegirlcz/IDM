package rc7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.widgets_catalogue_cards_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return v.k("CardsSmall", "CardsMedium");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.widgets_catalogue_cards_medium_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Object next;
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        Iterator it8 = availableWidgetTypes.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f((String) next, "CardsSmall")) {
                break;
            }
        }
        String str = (String) next;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
