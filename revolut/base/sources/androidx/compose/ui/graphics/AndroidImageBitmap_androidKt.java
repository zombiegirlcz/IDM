package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0007*\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/graphics/Bitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "asImageBitmap", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "ActualImageBitmap", "asAndroidBitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toBitmapConfig", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidImageBitmap_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m1891ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, @NotNull ColorSpace colorSpace) {
        m1892toBitmapConfig1JJdX4A(i3);
        return new AndroidImageBitmap(Bitmap.createBitmap((DisplayMetrics) null, i, i2, m1892toBitmapConfig1JJdX4A(i3), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace)));
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    @NotNull
    /* JADX INFO: renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m1892toBitmapConfig1JJdX4A(int i) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.INSTANCE;
        return ImageBitmapConfig.m2037equalsimpl0(i, companion.m2042getArgb8888_sVssgQ()) ? Bitmap.Config.ARGB_8888 : ImageBitmapConfig.m2037equalsimpl0(i, companion.m2041getAlpha8_sVssgQ()) ? Bitmap.Config.ALPHA_8 : ImageBitmapConfig.m2037equalsimpl0(i, companion.m2045getRgb565_sVssgQ()) ? Bitmap.Config.RGB_565 : ImageBitmapConfig.m2037equalsimpl0(i, companion.m2043getF16_sVssgQ()) ? Bitmap.Config.RGBA_F16 : ImageBitmapConfig.m2037equalsimpl0(i, companion.m2044getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ImageBitmapConfig.INSTANCE.m2041getAlpha8_sVssgQ() : config == Bitmap.Config.RGB_565 ? ImageBitmapConfig.INSTANCE.m2045getRgb565_sVssgQ() : config == Bitmap.Config.ARGB_4444 ? ImageBitmapConfig.INSTANCE.m2042getArgb8888_sVssgQ() : config == Bitmap.Config.RGBA_F16 ? ImageBitmapConfig.INSTANCE.m2043getF16_sVssgQ() : config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.INSTANCE.m2044getGpu_sVssgQ() : ImageBitmapConfig.INSTANCE.m2042getArgb8888_sVssgQ();
    }
}
