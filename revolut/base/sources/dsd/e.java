package dsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f117293b;

    static {
        int[] iArr = new int[amd.b.values().length];
        try {
            iArr[amd.b.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[amd.b.SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[amd.b.INVEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[amd.b.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[amd.b.LINKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[amd.b.LINKED_CREDIT_CARDS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[amd.b.CREDIT_CARDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[amd.b.LOANS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[amd.b.PAY_LATER.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[amd.b.LINKED_COMBINED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[amd.b.CREDIT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[amd.b.POCKETS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[amd.b.OTHER_ASSETS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        f117292a = iArr;
        int[] iArr2 = new int[yld.g.values().length];
        try {
            iArr2[yld.g.ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[yld.g.LIABILITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f117293b = iArr2;
    }
}
