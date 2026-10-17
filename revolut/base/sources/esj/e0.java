package esj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f128970b;

    static {
        int[] iArr = new int[bsj.a.values().length];
        try {
            iArr[bsj.a.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bsj.a.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f128969a = iArr;
        int[] iArr2 = new int[uzi.c.values().length];
        try {
            iArr2[uzi.c.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[uzi.c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f128970b = iArr2;
    }
}
