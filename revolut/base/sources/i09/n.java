package i09;

import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157333a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.YOUTH_TRADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v.APP_TIPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[v.FRAUD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[v.PRO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f157333a = iArr;
    }
}
