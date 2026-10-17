package no;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f217829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f217830c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[w2.values().length];
        try {
            iArr[w2.PUSH_NOTIFICATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w2.CONTACT_ACCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w2.FACE_RECOGNITION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w2.FINGERPRINT_RECOGNITION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w2.MICROPHONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w2.CAMERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[w2.BLUETOOTH.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[w2.CALENDAR_ACCESS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[w2.LOCATION.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f217828a = iArr;
        int[] iArr2 = new int[b70.b.values().length];
        try {
            iArr2[b70.b.CONTROL_MAGNIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[b70.b.PERFORM_GESTURES.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[b70.b.REQUEST_ENHANCED_WEB_ACCESSIBILITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[b70.b.REQUEST_FILTER_KEY_EVENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[b70.b.REQUEST_FINGERPRINT_GESTURES.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[b70.b.REQUEST_TOUCH_EXPLORATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[b70.b.RETRIEVE_WINDOW_CONTENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[b70.b.TAKE_SCREENSHOT.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        f217829b = iArr2;
        int[] iArr3 = new int[zee.b.values().length];
        try {
            iArr3[zee.b.SYSTEM_ALERT_WINDOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        f217830c = iArr3;
        int[] iArr4 = new int[o2.values().length];
        try {
            iArr4[o2.SEND_ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[o2.SEND_ONLY_CHANGES_IN_SCOPE_OF_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[o2.SEND_ONLY_CHANGES.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[o2.SEND_PER_DAY_OR_CHANGES.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        d = iArr4;
    }
}
