package ps5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements csh.d {
    @Override // csh.d
    public final Clause a() {
        return new TextLocalisedClause(R$string.crypto_feed_widget_catalog_cards_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return v.k("CardsSmall", "CardsMedium");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new TextLocalisedClause(R$string.crypto_home_feed_widget_catalog_crypto_card_subtitle, null, null, 14);
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
