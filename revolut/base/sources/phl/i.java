package phl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236354a;

    static {
        int[] iArr = new int[iel.f.values().length];
        try {
            iArr[iel.f.DATE_ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iel.f.DATE_DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f236354a = iArr;
    }
}
