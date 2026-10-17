package nc8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214160a;

    static {
        int[] iArr = new int[kc8.a.values().length];
        try {
            iArr[kc8.a.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kc8.a.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f214160a = iArr;
    }
}
