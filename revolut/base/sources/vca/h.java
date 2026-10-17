package vca;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeFailureReason;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287662a;

    static {
        int[] iArr = new int[PixQrCodeDecodeFailureReason.values().length];
        try {
            iArr[PixQrCodeDecodeFailureReason.MALFORMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.NO_LONGER_PAYABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.PAYMENT_ALREADY_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.CREDITOR_NOT_FOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.INTERNAL_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.UNSUPPORTED_IMPLEMENTATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.UNSUPPORTED_FUNCTIONALITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.REMOVED_BY_CREDITOR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.REMOVED_BY_CREDITOR_AGENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.PAYER_RATE_LIMITED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.CREDITOR_AGENT_NOT_REACHABLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PixQrCodeDecodeFailureReason.FRAUD_RISK.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f287662a = iArr;
    }
}
