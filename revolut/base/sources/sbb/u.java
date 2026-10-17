package sbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261559a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.ThemeUpdateNotificationScheduled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.ThemeRevertScheduled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.ThemeUpdateScheduled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f261559a = iArr;
    }
}
