package e28;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {
    @Override // csh.j
    public final List a(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        String[] elements = {"recommended-buys", "symbol-standalone", "watchlist", "analytics", "automations", "top_movers", "corporate_events", "news", "most-traded", "transactions", "popular_cfds", "commodities", "collections", "popular_stocks", "popular-starter-cfds", "products", "popular_etfs", "cfds-pnl-drivers", "popular_bonds", "popular_first_buys"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
