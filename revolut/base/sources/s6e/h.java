package s6e;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f260282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f260283c;

    static {
        int[] iArr = new int[pcd.b.values().length];
        try {
            iArr[pcd.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pcd.b.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pcd.b.PERSONAL_UNDER_18.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pcd.b.YOUTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pcd.b.PERSONAL_JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f260281a = iArr;
        int[] iArr2 = new int[pcd.l0.values().length];
        try {
            iArr2[pcd.l0.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pcd.l0.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pcd.l0.PRO_REGULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pcd.l0.PRO_TAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pcd.l0.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pcd.l0.SAVINGS_FIXED_TERM.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pcd.l0.MONEY_MARKET_FUND_SAVINGS.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pcd.l0.UNDETERMINED.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        f260282b = iArr2;
        int[] iArr3 = new int[ibd.h.values().length];
        try {
            iArr3[ibd.h.EXTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[ibd.h.EXTERNAL_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[ibd.h.CARD_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[ibd.h.INTERNAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[ibd.h.MANUAL_CARD_MANDATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[ibd.h.PREDEFINED_CARD_MANDATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        f260283c = iArr3;
    }
}
