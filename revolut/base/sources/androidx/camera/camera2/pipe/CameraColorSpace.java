package androidx.camera.camera2.pipe;

import android.graphics.ColorSpace;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/CameraColorSpace;", "", "", "colorSpaceName", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/graphics/ColorSpace$Named;", "toColorSpaceNamed-impl", "(Ljava/lang/String;)Landroid/graphics/ColorSpace$Named;", "toColorSpaceNamed", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CameraColorSpace {

    @NotNull
    private static final String UNKNOWN = m113constructorimpl("UNKNOWN");

    @NotNull
    private static final String SRGB = m113constructorimpl("SRGB");

    @NotNull
    private static final String LINEAR_SRGB = m113constructorimpl("LINEAR_SRGB");

    @NotNull
    private static final String EXTENDED_SRGB = m113constructorimpl("EXTENDED_SRGB");

    @NotNull
    private static final String LINEAR_EXTENDED_SRGB = m113constructorimpl("LINEAR_EXTENDED_SRGB");

    @NotNull
    private static final String BT709 = m113constructorimpl("BT709");

    @NotNull
    private static final String BT2020 = m113constructorimpl("BT2020");

    @NotNull
    private static final String DCI_P3 = m113constructorimpl("DCI_P3");

    @NotNull
    private static final String DISPLAY_P3 = m113constructorimpl("DISPLAY_P3");

    @NotNull
    private static final String NTSC_1953 = m113constructorimpl("NTSC_1953");

    @NotNull
    private static final String SMPTE_C = m113constructorimpl("SMPTE_C");

    @NotNull
    private static final String ADOBE_RGB = m113constructorimpl("ADOBE_RGB");

    @NotNull
    private static final String PRO_PHOTO_RGB = m113constructorimpl("PRO_PHOTO_RGB");

    @NotNull
    private static final String ACES = m113constructorimpl("ACES");

    @NotNull
    private static final String ACESCG = m113constructorimpl("ACESCG");

    @NotNull
    private static final String CIE_XYZ = m113constructorimpl("CIE_XYZ");

    @NotNull
    private static final String CIE_LAB = m113constructorimpl("CIE_LAB");

    @NotNull
    private static final String BT2020_HLG = m113constructorimpl("BT2020_HLG");

    @NotNull
    private static final String BT2020_PQ = m113constructorimpl("BT2020_PQ");

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static String m113constructorimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m114equalsimpl0(String str, String str2) {
        return Intrinsics.f(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m115hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toColorSpaceNamed-impl, reason: not valid java name */
    public static final ColorSpace.Named m116toColorSpaceNamedimpl(String str) {
        if (m114equalsimpl0(str, UNKNOWN)) {
            return null;
        }
        if (m114equalsimpl0(str, SRGB)) {
            return ColorSpace.Named.SRGB;
        }
        if (m114equalsimpl0(str, LINEAR_SRGB)) {
            return ColorSpace.Named.LINEAR_SRGB;
        }
        if (m114equalsimpl0(str, EXTENDED_SRGB)) {
            return ColorSpace.Named.EXTENDED_SRGB;
        }
        if (m114equalsimpl0(str, LINEAR_EXTENDED_SRGB)) {
            return ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        }
        if (m114equalsimpl0(str, BT709)) {
            return ColorSpace.Named.BT709;
        }
        if (m114equalsimpl0(str, BT2020)) {
            return ColorSpace.Named.BT2020;
        }
        if (m114equalsimpl0(str, DCI_P3)) {
            return ColorSpace.Named.DCI_P3;
        }
        if (m114equalsimpl0(str, DISPLAY_P3)) {
            return ColorSpace.Named.DISPLAY_P3;
        }
        if (m114equalsimpl0(str, NTSC_1953)) {
            return ColorSpace.Named.NTSC_1953;
        }
        if (m114equalsimpl0(str, SMPTE_C)) {
            return ColorSpace.Named.SMPTE_C;
        }
        if (m114equalsimpl0(str, ADOBE_RGB)) {
            return ColorSpace.Named.ADOBE_RGB;
        }
        if (m114equalsimpl0(str, PRO_PHOTO_RGB)) {
            return ColorSpace.Named.PRO_PHOTO_RGB;
        }
        if (m114equalsimpl0(str, ACES)) {
            return ColorSpace.Named.ACES;
        }
        if (m114equalsimpl0(str, ACESCG)) {
            return ColorSpace.Named.ACESCG;
        }
        if (m114equalsimpl0(str, CIE_XYZ)) {
            return ColorSpace.Named.CIE_XYZ;
        }
        if (m114equalsimpl0(str, CIE_LAB)) {
            return ColorSpace.Named.CIE_LAB;
        }
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (m114equalsimpl0(str, BT2020_HLG)) {
            return ColorSpace.Named.BT2020_HLG;
        }
        if (m114equalsimpl0(str, BT2020_PQ)) {
            return ColorSpace.Named.BT2020_PQ;
        }
        return null;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m117toStringimpl(String str) {
        return a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "CameraColorSpace(colorSpaceName=", str);
    }
}
