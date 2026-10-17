package hkb;

import qib.j;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f152918b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.RECURRING_DRAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.ONE_TIME_DRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f152917a = iArr;
        int[] iArr2 = new int[qib.e.values().length];
        try {
            iArr2[qib.e.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qib.e.ELIGIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qib.e.INELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f152918b = iArr2;
    }
}
