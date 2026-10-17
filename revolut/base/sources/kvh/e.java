package kvh;

import ril.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f190125b;

    static {
        int[] iArr = new int[ril.g.values().length];
        try {
            iArr[ril.g.VIDEO_CONFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ril.g.DOCUMENT_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ril.g.GOVERNMENT_AUTH_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ril.g.QES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f190124a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.WEBID.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[i.DIIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[i.MY_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[i.CMD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[i.IDNOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[i.HYPERVERGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[i.DAP.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[i.MOBYWATEL.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[i.EGOV_KYC.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[i.TRUSTDOCK.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[i.ITSME.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[i.ID_AUSTRIA.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[i.BANKID.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[i.IDURA.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[i.UAE_PASS.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[i.FOURTHLINE.ordinal()] = 16;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[i.ONFIDO.ordinal()] = 17;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[i.ONFIDO_STUDIO.ordinal()] = 18;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[i.VISION.ordinal()] = 19;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[i.INCODE.ordinal()] = 20;
        } catch (NoSuchFieldError unused24) {
        }
        f190125b = iArr2;
    }
}
