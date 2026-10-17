package e0a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121513a;

    static {
        int[] iArr = new int[cu9.l.values().length];
        try {
            iArr[cu9.l.ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cu9.l.DECLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cu9.l.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cu9.l.REMIND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cu9.l.REVIEW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f121513a = iArr;
    }
}
