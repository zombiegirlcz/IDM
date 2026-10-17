package androidx.core.content.res;

import a0.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kii.e;

/* JADX INFO: loaded from: classes15.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((((double) CamUtils.yFromLStar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f, float f4, float f5, float f6, float f32, float f35, float[] fArr, float f36, float f37, float f41) {
        this.mN = f;
        this.mAw = f4;
        this.mNbb = f5;
        this.mNcb = f6;
        this.mC = f32;
        this.mNc = f35;
        this.mRgbD = fArr;
        this.mFl = f36;
        this.mFlRoot = f37;
        this.mZ = f41;
    }

    public static ViewingConditions make(float[] fArr, float f, float f4, float f5, boolean z) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f32 = fArr3[0] * f6;
        float f35 = fArr[1];
        float f36 = (fArr3[1] * f35) + f32;
        float f37 = fArr[2];
        float f41 = (fArr3[2] * f37) + f36;
        float[] fArr4 = fArr2[1];
        float f42 = (fArr4[2] * f37) + (fArr4[1] * f35) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f57 = (f37 * fArr5[2]) + (f35 * fArr5[1]) + (f6 * fArr5[0]);
        float f69 = (f5 / 10.0f) + 0.8f;
        float fLerp = ((double) f69) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f69 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f69 - 0.8f) * 10.0f);
        float fA = z ? 1.0f : e.a((float) Math.exp(((-f) - 42.0f) / 92.0f), 0.2777778f, 1.0f, f69);
        double d = fA;
        if (d > 1.0d) {
            fA = 1.0f;
        } else if (d < 0.0d) {
            fA = BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr6 = {(((100.0f / f41) * fA) + 1.0f) - fA, (((100.0f / f42) * fA) + 1.0f) - fA, (((100.0f / f57) * fA) + 1.0f) - fA};
        float f75 = 1.0f / ((5.0f * f) + 1.0f);
        float f77 = f75 * f75 * f75 * f75;
        float f81 = 1.0f - f77;
        float fCbrt = (0.1f * f81 * f81 * ((float) Math.cbrt(((double) f) * 5.0d))) + (f77 * f);
        float fYFromLStar = CamUtils.yFromLStar(f4) / fArr[1];
        double d5 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f41)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f42)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f57)) / 100.0d, 0.42d)};
        float f82 = fArr7[0];
        float f93 = (f82 * 400.0f) / (f82 + 27.13f);
        float f94 = fArr7[1];
        float f99 = (f94 * 400.0f) / (f94 + 27.13f);
        float f100 = fArr7[2];
        float[] fArr8 = {f93, f99, (400.0f * f100) / (f100 + 27.13f)};
        return new ViewingConditions(fYFromLStar, d.a(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, fLerp, f69, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.mZ;
    }
}
