package lu5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f200024b;

    static {
        int[] iArr = new int[it5.a.values().length];
        try {
            iArr[it5.a.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[it5.a.SPOT_MARGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[it5.a.PERPETUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f200023a = iArr;
        int[] iArr2 = new int[kt5.a.values().length];
        try {
            iArr2[kt5.a.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[kt5.a.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[kt5.a.REWARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[kt5.a.STAKE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[kt5.a.UNSTAKE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[kt5.a.CLOSE_POSITION.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[kt5.a.FEE.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[kt5.a.SEND.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[kt5.a.RECEIVE.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[kt5.a.PAYMENTS.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[kt5.a.SPARE_CHANGE.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        f200024b = iArr2;
    }
}
