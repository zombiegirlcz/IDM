package q6i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f242639b;

    static {
        int[] iArr = new int[b6i.l.values().length];
        try {
            iArr[b6i.l.TOP_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b6i.l.BOTTOM_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f242638a = iArr;
        int[] iArr2 = new int[b6i.j.values().length];
        try {
            iArr2[b6i.j.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b6i.j.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f242639b = iArr2;
    }
}
