package lki;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196457a;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.END_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.START_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f196457a = iArr;
    }
}
