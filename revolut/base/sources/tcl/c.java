package tcl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269878a;

    static {
        int[] iArr = new int[gdl.e.values().length];
        try {
            iArr[gdl.e.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gdl.e.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gdl.e.PENDING_DEACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f269878a = iArr;
    }
}
