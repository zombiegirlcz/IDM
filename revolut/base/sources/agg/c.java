package agg;

import hfg.t0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4820b;

    static {
        int[] iArr = new int[t0.values().length];
        try {
            iArr[t0.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t0.AVIOS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4819a = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b.REV_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f4820b = iArr2;
    }
}
