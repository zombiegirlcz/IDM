package a1b;

import c1b.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f579a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.MEASURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.TRENDLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.HORIZONTAL_LINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.VERTICAL_LINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.FIBONACCI_RETRACEMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e.ELLIOT_IMPULSE_WAVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f579a = iArr;
    }
}
