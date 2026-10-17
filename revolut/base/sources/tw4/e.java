package tw4;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.z3;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentCreateFlowDestination$Create;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentHubDestination;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.navigable.TransitionAnimation;
import dsh.o;
import io3.l;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f274907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc7.a f274908b;

    public e(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f274907a = widgetsUiInteractor;
        this.f274908b = homeFeedWidgetsEventDispatcher;
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
            this.f274907a.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str));
        } else {
            boolean z = event instanceof z3;
            uc7.a aVar = this.f274908b;
            if (z) {
                aVar.b(new fc7.d(new CreditCardInstalmentCreateFlowDestination$Create(widgetContext2.getCreditCardFacilityId(), l.CREDIT)));
            } else if (!(event instanceof com.revolut.core.ui_kit.delegates.widgets.i) || (((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof ErrorWidgetDelegate.Model)) {
                int i = jli.h.f175850a;
            } else {
                aVar.b(new fc7.d(new CreditCardInstalmentHubDestination(widgetContext2.getCreditCardFacilityId(), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE))));
            }
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
