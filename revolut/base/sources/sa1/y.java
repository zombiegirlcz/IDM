package sa1;

import com.youTransactor.uCube.connexion.ConnectionState;
import com.youTransactor.uCube.payment.PaymentState;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261265b;

    static {
        int[] iArr = new int[PaymentState.values().length];
        try {
            iArr[PaymentState.START_CANCEL_ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentState.START_EXIT_SECURE_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentState.GET_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentState.ENTER_SECURE_SESSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentState.KSN_AVAILABLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentState.START_TRANSACTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentState.CARD_READ_END.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PaymentState.AUTHORIZATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PaymentState.GET_FINALIZATION_SECURED_TAGS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PaymentState.GET_FINALIZATION_PLAIN_TAGS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PaymentState.GET_CC_L2_LOG.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PaymentState.GET_F4_L2_LOG.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PaymentState.GET_F5_L2_LOG.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PaymentState.END_EXIT_SECURE_SESSION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PaymentState.START_ICC.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[PaymentState.SMC_BUILD_CANDIDATE_LIST.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[PaymentState.SMC_SELECT_APPLICATION.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[PaymentState.SMC_USER_SELECT_APPLICATION.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[PaymentState.SMC_INIT_TRANSACTION.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[PaymentState.SMC_RISK_MANAGEMENT.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[PaymentState.SMC_PROCESS_TRANSACTION.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[PaymentState.SMC_GET_AUTHORIZATION_SECURED_TAGS.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[PaymentState.SMC_FINALIZE_TRANSACTION.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[PaymentState.SMC_REMOVE_CARD.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[PaymentState.START_NFC.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[PaymentState.NFC_GET_AUTHORIZATION_SECURED_TAGS.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[PaymentState.NFC_SIMPLIFIED_ONLINE_PIN.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[PaymentState.NFC_SIMPLIFIED_ONLINE_PIN_WITHOUT_AMOUNT_AND_CURRENCY.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[PaymentState.NFC_COMPLETE_TRANSACTION.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[PaymentState.DISPLAY_START_WAIT_CARD.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[PaymentState.WAITING_CARD.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[PaymentState.ONLINE_PIN.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[PaymentState.OFFLINE_PIN.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        f261264a = iArr;
        int[] iArr2 = new int[ConnectionState.values().length];
        try {
            iArr2[ConnectionState.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[ConnectionState.DISCONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[ConnectionState.CONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[ConnectionState.DISCONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused37) {
        }
        f261265b = iArr2;
    }
}
