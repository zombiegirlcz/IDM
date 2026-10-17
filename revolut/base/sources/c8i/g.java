package c8i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22199a;

    static {
        int[] iArr = new int[mri.j.values().length];
        try {
            iArr[mri.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mri.j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mri.j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mri.j.TEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22199a = iArr;
    }
}
