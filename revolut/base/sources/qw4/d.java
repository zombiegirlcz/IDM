package qw4;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.credit.card.api.navigation.CreditCardCashbabackDetailsDestination;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.navigable.TransitionAnimation;
import dsh.o;
import ish.a0;
import jli.h;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f249767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc7.a f249768b;

    public d(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f249767a = widgetsUiInteractor;
        this.f249768b = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return CreditCardWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            String str = ((q0) event).f55476b;
            HomeFeedWidgetContext.CreditCard.Companion companion = HomeFeedWidgetContext.CreditCard.INSTANCE;
            String creditCardFacilityId = widgetContext2.getCreditCardFacilityId();
            companion.getClass();
            this.f249767a.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str));
        } else if (!(event instanceof i) || (((i) event).f55375c instanceof ErrorWidgetDelegate.Model)) {
            int i = h.f175850a;
        } else {
            this.f249768b.b(new fc7.d(new CreditCardCashbabackDetailsDestination(widgetContext2.getCreditCardFacilityId(), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE))));
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
