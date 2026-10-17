package pc7;

import ard.c0;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.MapLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import ish.f;
import java.util.List;
import jla.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj2.d f234825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f234826c;

    public d(yj2.d atmMapDataProvider, gc7.a atmsMapWidgetMapper, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(atmMapDataProvider, "atmMapDataProvider");
        Intrinsics.checkNotNullParameter(atmsMapWidgetMapper, "atmsMapWidgetMapper");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f234825b = atmMapDataProvider;
        this.f234826c = productCatalogueInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "ATMMedium") && !Intrinsics.f(str, "ATMSmall")) {
            throw new IllegalArgumentException();
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return q.x(new ae8.c(bla.b.b(this.f234826c, "cash_withdrawal.atm_locator"), 22), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (!Intrinsics.f(widgetType, "ATMMedium")) {
            if (!Intrinsics.f(widgetType, "ATMSmall")) {
                throw new IllegalArgumentException(a0.d.r(widgetType, " is not a correct widget type"));
            }
            MapLoadingWidgetDelegate.Model.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            return new MapLoadingWidgetDelegate.Model(listId, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), op0.q.SMALL, null, null);
        }
        MapLoadingWidgetDelegate.Model.Companion aVar = MapLoadingWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause title = new TextLocalisedClause(R$string.home_feed_widget_title_atms_map, null, null, 14);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MapLoadingWidgetDelegate.Model(listId, yh5.b.a(title), op0.q.MEDIUM, null, null);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return q.x(new c0((StateFlow) this.f234825b.f.getValue(), this, str, str2, 17), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return q.Q(new ae8.c(bla.b.b(this.f234826c, "cash_withdrawal.atm_locator"), 22), new mki.d((Continuation) null, this, id10, widgetType, 5));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Personal) widgetContext, str, eVar);
        return null;
    }
}
