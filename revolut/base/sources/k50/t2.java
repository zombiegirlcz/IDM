package k50;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f181249c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[l30.f.values().length];
        try {
            iArr[l30.f.MESSAGES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l30.f.SUGGESTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f181247a = iArr;
        int[] iArr2 = new int[v30.c0.values().length];
        try {
            iArr2[v30.c0.ASSISTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[v30.c0.PRIVATE_BANKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v30.c0.SUPPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f181248b = iArr2;
        int[] iArr3 = new int[mx0.b4.values().length];
        try {
            iArr3[mx0.b4.SEND_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[mx0.b4.ATTACH_FILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f181249c = iArr3;
        int[] iArr4 = new int[r.values().length];
        try {
            iArr4[r.FOLLOW_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
        int[] iArr5 = new int[v0.values().length];
        try {
            iArr5[v0.PROMPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr5[v0.MESSAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        e = iArr5;
        int[] iArr6 = new int[z30.l.values().length];
        try {
            iArr6[z30.l.MANDATORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr6[z30.l.OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr6[z30.l.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f = iArr6;
    }
}
