package ful;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f138292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f138293c;

    static {
        int[] iArr = new int[hel.b.values().length];
        try {
            iArr[hel.b.US.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hel.b.GB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hel.b.AU.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hel.b.EEA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[hel.b.SG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[hel.b.BR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[hel.b.MX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f138291a = iArr;
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f138292b = iArr2;
        int[] iArr3 = new int[bfl.g.values().length];
        try {
            iArr3[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f138293c = iArr3;
    }
}
