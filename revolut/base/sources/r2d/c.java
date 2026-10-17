package r2d;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.r;
import java.util.List;
import jid.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f251097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1d.a f251098c;

    public c(z widgetDataProvider, o1d.a configProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f251097b = widgetDataProvider;
        this.f251098c = configProvider;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return zhm.u.c(r.a.a(dsh.r.Companion, inputConfig, null, null, 14));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return vkm.q.x(this.f251098c.a(), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        ((k) ((s) this.f251097b.f174461b)).getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, new TextLocalisedClause(R$string.shared_alerts_alerts_screen_header_title, null, null, 14), r.a.c(dsh.r.Companion, eVar), null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return vkm.q.x(i(str, str2, eVar, this.f251098c.b()), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return i(id10, widgetType, config, this.f251098c.b());
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((FavouritesWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final wkm.l i(String str, String str2, dsh.e eVar, AlertsWidgetContext alertsWidgetContext) {
        int i = alertsWidgetContext.e;
        if (!Intrinsics.f(str2, "AlertsMedium") && !Intrinsics.f(str2, "AlertsList")) {
            throw new IllegalArgumentException(p.a.p("Widget ", str2, " type not supported"));
        }
        dsh.r.Companion.getClass();
        int iB = r.a.b(eVar, i);
        return vkm.q.Q(this.f251098c.a(), new a(null, this, alertsWidgetContext, iB + 1, str, iB));
    }
}
