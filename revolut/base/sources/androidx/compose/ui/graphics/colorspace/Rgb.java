package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kx7.o0;
import m72.b;
import n2.c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001YB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0010¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J7\u00101\u001a\u00020.2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b/\u00100J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102H\u0096\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bC\u0010BR\u001a\u0010D\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u001a\u0010F\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170J8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u001a\u0010P\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010IR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170J8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bR\u0010MR\u001a\u0010S\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010G\u001a\u0004\bT\u0010IR\u001a\u0010U\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010WR\u001a\u0010X\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bX\u0010W¨\u0006Z"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "", "gamma", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "component", "getMinValue", "(I)F", "getMaxValue", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toXy", "toZ$ui_graphics", "(FFF)F", "toZ", "x", "y", "z", "a", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "[F", "getPrimaries$ui_graphics", "()[F", "getTransform$ui_graphics", "inverseTransform", "getInverseTransform$ui_graphics", "oetfOrig", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "oetfFunc", "getOetfFunc$ui_graphics", "eotfOrig", "getEotfOrig$ui_graphics", "getEotf", "eotfFunc", "getEotfFunc$ui_graphics", "isWideGamut", "Z", "()Z", "isSrgb", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Rgb extends ColorSpace {

    @NotNull
    private final Function1<Double, Double> eotf;

    @NotNull
    private final DoubleFunction eotfFunc;

    @NotNull
    private final DoubleFunction eotfOrig;

    @NotNull
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;

    @NotNull
    private final Function1<Double, Double> oetf;

    @NotNull
    private final DoubleFunction oetfFunc;

    @NotNull
    private final DoubleFunction oetfOrig;

    @NotNull
    private final float[] primaries;
    private final TransferParameters transferParameters;

    @NotNull
    private final float[] transform;

    @NotNull
    private final WhitePoint whitePoint;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final DoubleFunction DoubleIdentity = new o0(26);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "<init>", "()V", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "OETF", "EOTF", "", "min", "max", "", "id", "", "isSrgb", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFI)Z", "", "point", "a", "b", "compare", "(DLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;)Z", "isWideGamut", "([FFF)Z", "area", "([F)F", "p1", "p2", "contains", "([F[F)Z", "xyPrimaries", "([F)[F", "computeXYZMatrix", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)[F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "function", "generateOetf", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "generateEotf", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float area(float[] primaries) {
            if (primaries.length < 6) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            float f = primaries[0];
            float f4 = primaries[1];
            float f5 = primaries[2];
            float f6 = primaries[3];
            float f32 = primaries[4];
            float f35 = primaries[5];
            float fA = e.a(f, f35, (((f5 * f35) + ((f4 * f32) + (f * f6))) - (f6 * f32)) - (f4 * f5), 0.5f);
            return fA < BitmapDescriptorFactory.HUE_RED ? -fA : fA;
        }

        private final boolean compare(double point, DoubleFunction a7, DoubleFunction b4) {
            return Math.abs(a7.invoke(point) - b4.invoke(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] primaries, WhitePoint whitePoint) {
            float f = primaries[0];
            float f4 = primaries[1];
            float f5 = primaries[2];
            float f6 = primaries[3];
            float f32 = primaries[4];
            float f35 = primaries[5];
            float x3 = whitePoint.getX();
            float y2 = whitePoint.getY();
            float f36 = 1;
            float f37 = (f36 - f) / f4;
            float f41 = (f36 - f5) / f6;
            float f42 = (f36 - f32) / f35;
            float f57 = (f36 - x3) / y2;
            float f69 = f / f4;
            float f75 = x3 / y2;
            float f77 = (f5 / f6) - f69;
            float f81 = f75 - f69;
            float f82 = f41 - f37;
            float f93 = ((f57 - f37) * f77) - (f81 * f82);
            float f94 = (f42 - f37) * f77;
            float f99 = (f32 / f35) - f69;
            float f100 = f93 / (f94 - (f82 * f99));
            float fA = b.a(f100, f99, f81, f77);
            float f101 = (1.0f - fA) - f100;
            float f102 = f101 / f4;
            float f103 = fA / f6;
            float f104 = f100 / f35;
            return new float[]{f102 * f, f101, ((1.0f - f) - f4) * f102, f103 * f5, fA, ((1.0f - f5) - f6) * f103, f104 * f32, f100, ((1.0f - f32) - f35) * f104};
        }

        private final boolean contains(float[] p17, float[] p2) {
            float f = p17[0];
            float f4 = p2[0];
            float f5 = p17[1];
            float f6 = p2[1];
            float f32 = p17[2];
            float f35 = p2[2];
            float f36 = p17[3];
            float f37 = p2[3];
            float f41 = p17[4];
            float f42 = p2[4];
            float f57 = p17[5];
            float f69 = p2[5];
            float[] fArr = {f - f4, f5 - f6, f32 - f35, f36 - f37, f41 - f42, f57 - f69};
            float f75 = fArr[0];
            float f77 = fArr[1];
            if (((f6 - f69) * f75) - ((f4 - f42) * f77) >= BitmapDescriptorFactory.HUE_RED && ((f4 - f35) * f77) - ((f6 - f37) * f75) >= BitmapDescriptorFactory.HUE_RED) {
                float f81 = fArr[2];
                float f82 = fArr[3];
                if (((f37 - f6) * f81) - ((f35 - f4) * f82) >= BitmapDescriptorFactory.HUE_RED && ((f35 - f42) * f82) - ((f37 - f69) * f81) >= BitmapDescriptorFactory.HUE_RED) {
                    float f93 = fArr[4];
                    float f94 = fArr[5];
                    if (((f69 - f37) * f93) - ((f42 - f35) * f94) >= BitmapDescriptorFactory.HUE_RED && ((f42 - f4) * f94) - ((f69 - f6) * f93) >= BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(TransferParameters function) {
            return function.isHLGish$ui_graphics() ? new c(function, 0) : function.isPQish$ui_graphics() ? new c(function, 1) : (function.getE() == 0.0d && function.getF() == 0.0d) ? new c(function, 2) : new c(function, 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(TransferParameters function) {
            return function.isHLGish$ui_graphics() ? new c(function, 4) : function.isPQish$ui_graphics() ? new c(function, 5) : (function.getE() == 0.0d && function.getF() == 0.0d) ? new c(function, 6) : new c(function, 7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] primaries, WhitePoint whitePoint, DoubleFunction OETF, DoubleFunction EOTF, float min, float max, int id10) {
            if (id10 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(primaries, colorSpaces.getSrgbPrimaries$ui_graphics()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || min != BitmapDescriptorFactory.HUE_RED || max != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, OETF, srgb.getOetfOrig()) || !compare(d, EOTF, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] primaries, float min, float max) {
            float fArea = area(primaries);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (fArea / area(colorSpaces.getNtsc1953Primaries$ui_graphics()) <= 0.9f || !contains(primaries, colorSpaces.getSrgbPrimaries$ui_graphics())) {
                return min < BitmapDescriptorFactory.HUE_RED && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] primaries) {
            float[] destination = new float[6];
            if (primaries.length != 9) {
                Intrinsics.checkNotNullParameter(primaries, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                System.arraycopy(primaries, 0, destination, 0, 6);
                return destination;
            }
            float f = primaries[0];
            float f4 = primaries[1];
            float f5 = f + f4 + primaries[2];
            destination[0] = f / f5;
            destination[1] = f4 / f5;
            float f6 = primaries[3];
            float f32 = primaries[4];
            float f35 = f6 + f32 + primaries[5];
            destination[2] = f6 / f35;
            destination[3] = f32 / f35;
            float f36 = primaries[6];
            float f37 = primaries[7];
            float f41 = f36 + f37 + primaries[8];
            destination[4] = f36 / f41;
            destination[5] = f37 / f41;
            return destination;
        }

        private Companion() {
        }
    }

    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, float[] fArr2, @NotNull DoubleFunction doubleFunction, @NotNull DoubleFunction doubleFunction2, float f, float f4, TransferParameters transferParameters, int i) {
        super(str, ColorModel.INSTANCE.m2150getRgbxdoWZVw(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f4;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Rgb$oetf$1(this);
        final int i2 = 0;
        this.oetfFunc = new DoubleFunction(this) { // from class: n2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rgb f211414b;

            {
                this.f211414b = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                switch (i2) {
                    case 0:
                        return Rgb.oetfFunc$lambda$0(this.f211414b, d);
                    default:
                        return Rgb.eotfFunc$lambda$0(this.f211414b, d);
                }
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Rgb$eotf$1(this);
        final int i3 = 1;
        this.eotfFunc = new DoubleFunction(this) { // from class: n2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rgb f211414b;

            {
                this.f211414b = this;
            }

            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                switch (i3) {
                    case 0:
                        return Rgb.oetfFunc$lambda$0(this.f211414b, d);
                    default:
                        return Rgb.eotfFunc$lambda$0(this.f211414b, d);
                }
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f4) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f4 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 == null) {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f, f4);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f4, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$0(double d) {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(double d, double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        return Math.pow(d5, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(double d, double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        return Math.pow(d5, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$0(Rgb rgb, double d) {
        return rgb.eotfOrig.invoke(f.e(d, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        return f.e(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Rgb.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.f(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.f(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.f(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.f(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @NotNull
    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    @NotNull
    /* JADX INFO: renamed from: getEotfFunc$ui_graphics, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    @NotNull
    /* JADX INFO: renamed from: getEotfOrig$ui_graphics, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    @NotNull
    /* JADX INFO: renamed from: getInverseTransform$ui_graphics, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return this.min;
    }

    @NotNull
    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    @NotNull
    /* JADX INFO: renamed from: getOetfFunc$ui_graphics, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    @NotNull
    /* JADX INFO: renamed from: getOetfOrig$ui_graphics, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    @NotNull
    /* JADX INFO: renamed from: getPrimaries$ui_graphics, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransform$ui_graphics, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.primaries) + ((this.whitePoint.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.min;
        int iFloatToIntBits = (iHashCode + (f == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f))) * 31;
        float f4 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f4 == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f4))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return this.eotfOrig.hashCode() + ((this.oetfOrig.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isSrgb, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float v07, float v16, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v07);
        float fInvoke2 = (float) this.eotfFunc.invoke(v16);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f = (fArr[6] * fInvoke3) + (fArr[3] * fInvoke2) + (fArr[0] * fInvoke);
        return (((long) Float.floatToRawIntBits((fArr[7] * fInvoke3) + (fArr[4] * fInvoke2) + (fArr[1] * fInvoke))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float v07, float v16, float v2) {
        float fInvoke = (float) this.eotfFunc.invoke(v07);
        float fInvoke2 = (float) this.eotfFunc.invoke(v16);
        float fInvoke3 = (float) this.eotfFunc.invoke(v2);
        float[] fArr = this.transform;
        return (fArr[8] * fInvoke3) + (fArr[5] * fInvoke2) + (fArr[2] * fInvoke);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo2153xyzaToColorJlNiLsg$ui_graphics(float x3, float y2, float z, float a7, @NotNull ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[6] * z) + (fArr[3] * y2) + (fArr[0] * x3)), (float) this.oetfFunc.invoke((fArr[7] * z) + (fArr[4] * y2) + (fArr[1] * x3)), (float) this.oetfFunc.invoke((fArr[8] * z) + (fArr[5] * y2) + (fArr[2] * x3)), a7, colorSpace);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, @NotNull TransferParameters transferParameters, int i) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@NotNull String str, @NotNull float[] fArr, @NotNull WhitePoint whitePoint, final double d, float f, float f4, int i) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            final int i2 = 0;
            doubleFunction = new DoubleFunction() { // from class: n2.b
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    switch (i2) {
                        case 0:
                            return Rgb._init_$lambda$4(d, d5);
                        default:
                            return Rgb._init_$lambda$5(d, d5);
                    }
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            final int i3 = 1;
            doubleFunction2 = new DoubleFunction() { // from class: n2.b
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d5) {
                    switch (i3) {
                        case 0:
                            return Rgb._init_$lambda$4(d, d5);
                        default:
                            return Rgb._init_$lambda$5(d, d5);
                    }
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f, f4, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    public Rgb(@NotNull Rgb rgb, @NotNull float[] fArr, @NotNull WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
