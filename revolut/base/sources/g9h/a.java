package g9h;

import xzg.b0;
import xzg.d0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f141871b;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.MOST_TRADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.MOST_BOUGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.MOST_SOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f141870a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b0.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b0.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f141871b = iArr2;
    }
}
