package yrb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f316209b;

    static {
        int[] iArr = new int[bfl.g.values().length];
        try {
            iArr[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316208a = iArr;
        int[] iArr2 = new int[qrb.b.values().length];
        try {
            iArr2[qrb.b.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qrb.b.QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f316209b = iArr2;
    }
}
