package androidx.glance.appwidget.translators;

import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.ResourceColorProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/translators/ImageTranslatorApi31Impl;", "", "()V", "applyTintColorFilter", "", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "rv", "Landroid/widget/RemoteViews;", "colorProvider", "Landroidx/glance/unit/ColorProvider;", "viewId", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ImageTranslatorApi31Impl {

    @NotNull
    public static final ImageTranslatorApi31Impl INSTANCE = new ImageTranslatorApi31Impl();

    private ImageTranslatorApi31Impl() {
    }

    public final void applyTintColorFilter(@NotNull TranslationContext translationContext, @NotNull RemoteViews rv4, @NotNull ColorProvider colorProvider, int viewId) {
        if (colorProvider instanceof ResourceColorProvider) {
            RemoteViewsCompat.setImageViewColorFilterResource(rv4, viewId, ((ResourceColorProvider) colorProvider).getResId());
        } else {
            RemoteViewsCompat.setImageViewColorFilter(rv4, viewId, ColorKt.m2002toArgb8_81llA(colorProvider.mo3583getColorvNxB06k(translationContext.getContext())));
        }
    }
}
