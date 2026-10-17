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

/* JADX INFO: loaded from: classes4.dex */
public final class r implements e {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f170735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f38.b f170736b;

    public r(gte.a featureToggleInteractor, f38.b configProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f170735a = featureToggleInteractor;
        this.f170736b = configProvider;
    }

    @Override // j28.e
    public final int a() {
        return 4;
    }

    @Override // j28.e
    public final Flow b(InvestWidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new go.g(zi0.c.P(new RowDelegate.Model("LIST_ID_AUTOMATIONS_WATCHLIST", new RowDelegate.Model.MainImage.Image40(c.b(R$drawable.uikit_icn_24_star_empty), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_watchlist_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_watchlist_subtitle, null, null, 14), null, null, 0, c.a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), false, null, 3), 2);
    }

    @Override // j28.e
    public final Object c(String str, Continuation continuation) {
        return ((jte.d) this.f170735a).c(FeatureWealthApi$Toggles.InvestFeaturesWidget.f95157c) ? this.f170736b.b(str, (gim.c) continuation) : Boolean.FALSE;
    }
}
