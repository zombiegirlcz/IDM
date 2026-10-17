package au0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f9247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f9248c;

    static {
        int[] iArr = new int[com.revolut.core.ui_kit.models.l.values().length];
        try {
            iArr[com.revolut.core.ui_kit.models.l.CONTEXTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.core.ui_kit.models.l.WHITE_OR_BLACK_INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.core.ui_kit.models.l.INVERTED_PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.core.ui_kit.models.l.PRIMARY_NEUTRAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f9246a = iArr;
        int[] iArr2 = new int[aw0.v1.values().length];
        try {
            iArr2[aw0.v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[aw0.v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f9247b = iArr2;
        int[] iArr3 = new int[tx0.v2.values().length];
        try {
            iArr3[tx0.v2.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[tx0.v2.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f9248c = iArr3;
    }
}
