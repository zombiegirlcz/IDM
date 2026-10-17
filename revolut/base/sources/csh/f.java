package csh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface f {
    default void a() {
    }

    default void i() {
    }

    Class j();

    default void p(ash.f facade) {
        Intrinsics.checkNotNullParameter(facade, "facade");
    }

    default void r() {
    }

    efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a aVar);
}
