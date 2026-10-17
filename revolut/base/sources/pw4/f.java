package pw4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.m3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsCancelPendingInvitationDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsCardholderDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import dsh.o;
import ft3.a1;
import ft3.r;
import grl.r2;
import ish.a0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pp4.s;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f240325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc7.a f240326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sri.m f240327c;

    public f(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher, sri.m navigator) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f240325a = widgetsUiInteractor;
        this.f240326b = homeFeedWidgetsEventDispatcher;
        this.f240327c = navigator;
    }

    public final void b(String str) {
        this.f240327c.c(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.HOME, null, null, null, null, 30), new r(str), null, null, null, null, null, null, null, null, 2044)));
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
        boolean z = event instanceof q0;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            String str = ((q0) event).f55476b;
            String creditCardFacilityId = widgetContext2.getCreditCardFacilityId();
            HomeFeedWidgetContext.CreditCard.INSTANCE.getClass();
            this.f240325a.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str));
        } else {
            boolean z3 = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
            uc7.a aVar = this.f240326b;
            if (z3) {
                BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
                RowsWidgetDelegate.Model model2 = model instanceof RowsWidgetDelegate.Model ? (RowsWidgetDelegate.Model) model : null;
                if (model2 == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                Object obj2 = model2.f55231n;
                el4.i iVar = obj2 instanceof el4.i ? (el4.i) obj2 : null;
                if (iVar == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                ArrayList arrayList = iVar.f127266b;
                if (arrayList.isEmpty()) {
                    b(widgetContext2.getCreditCardFacilityId());
                } else {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        if (!((el4.e) it8.next()).k) {
                            aVar.b(new fc7.d(new AdditionalCardsDestination(widgetContext2.getCreditCardFacilityId(), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE))));
                            break;
                        }
                    }
                    b(widgetContext2.getCreditCardFacilityId());
                }
            } else if (event instanceof g3) {
                aVar.b(new fc7.d(new AdditionalCardsDestination(widgetContext2.getCreditCardFacilityId(), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE))));
            } else if (event instanceof i3) {
                RowDelegate.Model model3 = ((i3) event).f55382c;
                Object obj3 = model3.u;
                if (obj3 instanceof s) {
                    s sVar = (s) obj3;
                    aVar.b(new fc7.d(new AdditionalCardsCardholderDetailsDestination(widgetContext2.getCreditCardFacilityId(), sVar.f238271a, sVar.f238272b, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE))));
                } else if (Intrinsics.f(model3.f53228a, "ADD_NEW_ITEM_ID")) {
                    b(widgetContext2.getCreditCardFacilityId());
                }
            } else if (event instanceof m3) {
                Object obj4 = ((m3) event).f55431c.u;
                pp4.r rVar = obj4 instanceof pp4.r ? (pp4.r) obj4 : null;
                if (rVar != null) {
                    this.f240327c.c(new FeatureCommand(new KompotOverlayFeatureConfig(new AdditionalCardsCancelPendingInvitationDestination(widgetContext2.getCreditCardFacilityId(), rVar.f238268a, rVar.f238269b, rVar.f238270c), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
                }
            } else {
                int i = jli.h.f175850a;
            }
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
