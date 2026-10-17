package nrl;

import orl.n;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218674a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.TAX_ADVANTAGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.MARGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f218674a = iArr;
    }
}
