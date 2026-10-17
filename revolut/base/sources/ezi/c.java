package ezi;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.y0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.airportlounges.api.widgets.AirportLoungesWidgetContext;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import csh.e;
import dsh.j;
import dwi.x;
import grl.t9;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.v1;
import vkm.y;
import w4l.h;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f130942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vvi.b f130943c;

    public c(x airportLoungesAvailabilityInteractor, vvi.b airportLoungesMediumWidgetItemsProvider) {
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(airportLoungesMediumWidgetItemsProvider, "airportLoungesMediumWidgetItemsProvider");
        this.f130942b = airportLoungesAvailabilityInteractor;
        this.f130943c = airportLoungesMediumWidgetItemsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "AirportLoungesMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(this.f130942b.f120468a.d("LOUNGE_PASS", null) == bla.c.ENABLED);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "AirportLoungesMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", widgetType));
        }
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
        y0 y0Var = y0.WITHOUT_PROGRESS;
        return new GoalProgressLoadingWidgetDelegate.Model(widgetId, new TextLocalisedClause(R$string.airport_lounges_widget_title, null, null, 14), y0Var, new AnalyticsContext(w0VarE), new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)));
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return q.x(i(str, str2), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        AirportLoungesWidgetContext widgetContext2 = (AirportLoungesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new b(this, widgetType, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((AirportLoungesWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String widgetId, String str) {
        if (!Intrinsics.f(str, "AirportLoungesMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        gzi.d dVar = (gzi.d) this.f130943c;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return rd0.e.e(q.H(new gzi.b(dVar, widgetId, null), mo3.a.g(u0.m(rd0.e.b(dVar.f148136a.a(false, false)), dVar.f148137b.j(h.f294642c)), null, new gug.c(15), 1)), h0.f322473a, new gzi.c(dVar, widgetId, null));
    }
}
