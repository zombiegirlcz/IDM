package nx7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220479a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.PET_SELECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.BASE_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.BREED_SELECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.PET_AGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f220479a = iArr;
    }
}
