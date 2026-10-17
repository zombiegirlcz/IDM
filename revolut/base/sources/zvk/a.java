package zvk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f325710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f325711b;

    static {
        int[] iArr = new int[trk.a.values().length];
        try {
            iArr[trk.a.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[trk.a.ETF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[trk.a.BONDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f325710a = iArr;
        int[] iArr2 = new int[hel.b.values().length];
        try {
            iArr2[hel.b.EEA.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hel.b.GB.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hel.b.US.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[hel.b.AU.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[hel.b.SG.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[hel.b.MX.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[hel.b.BR.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f325711b = iArr2;
    }
}
