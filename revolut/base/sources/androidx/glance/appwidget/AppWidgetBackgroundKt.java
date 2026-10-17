package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"appWidgetBackground", "Landroidx/glance/GlanceModifier;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class AppWidgetBackgroundKt {
    @NotNull
    public static final GlanceModifier appWidgetBackground(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.then(AppWidgetBackgroundModifier.INSTANCE);
    }
}
