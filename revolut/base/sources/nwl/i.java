package nwl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f220021c;

    static {
        int[] iArr = new int[sab.b.values().length];
        try {
            iArr[sab.b.SIGN_SHOW_PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sab.b.SIGN_CHANGED_PHONE_SHOW_CHAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sab.b.RESET_CARD_SCA_COUNTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[sab.b.SIGN_LOGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[sab.b.SIGN_SHOW_CHAT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[sab.b.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f220019a = iArr;
        int[] iArr2 = new int[m0j.a.values().length];
        try {
            iArr2[m0j.a.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[m0j.a.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[m0j.a.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f220020b = iArr2;
        int[] iArr3 = new int[rl0.d.values().length];
        try {
            iArr3[rl0.d.PASSCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[rl0.d.PASSKEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f220021c = iArr3;
    }
}
