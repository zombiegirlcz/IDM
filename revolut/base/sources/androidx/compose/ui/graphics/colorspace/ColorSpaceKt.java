package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0010\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007\u001a%\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001aO\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u001d\u001aO\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u001d\u001a?\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001e\u0010\u0019\u001a?\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020#H\u0000¢\u0006\u0004\b!\u0010$\u001a\u0017\u0010&\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010*\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b,\u0010+\u001a\u001f\u0010-\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b-\u0010+\u001a'\u00101\u001a\u00020#2\u0006\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#H\u0000¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "Landroidx/compose/ui/graphics/colorspace/Connector;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "createConnector", "connect-YBCOT_4", "connect", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "adaptation", "adapt", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "x", "a", "b", "c", "d", "g", "rcpResponse", "(DDDDDD)D", "response", "e", "f", "(DDDDDDDD)D", "absRcpResponse", "absResponse", "", "compare", "(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z", "", "([F[F)Z", "m", "inverse3x3", "([F)[F", "lhs", "rhs", "mul3x3", "([F[F)[F", "mul3x3Float3", "mul3x3Diag", "matrix", "srcWhitePoint", "dstWhitePoint", "chromaticAdaptation", "([F[F[F)[F", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ColorSpaceKt {
    public static final double absRcpResponse(double d, double d5, double d6, double d10, double d15, double d41) {
        return Math.copySign(rcpResponse(d < 0.0d ? -d : d, d5, d6, d10, d15, d41), d);
    }

    public static final double absResponse(double d, double d5, double d6, double d10, double d15, double d41) {
        return Math.copySign(response(d < 0.0d ? -d : d, d5, d6, d10, d15, d41), d);
    }

    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint, @NotNull Adaptation adaptation) {
        if (ColorModel.m2145equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m2150getRgbxdoWZVw())) {
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics(), whitePoint.toXyz$ui_graphics()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i, Object obj2) {
        if ((i & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @NotNull
    public static final float[] chromaticAdaptation(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(@NotNull WhitePoint whitePoint, @NotNull WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    @NotNull
    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m2154connectYBCOT_4(@NotNull ColorSpace colorSpace, @NotNull ColorSpace colorSpace2, int i) {
        int id$ui_graphics = colorSpace.getId();
        int id$ui_graphics2 = colorSpace2.getId();
        if ((id$ui_graphics | id$ui_graphics2) < 0) {
            return m2156createConnectorYBCOT_4(colorSpace, colorSpace2, i);
        }
        MutableIntObjectMap<Connector> connectors = ConnectorKt.getConnectors();
        int i2 = id$ui_graphics | (id$ui_graphics2 << 6) | (i << 12);
        Connector connectorM2156createConnectorYBCOT_4 = connectors.get(i2);
        if (connectorM2156createConnectorYBCOT_4 == null) {
            connectorM2156createConnectorYBCOT_4 = m2156createConnectorYBCOT_4(colorSpace, colorSpace2, i);
            connectors.set(i2, connectorM2156createConnectorYBCOT_4);
        }
        return connectorM2156createConnectorYBCOT_4;
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m2155connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = RenderIntent.INSTANCE.m2164getPerceptualuksYyKA();
        }
        return m2154connectYBCOT_4(colorSpace, colorSpace2, i);
    }

    /* JADX INFO: renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m2156createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        if (colorSpace == colorSpace2) {
            return Connector.INSTANCE.identity$ui_graphics(colorSpace);
        }
        long jM2152getModelxdoWZVw = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return (ColorModel.m2145equalsimpl0(jM2152getModelxdoWZVw, companion.m2150getRgbxdoWZVw()) && ColorModel.m2145equalsimpl0(colorSpace2.getModel(), companion.m2150getRgbxdoWZVw())) ? new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i, defaultConstructorMarker) : new Connector(colorSpace, colorSpace2, i, defaultConstructorMarker);
    }

    @NotNull
    public static final float[] inverse3x3(@NotNull float[] fArr) {
        float f = fArr[0];
        float f4 = fArr[3];
        float f5 = fArr[6];
        float f6 = fArr[1];
        float f32 = fArr[4];
        float f35 = fArr[7];
        float f36 = fArr[2];
        float f37 = fArr[5];
        float f41 = fArr[8];
        float f42 = (f32 * f41) - (f35 * f37);
        float f57 = (f35 * f36) - (f6 * f41);
        float f69 = (f6 * f37) - (f32 * f36);
        float f75 = (f5 * f69) + (f4 * f57) + (f * f42);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f42 / f75;
        fArr2[1] = f57 / f75;
        fArr2[2] = f69 / f75;
        fArr2[3] = b.a(f4, f41, f5 * f37, f75);
        fArr2[4] = b.a(f5, f36, f41 * f, f75);
        fArr2[5] = b.a(f, f37, f36 * f4, f75);
        fArr2[6] = b.a(f5, f32, f4 * f35, f75);
        fArr2[7] = b.a(f, f35, f5 * f6, f75);
        fArr2[8] = b.a(f4, f6, f * f32, f75);
        return fArr2;
    }

    @NotNull
    public static final float[] mul3x3(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f4 = fArr[3];
        float f5 = fArr2[1];
        float f6 = fArr[6];
        float f32 = fArr2[2];
        fArr3[0] = (f6 * f32) + (f4 * f5) + f;
        float f35 = fArr[1];
        float f36 = fArr2[0];
        float f37 = fArr[4];
        float f41 = fArr[7];
        float f42 = f41 * f32;
        fArr3[1] = f42 + (f5 * f37) + (f35 * f36);
        float f57 = fArr[2] * f36;
        float f69 = fArr[5];
        float f75 = (fArr2[1] * f69) + f57;
        float f77 = fArr[8];
        fArr3[2] = (f32 * f77) + f75;
        float f81 = fArr[0];
        float f82 = fArr2[3] * f81;
        float f93 = fArr2[4];
        float f94 = (f4 * f93) + f82;
        float f99 = fArr2[5];
        fArr3[3] = (f6 * f99) + f94;
        float f100 = fArr[1];
        float f101 = fArr2[3];
        float f102 = f37 * f93;
        fArr3[4] = (f41 * f99) + f102 + (f100 * f101);
        float f103 = fArr[2];
        float f104 = f99 * f77;
        fArr3[5] = f104 + (f69 * fArr2[4]) + (f101 * f103);
        float f105 = f81 * fArr2[6];
        float f106 = fArr[3];
        float f107 = fArr2[7];
        float f108 = (f106 * f107) + f105;
        float f109 = fArr2[8];
        fArr3[6] = (f6 * f109) + f108;
        float f110 = fArr2[6];
        float f111 = f41 * f109;
        fArr3[7] = f111 + (fArr[4] * f107) + (f100 * f110);
        float f112 = f77 * f109;
        fArr3[8] = f112 + (fArr[5] * fArr2[7]) + (f103 * f110);
        return fArr3;
    }

    @NotNull
    public static final float[] mul3x3Diag(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f = fArr[0];
        float f4 = fArr2[0] * f;
        float f5 = fArr[1];
        float f6 = fArr2[1] * f5;
        float f32 = fArr[2];
        return new float[]{f4, f6, fArr2[2] * f32, fArr2[3] * f, fArr2[4] * f5, fArr2[5] * f32, f * fArr2[6], f5 * fArr2[7], f32 * fArr2[8]};
    }

    @NotNull
    public static final float[] mul3x3Float3(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f4 = fArr2[1];
        float f5 = fArr2[2];
        fArr2[0] = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f);
        return fArr2;
    }

    public static final double rcpResponse(double d, double d5, double d6, double d10, double d15, double d41) {
        return d >= d15 * d10 ? (Math.pow(d, 1.0d / d41) - d6) / d5 : d / d10;
    }

    public static final double response(double d, double d5, double d6, double d10, double d15, double d41) {
        return d >= d15 ? Math.pow((d5 * d) + d6, d41) : d10 * d;
    }

    public static final boolean compare(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final double rcpResponse(double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68) {
        return d >= d15 * d10 ? (Math.pow(d - d41, 1.0d / d68) - d6) / d5 : (d - d51) / d10;
    }

    public static final double response(double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68) {
        return d >= d15 ? Math.pow((d5 * d) + d6, d68) + d41 : (d10 * d) + d51;
    }
}
