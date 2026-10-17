package kbh;

import k1h.q;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f182592b;

    static {
        int[] iArr = new int[hel.b.values().length];
        try {
            iArr[hel.b.US.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hel.b.EEA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hel.b.MX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hel.b.BR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[hel.b.SG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[hel.b.GB.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[hel.b.AU.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f182591a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.FINANCIALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[q.NEWS.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f182592b = iArr2;
    }
}
