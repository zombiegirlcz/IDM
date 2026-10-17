package ksc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f189421b;

    static {
        int[] iArr = new int[vrc.d.values().length];
        try {
            iArr[vrc.d.RDAEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vrc.d.RSEUAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vrc.d.REVOLUT_LTD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vrc.d.REVOLUT_TRADING_LTD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vrc.d.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f189420a = iArr;
        int[] iArr2 = new int[vrc.k.values().length];
        try {
            iArr2[vrc.k.OPTIONAL_TO_SKIP_2FA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[vrc.k.TRADE_WITH_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[vrc.k.MANDATORY_TO_TRADE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f189421b = iArr2;
    }
}
