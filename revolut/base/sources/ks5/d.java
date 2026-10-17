package ks5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements bsh.a {
    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        return new FavouritesWidgetContext(widgetContext2.getContextKey());
    }
}
