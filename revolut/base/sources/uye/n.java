package uye;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f284307b;

    static {
        int[] iArr = new int[aue.c.values().length];
        try {
            iArr[aue.c.ACCOUNT_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f284306a = iArr;
        int[] iArr2 = new int[vye.c.values().length];
        try {
            iArr2[vye.c.CHECK.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[vye.c.GOOGLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vye.c.EASY_BANK_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vye.c.MOVE_MONEY.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vye.c.PIX.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vye.c.PIX_SMART_TRANSFER.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vye.c.IDEAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[vye.c.UPI_APP.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[vye.c.PAY_TO.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[vye.c.NET_BANKING.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[vye.c.MCY_UPI_APP.ordinal()] = 11;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[vye.c.MCY_NET_BANKING.ordinal()] = 12;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[vye.c.MCY_BANK_TRANSFER.ordinal()] = 13;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[vye.c.PSE.ordinal()] = 14;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[vye.c.BREB.ordinal()] = 15;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[vye.c.PAYNOW.ordinal()] = 16;
        } catch (NoSuchFieldError unused17) {
        }
        f284307b = iArr2;
    }
}
