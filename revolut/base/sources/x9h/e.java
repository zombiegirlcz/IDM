package x9h;

import xzg.j0;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f303739c;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.LOSERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.GAINERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f303737a = iArr;
        int[] iArr2 = new int[w0h.d.values().length];
        try {
            iArr2[w0h.d.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0h.d.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f303738b = iArr2;
        int[] iArr3 = new int[j0.values().length];
        try {
            iArr3[j0.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[j0.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f303739c = iArr3;
    }
}
