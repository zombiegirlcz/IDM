package ns5;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import ne0.o;
import pfm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f218758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss5.a f218759b;

    public h(a0 widgetsUiInteractor, ss5.a cryptoFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        this.f218758a = widgetsUiInteractor;
        this.f218759b = cryptoFeedWidgetsEventDispatcher;
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
        boolean z = event instanceof i;
        CryptoInvestFeatureConfig.AllCrypto allCrypto = CryptoInvestFeatureConfig.AllCrypto.f71497a;
        m mVar = m.f235744a;
        if (z) {
            if (((i) event).f55375c instanceof RowsWidgetDelegate.Model) {
                pfm.h hVar = new pfm.h(new o(this, u0.c(allCrypto), 4), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            }
        } else {
            if (event instanceof g3) {
                pfm.h hVar2 = new pfm.h(new o(this, u0.c(allCrypto), 4), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            }
            if (!(event instanceof i3)) {
                if (!(event instanceof q0)) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                pfm.h hVar3 = new pfm.h(new ly2.d(this, 13, event, widgetContext2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
            }
            Object obj2 = ((i3) event).f55382c.u;
            if (obj2 instanceof zv5.a) {
                String str = ((zv5.a) obj2).f325574a;
                xi0.b.Companion.getClass();
                pfm.h hVar4 = new pfm.h(new o(this, new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(xi0.a.a(str), (BuyFundingCurrencyPrefill) null, 6), 4), 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            }
        }
        return mVar;
    }
}
