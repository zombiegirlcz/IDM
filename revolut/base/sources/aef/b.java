package aef;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3574a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SUBMITTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.IN_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.INVALID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.INELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.REFUNDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a.RAISED_TO_CARD_SCHEME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[a.CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[a.UNSUCCESSFUL.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[a.SUCCESSFUL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[a.PROVISIONAL_REFUND_REVERTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[a.MERCHANT_REFUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[a.PROVISIONAL_REFUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[a.REVIEWING_EVIDENCE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[a.SENT_BACK_TO_CARD_SCHEME.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[a.PENDING_TRANSACTION.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[a.INFORMATION_PROVIDED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[a.INFORMATION_PROVIDED_SECOND_STAGE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[a.PENDING_USER_CONFIRMATION.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[a.PENDING_USER_SECOND_STAGE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[a.INFORMATION_REQUIRED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[a.PRE_ARBITRATION.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[a.ARBITRATION.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        f3574a = iArr;
    }
}
