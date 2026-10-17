package qa5;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f243960a;

    static {
        int[] iArr = new int[ia5.b.values().length];
        try {
            iArr[ia5.b.PartialSettlement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ia5.b.FullSettlement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f243960a = iArr;
    }
}
