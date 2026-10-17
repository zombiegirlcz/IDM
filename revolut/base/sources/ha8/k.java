package ha8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f150473b;

    static {
        int[] iArr = new int[cfl.b.values().length];
        try {
            iArr[cfl.b.ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.b.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.b.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cfl.b.OFFBOARDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cfl.b.CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cfl.b.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f150472a = iArr;
        int[] iArr2 = new int[u98.a.values().length];
        try {
            iArr2[u98.a.INVALID_AGE_DIFFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[u98.a.ELIGIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[u98.a.FUTURE_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[u98.a.TOO_OLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[u98.a.TOO_YOUNG.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f150473b = iArr2;
    }
}
