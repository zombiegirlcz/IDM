package androidx.compose.ui.graphics.colorspace;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kx7.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010+\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010-\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010/\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u00101\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0017\u00103\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u0017\u00105\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u0017\u00107\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R\u0017\u00109\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R\u0017\u0010;\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(R\u0017\u0010=\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(R\u0017\u0010?\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b@\u0010(R\u0017\u0010A\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bA\u0010&\u001a\u0004\bB\u0010(R\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u001a\u0010J\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010(R\u0017\u0010L\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bL\u0010&\u001a\u0004\bM\u0010(R\u0017\u0010N\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bN\u0010&\u001a\u0004\bO\u0010(R\u0017\u0010P\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bP\u0010E\u001a\u0004\bQ\u0010GR \u0010S\u001a\b\u0012\u0004\u0012\u00020C0R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006W"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "params", "", "x", "transferHlgOetf$ui_graphics", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;D)D", "transferHlgOetf", "transferHlgEotf$ui_graphics", "transferHlgEotf", "transferSt2048Oetf$ui_graphics", "transferSt2048Oetf", "pq", "transferSt2048Eotf$ui_graphics", "transferSt2048Eotf", "", "SrgbPrimaries", "[F", "getSrgbPrimaries$ui_graphics", "()[F", "Ntsc1953Primaries", "getNtsc1953Primaries$ui_graphics", "Bt2020Primaries", "getBt2020Primaries$ui_graphics", "SrgbTransferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getSrgbTransferParameters$ui_graphics", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "NoneTransferParameters", "Bt2020HlgTransferParameters", "getBt2020HlgTransferParameters$ui_graphics", "Bt2020PqTransferParameters", "getBt2020PqTransferParameters$ui_graphics", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getSrgb", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "LinearSrgb", "getLinearSrgb", "ExtendedSrgb", "getExtendedSrgb", "LinearExtendedSrgb", "getLinearExtendedSrgb", "Bt709", "getBt709", "Bt2020", "getBt2020", "DciP3", "getDciP3", "DisplayP3", "getDisplayP3", "Ntsc1953", "getNtsc1953", "SmpteC", "getSmpteC", "AdobeRgb", "getAdobeRgb", "ProPhotoRgb", "getProPhotoRgb", "Aces", "getAces", "Acescg", "getAcescg", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieXyz", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieLab", "getCieLab", "Unspecified", "getUnspecified$ui_graphics", "Bt2020Hlg", "getBt2020Hlg", "Bt2020Pq", "getBt2020Pq", "Oklab", "getOklab", "", "ColorSpacesArray", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpacesArray$ui_graphics", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ColorSpaces {
    public static final int $stable;

    @NotNull
    private static final Rgb Aces;

    @NotNull
    private static final Rgb Acescg;

    @NotNull
    private static final Rgb AdobeRgb;

    @NotNull
    private static final Rgb Bt2020;

    @NotNull
    private static final Rgb Bt2020Hlg;

    @NotNull
    private static final TransferParameters Bt2020HlgTransferParameters;

    @NotNull
    private static final Rgb Bt2020Pq;

    @NotNull
    private static final TransferParameters Bt2020PqTransferParameters;

    @NotNull
    private static final float[] Bt2020Primaries;

    @NotNull
    private static final Rgb Bt709;

    @NotNull
    private static final ColorSpace CieLab;

    @NotNull
    private static final ColorSpace CieXyz;

    @NotNull
    private static final ColorSpace[] ColorSpacesArray;

    @NotNull
    private static final Rgb DciP3;

    @NotNull
    private static final Rgb DisplayP3;

    @NotNull
    private static final Rgb ExtendedSrgb;

    @NotNull
    public static final ColorSpaces INSTANCE = new ColorSpaces();

    @NotNull
    private static final Rgb LinearExtendedSrgb;

    @NotNull
    private static final Rgb LinearSrgb;

    @NotNull
    private static final TransferParameters NoneTransferParameters;

    @NotNull
    private static final Rgb Ntsc1953;

    @NotNull
    private static final float[] Ntsc1953Primaries;

    @NotNull
    private static final ColorSpace Oklab;

    @NotNull
    private static final Rgb ProPhotoRgb;

    @NotNull
    private static final Rgb SmpteC;

    @NotNull
    private static final Rgb Srgb;

    @NotNull
    private static final float[] SrgbPrimaries;

    @NotNull
    private static final TransferParameters SrgbTransferParameters;

    @NotNull
    private static final Rgb Unspecified;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        Bt2020Primaries = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020HlgTransferParameters = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Bt2020PqTransferParameters = transferParameters4;
        Illuminant illuminant = Illuminant.INSTANCE;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, illuminant.getD65(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, illuminant.getD65(), 1.0d, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, illuminant.getD65(), null, new o0(20), new o0(21), -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, illuminant.getD65(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, BitmapDescriptorFactory.HUE_RED, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, illuminant.getD65(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, illuminant.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, illuminant.getD65(), 2.2d, BitmapDescriptorFactory.HUE_RED, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, illuminant.getD50(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0E-4f, -0.077f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        CieXyz = xyz;
        Lab lab2 = new Lab("Generic L*a*b*", 15);
        CieLab = lab2;
        Rgb rgb15 = new Rgb("None", fArr, illuminant.getD65(), transferParameters2, 16);
        Unspecified = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, illuminant.getD65(), null, new o0(22), new o0(23), BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters3, 17);
        Bt2020Hlg = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, illuminant.getD65(), null, new o0(24), new o0(25), BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters4, 18);
        Bt2020Pq = rgb17;
        Oklab oklab = new Oklab("Oklab", 19);
        Oklab = oklab;
        ColorSpacesArray = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab2, rgb15, rgb16, rgb17, oklab};
        $stable = 8;
    }

    private ColorSpaces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Hlg$lambda$0(double d) {
        return INSTANCE.transferHlgOetf$ui_graphics(Bt2020HlgTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Hlg$lambda$1(double d) {
        return INSTANCE.transferHlgEotf$ui_graphics(Bt2020HlgTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Pq$lambda$0(double d) {
        return INSTANCE.transferSt2048Oetf$ui_graphics(Bt2020PqTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Bt2020Pq$lambda$1(double d) {
        return INSTANCE.transferSt2048Eotf$ui_graphics(Bt2020PqTransferParameters, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ExtendedSrgb$lambda$0(double d) {
        return ColorSpaceKt.absRcpResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double ExtendedSrgb$lambda$1(double d) {
        return ColorSpaceKt.absResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @NotNull
    public final Rgb getAces() {
        return Aces;
    }

    @NotNull
    public final Rgb getAcescg() {
        return Acescg;
    }

    @NotNull
    public final Rgb getAdobeRgb() {
        return AdobeRgb;
    }

    @NotNull
    public final Rgb getBt2020() {
        return Bt2020;
    }

    @NotNull
    public final Rgb getBt2020Hlg() {
        return Bt2020Hlg;
    }

    @NotNull
    public final Rgb getBt2020Pq() {
        return Bt2020Pq;
    }

    @NotNull
    public final Rgb getBt709() {
        return Bt709;
    }

    @NotNull
    public final ColorSpace getCieLab() {
        return CieLab;
    }

    @NotNull
    public final ColorSpace getCieXyz() {
        return CieXyz;
    }

    @NotNull
    public final ColorSpace[] getColorSpacesArray$ui_graphics() {
        return ColorSpacesArray;
    }

    @NotNull
    public final Rgb getDciP3() {
        return DciP3;
    }

    @NotNull
    public final Rgb getDisplayP3() {
        return DisplayP3;
    }

    @NotNull
    public final Rgb getExtendedSrgb() {
        return ExtendedSrgb;
    }

    @NotNull
    public final Rgb getLinearExtendedSrgb() {
        return LinearExtendedSrgb;
    }

    @NotNull
    public final Rgb getLinearSrgb() {
        return LinearSrgb;
    }

    @NotNull
    public final Rgb getNtsc1953() {
        return Ntsc1953;
    }

    @NotNull
    public final float[] getNtsc1953Primaries$ui_graphics() {
        return Ntsc1953Primaries;
    }

    @NotNull
    public final ColorSpace getOklab() {
        return Oklab;
    }

    @NotNull
    public final Rgb getProPhotoRgb() {
        return ProPhotoRgb;
    }

    @NotNull
    public final Rgb getSmpteC() {
        return SmpteC;
    }

    @NotNull
    public final Rgb getSrgb() {
        return Srgb;
    }

    @NotNull
    public final float[] getSrgbPrimaries$ui_graphics() {
        return SrgbPrimaries;
    }

    @NotNull
    public final Rgb getUnspecified$ui_graphics() {
        return Unspecified;
    }

    public final double transferHlgEotf$ui_graphics(@NotNull TransferParameters params, double x3) {
        double d = x3 < 0.0d ? -1.0d : 1.0d;
        double d5 = x3 * d;
        double a7 = params.getA();
        double b4 = params.getB();
        double c2 = params.getC();
        double d6 = params.getD();
        double e = params.getE();
        double d10 = a7 * d5;
        return (params.getF() + 1.0d) * d * (d10 <= 1.0d ? Math.pow(d10, b4) : Math.exp((d5 - e) * c2) + d6);
    }

    public final double transferHlgOetf$ui_graphics(@NotNull TransferParameters params, double x3) {
        double d = x3 < 0.0d ? -1.0d : 1.0d;
        double a7 = 1.0d / params.getA();
        double b4 = 1.0d / params.getB();
        double c2 = 1.0d / params.getC();
        double d5 = params.getD();
        double e = params.getE();
        double f = (x3 * d) / (params.getF() + 1.0d);
        return d * (f <= 1.0d ? Math.pow(f, b4) * a7 : (Math.log(f - d5) * c2) + e);
    }

    public final double transferSt2048Eotf$ui_graphics(@NotNull TransferParameters pq5, double x3) {
        double d = x3 < 0.0d ? -1.0d : 1.0d;
        double d5 = x3 * d;
        double dPow = (Math.pow(d5, pq5.getC()) * pq5.getB()) + pq5.getA();
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d5, pq5.getC()) * pq5.getE()) + pq5.getD()), pq5.getF()) * d;
    }

    public final double transferSt2048Oetf$ui_graphics(@NotNull TransferParameters params, double x3) {
        double d = x3 < 0.0d ? -1.0d : 1.0d;
        double d5 = x3 * d;
        double d6 = -params.getA();
        double d10 = params.getD();
        double f = 1.0d / params.getF();
        return Math.pow(Math.max((Math.pow(d5, f) * d10) + d6, 0.0d) / ((Math.pow(d5, f) * (-params.getE())) + params.getB()), 1.0d / params.getC()) * d;
    }
}
