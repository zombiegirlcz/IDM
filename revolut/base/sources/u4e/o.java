package u4e;

import nel.d0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f277341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f277342b;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.AUTOCALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.CAPITAL_PROTECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.LEVERAGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f277341a = iArr;
        int[] iArr2 = new int[q4e.b.values().length];
        try {
            iArr2[q4e.b.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q4e.b.HOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[q4e.b.SELL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f277342b = iArr2;
    }
}
