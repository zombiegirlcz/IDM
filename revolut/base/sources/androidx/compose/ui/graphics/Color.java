package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import yhm.w;
import zi0.c;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087@\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001a\u0010\u0014\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0015\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u0016\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010&R\u001a\u0010\u0013\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010&\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lyhm/w;", "value", "constructor-impl", "(J)J", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "()V", "getRed-impl", "(J)F", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Color {
    private final long value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(BodyPartID.bodyIdMax);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ColorSpaces.INSTANCE.getUnspecified$ui_graphics());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m1987getBlack0d7_KjU() {
            return Color.Black;
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m1988getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m1989getGray0d7_KjU() {
            return Color.Gray;
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m1990getGreen0d7_KjU() {
            return Color.Green;
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m1991getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m1992getRed0d7_KjU() {
            return Color.Red;
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m1993getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m1994getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m1995getWhite0d7_KjU() {
            return Color.White;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m1972boximpl(long j2) {
        return new Color(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1973constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m1974convertvNxB06k(long j2, @NotNull ColorSpace colorSpace) {
        return ColorSpaceKt.m2155connectYBCOT_4$default(m1981getColorSpaceimpl(j2), colorSpace, 0, 2, null).mo2157transformToColorl2rxGTc$ui_graphics(j2);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m1975copywmQWz5c(long j2, float f, float f4, float f5, float f6) {
        return ColorKt.Color(f4, f5, f6, f, m1981getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m1976copywmQWz5c$default(long j2, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = m1979getAlphaimpl(j2);
        }
        float f32 = f;
        if ((i & 2) != 0) {
            f4 = m1983getRedimpl(j2);
        }
        float f35 = f4;
        if ((i & 4) != 0) {
            f5 = m1982getGreenimpl(j2);
        }
        float f36 = f5;
        if ((i & 8) != 0) {
            f6 = m1980getBlueimpl(j2);
        }
        return m1975copywmQWz5c(j2, f32, f35, f36, f6);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1977equalsimpl(long j2, Object obj2) {
        return (obj2 instanceof Color) && j2 == ((Color) obj2).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1978equalsimpl0(long j2, long j3) {
        w.Companion aVar = w.INSTANCE;
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m1979getAlphaimpl(long j2) {
        float fC0;
        float f;
        long j3 = 63 & j2;
        w.Companion aVar = w.INSTANCE;
        if (j3 == 0) {
            fC0 = (float) c.c0((j2 >>> 56) & 255);
            f = 255.0f;
        } else {
            fC0 = (float) c.c0((j2 >>> 6) & 1023);
            f = 1023.0f;
        }
        return fC0 / f;
    }

    /* JADX INFO: renamed from: getBlue-impl, reason: not valid java name */
    public static final float m1980getBlueimpl(long j2) {
        int i;
        int i2;
        int i3;
        long j3 = 63 & j2;
        w.Companion aVar = w.INSTANCE;
        if (j3 == 0) {
            return ((float) c.c0((j2 >>> 32) & 255)) / 255.0f;
        }
        short s2 = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i21 = s2 & 1023;
        if (i6 != 0) {
            int i22 = i21 << 13;
            if (i6 == 31) {
                i = 255;
                if (i22 != 0) {
                    i22 |= 4194304;
                }
            } else {
                i = i6 + 112;
            }
            int i32 = i;
            i2 = i22;
            i3 = i32;
        } else {
            if (i21 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i21 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i5 << 16) | i2);
    }

    @NotNull
    /* JADX INFO: renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m1981getColorSpaceimpl(long j2) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        w.Companion aVar = w.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics()[(int) (j2 & 63)];
    }

    /* JADX INFO: renamed from: getGreen-impl, reason: not valid java name */
    public static final float m1982getGreenimpl(long j2) {
        int i;
        int i2;
        int i3;
        long j3 = 63 & j2;
        w.Companion aVar = w.INSTANCE;
        if (j3 == 0) {
            return ((float) c.c0((j2 >>> 40) & 255)) / 255.0f;
        }
        short s2 = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i21 = s2 & 1023;
        if (i6 != 0) {
            int i22 = i21 << 13;
            if (i6 == 31) {
                i = 255;
                if (i22 != 0) {
                    i22 |= 4194304;
                }
            } else {
                i = i6 + 112;
            }
            int i32 = i;
            i2 = i22;
            i3 = i32;
        } else {
            if (i21 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i21 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i5 << 16) | i2);
    }

    /* JADX INFO: renamed from: getRed-impl, reason: not valid java name */
    public static final float m1983getRedimpl(long j2) {
        int i;
        int i2;
        int i3;
        long j3 = 63 & j2;
        w.Companion aVar = w.INSTANCE;
        if (j3 == 0) {
            return ((float) c.c0((j2 >>> 48) & 255)) / 255.0f;
        }
        short s2 = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s2;
        int i6 = ((65535 & s2) >>> 10) & 31;
        int i21 = s2 & 1023;
        if (i6 != 0) {
            int i22 = i21 << 13;
            if (i6 == 31) {
                i = 255;
                if (i22 != 0) {
                    i22 |= 4194304;
                }
            } else {
                i = i6 + 112;
            }
            int i32 = i;
            i2 = i22;
            i3 = i32;
        } else {
            if (i21 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i21 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i5 << 16) | i2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1984hashCodeimpl(long j2) {
        w.Companion aVar = w.INSTANCE;
        return Long.hashCode(j2);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1985toStringimpl(long j2) {
        return "Color(" + m1983getRedimpl(j2) + ", " + m1982getGreenimpl(j2) + ", " + m1980getBlueimpl(j2) + ", " + m1979getAlphaimpl(j2) + ", " + m1981getColorSpaceimpl(j2).getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object other) {
        return m1977equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m1984hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1985toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
