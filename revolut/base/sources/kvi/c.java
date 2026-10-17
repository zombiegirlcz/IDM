package kvi;

import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.y0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.airport.security_fast_track.api.widgets.AsftWidgetContext;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import dsh.j;
import grl.t9;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mti.g;
import mti.h;
import mti.p;
import vkm.q;
import vkm.v1;
import vkm.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f190131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eti.a f190132c;

    public c(h asftProductAvailabilityInteractor, eti.a asftMediumWidgetItemsProvider) {
        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(asftMediumWidgetItemsProvider, "asftMediumWidgetItemsProvider");
        this.f190131b = asftProductAvailabilityInteractor;
        this.f190132c = asftMediumWidgetItemsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "AirportFastTrackPassMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(this.f190131b.a());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "AirportFastTrackPassMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", widgetType));
        }
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
        y0 y0Var = y0.WITHOUT_PROGRESS;
        return new GoalProgressLoadingWidgetDelegate.Model(widgetId, new TextLocalisedClause(R$string.asft_widget_title, null, null, 14), y0Var, new AnalyticsContext(w0VarE), new zn.b(widgetId, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)));
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
        AsftWidgetContext widgetContext2 = (AsftWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new b(this, widgetType, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((AsftWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final y i(String widgetId, String str) {
        if (!Intrinsics.f(str, "AirportFastTrackPassMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        mvi.f fVar = (mvi.f) this.f190132c;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return rd0.e.e(q.H(new mvi.d(fVar, widgetId, null), mo3.a.g(u0.m(((g) fVar.f209260a).c(w4l.h.f294642c), ((p) fVar.f209261b).a()), null, new mv5.h(1), 1)), h0.f322473a, new mvi.e(fVar, widgetId, null));
    }
}
