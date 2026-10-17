package h8b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149975a;

    static {
        int[] iArr = new int[iel.n.values().length];
        try {
            iArr[iel.n.DELISTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iel.n.LISTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iel.n.NEW_LISTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[iel.n.RESUMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[iel.n.SUSPENDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f149975a = iArr;
    }
}
