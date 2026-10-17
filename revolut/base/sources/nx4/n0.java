package nx4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f220288b;

    static {
        int[] iArr = new int[o2.values().length];
        try {
            iArr[o2.MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o2.MONEY_WITH_PERCENTAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o2.CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o2.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f220287a = iArr;
        int[] iArr2 = new int[u.values().length];
        try {
            iArr2[u.EDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f220288b = iArr2;
    }
}
