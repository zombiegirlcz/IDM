package xpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.widget.NetworthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.j;
import gim.c;
import ish.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rpb.a0;
import zc7.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f307925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f307926c;

    public a(a0 savingsWidgetsVisibilityInteractor, i delegate) {
        Intrinsics.checkNotNullParameter(savingsWidgetsVisibilityInteractor, "savingsWidgetsVisibilityInteractor");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f307925b = savingsWidgetsVisibilityInteractor;
        this.f307926c = delegate;
    }

    @Override // csh.e
    public final Object b(String str, c cVar) {
        return this.f307926c.b(str, cVar);
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.f307926c.c(str, continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return this.f307926c.d(id10, widgetType, eVar);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        NetworthWidgetContext.Type type = ((NetworthWidgetContext) widgetContext).f74707b;
        NetworthWidgetContext.Type.Savings savings = type instanceof NetworthWidgetContext.Type.Savings ? (NetworthWidgetContext.Type.Savings) type : null;
        return savings == null ? Boolean.TRUE : this.f307925b.d(str, savings.f74719a, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        return this.f307926c.f((NetworthWidgetContext) widgetContext, str, str2, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        NetworthWidgetContext widgetContext2 = (NetworthWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return this.f307926c.g(widgetContext2, id10, widgetType, config);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((NetworthWidgetContext) widgetContext, str, eVar);
        return null;
    }
}
