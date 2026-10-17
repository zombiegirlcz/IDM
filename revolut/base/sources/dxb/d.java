package dxb;

import a08.l;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardsWidgetAnimatedEmptyStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.api.widgets.RevPointsGiftcardsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f120934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.d f120935b;

    public d(ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f120934a = widgetsUiInteractor;
        this.f120935b = widgetsCommonEventDispatcher;
    }

    public final h b(RevPointsGiftcardsDestination revPointsGiftcardsDestination) {
        h hVar = new h(new l(this, revPointsGiftcardsDestination, 20), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return RevPointsGiftcardsWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        RevPointsGiftcardsWidgetContext widgetContext2 = (RevPointsGiftcardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
            if (model instanceof HorizontalScrollerWidgetDelegate.Model) {
                return b(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(RevPointsGiftcardsDestination.GiftcardsHomePagerItem.MyCards.f83658a), null));
            }
            if (model instanceof CardsWidgetAnimatedEmptyStateDelegate.Model) {
                return b(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(new RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover(false)), null));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(event instanceof n0)) {
            if (event instanceof q0) {
                return new h(new a09.a0(this, 6, event, widgetContext2), 2);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        String str = ((n0) event).f55437c.f53161a;
        if (kotlin.text.a0.H(str, "GIFT_CARDS_MEDIUM_ITEM_ID_", false)) {
            return b(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, d0.e0(str, "GIFT_CARDS_MEDIUM_ITEM_ID_"), null, null, 13), null));
        }
        if (Intrinsics.f(str, "GIFT_CARDS_MEDIUM_GET_MORE_ITEM_ID") || Intrinsics.f(str, "GIFT_CARDS_MEDIUM_EMPTY_ITEM_ID")) {
            return b(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(new RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover(false)), null));
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
