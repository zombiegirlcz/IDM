package p46;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.defi.feed.api.widget.DeFiPortfolioWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements bsh.a {
    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        DeFiPortfolioWidgetContext widgetContext2 = (DeFiPortfolioWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        CryptoWidgetContext.INSTANCE.getClass();
        return new CryptoWidgetContext("RetailDeFiSingleFeed", null);
    }
}
