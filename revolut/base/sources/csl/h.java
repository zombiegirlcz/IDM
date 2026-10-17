package csl;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108539b;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108538a = iArr;
        int[] iArr2 = new int[k4l.k.values().length];
        try {
            iArr2[k4l.k.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k4l.k.NEXT_TRADING_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k4l.k.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k4l.k.NINETY_DAYS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k4l.k.SIX_MONTHS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[k4l.k.CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f108539b = iArr2;
    }
}
