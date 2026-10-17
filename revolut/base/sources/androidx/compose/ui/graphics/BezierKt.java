package androidx.compose.ui.graphics;

import androidx.collection.FloatFloatPair;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\b\u001a/\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "p0", "p1", "p2", "p3", "t", "evaluateCubic", "(FFFFF)F", "(FFF)F", "findFirstCubicRoot", "(FFFF)F", "", "roots", "", "index", "findQuadraticRoots", "(FFF[FI)I", "p0y", "p1y", "p2y", "p3y", "Landroidx/collection/FloatFloatPair;", "computeCubicVerticalBounds", "(FFFF[FI)J", "r", "writeValidRootInUnitRange", "(F[FI)I", "ui-graphics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BezierKt {
    public static final long computeCubicVerticalBounds(float f, float f4, float f5, float f6, @NotNull float[] fArr, int i) {
        float f32 = (f4 - f) * 3.0f;
        float f35 = (f5 - f4) * 3.0f;
        float f36 = (f6 - f5) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f32, f35, f36, fArr, i);
        float f37 = (f35 - f32) * 2.0f;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((-f37) / (((f36 - f35) * 2.0f) - f37), fArr, i + iFindQuadraticRoots) + iFindQuadraticRoots;
        float fMin = Math.min(f, f6);
        float fMax = Math.max(f, f6);
        for (int i2 = 0; i2 < iWriteValidRootInUnitRange; i2++) {
            float fEvaluateCubic = evaluateCubic(f, f4, f5, f6, fArr[i2]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m514constructorimpl(fMin, fMax);
    }

    public static final float evaluateCubic(float f, float f4, float f5) {
        return ((((((f - f4) + 0.33333334f) * f5) + (f4 - (2.0f * f))) * f5) + f) * 3.0f * f5;
    }

    public static final float findFirstCubicRoot(float f, float f4, float f5, float f6) {
        float f32;
        double d = f;
        double d5 = ((d - (((double) f4) * 2.0d)) + ((double) f5)) * 3.0d;
        double d6 = ((double) (f4 - f)) * 3.0d;
        double d10 = (((double) (f4 - f5)) * 3.0d) + ((double) (-f)) + ((double) f6);
        double dAbs = Math.abs(d10 - 0.0d);
        float f35 = BitmapDescriptorFactory.HUE_RED;
        if (dAbs < 1.0E-7d) {
            if (Math.abs(d5 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d6 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f36 = (float) ((-d) / d6);
                if (f36 >= BitmapDescriptorFactory.HUE_RED) {
                    f35 = f36;
                }
                f32 = f35 <= 1.0f ? f35 : 1.0f;
                if (Math.abs(f32 - f36) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f32;
            }
            double dSqrt = Math.sqrt((d6 * d6) - ((4.0d * d5) * d));
            double d15 = d5 * 2.0d;
            float f37 = (float) ((dSqrt - d6) / d15);
            float f41 = f37 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f37;
            if (f41 > 1.0f) {
                f41 = 1.0f;
            }
            if (Math.abs(f41 - f37) > 1.05E-6f) {
                f41 = Float.NaN;
            }
            if (!Float.isNaN(f41)) {
                return f41;
            }
            float f42 = (float) (((-d6) - dSqrt) / d15);
            if (f42 >= BitmapDescriptorFactory.HUE_RED) {
                f35 = f42;
            }
            f32 = f35 <= 1.0f ? f35 : 1.0f;
            if (Math.abs(f32 - f42) > 1.05E-6f) {
                return Float.NaN;
            }
            return f32;
        }
        double d41 = d5 / d10;
        double d51 = d6 / d10;
        double d68 = d / d10;
        double d81 = ((d51 * 3.0d) - (d41 * d41)) / 9.0d;
        double d82 = ((d68 * 27.0d) + ((((2.0d * d41) * d41) * d41) - ((9.0d * d41) * d51))) / 54.0d;
        double d95 = d81 * d81 * d81;
        double d100 = (d82 * d82) + d95;
        double d101 = d41 / 3.0d;
        if (d100 >= 0.0d) {
            if (d100 != 0.0d) {
                double dSqrt2 = Math.sqrt(d100);
                float fFastCbrt = (float) (((double) (MathHelpersKt.fastCbrt((float) ((-d82) + dSqrt2)) - MathHelpersKt.fastCbrt((float) (d82 + dSqrt2)))) - d101);
                if (fFastCbrt >= BitmapDescriptorFactory.HUE_RED) {
                    f35 = fFastCbrt;
                }
                f32 = f35 <= 1.0f ? f35 : 1.0f;
                if (Math.abs(f32 - fFastCbrt) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f32;
            }
            float f57 = -MathHelpersKt.fastCbrt((float) d82);
            float f69 = (float) d101;
            float f75 = (2.0f * f57) - f69;
            float f77 = f75 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f75;
            if (f77 > 1.0f) {
                f77 = 1.0f;
            }
            if (Math.abs(f77 - f75) > 1.05E-6f) {
                f77 = Float.NaN;
            }
            if (!Float.isNaN(f77)) {
                return f77;
            }
            float f81 = (-f57) - f69;
            if (f81 >= BitmapDescriptorFactory.HUE_RED) {
                f35 = f81;
            }
            f32 = f35 <= 1.0f ? f35 : 1.0f;
            if (Math.abs(f32 - f81) > 1.05E-6f) {
                return Float.NaN;
            }
            return f32;
        }
        double dSqrt3 = Math.sqrt(-d95);
        double d102 = (-d82) / dSqrt3;
        if (d102 < -1.0d) {
            d102 = -1.0d;
        }
        if (d102 > 1.0d) {
            d102 = 1.0d;
        }
        double dAcos = Math.acos(d102);
        double dFastCbrt = MathHelpersKt.fastCbrt((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dFastCbrt) - d101);
        float f82 = fCos < BitmapDescriptorFactory.HUE_RED ? 0.0f : fCos;
        if (f82 > 1.0f) {
            f82 = 1.0f;
        }
        if (Math.abs(f82 - fCos) > 1.05E-6f) {
            f82 = Float.NaN;
        }
        if (!Float.isNaN(f82)) {
            return f82;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dFastCbrt) - d101);
        float f93 = fCos2 < BitmapDescriptorFactory.HUE_RED ? 0.0f : fCos2;
        if (f93 > 1.0f) {
            f93 = 1.0f;
        }
        if (Math.abs(f93 - fCos2) > 1.05E-6f) {
            f93 = Float.NaN;
        }
        if (!Float.isNaN(f93)) {
            return f93;
        }
        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dFastCbrt) - d101);
        if (fCos3 >= BitmapDescriptorFactory.HUE_RED) {
            f35 = fCos3;
        }
        f32 = f35 <= 1.0f ? f35 : 1.0f;
        if (Math.abs(f32 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f32;
    }

    private static final int findQuadraticRoots(float f, float f4, float f5, float[] fArr, int i) {
        double d = f;
        double d5 = f4;
        double d6 = f5;
        double d10 = d5 * 2.0d;
        double d15 = (d - d10) + d6;
        if (d15 == 0.0d) {
            if (d5 == d6) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d10 - d6) / (d10 - (d6 * 2.0d))), fArr, i);
        }
        double d41 = -Math.sqrt((d5 * d5) - (d6 * d));
        double d51 = (-d) + d5;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d41 + d51)) / d15), fArr, i);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d41 - d51) / d15), fArr, i + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 <= 1) {
            return iWriteValidRootInUnitRange2;
        }
        float f6 = fArr[i];
        int i2 = i + 1;
        float f32 = fArr[i2];
        if (f6 <= f32) {
            return f6 == f32 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
        }
        fArr[i] = f32;
        fArr[i2] = f6;
        return iWriteValidRootInUnitRange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f, float[] fArr, int i) {
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            f4 = f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (Math.abs(f4 - f) > 1.05E-6f) {
            f4 = Float.NaN;
        }
        fArr[i] = f4;
        return !Float.isNaN(f4) ? 1 : 0;
    }

    private static final float evaluateCubic(float f, float f4, float f5, float f6, float f32) {
        float f35 = (((f4 - f5) * 3.0f) + f6) - f;
        return (((((f35 * f32) + (((f5 - (2.0f * f4)) + f) * 3.0f)) * f32) + ((f4 - f) * 3.0f)) * f32) + f;
    }
}
