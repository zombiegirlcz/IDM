package ih1;

import jg1.g;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f161285a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SAMSUNG_WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.APPLE_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f161285a = iArr;
    }
}
