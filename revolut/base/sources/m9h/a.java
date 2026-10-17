package m9h;

import xzg.o;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203783a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f203783a = iArr;
    }
}
