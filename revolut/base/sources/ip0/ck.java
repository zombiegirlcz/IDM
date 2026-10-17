package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f163752a;

    static {
        int[] iArr = new int[zj.values().length];
        try {
            iArr[zj.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zj.AVATAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zj.REGULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zj.OVERLAPPED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f163752a = iArr;
    }
}
