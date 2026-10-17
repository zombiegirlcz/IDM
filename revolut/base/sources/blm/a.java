package blm;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16745a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.FIRST_OR_DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.LAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.SINGLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.SINGLE_OR_DEFAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f16745a = iArr;
    }
}
