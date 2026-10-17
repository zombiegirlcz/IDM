package swk;

import mel.q;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266232a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.BEARISH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.BULLISH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f266232a = iArr;
    }
}
