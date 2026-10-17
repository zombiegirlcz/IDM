package aul;

import dfl.r;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9862b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9861a = iArr;
        int[] iArr2 = new int[r.values().length];
        try {
            iArr2[r.MONEY_AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r.STOCK_QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f9862b = iArr2;
    }
}
