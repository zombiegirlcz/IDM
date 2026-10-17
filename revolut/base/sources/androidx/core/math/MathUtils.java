package androidx.core.math;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MathUtils {
    public static double clamp(double d, double d5, double d6) {
        return d < d5 ? d5 : d > d6 ? d6 : d;
    }

    public static float clamp(float f, float f4, float f5) {
        return f < f4 ? f4 : f > f5 ? f5 : f;
    }

    public static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long clamp(long j2, long j3, long j5) {
        return j2 < j3 ? j3 : j2 > j5 ? j5 : j2;
    }
}
