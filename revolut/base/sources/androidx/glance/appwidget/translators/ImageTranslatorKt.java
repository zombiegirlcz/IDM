package androidx.glance.appwidget.translators;

import android.graphics.Color;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.ColorFilterParams;
import androidx.glance.EmittableImage;
import androidx.glance.ImageKt;
import androidx.glance.TintColorFilterParams;
import androidx.glance.appwidget.InsertedViewInfo;
import androidx.glance.appwidget.LayoutType;
import androidx.glance.appwidget.TintAndAlphaColorFilterParams;
import androidx.glance.appwidget.TranslationContext;
import androidx.glance.layout.ContentScale;
import androidx.glance.unit.ColorProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/widget/RemoteViews;", "Landroidx/glance/appwidget/TranslationContext;", "translationContext", "Landroidx/glance/EmittableImage;", "element", "", "translateEmittableImage", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/EmittableImage;)V", "Landroidx/glance/appwidget/LayoutType;", "getLayoutSelector", "(Landroidx/glance/EmittableImage;)Landroidx/glance/appwidget/LayoutType;", "rv", "Landroidx/glance/ColorFilterParams;", "colorFilterParams", "Landroidx/glance/appwidget/InsertedViewInfo;", "viewDef", "applyColorFilter", "(Landroidx/glance/appwidget/TranslationContext;Landroid/widget/RemoteViews;Landroidx/glance/ColorFilterParams;Landroidx/glance/appwidget/InsertedViewInfo;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ImageTranslatorKt {
    private static final void applyColorFilter(TranslationContext translationContext, RemoteViews remoteViews, ColorFilterParams colorFilterParams, InsertedViewInfo insertedViewInfo) {
        if (colorFilterParams instanceof TintColorFilterParams) {
            ColorProvider colorProvider = ((TintColorFilterParams) colorFilterParams).getColorProvider();
            if (Build.VERSION.SDK_INT >= 31) {
                ImageTranslatorApi31Impl.INSTANCE.applyTintColorFilter(translationContext, remoteViews, colorProvider, insertedViewInfo.getMainViewId());
                return;
            } else {
                RemoteViewsCompat.setImageViewColorFilter(remoteViews, insertedViewInfo.getMainViewId(), ColorKt.m2002toArgb8_81llA(colorProvider.mo3583getColorvNxB06k(translationContext.getContext())));
                return;
            }
        }
        if (!(colorFilterParams instanceof TintAndAlphaColorFilterParams)) {
            throw new IllegalArgumentException("An unsupported ColorFilter was used.");
        }
        if (Build.VERSION.SDK_INT > 30) {
            throw new IllegalStateException("There is no use case yet to support this colorFilter in S+ versions.");
        }
        int iM2002toArgb8_81llA = ColorKt.m2002toArgb8_81llA(((TintAndAlphaColorFilterParams) colorFilterParams).getColorProvider().mo3583getColorvNxB06k(translationContext.getContext()));
        RemoteViewsCompat.setImageViewColorFilter(remoteViews, insertedViewInfo.getMainViewId(), iM2002toArgb8_81llA);
        RemoteViewsCompat.setImageViewImageAlpha(remoteViews, insertedViewInfo.getMainViewId(), Color.alpha(iM2002toArgb8_81llA));
    }

    private static final LayoutType getLayoutSelector(EmittableImage emittableImage) {
        boolean zIsDecorative = ImageKt.isDecorative(emittableImage);
        int contentScale = emittableImage.getContentScale();
        ContentScale.Companion companion = ContentScale.INSTANCE;
        if (ContentScale.m3543equalsimpl0(contentScale, companion.m3547getCropAe3V0ko())) {
            return zIsDecorative ? LayoutType.ImageCropDecorative : LayoutType.ImageCrop;
        }
        if (ContentScale.m3543equalsimpl0(contentScale, companion.m3549getFitAe3V0ko())) {
            return zIsDecorative ? LayoutType.ImageFitDecorative : LayoutType.ImageFit;
        }
        if (ContentScale.m3543equalsimpl0(contentScale, companion.m3548getFillBoundsAe3V0ko())) {
            return zIsDecorative ? LayoutType.ImageFillBoundsDecorative : LayoutType.ImageFillBounds;
        }
        String str = "Unsupported ContentScale user: " + ((Object) ContentScale.m3545toStringimpl(emittableImage.getContentScale()));
        return LayoutType.ImageFit;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void translateEmittableImage(@org.jetbrains.annotations.NotNull android.widget.RemoteViews r3, @org.jetbrains.annotations.NotNull androidx.glance.appwidget.TranslationContext r4, @org.jetbrains.annotations.NotNull androidx.glance.EmittableImage r5) {
        /*
            androidx.glance.appwidget.LayoutType r0 = getLayoutSelector(r5)
            androidx.glance.GlanceModifier r1 = r5.getModifier()
            androidx.glance.appwidget.InsertedViewInfo r0 = androidx.glance.appwidget.LayoutSelectionKt.insertView(r3, r4, r0, r1)
            androidx.glance.ImageProvider r1 = r5.getProvider()
            boolean r2 = r1 instanceof androidx.glance.AndroidResourceImageProvider
            if (r2 == 0) goto L22
            int r2 = r0.getMainViewId()
            androidx.glance.AndroidResourceImageProvider r1 = (androidx.glance.AndroidResourceImageProvider) r1
            int r1 = r1.getResId()
            r3.setImageViewResource(r2, r1)
            goto L33
        L22:
            boolean r2 = r1 instanceof androidx.glance.BitmapImageProvider
            if (r2 == 0) goto L93
            int r2 = r0.getMainViewId()
            androidx.glance.BitmapImageProvider r1 = (androidx.glance.BitmapImageProvider) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            r3.setImageViewBitmap(r2, r1)
        L33:
            androidx.glance.ColorFilterParams r1 = r5.getColorFilterParams()
            if (r1 == 0) goto L3c
            applyColorFilter(r4, r3, r1, r0)
        L3c:
            androidx.glance.GlanceModifier r1 = r5.getModifier()
            androidx.glance.appwidget.ApplyModifiersKt.applyModifiers(r4, r3, r1, r0)
            int r4 = r5.getContentScale()
            androidx.glance.layout.ContentScale$Companion r1 = androidx.glance.layout.ContentScale.INSTANCE
            int r1 = r1.m3549getFitAe3V0ko()
            boolean r4 = androidx.glance.layout.ContentScale.m3543equalsimpl0(r4, r1)
            if (r4 == 0) goto L8a
            androidx.glance.GlanceModifier r4 = r5.getModifier()
            androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1 r1 = androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1.INSTANCE
            r2 = 0
            java.lang.Object r4 = r4.foldIn(r2, r1)
            androidx.glance.layout.WidthModifier r4 = (androidx.glance.layout.WidthModifier) r4
            if (r4 == 0) goto L67
            androidx.glance.unit.Dimension r4 = r4.getWidth()
            goto L68
        L67:
            r4 = r2
        L68:
            androidx.glance.unit.Dimension$Wrap r1 = androidx.glance.unit.Dimension.Wrap.INSTANCE
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r1)
            if (r4 != 0) goto L88
            androidx.glance.GlanceModifier r4 = r5.getModifier()
            androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$2 r5 = androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$2.INSTANCE
            java.lang.Object r4 = r4.foldIn(r2, r5)
            androidx.glance.layout.HeightModifier r4 = (androidx.glance.layout.HeightModifier) r4
            if (r4 == 0) goto L82
            androidx.glance.unit.Dimension r2 = r4.getHeight()
        L82:
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r2, r1)
            if (r4 == 0) goto L8a
        L88:
            r4 = 1
            goto L8b
        L8a:
            r4 = 0
        L8b:
            int r5 = r0.getMainViewId()
            androidx.core.widget.RemoteViewsCompat.setImageViewAdjustViewBounds(r3, r5, r4)
            return
        L93:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "An unsupported ImageProvider type was used."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.translators.ImageTranslatorKt.translateEmittableImage(android.widget.RemoteViews, androidx.glance.appwidget.TranslationContext, androidx.glance.EmittableImage):void");
    }
}
