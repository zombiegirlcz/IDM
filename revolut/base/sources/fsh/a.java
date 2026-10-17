package fsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.j;
import ish.f;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f137699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bsh.a f137700c;

    public a(e base, bsh.a contextAdapter) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(contextAdapter, "contextAdapter");
        this.f137699b = base;
        this.f137700c = contextAdapter;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return this.f137699b.a(widgetType, inputConfig);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        return this.f137699b.b(str, cVar);
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.f137699b.c(str, continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return this.f137699b.d(id10, widgetType, eVar);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        WidgetContext widgetContextB = this.f137700c.b(widgetContext);
        widgetContextB.set_originalWidgetContext(widgetContext);
        return this.f137699b.e(widgetContextB, str, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, f fVar) {
        WidgetContext widgetContextB = this.f137700c.b(widgetContext);
        widgetContextB.set_originalWidgetContext(widgetContext);
        return this.f137699b.f(widgetContextB, str, str2, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        WidgetContext widgetContextB = this.f137700c.b(widgetContext);
        widgetContextB.set_originalWidgetContext(widgetContext);
        return this.f137699b.g(widgetContextB, id10, widgetType, config);
    }

    @Override // csh.e
    public final j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        WidgetContext widgetContextB = this.f137700c.b(widgetContext);
        widgetContextB.set_originalWidgetContext(widgetContext);
        return this.f137699b.h(widgetContextB, widgetType, inputConfig);
    }

    public final WidgetContext i(WidgetContext targetContext) {
        Intrinsics.checkNotNullParameter(targetContext, "targetContext");
        WidgetContext widgetContextB = this.f137700c.b(targetContext);
        widgetContextB.set_originalWidgetContext(targetContext);
        e eVar = this.f137699b;
        return eVar instanceof a ? ((a) eVar).i(widgetContextB) : widgetContextB;
    }
}
