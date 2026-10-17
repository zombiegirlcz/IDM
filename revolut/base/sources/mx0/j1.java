package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f209769b;

    static {
        int[] iArr = new int[com.revolut.core.ui_kit.models.avatar.a.values().length];
        try {
            iArr[com.revolut.core.ui_kit.models.avatar.a.CLIPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.core.ui_kit.models.avatar.a.UNCLIPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f209768a = iArr;
        int[] iArr2 = new int[com.revolut.core.ui_kit.models.avatar.c.values().length];
        try {
            iArr2[com.revolut.core.ui_kit.models.avatar.c.OVAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.core.ui_kit.models.avatar.c.RECTANGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f209769b = iArr2;
    }
}
