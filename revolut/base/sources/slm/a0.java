package slm;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264235a;

    static {
        int[] iArr = new int[rlm.a.values().length];
        try {
            iArr[rlm.a.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rlm.a.POLYMORPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rlm.a.ALL_JSON_OBJECTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f264235a = iArr;
    }
}
