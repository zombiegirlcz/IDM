package androidx.glance.layout;

import androidx.glance.GlanceModifier;
import androidx.glance.unit.Dimension;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/glance/layout/RowScopeImplInstance;", "Landroidx/glance/layout/RowScope;", "()V", "defaultWeight", "Landroidx/glance/GlanceModifier;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RowScopeImplInstance implements RowScope {

    @NotNull
    public static final RowScopeImplInstance INSTANCE = new RowScopeImplInstance();

    private RowScopeImplInstance() {
    }

    @Override // androidx.glance.layout.RowScope
    @NotNull
    public GlanceModifier defaultWeight(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.then(new WidthModifier(Dimension.Expand.INSTANCE));
    }
}
