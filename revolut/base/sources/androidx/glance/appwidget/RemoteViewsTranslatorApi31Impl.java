package androidx.glance.appwidget;

import android.widget.RemoteViews;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/glance/appwidget/RemoteViewsTranslatorApi31Impl;", "", "()V", "addChildView", "", "rv", "Landroid/widget/RemoteViews;", "viewId", "", "childView", "stableId", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RemoteViewsTranslatorApi31Impl {

    @NotNull
    public static final RemoteViewsTranslatorApi31Impl INSTANCE = new RemoteViewsTranslatorApi31Impl();

    private RemoteViewsTranslatorApi31Impl() {
    }

    public final void addChildView(@NotNull RemoteViews rv4, int viewId, @NotNull RemoteViews childView, int stableId) {
        rv4.addStableView(viewId, childView, stableId);
    }
}
