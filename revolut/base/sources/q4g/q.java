package q4g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f242158b;

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
        f242157a = iArr;
        int[] iArr2 = new int[m7g.b.values().length];
        try {
            iArr2[m7g.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[m7g.b.CABIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[m7g.b.CHECKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[m7g.b.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f242158b = iArr2;
    }
}
