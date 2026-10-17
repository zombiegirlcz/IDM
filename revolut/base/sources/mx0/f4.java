package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f209696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f209697c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[e4.values().length];
        try {
            iArr[e4.TEXT_AND_START_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e4.TEXT_AND_START_BUTTON_ACTIVATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e4.ONLY_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f209695a = iArr;
        int[] iArr2 = new int[d4.values().length];
        try {
            iArr2[d4.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d4.HOLD_HINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[d4.RECORDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[d4.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[d4.HANDS_FREE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[d4.PREVIEW.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f209696b = iArr2;
        int[] iArr3 = new int[c4.values().length];
        try {
            iArr3[c4.CHAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[c4.SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f209697c = iArr3;
        int[] iArr4 = new int[b4.values().length];
        try {
            iArr4[b4.ATTACH_FILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[b4.REACTIONS_KEYBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[b4.SEND_MESSAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[b4.SOFT_KEYBOARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[b4.RECORD_AUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
        int[] iArr5 = new int[oo0.a.values().length];
        try {
            iArr5[oo0.a.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[oo0.a.PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[oo0.a.ABSENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[oo0.a.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[oo0.a.PAUSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
    }
}
