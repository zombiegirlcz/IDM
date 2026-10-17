package c45;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21079b;

    static {
        int[] iArr = new int[x35.c.values().length];
        try {
            iArr[x35.c.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x35.c.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21078a = iArr;
        int[] iArr2 = new int[w35.a.values().length];
        try {
            iArr2[w35.a.FORMATTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w35.a.NON_FORMATTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w35.a.LAST_FOUR.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f21079b = iArr2;
    }
}
