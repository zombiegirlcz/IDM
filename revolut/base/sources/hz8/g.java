package hz8;

import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157070a;

    static {
        int[] iArr = new int[v.values().length];
        f157070a = iArr;
        try {
            iArr[v.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f157070a[v.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f157070a[v.FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f157070a[v.APP_TIPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f157070a[v.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f157070a[v.YOUTH_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
