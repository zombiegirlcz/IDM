package wuh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300153a;

    static {
        int[] iArr = new int[my8.t.values().length];
        try {
            iArr[my8.t.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[my8.t.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[my8.t.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[my8.t.SKIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f300153a = iArr;
    }
}
