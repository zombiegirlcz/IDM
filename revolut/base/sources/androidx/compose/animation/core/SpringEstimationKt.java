package androidx.compose.animation.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n\u001a7\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0010\u001aG\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "(FFFFF)J", "", "(DDDDD)J", "firstRootReal", "firstRootImaginary", "p0", "v0", "estimateUnderDamped", "(DDDDD)D", "estimateCriticallyDamped", "(DDDD)D", "secondRootReal", "estimateOverDamped", "initialPosition", "estimateDurationInternal", "(DDDDDDD)J", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f4, float f5, float f6, float f32) {
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            return 9223372036854L;
        }
        return estimateAnimationDurationMillis(f, f4, f5, f6, f32);
    }

    private static final double estimateCriticallyDamped(double d, double d5, double d6, double d10) {
        double d15 = d10;
        double d41 = d * d5;
        double d51 = d6 - d41;
        double dLog = Math.log(Math.abs(d15 / d5)) / d;
        double dLog2 = Math.log(Math.abs(d15 / d51));
        int i = 0;
        double dLog3 = dLog2;
        for (int i2 = 0; i2 < 6; i2++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d));
        }
        double d68 = dLog3 / d;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d68;
        } else if ((Double.doubleToRawLongBits(d68) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d68);
        }
        double d81 = (-(d41 + d51)) / (d * d51);
        double d82 = d * d81;
        double dExp = (Math.exp(d82) * d51 * d81) + (Math.exp(d82) * d5);
        if (Double.isNaN(d81) || d81 <= 0.0d) {
            d15 = -d15;
        } else if (d81 <= 0.0d || (-dExp) >= d15) {
            dLog = (-(2.0d / d)) - (d5 / d51);
        } else {
            if (d51 < 0.0d && d5 > 0.0d) {
                dLog = 0.0d;
            }
            d15 = -d15;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i < 100) {
            i++;
            double d95 = d * dLog;
            double dExp2 = dLog - (((Math.exp(d95) * ((d51 * dLog) + d5)) + d15) / (Math.exp(d95) * (((((double) 1) + d95) * d51) + d41)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(double d, double d5, double d6, double d10, double d15, double d41, double d51) {
        double d68 = d15;
        if (d41 == 0.0d && d68 == 0.0d) {
            return 0L;
        }
        if (d41 < 0.0d) {
            d68 = -d68;
        }
        double d81 = d68;
        double dAbs = Math.abs(d41);
        return (long) ((d10 > 1.0d ? estimateOverDamped(d, d6, dAbs, d81, d51) : d10 < 1.0d ? estimateUnderDamped(d, d5, dAbs, d81, d51) : estimateCriticallyDamped(d, dAbs, d81, d51)) * 1000.0d);
    }

    private static final double estimateOverDamped(double d, double d5, double d6, double d10, double d15) {
        double d41 = d15;
        double d51 = d - d5;
        double d68 = ((d * d6) - d10) / d51;
        double d81 = d6 - d68;
        double dLog = Math.log(Math.abs(d41 / d81)) / d;
        double dLog2 = Math.log(Math.abs(d41 / d68)) / d5;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d82 = d81 * d;
        double dLog3 = Math.log(d82 / ((-d68) * d5)) / (d5 - d);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d41 = -d41;
        } else if (dLog3 <= 0.0d || (-estimateOverDamped$xInflection(d81, d, dLog3, d68, d5)) >= d41) {
            dLog = Math.log((-((d68 * d5) * d5)) / (d82 * d)) / d51;
        } else {
            if (d68 > 0.0d && d81 < 0.0d) {
                dLog = 0.0d;
            }
            d41 = -d41;
        }
        double d95 = d68 * d5;
        if (Math.abs((Math.exp(d5 * dLog) * d95) + (Math.exp(d * dLog) * d82)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i = 0;
        while (dAbs > 0.001d && i < 100) {
            i++;
            double d100 = d * dLog;
            double d101 = d5 * dLog;
            double dExp = dLog - ((((Math.exp(d101) * d68) + (Math.exp(d100) * d81)) + d41) / ((Math.exp(d101) * d95) + (Math.exp(d100) * d82)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double estimateOverDamped$xInflection(double d, double d5, double d6, double d10, double d15) {
        return (Math.exp(d15 * d6) * d10) + (Math.exp(d5 * d6) * d);
    }

    private static final double estimateUnderDamped(double d, double d5, double d6, double d10, double d15) {
        double d41 = (d10 - (d * d6)) / d5;
        return Math.log(d15 / Math.sqrt((d41 * d41) + (d6 * d6))) / d;
    }

    public static final long estimateAnimationDurationMillis(double d, double d5, double d6, double d10, double d15) {
        double dSqrt = Math.sqrt(d) * 2.0d * d5;
        double d41 = (dSqrt * dSqrt) - (4.0d * d);
        double dSqrt2 = d41 < 0.0d ? 0.0d : Math.sqrt(d41);
        double dSqrt3 = d41 < 0.0d ? Math.sqrt(Math.abs(d41)) : 0.0d;
        double d51 = -dSqrt;
        return estimateDurationInternal((d51 + dSqrt2) * 0.5d, dSqrt3 * 0.5d, (d51 - dSqrt2) * 0.5d, d5, d6, d10, d15);
    }
}
