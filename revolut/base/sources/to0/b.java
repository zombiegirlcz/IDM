package to0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    public static float a(float f, float f4) {
        double d = f4;
        if (0.0d <= d && d <= 1.0d) {
            return ((Math.max((int) (f4 * f), 16) + 15) & (-16)) / f;
        }
        throw new IllegalArgumentException(("scaleFactor must be between 0 and 1, was " + f4).toString());
    }
}
