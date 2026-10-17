package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f164473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f164474b;

    static {
        int[] iArr = new int[bw.values().length];
        try {
            iArr[bw.COMPACT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bw.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f164473a = iArr;
        int[] iArr2 = new int[cw.values().length];
        try {
            iArr2[cw.REVOLUT_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cw.VISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cw.MASTERCARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cw.AMEX.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cw.APPLE_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cw.GOOGLE_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[cw.CONTACTLESS.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f164474b = iArr2;
    }
}
