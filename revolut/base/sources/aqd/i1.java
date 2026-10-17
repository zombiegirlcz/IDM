package aqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f8351c;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.REMOVE_DESTINATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8349a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[o.FORCE_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o.FORCE_ONE_OFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f8350b = iArr2;
        int[] iArr3 = new int[q.values().length];
        try {
            iArr3[q.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[q.MANUAL_EXECUTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[q.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f8351c = iArr3;
    }
}
