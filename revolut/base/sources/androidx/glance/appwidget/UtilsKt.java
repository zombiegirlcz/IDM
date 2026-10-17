package androidx.glance.appwidget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.compose.ui.unit.Dp;
import androidx.core.widget.RemoteViewsCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\t\u001a\u001e\u0010\n\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0012\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Landroid/content/Context;", "context", "", "toPixels-D5KLDUw", "(FLandroid/content/Context;)I", "toPixels", "Landroid/util/DisplayMetrics;", "displayMetrics", "(FLandroid/util/DisplayMetrics;)I", "pixelsToDp", "(ILandroid/util/DisplayMetrics;)F", "Landroid/widget/RemoteViews;", "Landroidx/glance/appwidget/TranslationContext;", "translationContext", "viewStubId", "layoutId", "inflatedId", "inflateViewStub", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;IILjava/lang/Integer;)I", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class UtilsKt {
    public static final int inflateViewStub(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, int i, int i2, Integer num) {
        if (i == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int iIntValue = num != null ? num.intValue() : translationContext.nextViewId();
        if (iIntValue != -1) {
            RemoteViewsCompat.setViewStubInflatedId(remoteViews, i, iIntValue);
        }
        if (i2 != 0) {
            RemoteViewsCompat.setViewStubLayoutResource(remoteViews, i, i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static /* synthetic */ int inflateViewStub$default(RemoteViews remoteViews, TranslationContext translationContext, int i, int i2, Integer num, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        return inflateViewStub(remoteViews, translationContext, i, i2, num);
    }

    public static final float pixelsToDp(int i, @NotNull DisplayMetrics displayMetrics) {
        return Dp.m3297constructorimpl(i / displayMetrics.density);
    }

    /* JADX INFO: renamed from: toPixels-D5KLDUw, reason: not valid java name */
    public static final int m3505toPixelsD5KLDUw(float f, @NotNull Context context) {
        return m3506toPixelsD5KLDUw(f, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: toPixels-D5KLDUw, reason: not valid java name */
    public static final int m3506toPixelsD5KLDUw(float f, @NotNull DisplayMetrics displayMetrics) {
        return (int) TypedValue.applyDimension(1, f, displayMetrics);
    }
}
