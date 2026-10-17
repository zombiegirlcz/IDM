package db;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112636b;

    static {
        int[] iArr = new int[ta.f.values().length];
        try {
            iArr[ta.f.MISSING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ta.f.PRESENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ta.f.NOT_VERIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f112635a = iArr;
        int[] iArr2 = new int[ta.e.values().length];
        try {
            iArr2[ta.e.EDITABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ta.e.IN_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ta.e.MISSING_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ta.e.NOT_EDITABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f112636b = iArr2;
    }
}
