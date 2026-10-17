package p18;

import aii.e;
import aii.g;
import aii.p;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotifications;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsPerformance;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$StockDetailsAirTips;
import com.revolut.feature.invest.smart_notifications.api.domain.AllInsightsNotificationsDestination;
import com.revolut.feature.invest.smart_notifications.api.domain.InsightPublicationPriceDescriptor;
import com.revolut.feature.invest.smart_notifications.api.domain.WealthSmartFeedDestination;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details.InsightDetailsBottomSheetContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details.InsightDetailsBottomSheetScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.wealth.resources.R$string;
import dii.i;
import grl.k9;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a, p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f231879a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f231879a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof w08.a) {
            w08.a aVar = (w08.a) descriptor;
            return aVar.a(new InsightDetailsBottomSheetScreen(new InsightDetailsBottomSheetContract$InputData(aVar.f293665a, aVar.f293666b, aVar.f293667c)));
        }
        if (descriptor instanceof w08.b) {
            w08.b bVar = (w08.b) descriptor;
            return bVar.a(new InsightSettingsInfoBottomSheetScreen(new InsightSettingsInfoBottomSheetContract$InputData(bVar.f293668a)));
        }
        if (!(descriptor instanceof InsightPublicationPriceDescriptor)) {
            return null;
        }
        InsightPublicationPriceDescriptor insightPublicationPriceDescriptor = (InsightPublicationPriceDescriptor) descriptor;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.invest_smart_notifications_feed_publication_price_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return insightPublicationPriceDescriptor.a(new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, new i(new TextLocalisedClause(R$string.invest_smart_notifications_feed_publication_price_description, u.c(new TextClause(insightPublicationPriceDescriptor.f76421a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), 8)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsPerformance.f76417c, InvestSmartNotificationsApi$Toggles$StockDetailsAirTips.f76419c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WealthSmartFeedDestination) {
            return new SmartFeedScreen(new SmartFeedScreenContract$InputData(((WealthSmartFeedDestination) destination).f76422a));
        }
        if (destination instanceof AllInsightsNotificationsDestination) {
            return new AllInsightsScreen(new AllInsightsScreenContract$InputData(((AllInsightsNotificationsDestination) destination).f76420a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f231879a;
    }
}
