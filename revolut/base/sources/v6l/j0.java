package v6l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f286458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f286459c;

    static {
        int[] iArr = new int[i93.e.values().length];
        try {
            iArr[i93.e.LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i93.e.MAGNET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i93.e.CONTACTLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i93.e.ATM_WITHDRAWAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i93.e.ECOMMERCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[i93.e.POINT_OF_SALE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f286457a = iArr;
        int[] iArr2 = new int[b93.d.values().length];
        try {
            iArr2[b93.d.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[b93.d.ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[b93.d.FREELANCER.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[b93.d.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[b93.d.JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[b93.d.YOUTH.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[b93.d.CRYPTO.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f286458b = iArr2;
        int[] iArr3 = new int[b93.k.values().length];
        try {
            iArr3[b93.k.VIRTUAL_FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[b93.k.CREATED_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[b93.k.LAST_USED.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        f286459c = iArr3;
    }
}
