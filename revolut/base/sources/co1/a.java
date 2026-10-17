package co1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25485a;

    static {
        int[] iArr = new int[pn1.a.values().length];
        try {
            iArr[pn1.a.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pn1.a.CREATE_SCHEDULED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pn1.a.UPDATE_SCHEDULED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f25485a = iArr;
    }
}
