package ynb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315417a;

    static {
        int[] iArr = new int[rob.i.values().length];
        try {
            iArr[rob.i.WITHDRAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rob.i.TOP_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rob.i.DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f315417a = iArr;
    }
}
