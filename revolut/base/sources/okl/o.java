package okl;

import jkl.a3;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f226224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f226225c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[a3.values().length];
        try {
            iArr[a3.CHAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f226223a = iArr;
        int[] iArr2 = new int[jkl.i.values().length];
        try {
            iArr2[jkl.i.IN_SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[jkl.i.APP_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[jkl.i.BANK_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jkl.i.BIO_SIGNATURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[jkl.i.CARD_PIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[jkl.i.DAP.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[jkl.i.EMAIL.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[jkl.i.FACE.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[jkl.i.FACE_OTP.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[jkl.i.GOOGLE.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[jkl.i.ID_DOC.ordinal()] = 11;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[jkl.i.OKTA.ordinal()] = 12;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[jkl.i.PASSWORD.ordinal()] = 13;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[jkl.i.PIN.ordinal()] = 14;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[jkl.i.PUSH.ordinal()] = 15;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[jkl.i.RCS.ordinal()] = 16;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[jkl.i.SIGNATURE.ordinal()] = 17;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[jkl.i.SILENT_AUTH.ordinal()] = 18;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[jkl.i.SMS.ordinal()] = 19;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[jkl.i.TELEPHONE.ordinal()] = 20;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[jkl.i.TOKEN.ordinal()] = 21;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[jkl.i.WEB_AUTHN.ordinal()] = 22;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[jkl.i.WHATSAPP.ordinal()] = 23;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[jkl.i.QR_DELEGATED.ordinal()] = 24;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[jkl.i.UAE_PASS.ordinal()] = 25;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[jkl.i.UNKNOWN.ordinal()] = 26;
        } catch (NoSuchFieldError unused27) {
        }
        f226224b = iArr2;
        int[] iArr3 = new int[gkl.k.values().length];
        try {
            iArr3[gkl.k.UNDER_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr3[gkl.k.PREPARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        f226225c = iArr3;
        int[] iArr4 = new int[gkl.m.values().length];
        try {
            iArr4[gkl.m.APPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[gkl.m.BIO_PUBLIC_KEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[gkl.m.GOOGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[gkl.m.IDENTITY_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr4[gkl.m.PUBLIC_KEY.ordinal()] = 5;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr4[gkl.m.WEBAUTHN.ordinal()] = 6;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr4[gkl.m.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr4[gkl.m.EMAIL.ordinal()] = 8;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr4[gkl.m.PASSWORD.ordinal()] = 9;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr4[gkl.m.PHONE.ordinal()] = 10;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr4[gkl.m.PIN.ordinal()] = 11;
        } catch (NoSuchFieldError unused40) {
        }
        d = iArr4;
        int[] iArr5 = new int[inl.a.values().length];
        try {
            iArr5[inl.a.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr5[inl.a.SKIP_UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused42) {
        }
        e = iArr5;
        int[] iArr6 = new int[cjl.p.values().length];
        try {
            iArr6[cjl.p.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr6[cjl.p.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused44) {
        }
        f = iArr6;
    }
}
