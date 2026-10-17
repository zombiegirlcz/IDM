package s28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.k2;
import com.revolut.core.ui_kit.delegates.widgets.m2;
import com.revolut.core.ui_kit.delegates.widgets.n2;
import com.revolut.core.ui_kit.delegates.widgets.o2;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$IndexDetailsDestination;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotifications;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.invest.smart_notifications.api.domain.WealthSmartFeedDestination;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.marketnews.api.navigation.WealthNewsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f259269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f259270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ash.d f259271c;
    public final gte.a d;
    public final q18.h e;

    public j(k39.b navigationCommandsDispatcher, a0 widgetsUiInteractor, ash.d eventDispatcher, gte.a featureToggleInteractor, q18.h smartNotificationDestinationProvider) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(smartNotificationDestinationProvider, "smartNotificationDestinationProvider");
        this.f259269a = navigationCommandsDispatcher;
        this.f259270b = widgetsUiInteractor;
        this.f259271c = eventDispatcher;
        this.d = featureToggleInteractor;
        this.e = smartNotificationDestinationProvider;
    }

    public final efm.b b(rzj.h hVar) {
        InstrumentTicker instrumentTicker = hVar != null ? hVar.f258695a : null;
        m mVar = m.f235744a;
        if (instrumentTicker == null) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        int i = i.f259268a[instrumentTicker.f105111a.ordinal()];
        k39.b bVar = this.f259269a;
        if (i == 1) {
            return bVar.a(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(instrumentTicker.f105112b, null, false, "NewsSingleFeedWidget", null, null, 54), false, (Integer) null, 0, 61)));
        }
        if (i == 2) {
            return bVar.a(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new GlobalMarketsFeatureConfig$IndexDetailsDestination(instrumentTicker.f105112b, instrumentTicker.f105113c), false, (Integer) null, 0, 61)));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    public final efm.b c() {
        boolean zN = ifk.b.n(this.d, InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c);
        k39.b bVar = this.f259269a;
        if (!zN) {
            return bVar.a(gc0.c.f(new WealthNewsFeatureConfig.Overview(tzj.a.TOP_STORIES, new ActivityAnimation.System(Integer.valueOf(R$anim.fade_in), Integer.valueOf(R$anim.fade_out)))));
        }
        tdh.a[] elements = {tdh.a.PORTFOLIO, tdh.a.WATCHLIST};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return bVar.a(u0.f(new WealthSmartFeedDestination(kotlin.collections.d.y0(elements))));
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new r2d.e(this, 3, ((q0) event).f55476b, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        m mVar = m.f235744a;
        if (z) {
            if (((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof NewsWidgetDelegate.Model) {
                return c();
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(event instanceof NewsWidgetDelegate.b)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        NewsWidgetDelegate.b bVar = (NewsWidgetDelegate.b) event;
        if (bVar instanceof m2) {
            return c();
        }
        if (bVar instanceof k2) {
            Object obj2 = ((k2) bVar).f55404c.k;
            rzj.f fVar = obj2 instanceof rzj.f ? (rzj.f) obj2 : null;
            rzj.j jVarA = fVar != null ? fVar.a() : null;
            return b(jVarA instanceof rzj.h ? (rzj.h) jVarA : null);
        }
        if (bVar instanceof o2) {
            Object obj3 = ((o2) bVar).f55450c.k;
            rzj.f fVar2 = obj3 instanceof rzj.f ? (rzj.f) obj3 : null;
            rzj.j jVarE = fVar2 != null ? fVar2.e() : null;
            return b(jVarE instanceof rzj.h ? (rzj.h) jVarE : null);
        }
        if (!(bVar instanceof n2)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        StackDestination stackDestinationA = this.e.a(((n2) bVar).f55439c.k);
        if (stackDestinationA == null) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        pfm.h hVar2 = new pfm.h(new rzc.b(this, stackDestinationA, 2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        return hVar2;
    }
}
