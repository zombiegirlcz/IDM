package androidx.glance.action;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/glance/GlanceModifier;", "Landroidx/glance/action/Action;", "onClick", "clickable", "(Landroidx/glance/GlanceModifier;Landroidx/glance/action/Action;)Landroidx/glance/GlanceModifier;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ActionKt {
    @NotNull
    public static final GlanceModifier clickable(@NotNull GlanceModifier glanceModifier, @NotNull Action action) {
        return glanceModifier.then(new ActionModifier(action));
    }
}
