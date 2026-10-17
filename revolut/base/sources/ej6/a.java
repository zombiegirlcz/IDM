package ej6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126716a;

    static {
        int[] iArr = new int[io3.l.values().length];
        try {
            iArr[io3.l.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[io3.l.SAVINGS_EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[io3.l.SAVINGS_INTEREST_BEARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[io3.l.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[io3.l.CURRENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[io3.l.MERCHANT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f126716a = iArr;
    }
}
