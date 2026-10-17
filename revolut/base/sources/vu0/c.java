package vu0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f292135a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.CLAIMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.UNDECIDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f292135a = iArr;
    }
}
