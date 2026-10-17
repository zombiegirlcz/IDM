package hbg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150693a;

    static {
        int[] iArr = new int[rei.f.values().length];
        try {
            iArr[rei.f.NOT_ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rei.f.USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rei.f.AGENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f150693a = iArr;
    }
}
