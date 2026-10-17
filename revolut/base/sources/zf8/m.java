package zf8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f321905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f321906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f321907c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ij8.h.values().length];
        try {
            iArr[ij8.h.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ij8.h.OFFBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ij8.h.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ij8.h.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ij8.h.DISABLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f321905a = iArr;
        int[] iArr2 = new int[mf8.d.values().length];
        try {
            iArr2[mf8.d.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mf8.d.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[mf8.d.PASSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[mf8.d.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f321906b = iArr2;
        int[] iArr3 = new int[mf8.c.values().length];
        try {
            iArr3[mf8.c.GUARDIAN_SYNC.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[mf8.c.SUSPICIOUS_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[mf8.c.FORBIDDEN_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[mf8.c.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        f321907c = iArr3;
        int[] iArr4 = new int[mf8.b.values().length];
        try {
            iArr4[mf8.b.PLACE_OF_BIRTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[mf8.b.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
