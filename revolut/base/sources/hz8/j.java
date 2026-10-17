package hz8;

import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157077a;

    static {
        int[] iArr = new int[v.values().length];
        f157077a = iArr;
        try {
            iArr[v.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f157077a[v.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f157077a[v.FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f157077a[v.APP_TIPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f157077a[v.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f157077a[v.YOUTH_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
