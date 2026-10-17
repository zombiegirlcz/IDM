package bil;

import zel.f;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f15533b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15532a = iArr;
        int[] iArr2 = new int[zel.a.values().length];
        try {
            iArr2[zel.a.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zel.a.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zel.a.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[zel.a.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[zel.a.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f15533b = iArr2;
    }
}
