package sbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261560a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.ThemeUpdateNotificationScheduled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.ThemeRevertScheduled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.ThemeUpdateScheduled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f261560a = iArr;
    }
}
