package h3b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149109a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.ACCOUNT_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.PNL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.MARGIN_RESERVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.AVAILABLE_TO_INVEST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f149109a = iArr;
    }
}
