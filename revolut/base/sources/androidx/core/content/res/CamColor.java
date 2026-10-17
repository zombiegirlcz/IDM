package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import m72.b;

/* JADX INFO: loaded from: classes15.dex */
public class CamColor {
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    public CamColor(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41) {
        this.mHue = f;
        this.mChroma = f4;
        this.mJ = f5;
        this.mQ = f6;
        this.mM = f32;
        this.mS = f35;
        this.mJstar = f36;
        this.mAstar = f37;
        this.mBstar = f41;
    }

    private static CamColor findCamByJ(float f, float f4, float f5) {
        float f6 = 100.0f;
        float f32 = 1000.0f;
        float f35 = 0.0f;
        CamColor camColor = null;
        float f36 = 1000.0f;
        while (Math.abs(f35 - f6) > 0.01f) {
            float f37 = ((f6 - f35) / 2.0f) + f35;
            int iViewedInSrgb = fromJch(f37, f4, f).viewedInSrgb();
            float fLStarFromInt = CamUtils.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f5 - fLStarFromInt);
            if (fAbs < 0.2f) {
                CamColor camColorFromColor = fromColor(iViewedInSrgb);
                float fDistance = camColorFromColor.distance(fromJch(camColorFromColor.getJ(), camColorFromColor.getChroma(), f));
                if (fDistance <= 1.0f) {
                    camColor = camColorFromColor;
                    f32 = fAbs;
                    f36 = fDistance;
                }
            }
            if (f32 == BitmapDescriptorFactory.HUE_RED && f36 == BitmapDescriptorFactory.HUE_RED) {
                return camColor;
            }
            if (fLStarFromInt < f5) {
                f35 = f37;
            } else {
                f6 = f37;
            }
        }
        return camColor;
    }

    public static CamColor fromColor(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void fromColorInViewingConditions(int i, ViewingConditions viewingConditions, float[] fArr, float[] fArr2) {
        CamUtils.xyzFromInt(i, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f4 = fArr4[0] * f;
        float f5 = fArr2[1];
        float f6 = (fArr4[1] * f5) + f4;
        float f32 = fArr2[2];
        float f35 = (fArr4[2] * f32) + f6;
        float[] fArr5 = fArr3[1];
        float f36 = (fArr5[2] * f32) + (fArr5[1] * f5) + (fArr5[0] * f);
        float[] fArr6 = fArr3[2];
        float f37 = (f32 * fArr6[2]) + (f5 * fArr6[1]) + (f * fArr6[0]);
        float f41 = viewingConditions.getRgbD()[0] * f35;
        float f42 = viewingConditions.getRgbD()[1] * f36;
        float f57 = viewingConditions.getRgbD()[2] * f37;
        float fPow = (float) Math.pow(((double) (Math.abs(f41) * viewingConditions.getFl())) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f42) * viewingConditions.getFl())) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f57) * viewingConditions.getFl())) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f41) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f42) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f57) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f69 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f75 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f77 = fSignum2 * 20.0f;
        float f81 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f77)) / 20.0f;
        float f82 = (((fSignum * 40.0f) + f77) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f75, f69)) * 180.0f) / 3.1415927f;
        if (fAtan2 < BitmapDescriptorFactory.HUE_RED) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f93 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f82 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float aw2 = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * viewingConditions.getFlRoot();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f75 * f75) + (f69 * f69)))) / (f81 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r6 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f94 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d5 = f93;
        float fCos = ((float) Math.cos(d5)) * fLog;
        float fSin = fLog * ((float) Math.sin(d5));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = aw2;
            fArr[2] = flRoot;
            fArr[3] = fSqrt2;
            fArr[4] = f94;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static CamColor fromJch(float f, float f4, float f5) {
        return fromJchInFrame(f, f4, f5, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float f, float f4, float f5, ViewingConditions viewingConditions) {
        float aw2 = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(((double) f) / 100.0d)) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f4;
        float fSqrt = ((float) Math.sqrt(((f4 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f6 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) flRoot) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f5) / 180.0f;
        return new CamColor(f5, f4, f, aw2, flRoot, fSqrt, f6, ((float) Math.cos(d)) * fLog, fLog * ((float) Math.sin(d)));
    }

    public static int toColor(float f, float f4, float f5) {
        return toColor(f, f4, f5, ViewingConditions.DEFAULT);
    }

    public float distance(CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((bStar * bStar) + (aStar * aStar) + (jStar * jStar)), 0.63d) * 1.41d);
    }

    public float getAStar() {
        return this.mAstar;
    }

    public float getBStar() {
        return this.mBstar;
    }

    public float getChroma() {
        return this.mChroma;
    }

    public float getHue() {
        return this.mHue;
    }

    public float getJ() {
        return this.mJ;
    }

    public float getJStar() {
        return this.mJstar;
    }

    public int viewed(ViewingConditions viewingConditions) {
        float fPow = (float) Math.pow(((double) ((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? BitmapDescriptorFactory.HUE_RED : getChroma() / ((float) Math.sqrt(((double) getJ()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue2 = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue2) + 3.8d)) * 0.25f;
        float aw2 = viewingConditions.getAw() * ((float) Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) viewingConditions.getC())) / ((double) viewingConditions.getZ())));
        float nc3 = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb2 = aw2 / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue2);
        float fCos2 = (float) Math.cos(hue2);
        float f = (((0.305f + nbb2) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (nc3 * 23.0f)));
        float f4 = fCos2 * f;
        float f5 = f * fSin;
        float f6 = nbb2 * 460.0f;
        float fA = b.a(f5, 261.0f, f6 - (891.0f * f4), 1403.0f);
        float fA2 = b.a(f5, 6300.0f, f6 - (f4 * 220.0f), 1403.0f);
        float fl5 = (100.0f / viewingConditions.getFl()) * Math.signum(((288.0f * f5) + ((451.0f * f4) + f6)) / 1403.0f) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r1)) * 27.13d) / (400.0d - ((double) Math.abs(r1)))), 2.380952380952381d));
        float fl10 = (100.0f / viewingConditions.getFl()) * Math.signum(fA) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fA)) * 27.13d) / (400.0d - ((double) Math.abs(fA)))), 2.380952380952381d));
        float fl11 = (100.0f / viewingConditions.getFl()) * Math.signum(fA2) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fA2)) * 27.13d) / (400.0d - ((double) Math.abs(fA2)))), 2.380952380952381d));
        float f32 = fl5 / viewingConditions.getRgbD()[0];
        float f35 = fl10 / viewingConditions.getRgbD()[1];
        float f36 = fl11 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f37 = (fArr2[2] * f36) + (fArr2[1] * f35) + (fArr2[0] * f32);
        float[] fArr3 = fArr[1];
        float f41 = (fArr3[2] * f36) + (fArr3[1] * f35) + (fArr3[0] * f32);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f37, f41, (f36 * fArr4[2]) + (f35 * fArr4[1]) + (f32 * fArr4[0]));
    }

    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public static int toColor(float f, float f4, float f5, ViewingConditions viewingConditions) {
        if (f4 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
            return CamUtils.intFromLStar(f5);
        }
        float fMin = f < BitmapDescriptorFactory.HUE_RED ? 0.0f : Math.min(360.0f, f);
        CamColor camColor = null;
        boolean z = true;
        float f6 = 0.0f;
        float f32 = f4;
        while (Math.abs(f6 - f4) >= 0.4f) {
            CamColor camColorFindCamByJ = findCamByJ(fMin, f32, f5);
            if (!z) {
                if (camColorFindCamByJ == null) {
                    f4 = f32;
                } else {
                    f6 = f32;
                    camColor = camColorFindCamByJ;
                }
                f32 = ((f4 - f6) / 2.0f) + f6;
            } else {
                if (camColorFindCamByJ != null) {
                    return camColorFindCamByJ.viewed(viewingConditions);
                }
                f32 = ((f4 - f6) / 2.0f) + f6;
                z = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f5) : camColor.viewed(viewingConditions);
    }
}
