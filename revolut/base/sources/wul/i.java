package wul;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300237b;

    static {
        int[] iArr = new int[f8l.e.values().length];
        try {
            iArr[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f8l.e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f300236a = iArr;
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f300237b = iArr2;
    }
}
