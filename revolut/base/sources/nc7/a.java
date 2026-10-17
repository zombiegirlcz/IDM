package nc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TravelModeLoadingWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import csh.e;
import dsh.d;
import dsh.j;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qsa.p;
import vkm.q;
import w4l.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qtd.b f214155b;

    public a(qtd.b travelModeWidgetHandler) {
        Intrinsics.checkNotNullParameter(travelModeWidgetHandler, "travelModeWidgetHandler");
        this.f214155b = travelModeWidgetHandler;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new TravelModeLoadingWidgetDelegate.Model(listId);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        throw new WidgetNotAvailableException(a0.d.r(str2, " does not have a preview"), 2);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String listId, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listId, "listId");
        qtd.b bVar = this.f214155b;
        muj.c cVar = (muj.c) bVar.f249091a;
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return mo3.a.g(xam.a.h(new qtd.a(bVar, listId, null), nim.a.v(q.Q(cVar.b(), new mk0.f((Continuation) null, cVar, 8)), new p(9))), null, new qsk.d(4), 1);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((HomeFeedWidgetContext.Personal) widgetContext, str, eVar);
        return null;
    }
}
