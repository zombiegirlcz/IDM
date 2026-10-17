package pyj;

import u09.v;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f240846b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.BlogReader.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.ContentCard.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f240845a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v.TRADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v.FRAUD.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v.APP_TIPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v.PRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[v.YOUTH_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f240846b = iArr2;
    }
}
