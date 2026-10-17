package sw4;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.credit.card.api.navigation.FeeWaiverBottomSheetDestination;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import dsh.o;
import hha.w0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f266104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f266105b;

    public i(m navigator, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f266104a = navigator;
        this.f266105b = widgetsUiInteractor;
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
            this.f266105b.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str));
        } else if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            AvatarWidgetDelegate.Model model2 = model instanceof AvatarWidgetDelegate.Model ? (AvatarWidgetDelegate.Model) model : null;
            Object obj2 = model2 != null ? model2.f54968n : null;
            nl4.g gVar = obj2 instanceof nl4.g ? (nl4.g) obj2 : null;
            if (gVar != null) {
                w0 w0Var = gVar.f216999b;
                nl4.e eVar = gVar.f216998a;
                this.f266104a.c(new FeatureCommand(new KompotOverlayFeatureConfig(new FeeWaiverBottomSheetDestination(w0Var, eVar.d, eVar.f216996c, eVar.f216995b, eVar.e), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
            }
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
