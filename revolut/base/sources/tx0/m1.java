package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275198b;

    static {
        int[] iArr = new int[lw0.i.values().length];
        try {
            iArr[lw0.i.TITLE_SUBTITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lw0.i.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lw0.i.AVATAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lw0.i.CENTER_WITH_IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lw0.i.CENTER_WITH_PROGRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f275197a = iArr;
        int[] iArr2 = new int[lw0.d.values().length];
        try {
            iArr2[lw0.d.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lw0.d.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lw0.d.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f275198b = iArr2;
    }
}
