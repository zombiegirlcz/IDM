package mx2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210155a;

    static {
        int[] iArr = new int[b93.e.values().length];
        try {
            iArr[b93.e.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b93.e.JUNIOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b93.e.FREELANCER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b93.e.VIRTUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b93.e.JUNIOR_VIRTUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[b93.e.FREELANCER_VIRTUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[b93.e.DISPOSABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[b93.e.FREELANCER_DISPOSABLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f210155a = iArr;
    }
}
