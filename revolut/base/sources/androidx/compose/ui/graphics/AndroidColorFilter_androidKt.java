package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u000b\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0010\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u0001j\u0002`\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016*\f\b\u0000\u0010\u0017\"\u00020\u00012\u00020\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "Landroid/graphics/ColorFilter;", "asAndroidColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "actualTintColorFilter-xETnrds", "(JI)Landroid/graphics/ColorFilter;", "actualTintColorFilter", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroid/graphics/ColorFilter;", "actualColorMatrixColorFilter", "filter", "actualColorMatrixFromFilter", "(Landroid/graphics/ColorFilter;)[F", "", "supportsColorMatrixQuery", "()Z", "NativeColorFilter", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidColorFilter_androidKt {
    @NotNull
    /* JADX INFO: renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m1888actualColorMatrixColorFilterjHGOpc(@NotNull float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    @NotNull
    public static final float[] actualColorMatrixFromFilter(@NotNull android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m2007getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    @NotNull
    /* JADX INFO: renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m1889actualTintColorFilterxETnrds(long j2, int i) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m1957BlendModeColorFilterxETnrds(j2, i) : new PorterDuffColorFilter(ColorKt.m2002toArgb8_81llA(j2), AndroidBlendMode_androidKt.m1879toPorterDuffModes9anfk8(i));
    }

    @NotNull
    public static final android.graphics.ColorFilter asAndroidColorFilter(@NotNull ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter();
    }

    public static final boolean supportsColorMatrixQuery() {
        return true;
    }
}
