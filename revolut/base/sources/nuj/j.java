package nuj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f219331b;

    static {
        int[] iArr = new int[g0j.c.values().length];
        try {
            iArr[g0j.c.EXCHANGE_RATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0j.c.ESIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0j.c.SPLIT_BILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g0j.c.ATM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g0j.c.TRANSPORT_HUBS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g0j.c.BIZUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g0j.c.PIX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[g0j.c.ALIPAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f219330a = iArr;
        int[] iArr2 = new int[g0j.b.values().length];
        try {
            iArr2[g0j.b.STAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[g0j.b.EXPERIENCES.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[g0j.b.LOUNGES.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[g0j.b.INSURANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        f219331b = iArr2;
    }
}
