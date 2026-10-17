package knd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186107a;

    static {
        int[] iArr = new int[fnd.a.values().length];
        try {
            iArr[fnd.a.INFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fnd.a.OUTFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f186107a = iArr;
    }
}
