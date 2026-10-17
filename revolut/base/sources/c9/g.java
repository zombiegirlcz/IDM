package c9;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22263a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.SHIMMERING_CHILDREN_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.ALL_CHILDREN_MASK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.ALL_CHILDREN_BOUNDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f22263a = iArr;
    }
}
