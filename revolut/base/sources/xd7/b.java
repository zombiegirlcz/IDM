package xd7;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304272a;

    static {
        int[] iArr = new int[rd7.c.values().length];
        try {
            iArr[rd7.c.READ_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rd7.c.EDITABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f304272a = iArr;
    }
}
