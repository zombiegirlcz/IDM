package sa1;

import com.youTransactor.uCube.payment.PaymentStatus;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261260a;

    static {
        int[] iArr = new int[PaymentStatus.values().length];
        try {
            iArr[PaymentStatus.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentStatus.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentStatus.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentStatus.ERROR_DISCONNECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentStatus.ERROR_SHUTTING_DOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentStatus.UNSUPPORTED_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentStatus.CARD_WAIT_FAILED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f261260a = iArr;
    }
}
