package e3i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f122312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f122313c;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.PERCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f122311a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.ABOVE_THE_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k.BELOW_THE_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f122312b = iArr2;
        int[] iArr3 = new int[g3i.a.values().length];
        try {
            iArr3[g3i.a.TAKE_PROFIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[g3i.a.STOP_LOSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f122313c = iArr3;
    }
}
