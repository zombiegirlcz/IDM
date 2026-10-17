package obi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f223965a;

    static {
        int[] iArr = new int[bj0.b.values().length];
        try {
            iArr[bj0.b.MALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bj0.b.FEMALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f223965a = iArr;
    }
}
