package adh;

import k4l.c0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3353a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3353a = iArr;
    }
}
