package k40;

import com.revolut.chat.ui.assistant.widget.AssistantWidgetContext;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgm.c f180826a;

    public f(kgm.c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f180826a = callback;
    }

    @Override // csh.f
    public final Class j() {
        return AssistantWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        AssistantWidgetContext widgetContext2 = (AssistantWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        p0 p0Var = p0.f264001a;
        return pd.b.n(o.f323119a, new e(event, this, null));
    }
}
