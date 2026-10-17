package ks5;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {
    @Override // csh.j
    public final List a(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        return v.k("watchlist-symbol", "symbol-standalone", "receive", "cards", "most-traded", "alerts", "watchlist", "news", "orders", "transactions", "allCrypto", "newlyAdded", "top_movers");
    }
}
