package dwi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f120412a;

    static {
        int[] iArr = new int[svi.o.values().length];
        try {
            iArr[svi.o.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[svi.o.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[svi.o.PROVISIONING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f120412a = iArr;
    }
}
