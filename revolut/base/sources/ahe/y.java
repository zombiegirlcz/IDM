package ahe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5058b;

    static {
        int[] iArr = new int[ohe.g.values().length];
        try {
            iArr[ohe.g.Asset.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ohe.g.Liability.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ohe.g.Exempt.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5057a = iArr;
        int[] iArr2 = new int[yfe.a.values().length];
        try {
            iArr2[yfe.a.Cash.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yfe.a.Savings.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yfe.a.Crypto.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yfe.a.Invest.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yfe.a.Joint.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[yfe.a.Credit.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[yfe.a.Pro.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[yfe.a.Linked.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[yfe.a.Youth.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        f5058b = iArr2;
    }
}
