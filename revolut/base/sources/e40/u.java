package e40;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f122367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f122368c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.ASSISTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f122366a = iArr;
        int[] iArr2 = new int[be7.a.values().length];
        try {
            iArr2[be7.a.RINGING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[be7.a.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[be7.a.CONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[be7.a.RECONNECTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[be7.a.DISCONNECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[be7.a.IDLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        f122367b = iArr2;
        int[] iArr3 = new int[w30.d.values().length];
        try {
            iArr3[w30.d.NO_ANSWER.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[w30.d.CANCELED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[w30.d.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[w30.d.CLIENT_CONNECTION_ISSUES.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        f122368c = iArr3;
        int[] iArr4 = new int[w30.h.values().length];
        try {
            iArr4[w30.h.IN_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[w30.h.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
        int[] iArr5 = new int[v30.s.values().length];
        try {
            iArr5[v30.s.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[v30.s.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[v30.s.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[v30.s.PRIVATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[v30.s.STANDARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[v30.s.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
    }
}
