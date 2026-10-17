package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f275278c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[q1.values().length];
        try {
            iArr[q1.AVATAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q1.AVATAR_LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q1.PLAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f275276a = iArr;
        int[] iArr2 = new int[x1.values().length];
        try {
            iArr2[x1.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[x1.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x1.SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f275277b = iArr2;
        int[] iArr3 = new int[u1.values().length];
        try {
            iArr3[u1.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[u1.TITLE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[u1.TITLE_AND_SUBTITLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f275278c = iArr3;
        int[] iArr4 = new int[v1.values().length];
        try {
            iArr4[v1.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[v1.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[v1.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
