package mob;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207601a;

    static {
        int[] iArr = new int[cfl.b.values().length];
        try {
            iArr[cfl.b.OFFBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.b.SUSPENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f207601a = iArr;
    }
}
