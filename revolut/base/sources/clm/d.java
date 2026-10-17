package clm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25069a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.FIRST_OR_DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.LAST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.SINGLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f25069a = iArr;
    }
}
