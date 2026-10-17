package kkf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184752a;

    static {
        int[] iArr = new int[tof.q5.values().length];
        try {
            iArr[tof.q5.CARD_PRESENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tof.q5.APPLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tof.q5.BANK_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tof.q5.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tof.q5.GOOGLE_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tof.q5.OPEN_BANKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[tof.q5.PAY_WITH_REVOLUT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f184752a = iArr;
    }
}
