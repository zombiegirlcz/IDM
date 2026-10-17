package ey7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130587a;

    static {
        int[] iArr = new int[ky7.d.values().length];
        try {
            iArr[ky7.d.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ky7.d.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ky7.d.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ky7.d.INACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ky7.d.ACTION_NEEDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ky7.d.INITIALIZING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f130587a = iArr;
    }
}
