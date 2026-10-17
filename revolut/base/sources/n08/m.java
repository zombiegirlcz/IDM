package n08;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210907b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.CHANGE_PIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.REMOVE_PROFILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f210906a = iArr;
        int[] iArr2 = new int[d0.values().length];
        try {
            iArr2[d0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d0.INCOMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f210907b = iArr2;
    }
}
