package o0b;

import c1b.l;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221192a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.REVX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f221192a = iArr;
    }
}
