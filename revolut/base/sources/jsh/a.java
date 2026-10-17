package jsh;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f178181a = new Object();

    public static final WidgetContext a(WidgetContext widgetContext) {
        WidgetContext widgetContextA;
        Intrinsics.checkNotNullParameter(widgetContext, "<this>");
        WidgetContext widgetContext2 = widgetContext.get_originalWidgetContext();
        return (widgetContext2 == null || (widgetContextA = a(widgetContext2)) == null) ? widgetContext : widgetContextA;
    }
}
