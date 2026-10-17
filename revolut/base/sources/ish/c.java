package ish;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168255a;

    static {
        int[] iArr = new int[dsh.t.values().length];
        try {
            iArr[dsh.t.SEEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dsh.t.UNSEEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168255a = iArr;
    }
}
