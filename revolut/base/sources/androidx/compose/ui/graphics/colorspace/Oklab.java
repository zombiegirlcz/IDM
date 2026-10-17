package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "getMinValue", "(I)F", "getMaxValue", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toXy", "toZ$ui_graphics", "(FFF)F", "toZ", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "Companion", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Oklab extends ColorSpace {

    @NotNull
    private static final float[] InverseM1;

    @NotNull
    private static final float[] InverseM2;

    @NotNull
    private static final float[] M1;

    @NotNull
    private static final float[] M2;

    static {
        float[] transform = Adaptation.INSTANCE.getBradford().getTransform();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform, illuminant.getD50().toXyz$ui_graphics(), illuminant.getD65().toXyz$ui_graphics()));
        M1 = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(fArrMul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    public Oklab(@NotNull String str, int i) {
        super(str, ColorModel.INSTANCE.m2149getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        if (component == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float v07, float v16, float v2) {
        if (v07 < BitmapDescriptorFactory.HUE_RED) {
            v07 = 0.0f;
        }
        if (v07 > 1.0f) {
            v07 = 1.0f;
        }
        if (v16 < -0.5f) {
            v16 = -0.5f;
        }
        if (v16 > 0.5f) {
            v16 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = InverseM2;
        float f4 = (fArr[6] * f) + (fArr[3] * v16) + (fArr[0] * v07);
        float f5 = (fArr[7] * f) + (fArr[4] * v16) + (fArr[1] * v07);
        float f6 = (fArr[8] * f) + (fArr[5] * v16) + (fArr[2] * v07);
        float f32 = f4 * f4 * f4;
        float f35 = f5 * f5 * f5;
        float f36 = f6 * f6 * f6;
        float[] fArr2 = InverseM1;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f36) + (fArr2[4] * f35) + (fArr2[1] * f32))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits((fArr2[6] * f36) + ((fArr2[3] * f35) + (fArr2[0] * f32)))) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float v07, float v16, float v2) {
        if (v07 < BitmapDescriptorFactory.HUE_RED) {
            v07 = 0.0f;
        }
        if (v07 > 1.0f) {
            v07 = 1.0f;
        }
        if (v16 < -0.5f) {
            v16 = -0.5f;
        }
        if (v16 > 0.5f) {
            v16 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = InverseM2;
        float f4 = (fArr[6] * f) + (fArr[3] * v16) + (fArr[0] * v07);
        float f5 = (fArr[7] * f) + (fArr[4] * v16) + (fArr[1] * v07);
        float f6 = (fArr[8] * f) + (fArr[5] * v16) + (fArr[2] * v07);
        float f32 = f4 * f4 * f4;
        float f35 = f5 * f5 * f5;
        float f36 = f6 * f6 * f6;
        float[] fArr2 = InverseM1;
        return (fArr2[8] * f36) + (fArr2[5] * f35) + (fArr2[2] * f32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo2153xyzaToColorJlNiLsg$ui_graphics(float x3, float y2, float z, float a7, @NotNull ColorSpace colorSpace) {
        float[] fArr = M1;
        float f = (fArr[6] * z) + (fArr[3] * y2) + (fArr[0] * x3);
        float f4 = (fArr[7] * z) + (fArr[4] * y2) + (fArr[1] * x3);
        float f5 = (fArr[8] * z) + (fArr[5] * y2) + (fArr[2] * x3);
        float fFastCbrt = MathHelpersKt.fastCbrt(f);
        float fFastCbrt2 = MathHelpersKt.fastCbrt(f4);
        float fFastCbrt3 = MathHelpersKt.fastCbrt(f5);
        float[] fArr2 = M2;
        return ColorKt.Color((fArr2[6] * fFastCbrt3) + (fArr2[3] * fFastCbrt2) + (fArr2[0] * fFastCbrt), (fArr2[7] * fFastCbrt3) + (fArr2[4] * fFastCbrt2) + (fArr2[1] * fFastCbrt), (fArr2[8] * fFastCbrt3) + (fArr2[5] * fFastCbrt2) + (fArr2[2] * fFastCbrt), a7, colorSpace);
    }
}
