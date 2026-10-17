package aqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8348b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.MANUAL_EXECUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8347a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o.FORCE_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o.FORCE_ONE_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f8348b = iArr2;
    }
}
