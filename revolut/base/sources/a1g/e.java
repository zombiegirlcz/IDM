package a1g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f634a;

    static {
        int[] iArr = new int[myf.b.values().length];
        try {
            iArr[myf.b.ADULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[myf.b.CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[myf.b.INFANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[myf.b.SENIOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[myf.b.YOUTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[myf.b.VISITOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f634a = iArr;
    }
}
