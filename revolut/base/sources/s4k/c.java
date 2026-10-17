package s4k;

import com.revolut.domain.models.beneficiary.ConfirmationResult;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259896a;

    static {
        int[] iArr = new int[ConfirmationResult.ResultCode.values().length];
        try {
            iArr[ConfirmationResult.ResultCode.MATCHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.NOT_MATCHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.JOINT_MATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.NOT_NEEDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.CLOSE_MATCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.BUSINESS_ACCOUNT_CLOSE_MATCH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.PERSONAL_ACCOUNT_CLOSE_MATCH.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.BUSINESS_ACCOUNT_NAME_MATCHED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.PERSONAL_ACCOUNT_NAME_MATCHED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.ACCOUNT_SWITCHED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.ACCOUNT_DOES_NOT_EXIST.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.NO_RESPONSE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.CANNOT_BE_CHECKED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.NOT_FOUND.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.ACCOUNT_CLOSED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.JOINT_CLOSE_MATCH.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.ATTEMPTS_WITHOUT_PAYMENT_INIT_EXCEEDED.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.NOT_ENROLLED.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.OPTED_OUT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[ConfirmationResult.ResultCode.NOT_SUPPORTED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        f259896a = iArr;
    }
}
