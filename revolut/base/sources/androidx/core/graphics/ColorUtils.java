package androidx.core.graphics;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j6.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorUtils {
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();

    public static int HSLToColor(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float fAbs = (1.0f - Math.abs((f5 * 2.0f) - 1.0f)) * f4;
        float f6 = f5 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound = Math.round((fAbs + f6) * 255.0f);
                iRound2 = Math.round((fAbs2 + f6) * 255.0f);
                iRound3 = Math.round(f6 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f6) * 255.0f);
                iRound2 = Math.round((fAbs + f6) * 255.0f);
                iRound3 = Math.round(f6 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f6 * 255.0f);
                iRound2 = Math.round((fAbs + f6) * 255.0f);
                iRound3 = Math.round((fAbs2 + f6) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f6 * 255.0f);
                iRound2 = Math.round((fAbs2 + f6) * 255.0f);
                iRound3 = Math.round((fAbs + f6) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f6) * 255.0f);
                iRound2 = Math.round(f6 * 255.0f);
                iRound3 = Math.round((fAbs + f6) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f6) * 255.0f);
                iRound2 = Math.round(f6 * 255.0f);
                iRound3 = Math.round((fAbs2 + f6) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(constrain(iRound, 0, 255), constrain(iRound2, 0, 255), constrain(iRound3, 0, 255));
    }

    public static void RGBToHSL(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f4 = i / 255.0f;
        float f5 = i2 / 255.0f;
        float f6 = i3 / 255.0f;
        float fMax = Math.max(f4, Math.max(f5, f6));
        float fMin = Math.min(f4, Math.min(f5, f6));
        float f32 = fMax - fMin;
        float f35 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            f = fMax == f4 ? ((f5 - f6) / f32) % 6.0f : fMax == f5 ? ((f6 - f4) / f32) + 2.0f : 4.0f + ((f4 - f5) / f32);
            fAbs = f32 / (1.0f - Math.abs((2.0f * f35) - 1.0f));
        }
        float f36 = (f * 60.0f) % 360.0f;
        if (f36 < BitmapDescriptorFactory.HUE_RED) {
            f36 += 360.0f;
        }
        fArr[0] = constrain(f36, BitmapDescriptorFactory.HUE_RED, 360.0f);
        fArr[1] = constrain(fAbs, BitmapDescriptorFactory.HUE_RED, 1.0f);
        fArr[2] = constrain(f35, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public static void RGBToXYZ(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) i2) / 255.0d;
        double dPow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = ((double) i3) / 255.0d;
        double dPow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    public static int XYZToColor(double d, double d5, double d6) {
        double d10 = (((-0.4986d) * d6) + (((-1.5372d) * d5) + (3.2406d * d))) / 100.0d;
        double d15 = ((0.0415d * d6) + ((1.8758d * d5) + ((-0.9689d) * d))) / 100.0d;
        double d41 = ((1.057d * d6) + (((-0.204d) * d5) + (0.0557d * d))) / 100.0d;
        return Color.rgb(constrain((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d41 > 0.0031308d ? (Math.pow(d41, 0.4166666666666667d) * 1.055d) - 0.055d : d41 * 12.92d) * 255.0d), 0, 255));
    }

    public static int blendARGB(int i, int i2, float f) {
        float f4 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f4)), (int) ((Color.red(i2) * f) + (Color.red(i) * f4)), (int) ((Color.green(i2) * f) + (Color.green(i) * f4)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f4)));
    }

    public static double calculateContrast(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException(a.n(i2, new StringBuilder("background can not be translucent: #")));
        }
        if (Color.alpha(i) < 255) {
            i = compositeColors(i, i2);
        }
        double dCalculateLuminance = calculateLuminance(i) + 0.05d;
        double dCalculateLuminance2 = calculateLuminance(i2) + 0.05d;
        return Math.max(dCalculateLuminance, dCalculateLuminance2) / Math.min(dCalculateLuminance, dCalculateLuminance2);
    }

    public static double calculateLuminance(int i) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i, tempDouble3Array);
        return tempDouble3Array[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException(a.n(i2, new StringBuilder("background can not be translucent: #")));
        }
        double d = f;
        if (calculateContrast(setAlphaComponent(i, 255), i2) < d) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 <= 10 && i3 - i5 > 1; i6++) {
            int i21 = (i5 + i3) / 2;
            if (calculateContrast(setAlphaComponent(i, i21), i2) < d) {
                i5 = i21;
            } else {
                i3 = i21;
            }
        }
        return i3;
    }

    public static void colorToHSL(int i, float[] fArr) {
        RGBToHSL(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void colorToXYZ(int i, double[] dArr) {
        RGBToXYZ(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    private static int compositeAlpha(int i, int i2) {
        return 255 - (((255 - i) * (255 - i2)) / 255);
    }

    public static int compositeColors(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iCompositeAlpha = compositeAlpha(iAlpha2, iAlpha);
        return Color.argb(iCompositeAlpha, compositeComponent(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iCompositeAlpha), compositeComponent(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iCompositeAlpha), compositeComponent(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iCompositeAlpha));
    }

    private static int compositeComponent(int i, int i2, int i3, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return v0.a.a(255, i2, i3 * i5, (i * 255) * i2) / (i6 * 255);
    }

    private static float constrain(float f, float f4, float f5) {
        return f < f4 ? f4 : Math.min(f, f5);
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int setAlphaComponent(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    private static int constrain(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }
}
