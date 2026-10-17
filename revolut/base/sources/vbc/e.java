package vbc;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget;
import com.revolut.feature.revolutpay.order_tracking.api.widgets.RevolutPayWidgetContext;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements csh.e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f287494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usc.a f287495c;
    public final f d;

    public e(gte.a featureToggleInteractor, usc.a deliveryInteractor, f widgetMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deliveryInteractor, "deliveryInteractor");
        Intrinsics.checkNotNullParameter(widgetMapper, "widgetMapper");
        this.f287494b = featureToggleInteractor;
        this.f287495c = deliveryInteractor;
        this.d = widgetMapper;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((jte.d) this.f287494b).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget.f84601c));
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new TrackingProgressLoadingWidgetDelegate.Model(new TextLocalisedClause(R$string.revolut_pay_home_widget_order_tracking_title, null, null, 14), widgetId);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return c(str, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(i(str), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        RevolutPayWidgetContext widgetContext2 = (RevolutPayWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((RevolutPayWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String str) {
        return rd0.e.e(new t38.e(mo3.a.g(this.f287495c.j(new wbc.b(1, 0, 30)), null, new v78.d(10), 1), 14, this, str), h0.f322473a, new uec.d((Object) new d(this, str, null), (Continuation) null, 22));
    }
}
