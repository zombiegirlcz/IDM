package k9h;

import xzg.o;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182335a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f182335a = iArr;
    }
}
