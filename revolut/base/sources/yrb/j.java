package yrb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f316220b;

    static {
        int[] iArr = new int[j0b.e.values().length];
        try {
            iArr[j0b.e.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0b.e.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316219a = iArr;
        int[] iArr2 = new int[qrb.b.values().length];
        try {
            iArr2[qrb.b.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qrb.b.QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f316220b = iArr2;
    }
}
