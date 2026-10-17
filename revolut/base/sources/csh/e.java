package csh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public interface e {
    default List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return f0.f322471a;
    }

    Object b(String str, gim.c cVar);

    Object c(String str, Continuation continuation);

    BaseDraggableWidgetDelegate.Model d(String str, String str2, dsh.e eVar);

    Object e(WidgetContext widgetContext, String str, ish.e eVar);

    Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar);

    Flow g(WidgetContext widgetContext, String str, String str2, dsh.e eVar);

    default dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return null;
    }
}
