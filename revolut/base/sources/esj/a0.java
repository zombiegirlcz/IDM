package esj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f128956b;

    static {
        int[] iArr = new int[uzi.c.values().length];
        try {
            iArr[uzi.c.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uzi.c.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f128955a = iArr;
        int[] iArr2 = new int[bsj.a.values().length];
        try {
            iArr2[bsj.a.CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bsj.a.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f128956b = iArr2;
    }
}
