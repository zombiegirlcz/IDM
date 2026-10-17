package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.payment.PaymentState;
import com.youTransactor.uCube.rpc.Event;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f11496c;

    static {
        int[] iArr = new int[Event.values().length];
        f11496c = iArr;
        try {
            iArr[Event.wait_card.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11496c[Event.online_pin.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11496c[Event.offline_pin.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[TaskEvent.values().length];
        f11495b = iArr2;
        try {
            iArr2[TaskEvent.PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11495b[TaskEvent.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11495b[TaskEvent.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11495b[TaskEvent.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[PaymentState.values().length];
        f11494a = iArr3;
        try {
            iArr3[PaymentState.START_CANCEL_ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f11494a[PaymentState.START_EXIT_SECURE_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f11494a[PaymentState.GET_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f11494a[PaymentState.ENTER_SECURE_SESSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f11494a[PaymentState.DISPLAY_START_WAIT_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f11494a[PaymentState.GET_F5_L2_LOG.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f11494a[PaymentState.SMC_BUILD_CANDIDATE_LIST.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f11494a[PaymentState.SMC_SELECT_APPLICATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f11494a[PaymentState.KSN_AVAILABLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f11494a[PaymentState.START_TRANSACTION.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f11494a[PaymentState.WAITING_CARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f11494a[PaymentState.SMC_USER_SELECT_APPLICATION.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f11494a[PaymentState.START_ICC.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f11494a[PaymentState.SMC_INIT_TRANSACTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f11494a[PaymentState.SMC_RISK_MANAGEMENT.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f11494a[PaymentState.SMC_PROCESS_TRANSACTION.ordinal()] = 16;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f11494a[PaymentState.SMC_GET_AUTHORIZATION_SECURED_TAGS.ordinal()] = 17;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            f11494a[PaymentState.AUTHORIZATION.ordinal()] = 18;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f11494a[PaymentState.SMC_FINALIZE_TRANSACTION.ordinal()] = 19;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f11494a[PaymentState.START_NFC.ordinal()] = 20;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            f11494a[PaymentState.NFC_GET_AUTHORIZATION_SECURED_TAGS.ordinal()] = 21;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            f11494a[PaymentState.NFC_SIMPLIFIED_ONLINE_PIN.ordinal()] = 22;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            f11494a[PaymentState.NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY.ordinal()] = 23;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            f11494a[PaymentState.NFC_COMPLETE_TRANSACTION.ordinal()] = 24;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            f11494a[PaymentState.GET_FINALIZATION_SECURED_TAGS.ordinal()] = 25;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            f11494a[PaymentState.GET_FINALIZATION_PLAIN_TAGS.ordinal()] = 26;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            f11494a[PaymentState.GET_CC_L2_LOG.ordinal()] = 27;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            f11494a[PaymentState.GET_F4_L2_LOG.ordinal()] = 28;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            f11494a[PaymentState.END_EXIT_SECURE_SESSION.ordinal()] = 29;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            f11494a[PaymentState.SMC_REMOVE_CARD.ordinal()] = 30;
        } catch (NoSuchFieldError unused37) {
        }
    }
}
