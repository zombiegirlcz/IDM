package e28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.wealth.api.widget.WealthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements bsh.a {
    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        return new WealthWidgetContext(widgetContext2.getContextKey());
    }
}
