package o9c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f223218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f223219b;

    static {
        int[] iArr = new int[gec.d.values().length];
        try {
            iArr[gec.d.MOVE_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gec.d.ADD_MONEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gec.d.PAYMENT_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[gec.d.ADD_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f223218a = iArr;
        int[] iArr2 = new int[bgf.i.values().length];
        try {
            iArr2[bgf.i.REMEDIATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[bgf.i.WORKFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[bgf.i.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f223219b = iArr2;
    }
}
