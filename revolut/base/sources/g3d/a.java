package g3d;

import f3d.i;
import jpc.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static i a(e widgetDataProvider, qfd.a assetSelectorScreenProvider, s1d.a symbolWidgetConfigProvider, v1d.b watchlistWidgetConfigProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(watchlistWidgetConfigProvider, "watchlistWidgetConfigProvider");
        Intrinsics.checkNotNullParameter(assetSelectorScreenProvider, "assetSelectorScreenProvider");
        Intrinsics.checkNotNullParameter(symbolWidgetConfigProvider, "symbolWidgetConfigProvider");
        return new i(widgetDataProvider, assetSelectorScreenProvider, symbolWidgetConfigProvider, watchlistWidgetConfigProvider);
    }
}
