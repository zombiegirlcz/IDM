package ts5;

import aii.u;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.w0;
import com.revolut.feature.crypto.earn.assets.shared.api.navigation.EarnAssetsScreenDestination;
import com.revolut.feature.crypto.strategies.api.navigation.destinations.CryptoStrategiesDestination;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXPromoDestination;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import u09.v;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss5.a f273986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f273987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f273988c;

    public p(ss5.a cryptoFeedWidgetsEventDispatcher, a0 widgetsUiInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f273986a = cryptoFeedWidgetsEventDispatcher;
        this.f273987b = widgetsUiInteractor;
        this.f273988c = revolutCardsInteractor;
    }

    public final pfm.h b(u uVar) {
        pfm.h hVar = new pfm.h(new rzc.b(this, uVar, 17), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return CryptoWidgetContext.class;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CryptoWidgetContext widgetContext2 = (CryptoWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof w0) {
            throw null;
        }
        boolean z = event instanceof i3;
        efm.b bVarB = pfm.m.f235744a;
        if (!z) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(bVarB, "complete(...)");
                return bVarB;
            }
            pfm.h hVar = new pfm.h(new r2d.e(this, 10, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        String str = ((i3) event).f55382c.f53228a;
        int iHashCode = str.hashCode();
        RevolutXPromoDestination revolutXPromoDestination = RevolutXPromoDestination.f84265a;
        switch (iHashCode) {
            case -190797831:
                if (str.equals("RevolutX")) {
                    bVarB = b(revolutXPromoDestination);
                }
                break;
            case 553873:
                if (str.equals("CryptoCard")) {
                    bVarB = l93.f.a(this.f273988c).concatMapCompletable(new o(0, new tpl.o(this, 10)));
                }
                break;
            case 2152440:
                if (str.equals("Earn")) {
                    bVarB = b(EarnAssetsScreenDestination.f70788b);
                }
                break;
            case 73293348:
                if (str.equals("Learn")) {
                    bVarB = b(new LearnKompotFeatureConfig.Home.Destination(v.CRYPTO));
                }
                break;
            case 1161085680:
                if (str.equals("Futures")) {
                    bVarB = b(revolutXPromoDestination);
                }
                break;
            case 2080784241:
                if (str.equals("Strategies")) {
                    bVarB = b(CryptoStrategiesDestination.f70999a);
                }
                break;
        }
        Intrinsics.checkNotNullExpressionValue(bVarB, "handleTileClick(...)");
        return bVarB;
    }
}
