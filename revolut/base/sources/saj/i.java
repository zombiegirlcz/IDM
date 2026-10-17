package saj;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.crypto.newlyadded.api.navigation.NewlyAddedCryptoDestination;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f261433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k39.b f261434b;

    public i(a0 widgetsUiInteractor, k39.b navigationCommandsDispatcher, gaj.b assetDestinationProvider) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(assetDestinationProvider, "assetDestinationProvider");
        this.f261433a = widgetsUiInteractor;
        this.f261434b = navigationCommandsDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return CryptoWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof n0;
        k39.b bVar = this.f261434b;
        m mVar = m.f235744a;
        if (z) {
            Object obj2 = ((n0) event).f55437c.f53167l;
            if (!(obj2 instanceof haj.a)) {
                return mVar;
            }
            xi0.b currency = ((haj.a) obj2).f150521a;
            Intrinsics.checkNotNullParameter(currency, "currency");
            return bVar.a(u0.f(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(currency, (BuyFundingCurrencyPrefill) null, 6)));
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            if (((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof HorizontalScrollerWidgetDelegate.Model) {
                return bVar.a(u0.f(NewlyAddedCryptoDestination.f100029a));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(event instanceof q0)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        pfm.h hVar = new pfm.h(new r2d.e(this, 6, event, widgetContext2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
