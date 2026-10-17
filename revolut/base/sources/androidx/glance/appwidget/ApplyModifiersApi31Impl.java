package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.unit.Dimension;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/glance/appwidget/ApplyModifiersApi31Impl;", "", "()V", "applyRoundedCorners", "", "rv", "Landroid/widget/RemoteViews;", "viewId", "", "radius", "Landroidx/glance/unit/Dimension;", "setViewHeight", "height", "setViewWidth", "width", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ApplyModifiersApi31Impl {

    @NotNull
    public static final ApplyModifiersApi31Impl INSTANCE = new ApplyModifiersApi31Impl();

    private ApplyModifiersApi31Impl() {
    }

    public final void applyRoundedCorners(@NotNull RemoteViews rv4, int viewId, @NotNull Dimension radius) {
        RemoteViewsCompat.setViewClipToOutline(rv4, viewId, true);
        if (radius instanceof Dimension.Dp) {
            rv4.setViewOutlinePreferredRadius(viewId, ((Dimension.Dp) radius).getDp(), 1);
        } else if (radius instanceof Dimension.Resource) {
            rv4.setViewOutlinePreferredRadiusDimen(viewId, ((Dimension.Resource) radius).getRes());
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + radius.getClass().getCanonicalName()).toString());
        }
    }

    public final void setViewHeight(@NotNull RemoteViews rv4, int viewId, @NotNull Dimension height) {
        if (height instanceof Dimension.Wrap) {
            rv4.setViewLayoutHeight(viewId, -2.0f, 0);
        } else if (height instanceof Dimension.Expand) {
            rv4.setViewLayoutHeight(viewId, BitmapDescriptorFactory.HUE_RED, 0);
        } else if (height instanceof Dimension.Dp) {
            rv4.setViewLayoutHeight(viewId, ((Dimension.Dp) height).getDp(), 1);
        } else if (height instanceof Dimension.Resource) {
            rv4.setViewLayoutHeightDimen(viewId, ((Dimension.Resource) height).getRes());
        } else {
            if (!Intrinsics.f(height, Dimension.Fill.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            rv4.setViewLayoutHeight(viewId, -1.0f, 0);
        }
        Unit unit = Unit.f186387a;
    }

    public final void setViewWidth(@NotNull RemoteViews rv4, int viewId, @NotNull Dimension width) {
        if (width instanceof Dimension.Wrap) {
            rv4.setViewLayoutWidth(viewId, -2.0f, 0);
        } else if (width instanceof Dimension.Expand) {
            rv4.setViewLayoutWidth(viewId, BitmapDescriptorFactory.HUE_RED, 0);
        } else if (width instanceof Dimension.Dp) {
            rv4.setViewLayoutWidth(viewId, ((Dimension.Dp) width).getDp(), 1);
        } else if (width instanceof Dimension.Resource) {
            rv4.setViewLayoutWidthDimen(viewId, ((Dimension.Resource) width).getRes());
        } else {
            if (!Intrinsics.f(width, Dimension.Fill.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            rv4.setViewLayoutWidth(viewId, -1.0f, 0);
        }
        Unit unit = Unit.f186387a;
    }
}
