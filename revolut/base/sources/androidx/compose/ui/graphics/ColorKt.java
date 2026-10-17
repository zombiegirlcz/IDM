package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import yhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\r\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a7\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0010\u001a)\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001d\u001a\u00020\u0000*\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010 \u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "UncheckedColor", "", "color", "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "luminance-8_81llA", "(J)F", "luminance", "toArgb-8_81llA", "(J)I", "toArgb", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r21, float r22, float r23, float r24, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r25) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f, float f4, float f5, float f6, ColorSpace colorSpace, int i, Object obj2) {
        if ((i & 8) != 0) {
            f6 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f4, f5, f6, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1999compositeOverOWjLjI(long j2, long j3) {
        float f;
        float f4;
        long jM1974convertvNxB06k = Color.m1974convertvNxB06k(j2, Color.m1981getColorSpaceimpl(j3));
        float fM1979getAlphaimpl = Color.m1979getAlphaimpl(j3);
        float fM1979getAlphaimpl2 = Color.m1979getAlphaimpl(jM1974convertvNxB06k);
        float f5 = 1.0f - fM1979getAlphaimpl2;
        float f6 = (fM1979getAlphaimpl * f5) + fM1979getAlphaimpl2;
        float fM1983getRedimpl = Color.m1983getRedimpl(jM1974convertvNxB06k);
        float fM1983getRedimpl2 = Color.m1983getRedimpl(j3);
        float f32 = BitmapDescriptorFactory.HUE_RED;
        if (f6 == BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else {
            f = (((fM1983getRedimpl2 * fM1979getAlphaimpl) * f5) + (fM1983getRedimpl * fM1979getAlphaimpl2)) / f6;
        }
        float fM1982getGreenimpl = Color.m1982getGreenimpl(jM1974convertvNxB06k);
        float fM1982getGreenimpl2 = Color.m1982getGreenimpl(j3);
        if (f6 == BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        } else {
            f4 = (((fM1982getGreenimpl2 * fM1979getAlphaimpl) * f5) + (fM1982getGreenimpl * fM1979getAlphaimpl2)) / f6;
        }
        float fM1980getBlueimpl = Color.m1980getBlueimpl(jM1974convertvNxB06k);
        float fM1980getBlueimpl2 = Color.m1980getBlueimpl(j3);
        if (f6 != BitmapDescriptorFactory.HUE_RED) {
            f32 = (((fM1980getBlueimpl2 * fM1979getAlphaimpl) * f5) + (fM1980getBlueimpl * fM1979getAlphaimpl2)) / f6;
        }
        return UncheckedColor(f, f4, f32, f6, Color.m1981getColorSpaceimpl(j3));
    }

    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m2000lerpjxsXWHM(long j2, long j3, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM1974convertvNxB06k = Color.m1974convertvNxB06k(j2, oklab);
        long jM1974convertvNxB06k2 = Color.m1974convertvNxB06k(j3, oklab);
        float fM1979getAlphaimpl = Color.m1979getAlphaimpl(jM1974convertvNxB06k);
        float fM1983getRedimpl = Color.m1983getRedimpl(jM1974convertvNxB06k);
        float fM1982getGreenimpl = Color.m1982getGreenimpl(jM1974convertvNxB06k);
        float fM1980getBlueimpl = Color.m1980getBlueimpl(jM1974convertvNxB06k);
        float fM1979getAlphaimpl2 = Color.m1979getAlphaimpl(jM1974convertvNxB06k2);
        float fM1983getRedimpl2 = Color.m1983getRedimpl(jM1974convertvNxB06k2);
        float fM1982getGreenimpl2 = Color.m1982getGreenimpl(jM1974convertvNxB06k2);
        float fM1980getBlueimpl2 = Color.m1980getBlueimpl(jM1974convertvNxB06k2);
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m1974convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM1983getRedimpl, fM1983getRedimpl2, f), MathHelpersKt.lerp(fM1982getGreenimpl, fM1982getGreenimpl2, f), MathHelpersKt.lerp(fM1980getBlueimpl, fM1980getBlueimpl2, f), MathHelpersKt.lerp(fM1979getAlphaimpl, fM1979getAlphaimpl2, f), oklab), Color.m1981getColorSpaceimpl(j3));
    }

    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m2001luminance8_81llA(long j2) {
        ColorSpace colorSpaceM1981getColorSpaceimpl = Color.m1981getColorSpaceimpl(j2);
        if (!ColorModel.m2145equalsimpl0(colorSpaceM1981getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m2150getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m2148toStringimpl(colorSpaceM1981getColorSpaceimpl.getModel())));
        }
        DoubleFunction eotfFunc$ui_graphics = ((Rgb) colorSpaceM1981getColorSpaceimpl).getEotfFunc();
        double dInvoke = eotfFunc$ui_graphics.invoke(Color.m1983getRedimpl(j2));
        float fInvoke = (float) ((eotfFunc$ui_graphics.invoke(Color.m1980getBlueimpl(j2)) * 0.0722d) + (eotfFunc$ui_graphics.invoke(Color.m1982getGreenimpl(j2)) * 0.7152d) + (dInvoke * 0.2126d));
        if (fInvoke < BitmapDescriptorFactory.HUE_RED) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m2002toArgb8_81llA(long j2) {
        long jM1974convertvNxB06k = Color.m1974convertvNxB06k(j2, ColorSpaces.INSTANCE.getSrgb()) >>> 32;
        w.Companion aVar = w.INSTANCE;
        return (int) jM1974convertvNxB06k;
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i5, int i6, Object obj2) {
        if ((i6 & 8) != 0) {
            i5 = 255;
        }
        return Color(i, i2, i3, i5);
    }

    public static final long Color(int i) {
        long j2 = i;
        w.Companion aVar = w.INSTANCE;
        return Color.m1973constructorimpl(j2 << 32);
    }

    public static final long Color(long j2) {
        w.Companion aVar = w.INSTANCE;
        return Color.m1973constructorimpl(j2 << 32);
    }

    public static final long Color(int i, int i2, int i3, int i5) {
        return Color(((i & 255) << 16) | ((i5 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
