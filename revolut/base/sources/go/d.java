package go;

import no.w2;
import wl0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f145064b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.FACE_UNLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f145063a = iArr;
        int[] iArr2 = new int[w2.values().length];
        try {
            iArr2[w2.PUSH_NOTIFICATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w2.CONTACT_ACCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w2.FACE_RECOGNITION.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w2.FINGERPRINT_RECOGNITION.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[w2.MICROPHONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w2.CAMERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[w2.BLUETOOTH.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[w2.CALENDAR_ACCESS.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[w2.LOCATION.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        f145064b = iArr2;
    }
}
