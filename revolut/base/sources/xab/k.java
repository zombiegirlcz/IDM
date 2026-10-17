package xab;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f303830c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[rl0.d.values().length];
        try {
            iArr[rl0.d.PASSCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rl0.d.PASSKEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f303828a = iArr;
        int[] iArr2 = new int[sab.b.values().length];
        try {
            iArr2[sab.b.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[sab.b.SIGN_LOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[sab.b.SIGN_2FA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[sab.b.SIGN_SHOW_PIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[sab.b.RESET_CARD_SCA_COUNTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[sab.b.SIGN_CONFIRM_GOOGLE_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[sab.b.SIGN_CONFIRM_GOOGLE_PAY_VISA.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[sab.b.SIGN_SHOW_CHAT.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[sab.b.SIGN_SHOW_ASSISTANT.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        f303829b = iArr2;
        int[] iArr3 = new int[wli.b.values().length];
        try {
            iArr3[wli.b.ACKNOWLEDGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[wli.b.NO_PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f303830c = iArr3;
        int[] iArr4 = new int[j.values().length];
        try {
            iArr4[j.START_EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[j.RESUME_CONSTRAINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
