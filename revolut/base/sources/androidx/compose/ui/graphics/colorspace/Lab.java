package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "getMinValue", "(I)F", "getMaxValue", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toXy", "toZ$ui_graphics", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lab extends ColorSpace {
    public Lab(@NotNull String str, int i) {
        super(str, ColorModel.INSTANCE.m2149getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        if (component == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float v07, float v16, float v2) {
        if (v07 < BitmapDescriptorFactory.HUE_RED) {
            v07 = 0.0f;
        }
        if (v07 > 100.0f) {
            v07 = 100.0f;
        }
        if (v16 < -128.0f) {
            v16 = -128.0f;
        }
        if (v16 > 128.0f) {
            v16 = 128.0f;
        }
        float f = (v07 + 16.0f) / 116.0f;
        float f4 = (v16 * 0.002f) + f;
        float f5 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        float f6 = f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        return (((long) Float.floatToRawIntBits(f6 * illuminant.getD50Xyz$ui_graphics()[1])) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f5 * illuminant.getD50Xyz$ui_graphics()[0])) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float v07, float v16, float v2) {
        if (v07 < BitmapDescriptorFactory.HUE_RED) {
            v07 = 0.0f;
        }
        if (v07 > 100.0f) {
            v07 = 100.0f;
        }
        if (v2 < -128.0f) {
            v2 = -128.0f;
        }
        if (v2 > 128.0f) {
            v2 = 128.0f;
        }
        float f = ((v07 + 16.0f) / 116.0f) - (v2 * 0.005f);
        return (f > 0.20689656f ? f * f * f : 0.12841855f * (f - 0.13793103f)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo2153xyzaToColorJlNiLsg$ui_graphics(float x3, float y2, float z, float a7, @NotNull ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f = x3 / illuminant.getD50Xyz$ui_graphics()[0];
        float f4 = y2 / illuminant.getD50Xyz$ui_graphics()[1];
        float f5 = z / illuminant.getD50Xyz$ui_graphics()[2];
        float fCbrt = f > 0.008856452f ? (float) Math.cbrt(f) : (f * 7.787037f) + 0.13793103f;
        float fCbrt2 = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float f6 = (116.0f * fCbrt2) - 16.0f;
        float f32 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        if (f32 < -128.0f) {
            f32 = -128.0f;
        }
        if (f32 > 128.0f) {
            f32 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f6, f32, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a7, colorSpace);
    }
}
