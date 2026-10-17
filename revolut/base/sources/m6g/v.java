package m6g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203117a;

    static {
        int[] iArr = new int[m7g.j.values().length];
        try {
            iArr[m7g.j.ADULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m7g.j.CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m7g.j.INFANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m7g.j.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f203117a = iArr;
    }
}
