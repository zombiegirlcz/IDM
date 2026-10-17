package ks5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.wealth.api.ui.delegates.mosttraded.widget.MostTradedFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements bsh.a {
    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        return new MostTradedFeedWidgetContext(widgetContext2.getContextKey());
    }
}
