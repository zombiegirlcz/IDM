package vz9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293436a;

    static {
        int[] iArr = new int[cu9.c.values().length];
        try {
            iArr[cu9.c.DECLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cu9.c.SEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cu9.c.REMIND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cu9.c.CANCEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f293436a = iArr;
    }
}
