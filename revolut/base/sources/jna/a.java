package jna;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176662a;

    static {
        int[] iArr = new int[x91.a.values().length];
        try {
            iArr[x91.a.BALANCE_AND_CCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x91.a.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f176662a = iArr;
    }
}
