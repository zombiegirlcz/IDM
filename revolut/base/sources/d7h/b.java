package d7h;

import xzg.j0;
import xzg.l0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f111967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f111968b;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f111967a = iArr;
        int[] iArr2 = new int[l0.values().length];
        try {
            iArr2[l0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l0.ONE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l0.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l0.FIVE_YEARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f111968b = iArr2;
    }
}
