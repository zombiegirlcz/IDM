package pya;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f240737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f240738c;

    static {
        int[] iArr = new int[pwa.b.values().length];
        try {
            iArr[pwa.b.REDEEMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwa.b.REWARD_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwa.b.VERIFYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwa.b.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pwa.b.EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pwa.b.IGNORED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[pwa.b.MAX_REACHED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[pwa.b.INELIGIBLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f240736a = iArr;
        int[] iArr2 = new int[pwa.e.values().length];
        try {
            iArr2[pwa.e.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pwa.e.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pwa.e.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pwa.e.INELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pwa.e.DONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f240737b = iArr2;
        int[] iArr3 = new int[pwa.n.values().length];
        try {
            iArr3[pwa.n.CRYPTO_INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[pwa.n.JUNIOR_TO_JUNIOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[pwa.n.RETAIL_TO_BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[pwa.n.STANDARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[pwa.n.SALARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[pwa.n.PAPER_TRADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[pwa.n.PRO_INTERNAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        f240738c = iArr3;
    }
}
