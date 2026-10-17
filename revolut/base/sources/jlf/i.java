package jlf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f175743a;

    static {
        int[] iArr = new int[kq2.l.values().length];
        try {
            iArr[kq2.l.LOCAL_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kq2.l.CROSS_BORDER_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kq2.l.INTERNATIONAL_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kq2.l.SWIFT_USD_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[kq2.l.SWIFT_NON_USD_TRANSFER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f175743a = iArr;
    }
}
