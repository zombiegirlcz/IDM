package kof;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f186347b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.BANNER_TOP_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.BANNER_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.BANNER_SALARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.ACTION_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f186346a = iArr;
        int[] iArr2 = new int[yzi.b.values().length];
        try {
            iArr2[yzi.b.IN_REVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yzi.b.DEFERRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yzi.b.APPROVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[yzi.b.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[yzi.b.CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[yzi.b.SKIPPED.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[yzi.b.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[yzi.b.FAILED.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        f186347b = iArr2;
    }
}
