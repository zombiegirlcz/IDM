package mrl;

import orl.n;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208157a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.COMMODITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.MARGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.STOCKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.TAX_ADVANTAGED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f208157a = iArr;
    }
}
