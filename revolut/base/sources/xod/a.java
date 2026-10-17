package xod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307792b;

    static {
        int[] iArr = new int[lzi.i.values().length];
        try {
            iArr[lzi.i.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lzi.i.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lzi.i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lzi.i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lzi.i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f307791a = iArr;
        int[] iArr2 = new int[op0.q.values().length];
        try {
            iArr2[op0.q.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[op0.q.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[op0.q.DYNAMIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[op0.q.LARGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f307792b = iArr2;
    }
}
