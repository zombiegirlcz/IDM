package androidx.glance.appwidget;

import android.widget.RemoteViews;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/glance/appwidget/LayoutSelectionApi31Impl;", "", "()V", "remoteViews", "Landroid/widget/RemoteViews;", "packageName", "", "layoutId", "", "viewId", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutSelectionApi31Impl {

    @NotNull
    public static final LayoutSelectionApi31Impl INSTANCE = new LayoutSelectionApi31Impl();

    private LayoutSelectionApi31Impl() {
    }

    @NotNull
    public final RemoteViews remoteViews(@NotNull String packageName, int layoutId, int viewId) {
        return new RemoteViews(packageName, layoutId, viewId);
    }
}
