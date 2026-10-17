package ieg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160715a;

    static {
        int[] iArr = new int[xag.a.values().length];
        try {
            iArr[xag.a.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xag.a.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xag.a.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xag.a.HIDDEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f160715a = iArr;
    }
}
