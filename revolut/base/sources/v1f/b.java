package v1f;

import u2f.k;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f285306b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.AVIOS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.HILTON_HONORS_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.ACCOR_REWARD_POINTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.I_PREFER_POINTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k.EUROSTAR_POINTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[k.POINTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[k.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f285305a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[a.REV_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f285306b = iArr2;
    }
}
