package i28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ash.d f157898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f157899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1e.a f157900c;
    public final f38.b d;

    public n(ash.d eventDispatcher, a0 widgetsUiInteractor, d1e.a stockLendingNaviCommandProvider, f38.b configProvider) {
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(stockLendingNaviCommandProvider, "stockLendingNaviCommandProvider");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f157898a = eventDispatcher;
        this.f157899b = widgetsUiInteractor;
        this.f157900c = stockLendingNaviCommandProvider;
        this.d = configProvider;
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i3;
        pfm.m mVar = pfm.m.f235744a;
        if (!z) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            pfm.h hVar = new pfm.h(new a09.a0(this, 17, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        i3 i3Var = (i3) event;
        String str = i3Var.f55382c.f53228a;
        switch (str.hashCode()) {
            case -833446969:
                if (str.equals("LIST_ID_AUTOMATIONS_WATCHLIST")) {
                    return pd.b.n(p0.f264003c, new m(this, null));
                }
                break;
            case -783613660:
                if (str.equals("LIST_ID_AUTOMATIONS_STOCK_LENDING")) {
                    return pd.b.n(p0.f264003c, new l(i3Var, this, null));
                }
                break;
            case -724673997:
                if (str.equals("LIST_ID_AUTOMATIONS_PRICE_ALERTS")) {
                    return pd.b.n(p0.f264003c, new i(this, null));
                }
                break;
            case -644672802:
                if (str.equals("LIST_ID_AUTOMATIONS_RECURRING_BUY")) {
                    return pd.b.n(p0.f264003c, new k(this, null));
                }
                break;
            case 1474353911:
                if (str.equals("LIST_ID_AUTOMATIONS_RECOMMENDED_BUYS")) {
                    return pd.b.n(p0.f264003c, new j(this, null));
                }
                break;
            case 1491208580:
                if (str.equals("LIST_ID_AUTOMATIONS_ADVANCED_FILTERS")) {
                    return pd.b.n(p0.f264003c, new h(this, null));
                }
                break;
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
