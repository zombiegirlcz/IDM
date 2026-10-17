package ack;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3173a;

    static {
        int[] iArr = new int[kbk.a.values().length];
        try {
            iArr[kbk.a.FORCE_SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kbk.a.SKIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kbk.a.SHOW_IF_NEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f3173a = iArr;
    }
}
