package x9h;

import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f303742c;

    static {
        int[] iArr = new int[w0h.d.values().length];
        try {
            iArr[w0h.d.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0h.d.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f303740a = iArr;
        int[] iArr2 = new int[mzg.e.values().length];
        try {
            iArr2[mzg.e.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mzg.e.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mzg.e.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f303741b = iArr2;
        int[] iArr3 = new int[n0.values().length];
        try {
            iArr3[n0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[n0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[n0.LOSERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f303742c = iArr3;
    }
}
