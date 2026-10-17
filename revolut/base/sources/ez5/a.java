package ez5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130914a;

    static {
        int[] iArr = new int[dz5.a.values().length];
        try {
            iArr[dz5.a.ADD_TO_BEGINNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dz5.a.ADD_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dz5.a.EXCLUDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f130914a = iArr;
    }
}
