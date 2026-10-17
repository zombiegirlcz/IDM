package exe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f130389b;

    static {
        int[] iArr = new int[yt8.i.values().length];
        try {
            iArr[yt8.i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yt8.i.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yt8.i.PASSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yt8.i.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f130388a = iArr;
        int[] iArr2 = new int[vye.c.values().length];
        try {
            iArr2[vye.c.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vye.c.EASY_BANK_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vye.c.CHECKOUT_PREORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vye.c.CHECK.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[vye.c.REVOLUT_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[vye.c.MOVE_MONEY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[vye.c.PIX.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[vye.c.PIX_SMART_TRANSFER.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[vye.c.IDEAL.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[vye.c.PAY_TO.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[vye.c.MCY_UPI_APP.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[vye.c.MCY_NET_BANKING.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[vye.c.UPI_APP.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[vye.c.NET_BANKING.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[vye.c.MCY_BANK_TRANSFER.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[vye.c.BREB.ordinal()] = 16;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[vye.c.PSE.ordinal()] = 17;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[vye.c.AKAHU.ordinal()] = 18;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[vye.c.PAYNOW.ordinal()] = 19;
        } catch (NoSuchFieldError unused23) {
        }
        f130389b = iArr2;
    }
}
