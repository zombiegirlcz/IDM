package wc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.insurance_home.api.widget.models.InsuranceHomeWidgetContent;
import com.revolut.feature.insurance_home.api.widget.models.InsuranceWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import v3e.t;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f296358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f296359b;

    public g(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f296358a = homeFeedWidgetsEventDispatcher;
        this.f296359b = widgetsUiInteractor;
    }

    public final efm.b b(Object obj2) {
        if (obj2 instanceof InsuranceHomeWidgetContent.Action.OpenHome) {
            h hVar = new h(new ty7.b(this, 19), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (obj2 instanceof InsuranceHomeWidgetContent.Action.OpenDetails) {
            h hVar2 = new h(new t(this, ((InsuranceHomeWidgetContent.Action.OpenDetails) obj2).f76161a, 14), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // csh.f
    public final Class j() {
        return InsuranceWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InsuranceWidgetContext widgetContext2 = (InsuranceWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof n0) {
            return b(((n0) event).f55437c.f53167l);
        }
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            h hVar = new h(new r2d.e(this, 25, ((q0) event).f55476b, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        if (model instanceof ContactsWidgetDelegate.Model) {
            return b(((ContactsWidgetDelegate.Model) model).f55089j);
        }
        if (!(model instanceof HorizontalScrollerWidgetDelegate.Model)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        h hVar2 = new h(new ty7.b(this, 19), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        return hVar2;
    }
}
