package j28;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f170727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f170728b;

    public j(gte.a featureToggleInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f170727a = featureToggleInteractor;
        this.f170728b = tradingConfigInteractor;
    }

    @Override // j28.e
    public final int a() {
        return 5;
    }

    @Override // j28.e
    public final Flow b(InvestWidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new go.g(zi0.c.P(new RowDelegate.Model("LIST_ID_AUTOMATIONS_RECOMMENDED_BUYS", new RowDelegate.Model.MainImage.Image40(c.b(R$drawable.uikit_icn_24_double_thumbs), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_recommended_buys_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_recommended_buys_subtitle, null, null, 14), null, null, 0, c.a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), false, null, 3), 2);
    }

    @Override // j28.e
    public final Object c(String str, Continuation continuation) {
        if (!((jte.d) this.f170727a).c(FeatureWealthApi$Toggles.InvestFeaturesWidget.f95157c)) {
            return Boolean.FALSE;
        }
        return vkm.q.x(rd0.e.e(mo3.a.g(nim.a.v(ybl.l.d(this.f170728b), new j1.e(7)), null, new j0g.b(7), 1), h0.f322473a, new i23.c(3, 4, null)), continuation);
    }
}
