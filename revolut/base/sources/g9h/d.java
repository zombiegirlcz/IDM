package g9h;

import xzg.l0;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f141874b;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f141873a = iArr;
        int[] iArr2 = new int[l0.values().length];
        try {
            iArr2[l0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l0.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l0.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l0.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f141874b = iArr2;
    }
}
