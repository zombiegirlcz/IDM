package ws5;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.k2;
import com.revolut.core.ui_kit.delegates.widgets.m2;
import com.revolut.core.ui_kit.delegates.widgets.n2;
import com.revolut.core.ui_kit.delegates.widgets.o2;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsOverviewDestination;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import rzj.j;
import v3e.t;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss5.a f299667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f299668b;

    public i(a0 widgetsUiInteractor, ss5.a cryptoFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f299667a = cryptoFeedWidgetsEventDispatcher;
        this.f299668b = widgetsUiInteractor;
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
        if (event instanceof m2) {
            pfm.h hVar = new pfm.h(new t(this, new WealthNewsOverviewDestination(tzj.a.CRYPTO), 23), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        m mVar = m.f235744a;
        if (z) {
            if (!(((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof NewsWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            pfm.h hVar2 = new pfm.h(new t(this, new WealthNewsOverviewDestination(tzj.a.CRYPTO), 23), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (event instanceof n2) {
            Object obj2 = ((n2) event).f55439c.k;
            if (!(obj2 instanceof rzj.f)) {
                return mVar;
            }
            pfm.h hVar3 = new pfm.h(new t(this, new WealthNewsArticleReaderDestination(((rzj.f) obj2).d(), true, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE)), 23), 2);
            Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
            return hVar3;
        }
        if (event instanceof k2) {
            Object obj3 = ((k2) event).f55404c.k;
            rzj.f fVar = obj3 instanceof rzj.f ? (rzj.f) obj3 : null;
            j jVarA = fVar != null ? fVar.a() : null;
            rzj.i iVar = jVarA instanceof rzj.i ? (rzj.i) jVarA : null;
            if ((iVar != null ? iVar.f258696a : null) == null) {
                return mVar;
            }
            pfm.h hVar4 = new pfm.h(new t(this, new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(iVar.f258696a.f288344a, (BuyFundingCurrencyPrefill) null, 6), 23), 2);
            Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
            return hVar4;
        }
        if (!(event instanceof o2)) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            pfm.h hVar5 = new pfm.h(new r2d.e(this, 27, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
            return hVar5;
        }
        Object obj4 = ((o2) event).f55450c.k;
        rzj.f fVar2 = obj4 instanceof rzj.f ? (rzj.f) obj4 : null;
        j jVarE = fVar2 != null ? fVar2.e() : null;
        rzj.i iVar2 = jVarE instanceof rzj.i ? (rzj.i) jVarE : null;
        if ((iVar2 != null ? iVar2.f258696a : null) == null) {
            return mVar;
        }
        pfm.h hVar6 = new pfm.h(new t(this, new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(iVar2.f258696a.f288344a, (BuyFundingCurrencyPrefill) null, 6), 23), 2);
        Intrinsics.checkNotNullExpressionValue(hVar6, "fromAction(...)");
        return hVar6;
    }
}
