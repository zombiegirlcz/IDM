package qc2;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f244525a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.Send.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.Request.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.Pay.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.Settings.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.Help.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f244525a = iArr;
    }
}
