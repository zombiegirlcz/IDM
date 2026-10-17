package j28;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements e {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f170724b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f170725a;

    static {
        y1d.a aVar = y1d.b.Companion;
        aVar.getClass();
        FavouritesAssetTypeKey favouritesAssetTypeKey = y1d.a.e;
        aVar.getClass();
        FavouritesAssetTypeKey[] elements = {favouritesAssetTypeKey, y1d.a.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f170724b = kotlin.collections.d.y0(elements);
    }

    public g(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f170725a = featureToggleInteractor;
    }

    @Override // j28.e
    public final int a() {
        return 6;
    }

    @Override // j28.e
    public final Flow b(InvestWidgetContext widgetContext, String widgetType) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return new go.g(new Data(new RowDelegate.Model("LIST_ID_AUTOMATIONS_PRICE_ALERTS", new RowDelegate.Model.MainImage.Image40(c.b(R$drawable.uikit_icn_24_bell), null, null, false, null, false, 60), new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_price_alerts_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_widget_automations_item_price_alerts_subtitle, null, null, 14), null, null, 0, c.a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), null, false, 6, null), 2);
    }

    @Override // j28.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((jte.d) this.f170725a).c(FeatureWealthApi$Toggles.InvestFeaturesWidget.f95157c));
    }
}
