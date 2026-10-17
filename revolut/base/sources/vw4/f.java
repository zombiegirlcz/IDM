package vw4;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.o;
import efm.d0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import vq5.x;
import vrl.v0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f292631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f292632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.rev_points.api.navigation.a f292633c;

    public f(sri.m navigator, a0 widgetsUiInteractor, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        this.f292631a = navigator;
        this.f292632b = widgetsUiInteractor;
        this.f292633c = revPointsNavigationFactory;
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
            HomeFeedWidgetContext.CreditCard.Companion companion = HomeFeedWidgetContext.CreditCard.INSTANCE;
            String creditCardFacilityId = widgetContext2.getCreditCardFacilityId();
            companion.getClass();
            this.f292632b.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str));
            return mVar;
        }
        if (!(event instanceof com.revolut.core.ui_kit.delegates.widgets.i)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof ErrorWidgetDelegate.Model) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        qyb.a aVar = (qyb.a) this.f292633c;
        RevPointsOptInNextDestination.Default optInNextDestination = RevPointsOptInNextDestination.Default.f83526a;
        Intrinsics.checkNotNullParameter(optInNextDestination, "optInNextDestination");
        RevPointsOptInSource.CreditWidget optInSource = RevPointsOptInSource.CreditWidget.f83985a;
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        d0 d0VarE = ((nyb.o) aVar.f250267a).e(false);
        qsa.a aVar2 = new qsa.a(19, new qpb.a(optInSource, optInNextDestination, 24));
        d0VarE.getClass();
        ufm.i iVar = new ufm.i(d0VarE, aVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return new pfm.a(iVar, new v0(22, new x(this, 23)), 4);
    }
}
